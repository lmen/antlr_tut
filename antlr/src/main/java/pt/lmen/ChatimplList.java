package pt.lmen;

import java.util.Arrays;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.main.antlr4.pt.lmen.ChatBaseListener;
import src.main.antlr4.pt.lmen.ChatParser.PropertyPathContext;
import src.main.antlr4.pt.lmen.ChatParser.PropertyPathExpressionContext;

public class ChatimplList extends ChatBaseListener {

	TokenStreamRewriter rewriter;

	public ChatimplList(TokenStream tokens) {
		rewriter = new TokenStreamRewriter(tokens);
	}

	@Override
	public void enterPropertyPathExpression(PropertyPathExpressionContext ctx) {

		PropertyPathContext propertyPathCtx = ctx.propertyPath();
		if (!iskeyWord(propertyPathCtx.getText())) {
			rewriter.insertBefore(propertyPathCtx.start, "_$_M('");
			rewriter.insertAfter(propertyPathCtx.start, "')");
		}

		TerminalNode subprop = ctx.SUBPROP();
		if (subprop != null) {
			rewriter.replace(subprop.getSymbol(), ".");
		}

	}

	private boolean iskeyWord(String text) {
		String[] keywords = { "null", "true", "false", "undefined", "while", "for" };
		return Arrays.asList(keywords).contains(text);
	}

}