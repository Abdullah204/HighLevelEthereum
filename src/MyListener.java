import Contracts.TheFile;
import Methods.*;
import Methods.AccessModifier;
import Steps.*;
import Variables.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import Contracts.Contract;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Parameter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static Steps.Environment.*;

public class MyListener extends DecSolBaseListener {
    static ArrayList<Contract> contracts = new ArrayList<Contract>();
    static TheFile f;
    static String currentContract;

    @Override
    public void enterProgram(DecSolParser.ProgramContext ctx) {
        f= new TheFile("Output");
        contracts = new ArrayList<Contract>();
    }


    @Override
    public void enterContract(DecSolParser.ContractContext ctx) {
        Contract contract = new Contract(ctx.contractName().NAME().toString());
        Variable key  = new VariableAddress(false);
        Variable value;
        try{
            value = new VariableInteger(false,7);
            contract.addStateVariable(new StateMapping("NFTOwners", value, key, Variables.AccessModifier.PUBLIC));
            contract.addStateVariable(new StateMapping("deposit",key , value, Variables.AccessModifier.PUBLIC));
            contract.addStateVariable(new StateInteger("tokenCounter",false,7, 0, Variables.AccessModifier.PUBLIC));
            ParameterVariable[] ownerOfp = {new ParameterInteger("tokenID" , false,7)};
            ParameterVariable[] createp = {new ParameterAddress("owner" , false)};

            Method ownerOf = new Method("ownerOf",ownerOfp,AccessModifier.PUBLIC,Type.VIEW,new String[] {},
                    new ParameterVariable[]{ new ParameterAddress("owner" ,false)});
            ownerOf.addSteps(new SolidityCode("return NFTOwners[tokenID];"));
            Method createToken = new Method("createToken" ,createp,AccessModifier.PUBLIC,Type.NONE, new String[]{} ,
                    new ParameterVariable[]{new ParameterInteger("tokenID" , false,7)});
            createToken.addSteps(new SolidityCode("tokenCounter++;"));
            createToken.addSteps(new SolidityCode("NFTOwners[tokenCounter] = owner;"));
            createToken.addSteps(new SolidityCode("return tokenCounter;"));
            contract.addMethod(ownerOf);
            contract.addMethod(createToken);
        }
        catch (Exception e){

        }

        contracts.add(contract);
    }
    @Override
    public void exitProgram(DecSolParser.ProgramContext ctx){
        for (Contract c : contracts){
            f.addContract(c);
            f.createContract();
        }
    }
    @Override public void enterTransaction(DecSolParser.TransactionContext ctx) {
        currentContract = ctx.contractName().getText();
        String mname = ctx.transactionName().getText();
        List<Condition> condList = new ArrayList<Condition>();
        List<LogicalOperator> oplist = new ArrayList<LogicalOperator>();
        if(ctx.on()!=null){
            List <DecSolParser.FinalconditionContext> conditions = ctx.on().condition().finalcondition();
            List <TerminalNode> operators = ctx.on().condition().LOGICALOPERATOR();

            for(int i = 0 ; i < operators.size();i++){
                oplist.add(operators.get(i).getText().equals("and")?LogicalOperator.AND:LogicalOperator.OR);
            }
            for(int i = 0 ; i< conditions.size() ; i++){
                condList.add(createCond(conditions.get(i)));
            }
        }



        Method method;

        if(ctx.transactionType().getText().contains("deposits")) {
            try {
                method = createDeposit(currentContract,mname);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else if(ctx.transactionType().getText().contains("withdraws")) {
            try {
                method =createWithdraw(currentContract,mname,ctx.transactionType().withdraw().val().getText());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else if(ctx.transactionType().getText().contains("swaps")) {
            try {
                method = createSwap(currentContract,mname,ctx.transactionType().swap().val().getText(),ctx.transactionType().swap().address().getText(),ctx.transactionType().swap().tokenID().getText());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else if (ctx.transactionType().getText().contains("buys")){
            try {
                String days = ctx.transactionType().service().NUMBER()==null?"null":ctx.transactionType().service().NUMBER().getText();
                method = createService(currentContract,mname,ctx.transactionType().service().serviceName().getText(),ctx.transactionType().service().amount().getText(),days);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            }
        else {
            try {
                method = createTransfer(currentContract,mname,ctx.transactionType().transfer().amount().getText(),ctx.transactionType().transfer().wallet().getText());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if(condList.size()>0)
            method.addStepsBeginning(new Require(condList,oplist));

        DecSolParser.EmitContext emit = ctx.emit();
        if(emit!=null){
       //     method.addSteps(new FireEvent());

        }

    }

    public Method createService(String currentContract, String mname, String serviceName, String amount,String days) {
        Contract contract = getContract(currentContract);
        contract.addStateVariable(new StateBool(serviceName+"serviceCompleted" , Variables.AccessModifier.PUBLIC ,"false"));
        contract.addStateVariable(new StateBool(serviceName+"buyerApproved" , Variables.AccessModifier.PUBLIC ,"false"));
        try {
            contract.addStateVariable( new StateInteger(serviceName+"price" ,false,7, Variables.AccessModifier.PUBLIC));
            if(!days.equals("null"))
                contract.addStateVariable(new StateInteger("lastPayment",false,7,0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        contract.addStateVariable( new StateAddress(serviceName+"buyer",false, Variables.AccessModifier.PUBLIC));
        contract.addStateVariable(new StateAddress(serviceName+"serviceProvider",true, Variables.AccessModifier.PUBLIC));
        ParameterVariable[] arr = {};
        String [] m = {};
        Method complete = new Method(serviceName+"Complete",arr,AccessModifier.PUBLIC,Type.NONE,m,arr);
        Method approve = new Method(serviceName+"Approve",arr,AccessModifier.PUBLIC,Type.NONE,m,arr);
        Method release = new Method(serviceName+"Release",arr,AccessModifier.PUBLIC,Type.NONE,m,arr);
        complete.addSteps(new SolidityCode("require(msg.sender == "+serviceName+"serviceProvider, \"Only the service provider can complete the service\");"));
        complete.addSteps(new SolidityCode(serviceName+"serviceCompleted = true;"));
        complete.addSteps(new SolidityCode(serviceName+"buyerApproved = false;"));
        approve.addSteps(new SolidityCode("require(msg.sender =="+ serviceName+"buyer, \"Only the buyer can approve the service\");"));
        approve.addSteps(new SolidityCode("require("+serviceName+"serviceCompleted, \"The service has not been completed yet\");"));
        approve.addSteps(new SolidityCode(serviceName+"buyerApproved = true;"));
        if(!days.equals("null"))
            release.addSteps(new SolidityCode("require(block.timestamp>=lastPayment+ " +days+" days"+",\"duration has not ended yet\");"));
        release.addSteps(new SolidityCode("require(msg.sender =="+ serviceName+"buyer, \"Only the buyer can approve the service\");"));
        release.addSteps(new SolidityCode("require("+serviceName+"buyerApproved, \"The buyer has not approved the service yet\");"));
        release.addSteps(new SolidityCode(serviceName+"serviceProvider.transfer("+serviceName+"price);"));
        if(!days.equals("null")) {
            release.addSteps(new SolidityCode("lastPayment = block.timestamp;"));
            release.addSteps(new SolidityCode(serviceName+"serviceCompleted = false;"));
        }
        contract.addMethod(complete);
        contract.addMethod(approve);
        contract.addMethod(release);
        return complete;
    }


    @Override public void enterBid(DecSolParser.BidContext ctx)  {
        String cname = ctx.contractName().NAME().getText();
        String tokenId = ctx.assetName().getText();
        int days = Integer.parseInt(ctx.NUMBER().getText());
        Contract c = getContract(cname);
        if(c==null){
            try{
                throw new Exception("contract not found");
            }
            catch( Exception e){

            }

        }
        try {
            c.addStateVariable(new StateInteger(tokenId,false,7));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        c.addStateVariable( new StateAddress("seller",true , Variables.AccessModifier.PUBLIC));
        try {
            c.addStateVariable(new StateInteger("endat",false,7));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        c.addStateVariable(new StateBool("started", Variables.AccessModifier.PUBLIC));
        c.addStateVariable(new StateBool("ended", Variables.AccessModifier.PUBLIC));
        c.addStateVariable(new StateAddress("highestBidder",false, Variables.AccessModifier.PUBLIC));
        try {
            c.addStateVariable(new StateInteger("highestBid",false,7, Variables.AccessModifier.PUBLIC));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            c.addStateVariable(new StateMapping("bids",new VariableAddress(false), new VariableInteger(false,7)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ParameterVariable[] v ={};
        String[] m = {};
        Method start = new Method("start",v,AccessModifier.EXTERNAL ,Type.NONE,m,v);
        Method end = new Method("end",v,AccessModifier.EXTERNAL,Type.NONE,m,v);
        Method bid = new Method("bid",v,AccessModifier.EXTERNAL,Type.PAYABLE,m,v);
        Method withdraw = new Method("withdraw",v,AccessModifier.EXTERNAL,Type.NONE,m,v);

        start.addSteps(new SolidityCode("require(!started,\"started\");"));
        start.addSteps(new SolidityCode("require(seller==msg.sender,\"not seller\");"));
//        start.addSteps(new SafeTransfer("seller",tokenId));
//        start.addSteps(new SolidityCode("safeTransferFrom(seller, msg.sender, "+tokenId+");"));
        start.addSteps(new SolidityCode("NFTOwners[tokenId] = msg.sender;"));
        start.addSteps(new Assign("started","true"));
        start.addSteps(new Assign("endat" , BLOCK_TIMESTAMP+"+ "+days + " days"));

        bid.addSteps(new Require(new Condition("started",RelationalOperator.EQUAL),"\"not started\""));
        bid.addSteps(new Require(new Condition(BLOCK_TIMESTAMP,"endat" , "uint" , RelationalOperator.LESS_THAN)));
        bid.addSteps(new Require(new Condition(MSG_VALUE,"highestBid" , "uint" , RelationalOperator.GREATER_THAN)));
        Step [] steps =  {new SolidityCode("bids[highestBidder]+=highestBid;")};

        bid.addSteps( new IFStatement(new Condition("highestBidder" , "address(0)" , "address" , RelationalOperator.NOT_EQUAL) , steps));
        bid.addSteps(new Assign("highestBidder",MSG_SENDER));
        bid.addSteps(new Assign("highestBid",MSG_VALUE));

        withdraw.addSteps(new SolidityCode("uint bal = bids[msg.sender];"));
        withdraw.addSteps(new SolidityCode("bids[msg.sender] = 0;"));
        withdraw.addSteps(new SolidityCode("payable(msg.sender).transfer(bal);"));


        end.addSteps(new SolidityCode("require(started, \"not started\");"));
        end.addSteps(new SolidityCode("require(block.timestamp >= endat, \"not ended\");"));
        end.addSteps(new SolidityCode("require(!ended, \"ended\");"));
        end.addSteps(new SolidityCode("ended = true;"));
        end.addSteps(new SolidityCode("if (highestBidder != address(0)) {\n" +
                "NFTOwners[tokenId] = highestBidder;\n" +
                "seller.transfer(highestBid);" +
                "}"));
        end.addSteps(new SolidityCode(" else {\n" +
                "NFTOwners[tokenId] = seller;\n" +
                "}"));


        c.addMethod(start);
        c.addMethod(end);
        c.addMethod(bid);
        c.addMethod(withdraw);
    }
    @Override public void enterEvent(DecSolParser.EventContext ctx) {
        Contract c = getContract(ctx.contractName().getText());
        EventVariable[] arr = new EventVariable[ctx.NAME().size()];
        for(int i = 0;i < ctx.NAME().size(); i++){
            arr[i] = new EventString(ctx.NAME().get(i).getText(),true);
        }
        c.addEvent(new Event(ctx.eventName().getText(),arr));
    }

    public Condition createCond(DecSolParser.FinalconditionContext cond){
        String arg1;
        String op;
        String arg2;
        if(cond.assetCondition()!=null){
            op = cond.assetCondition().CONDITIONALOPERATOR().getText();
            arg1 = cond.assetCondition().assetName().getText();
            if(cond.assetCondition().NAME()==null)
                arg2 = cond.assetCondition().NUMBER().getText();
            else
                arg2 = cond.assetCondition().NAME().getText();
            return new Condition(arg1,arg2,"asset" , convert(op));
        }

        if(cond.timeCondition()!=null){
            op = cond.timeCondition().CONDITIONALOPERATOR().getText();
            arg1 = "block.timestamp";
            arg2 = cond.timeCondition().time().getText();
            return new Condition(arg1,arg2,"time" , convert(op));
        }
        if(cond.dateCondition()!=null){
            op = cond.dateCondition().CONDITIONALOPERATOR().getText();
            arg1 = cond.dateCondition().date().getText();
            arg2 = "block.timestamp";
            return new Condition(arg2,getTimestamp(arg1),"date" , convert(op));
        }

        return null;

    }

    public String getTimestamp (String datep){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parse the date string into a LocalDate object
        LocalDate date = LocalDate.parse(datep, formatter);

        // Get the year, month, and day values from the LocalDate object
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        LocalDate newdate = LocalDate.of(year, month, day);

        // Convert the LocalDate object to an Instant object
        Instant instant = date.atStartOfDay().toInstant(ZoneOffset.UTC);

        // Get the Unix timestamp from the Instant object
        long timestamp = instant.getEpochSecond();
        return timestamp+"";
    }

    public RelationalOperator convert(String op){
        return op.equals("<=")?RelationalOperator.LESS_OR_EQUAL:
                op.equals("<")?RelationalOperator.LESS_THAN:
                        op.equals("==")?RelationalOperator.EQUAL:
                                op.equals("!=")?RelationalOperator.NOT_EQUAL:
                                        op.equals(">")?RelationalOperator.GREATER_THAN:
                                                RelationalOperator.GREATER_OR_EQUAL;

    }





    public Method createDeposit(String contractName ,String methodName) throws Exception {
        Contract c = getContract(contractName);

        if(c==null)
            throw new Exception("contractNotFound");
        String[] m = {};
        ParameterVariable[] r = {};
        Method method = new Method(methodName,r, AccessModifier.PUBLIC, Type.PAYABLE,m,r);
        Step step = new SolidityCode("deposit[msg.sender]+=msg.value;");
        method.addSteps(step);

        c.addMethod(method);
        return method;
    }
    public Method createWithdraw(String contractName , String methodName , String amount) throws Exception{
        // require sender has money more than withdraw
        Contract c = getContract(contractName);
        if(c==null)
            throw new Exception("contractNotFound");
        String[] m = {};
        ParameterVariable[] r = {new ParameterInteger(amount,false , 7)};
        ParameterVariable[] x = {};
        Method method = new Method(methodName,r, AccessModifier.PUBLIC, Type.NONE,m,x);

        Step req = new SolidityCode("require(deposit[msg.sender]>="+amount+",\"Insufficient balance.\");");
        Step step = new SolidityCode("deposit[msg.sender]-="+amount+";");
        Step trans = new SolidityCode("msg.sender.transfer("+ amount+");");
        method.addSteps(req);
        method.addSteps(step);
        c.addMethod(method);
        return method;
    }

    public Method createSwap(String contractName,String methodName ,String valName , String addressName , String tokenIdName) throws Exception {
        Contract c = getContract(contractName);
        if(c==null)
            throw new Exception("contractNotFound");
        String[] m = {};
        ParameterVariable[] x = {};
        ParameterVariable[] r = {
                new ParameterInteger(valName,false,7),
                new ParameterAddress(addressName,true)
                ,new ParameterInteger(tokenIdName,false , 7)
        };
        Method method = new Method(methodName,r, AccessModifier.PUBLIC, Type.PAYABLE,m,x);
        Step req1 = new Require(new Condition("ownerOf("+tokenIdName +")",addressName,"address",RelationalOperator.EQUAL));
        Step req2 = new Require(new Condition(MSG_VALUE,valName,"uint",RelationalOperator.EQUAL));
        Step trans1 = new SolidityCode("NFTOwners[tokenId] = msg.sender;");
        Step trans2 = new SolidityCode(addressName+".transfer(msg.value);");

        method.addSteps(req1);
        method.addSteps(req2);
        method.addSteps(trans1);
        method.addSteps(trans2);
        c.addMethod(method);
        return method;
    }

    public Method createTransfer(String contractName,String methodName ,String valName , String addressName) throws Exception {
        Contract c = getContract(contractName);
        if(c==null)
            throw new Exception("contractNotFound");
        String[] m = {};
        ParameterVariable [] x = {};
        ParameterVariable[] r = {new ParameterInteger(valName,false,7),new ParameterAddress(addressName,true)};
        Method method = new Method(methodName,r, AccessModifier.PUBLIC, Type.PAYABLE,m,x);
        Step req2 = new Require(new Condition(MSG_VALUE,valName,"uint",RelationalOperator.EQUAL));
        Step trans2 = new SolidityCode(addressName+".transfer(msg.value);");
        method.addSteps(req2);
        method.addSteps(trans2);
        c.addMethod(method);
        return  method;
    }


    public Contract getContract(String name){
        for(Contract c : contracts){
            if(c.getContractName().equals(name))
                return c;
        }
        return null;

    }


    public static void main(String[] args) {
        String DecSolContent = mybid();
        DecSolLexer decSolLexer = new DecSolLexer(CharStreams.fromString(DecSolContent));
        CommonTokenStream tokens = new CommonTokenStream(decSolLexer);
        DecSolParser parser = new DecSolParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MyListener(),tree);
    }


    // tests

    public static String rent (){
        return "create contract Transfer" +
                " create transaction rent in Transfer that transfers amount rentValue to wallet landlord" +
                " on msg.value == rentValue";
    }

    public static String buyToken (){
        return "create contract BuyCase" +
                " create transaction buyNFT in BuyCase that swaps token tokenId with val from wallet seller" +
                " on msg.value == val";
    }
    public static String deposit (){
        return "create contract DepositCase" +
                " create transaction depositFunc in DepositCase that deposits value val from wallet dep";
    }
    public static String withdraw (){
        return "create contract BuyCase" +
                " create transaction withdrawFunc in BuyCase that withdraws value val into wallet withd";
    }

    public static String bank() {
        return
                "create contract Bank " +
                        "create transaction depositFunc in Bank that deposits value val from wallet myWallet " +
                        "create transaction withdrawFunc in Bank that withdraws value val into wallet myWallet " +
                        "on val >= 300 and val <= 500 and date >= 12-06-2023" +
                        "create transaction send in Bank that transfers amount amountTransferred to wallet myWallet";
    }
    public static String myevent (){
        return "create contract EventCase create event myEvent in contract EventCase (myWallet,myAmount,isTrue)";
    }

    public static String mybid(){
        return "create contract Auction" +
                " create bid in Auction on tokenId for 7 days";
    }

    public static String myService(){
        return "create contract MyService" +
                " create transaction ser in MyService that buys service appartment with amount val every 30 days";
    }
}
