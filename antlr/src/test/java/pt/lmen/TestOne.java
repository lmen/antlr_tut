package pt.lmen;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import src.main.antlr4.pt.lmen.ChatLexer;
import src.main.antlr4.pt.lmen.ChatParser;

public class TestOne {

	@Test
	public void aa(){
		
		String text = "sdsds.ds";

        ANTLRInputStream inputStream = new ANTLRInputStream(text);
        ChatLexer lexer = new ChatLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ChatParser parser = new ChatParser(commonTokenStream);
        parser.setBuildParseTree(true);
        ChatParser.RContext tree = parser.r();

        ChatimplList listener = new ChatimplList();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
		
	}
	
}
