package pt.lmen;

import java.util.Arrays;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.main.antlr4.pt.lmen.ChatBaseListener;
import src.main.antlr4.pt.lmen.ChatParser;
import src.main.antlr4.pt.lmen.ChatParser.IdentifierName2Context;
import src.main.antlr4.pt.lmen.ChatParser.IdentifierNameAccessPropExpressionContext;

public class ChatimplList extends ChatBaseListener {

	TokenStreamRewriter rewriter;

	public ChatimplList(TokenStream tokens) {
		rewriter = new TokenStreamRewriter(tokens);
	}

	String finalText = "";

	// @Override
	// public void exitEqualityExpression(EqualityExpressionContext ctx) {
	//
	// String text = ctx.Equals().getText();
	// System.out.println("sss: " + text);
	// finalText += " " + text + " ";
	// }

	// @Override
	// public void enterLiteralExpression(LiteralExpressionContext ctx) {
	// finalText += ctx.getText();
	// }

	// @Override
	// public void enterMemberDotExpression(MemberDotExpressionContext ctx) {
	//
	// rewriter.insertBefore(ctx.start, "_$_M('");
	// rewriter.insertAfter(ctx.start, "')");
	//
	// }

	// @Override
	// public void
	// enterIdentifierNameAccessPropExpression(IdentifierNameAccessPropExpressionContext
	// ctx) {
	//
	// }

	@Override
	public void enterIdentifierName2(IdentifierName2Context ctx) {
		System.out.println("identifier 2");
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

	// @Override
	// public void enterIdentifierName(IdentifierNameContext ctx) {
	// // String text = ctx.IdentifierWithDot().getText();
	// // System.out.format("=== %s \n", text);
	// // finalText += "context(" + text + ")";
	//
	// if (!iskeyWord(ctx.getText())) {
	// rewriter.insertBefore(ctx.start, "_$_M('");
	// rewriter.insertAfter(ctx.start, "')");
	// }
	// }

	// @Override
	// public void enterIdentifierNameExpression(IdentifierNameExpressionContext
	// ctx) {
	// }
	//

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		System.out.format("%s %s (%s %s) : %s [%s %s] [%s %s] \n", pad(ctx.depth()), ctx.getClass().getSimpleName(),
				ctx.getRuleIndex(), ChatParser.ruleNames[ctx.getRuleIndex()], ctx.getText(), ctx.start.getText(),
				ctx.stop.getText(), ctx.start.getStartIndex(), ctx.start.getStopIndex());

		// finalText += " !" + ctx.getRuleIndex() + " " + ctx.start.getText() +
		// " - " + ctx.stop.getText();
		// finalText += "" + ctx.toStringTree();
	}

	private boolean iskeyWord(String text) {
		String[] keywords = { "null", "true", "false", "undefined", "while", "for" };
		return Arrays.asList(keywords).contains(text);
	}

	private String pad(int depth) {
		String r = "";
		for (int i = 0; i < depth; i++) {
			r += "   ";
		}

		return r;
	}

	public String getFinalText() {
		return finalText;
	}

}