package pt.lmen;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.main.antlr4.pt.lmen.ExpressionBaseListener;
import src.main.antlr4.pt.lmen.ExpressionParser.PropertyPathContext;
import src.main.antlr4.pt.lmen.ExpressionParser.PropertyPathExpressionContext;

public class ExpressionListener extends ExpressionBaseListener {

	private TokenStreamRewriter rewriter;
	private String contextFunctionName;

	public ExpressionListener(TokenStream tokens, String contextFunctionName) {
		this.rewriter = new TokenStreamRewriter(tokens);
		this.contextFunctionName = contextFunctionName;
	}

	@Override
	public void enterPropertyPathExpression(PropertyPathExpressionContext ctx) {

		PropertyPathContext propertyPathCtx = ctx.propertyPath();
		rewriter.insertBefore(propertyPathCtx.start, contextFunctionName + "('");
		rewriter.insertAfter(propertyPathCtx.start, "')");

		TerminalNode subprop = ctx.JavaSectionSeparator();
		if (subprop != null) {
			rewriter.replace(subprop.getSymbol(), ".");
		}

	}

	public String getTranslatedText() {
		return rewriter.getText();
	}

}