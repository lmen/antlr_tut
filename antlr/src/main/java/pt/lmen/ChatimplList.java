package pt.lmen;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.main.antlr4.pt.lmen.ChatBaseListener;
import src.main.antlr4.pt.lmen.ChatParser;

public class ChatimplList extends ChatBaseListener {

    String finalText = "";

    private String extractTerminalNodeText(TerminalNode node) {
        if (node == null) return "";
        return node.getSymbol().getText();
    }

    /**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterR(ChatParser.RContext ctx) {
        finalText = extractTerminalNodeText(ctx.ID()) + " " +
        extractTerminalNodeText(ctx.OP()) + " " +
        extractTerminalNodeText(ctx.NUMBER());


        System.out.format("Enter R: [%s ] ", finalText);
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitR(ChatParser.RContext ctx) {
        System.out.println("ExitR " +  ctx.ID().getSymbol().getText());
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }


}