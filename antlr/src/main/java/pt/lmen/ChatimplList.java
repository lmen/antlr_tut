package pt.lmen;

import java.util.Arrays;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.main.antlr4.pt.lmen.ChatBaseListener;
import src.main.antlr4.pt.lmen.ChatParser.IdentifierNameAccessPropExpressionContext;

public class ChatimplList extends ChatBaseListener {

	TokenStreamRewriter rewriter;

	public ChatimplList(TokenStream tokens) {
		rewriter = new TokenStreamRewriter(tokens);
	}

	@Override
	public void enterIdentifierNameAccessPropExpression(IdentifierNameAccessPropExpressionContext ctx) {

		if (!iskeyWord(ctx.identifierName().getText())) {
			rewriter.insertBefore(ctx.identifierName().start, "_$_M('");
			rewriter.insertAfter(ctx.identifierName().start, "')");
		}

		TerminalNode subprop = ctx.SUBPROP();
		if (subprop != null) {
			rewriter.replace(subprop.getSymbol(), ".");
		}

		if (ctx.identifierName2() != null) {

		}
	}

	private boolean iskeyWord(String text) {
		String[] keywords = { "null", "true", "false", "undefined", "while", "for" };
		return Arrays.asList(keywords).contains(text);
	}

}