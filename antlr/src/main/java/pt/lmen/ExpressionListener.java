package pt.lmen;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.main.antlr4.pt.lmen.ChatBaseListener;
import src.main.antlr4.pt.lmen.ChatParser.PropertyPathContext;
import src.main.antlr4.pt.lmen.ChatParser.PropertyPathExpressionContext;

public class ExpressionListener extends ChatBaseListener {

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