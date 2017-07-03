package pt.lmen;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.main.antlr4.pt.lmen.ExpressionBaseListener;
import src.main.antlr4.pt.lmen.ExpressionParser.PropertyPathContext;
import src.main.antlr4.pt.lmen.ExpressionParser.PropertyPathExpressionContext;

public class ExpressionListener extends ExpressionBaseListener {

	TokenStreamRewriter rewriter;

	public ExpressionListener(TokenStream tokens) {
		rewriter = new TokenStreamRewriter(tokens);
	}

	@Override
	public void enterPropertyPathExpression(PropertyPathExpressionContext ctx) {

		PropertyPathContext propertyPathCtx = ctx.propertyPath();
		rewriter.insertBefore(propertyPathCtx.start, "_$_M('");
		rewriter.insertAfter(propertyPathCtx.start, "')");

		TerminalNode subprop = ctx.JavaSectionSeparator();
		if (subprop != null) {
			rewriter.replace(subprop.getSymbol(), ".");
		}

	}

}