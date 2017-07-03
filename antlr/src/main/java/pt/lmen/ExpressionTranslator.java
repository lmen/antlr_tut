package pt.lmen;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import src.main.antlr4.pt.lmen.ExpressionLexer;
import src.main.antlr4.pt.lmen.ExpressionParser;
import src.main.antlr4.pt.lmen.ExpressionParser.SingleExpressionContext;

public class ExpressionTranslator {

	public String translate(String expression) {

		ANTLRInputStream input = new ANTLRInputStream(expression);

		ExpressionLexer lexer = new ExpressionLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExpressionParser parser = new ExpressionParser(tokens);
		SingleExpressionContext tree = parser.singleExpression();

		ParseTreeWalker walker = new ParseTreeWalker();
		ExpressionListener listener = new ExpressionListener(tokens, "_$_M");
		walker.walk(listener, tree);

		return listener.getTranslatedText();

	}

}
