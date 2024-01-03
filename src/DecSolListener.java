// Generated from DecSol.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecSolParser}.
 */
public interface DecSolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecSolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecSolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecSolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DecSolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DecSolParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#contract}.
	 * @param ctx the parse tree
	 */
	void enterContract(DecSolParser.ContractContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#contract}.
	 * @param ctx the parse tree
	 */
	void exitContract(DecSolParser.ContractContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#transaction}.
	 * @param ctx the parse tree
	 */
	void enterTransaction(DecSolParser.TransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#transaction}.
	 * @param ctx the parse tree
	 */
	void exitTransaction(DecSolParser.TransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#transactionType}.
	 * @param ctx the parse tree
	 */
	void enterTransactionType(DecSolParser.TransactionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#transactionType}.
	 * @param ctx the parse tree
	 */
	void exitTransactionType(DecSolParser.TransactionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#deposit}.
	 * @param ctx the parse tree
	 */
	void enterDeposit(DecSolParser.DepositContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#deposit}.
	 * @param ctx the parse tree
	 */
	void exitDeposit(DecSolParser.DepositContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#withdraw}.
	 * @param ctx the parse tree
	 */
	void enterWithdraw(DecSolParser.WithdrawContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#withdraw}.
	 * @param ctx the parse tree
	 */
	void exitWithdraw(DecSolParser.WithdrawContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#swap}.
	 * @param ctx the parse tree
	 */
	void enterSwap(DecSolParser.SwapContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#swap}.
	 * @param ctx the parse tree
	 */
	void exitSwap(DecSolParser.SwapContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#transfer}.
	 * @param ctx the parse tree
	 */
	void enterTransfer(DecSolParser.TransferContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#transfer}.
	 * @param ctx the parse tree
	 */
	void exitTransfer(DecSolParser.TransferContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#service}.
	 * @param ctx the parse tree
	 */
	void enterService(DecSolParser.ServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#service}.
	 * @param ctx the parse tree
	 */
	void exitService(DecSolParser.ServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(DecSolParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(DecSolParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#emit}.
	 * @param ctx the parse tree
	 */
	void enterEmit(DecSolParser.EmitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#emit}.
	 * @param ctx the parse tree
	 */
	void exitEmit(DecSolParser.EmitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#bid}.
	 * @param ctx the parse tree
	 */
	void enterBid(DecSolParser.BidContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#bid}.
	 * @param ctx the parse tree
	 */
	void exitBid(DecSolParser.BidContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#asset}.
	 * @param ctx the parse tree
	 */
	void enterAsset(DecSolParser.AssetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#asset}.
	 * @param ctx the parse tree
	 */
	void exitAsset(DecSolParser.AssetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#assetType}.
	 * @param ctx the parse tree
	 */
	void enterAssetType(DecSolParser.AssetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#assetType}.
	 * @param ctx the parse tree
	 */
	void exitAssetType(DecSolParser.AssetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#on}.
	 * @param ctx the parse tree
	 */
	void enterOn(DecSolParser.OnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#on}.
	 * @param ctx the parse tree
	 */
	void exitOn(DecSolParser.OnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DecSolParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DecSolParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#finalcondition}.
	 * @param ctx the parse tree
	 */
	void enterFinalcondition(DecSolParser.FinalconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#finalcondition}.
	 * @param ctx the parse tree
	 */
	void exitFinalcondition(DecSolParser.FinalconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#assetCondition}.
	 * @param ctx the parse tree
	 */
	void enterAssetCondition(DecSolParser.AssetConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#assetCondition}.
	 * @param ctx the parse tree
	 */
	void exitAssetCondition(DecSolParser.AssetConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#timeCondition}.
	 * @param ctx the parse tree
	 */
	void enterTimeCondition(DecSolParser.TimeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#timeCondition}.
	 * @param ctx the parse tree
	 */
	void exitTimeCondition(DecSolParser.TimeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#dateCondition}.
	 * @param ctx the parse tree
	 */
	void enterDateCondition(DecSolParser.DateConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#dateCondition}.
	 * @param ctx the parse tree
	 */
	void exitDateCondition(DecSolParser.DateConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#assetName}.
	 * @param ctx the parse tree
	 */
	void enterAssetName(DecSolParser.AssetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#assetName}.
	 * @param ctx the parse tree
	 */
	void exitAssetName(DecSolParser.AssetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#transactionName}.
	 * @param ctx the parse tree
	 */
	void enterTransactionName(DecSolParser.TransactionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#transactionName}.
	 * @param ctx the parse tree
	 */
	void exitTransactionName(DecSolParser.TransactionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(DecSolParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(DecSolParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(DecSolParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(DecSolParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#tokenID}.
	 * @param ctx the parse tree
	 */
	void enterTokenID(DecSolParser.TokenIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#tokenID}.
	 * @param ctx the parse tree
	 */
	void exitTokenID(DecSolParser.TokenIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(DecSolParser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(DecSolParser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#contractName}.
	 * @param ctx the parse tree
	 */
	void enterContractName(DecSolParser.ContractNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#contractName}.
	 * @param ctx the parse tree
	 */
	void exitContractName(DecSolParser.ContractNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#amount}.
	 * @param ctx the parse tree
	 */
	void enterAmount(DecSolParser.AmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#amount}.
	 * @param ctx the parse tree
	 */
	void exitAmount(DecSolParser.AmountContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#wallet}.
	 * @param ctx the parse tree
	 */
	void enterWallet(DecSolParser.WalletContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#wallet}.
	 * @param ctx the parse tree
	 */
	void exitWallet(DecSolParser.WalletContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#serviceName}.
	 * @param ctx the parse tree
	 */
	void enterServiceName(DecSolParser.ServiceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#serviceName}.
	 * @param ctx the parse tree
	 */
	void exitServiceName(DecSolParser.ServiceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(DecSolParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(DecSolParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecSolParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(DecSolParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecSolParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(DecSolParser.DateContext ctx);
}