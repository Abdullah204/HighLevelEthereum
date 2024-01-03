package Steps;


import Contracts.TheFile;
import Lines.Line;

import java.util.List;

public class Require implements Step{
    Condition condition;
    List<Condition> list;
    List<LogicalOperator> ops;
    String messageToThrow  = null;
    int javaLine;

    //require(bool statement,if false throw message)
    public Require(Condition condition, String messageToThrow){
        this.condition = condition;
        this.messageToThrow = messageToThrow;
    }

    //require(condition) if false throws error
    public Require(Condition condition){
        this.condition = condition;
    }
    public Require(List<Condition> list ,List<LogicalOperator> ops){
        this.list = list;
        this.ops = ops;

    }
    @Override
    public String write() throws Exception {
        TheFile.lineMap.addLine(new Line(javaLine,"Step",TheFile.solidityCount,TheFile.solidityCount));
        TheFile.solidityCount++;
        String res = "require(";
        if(list!=null){
            res += list.get(0).write();
            for(int i = 0 ; i < ops.size() ; i++){
                res += ops.get(i)==LogicalOperator.AND?" && ":" || ";
                res += list.get(i+1).write();
            }

        }
        else
            res += condition.write();
        res += messageToThrow != null ? ", "+messageToThrow+");" : ");";
        return res;
    }

    @Override
    public void setJavaLine(int javaLine) {
        this.javaLine = javaLine;
    }

    public static void main(String[] args) throws Exception {
    }
}
