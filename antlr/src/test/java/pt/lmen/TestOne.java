package pt.lmen;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import src.main.antlr4.pt.lmen.ChatLexer;
import src.main.antlr4.pt.lmen.ChatParser;
import src.main.antlr4.pt.lmen.ChatParser.ExpressionStatementContext;

public class TestOne {

	@Test
	public void aa(){
		
		String text = " _asds.s == 12 ";
System.out.println(":: " + text);
        ANTLRInputStream inputStream = new ANTLRInputStream(text);
        ChatLexer lexer = new ChatLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ChatParser parser = new ChatParser(commonTokenStream);
        parser.setBuildParseTree(true);
        
        ExpressionStatementContext tree = parser.expressionStatement();

        ChatimplList listener = new ChatimplList();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
		System.out.println("File Information: " + listener.getFinalText());
	}
	
}
