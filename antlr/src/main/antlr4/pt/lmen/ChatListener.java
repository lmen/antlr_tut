// Generated from Chat.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChatParser}.
 */
public interface ChatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChatParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ChatParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ChatParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(ChatParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(ChatParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(ChatParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(ChatParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#elision}.
	 * @param ctx the parse tree
	 */
	void enterElision(ChatParser.ElisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#elision}.
	 * @param ctx the parse tree
	 */
	void exitElision(ChatParser.ElisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ChatParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ChatParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyNameAndValueList(ChatParser.PropertyNameAndValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyNameAndValueList(ChatParser.PropertyNameAndValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ChatParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(ChatParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ChatParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(ChatParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(ChatParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(ChatParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetParameterList(ChatParser.PropertySetParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetParameterList(ChatParser.PropertySetParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ChatParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ChatParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ChatParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ChatParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(ChatParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(ChatParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ChatParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ChatParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ChatParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ChatParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ChatParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ChatParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(ChatParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(ChatParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ChatParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ChatParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(ChatParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(ChatParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ChatParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ChatParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(ChatParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(ChatParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(ChatParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(ChatParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(ChatParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(ChatParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(ChatParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(ChatParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierNameExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierNameExpression(ChatParser.IdentifierNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierNameExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierNameExpression(ChatParser.IdentifierNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ChatParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ChatParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(ChatParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(ChatParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ChatParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ChatParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpression(ChatParser.BitShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link ChatParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpression(ChatParser.BitShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ChatParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ChatParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(ChatParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(ChatParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#aa}.
	 * @param ctx the parse tree
	 */
	void enterAa(ChatParser.AaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#aa}.
	 * @param ctx the parse tree
	 */
	void exitAa(ChatParser.AaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#tyu}.
	 * @param ctx the parse tree
	 */
	void enterTyu(ChatParser.TyuContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#tyu}.
	 * @param ctx the parse tree
	 */
	void exitTyu(ChatParser.TyuContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(ChatParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(ChatParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(ChatParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(ChatParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ChatParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ChatParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#futureReservedWord}.
	 * @param ctx the parse tree
	 */
	void enterFutureReservedWord(ChatParser.FutureReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#futureReservedWord}.
	 * @param ctx the parse tree
	 */
	void exitFutureReservedWord(ChatParser.FutureReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(ChatParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(ChatParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(ChatParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(ChatParser.EofContext ctx);
}