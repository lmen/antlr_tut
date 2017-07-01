package pt.lmen;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import src.main.antlr4.pt.lmen.ChatLexer;
import src.main.antlr4.pt.lmen.ChatParser;
import src.main.antlr4.pt.lmen.ChatParser.ExpressionStatementContext;

public class ExpressionTranslator {

    public String translate( String expression ) {

        ANTLRInputStream input = new ANTLRInputStream( expression );

        ChatLexer lexer = new ChatLexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        ChatParser parser = new ChatParser( tokens );
        ExpressionStatementContext tree = parser.expressionStatement();

        ParseTreeWalker walker = new ParseTreeWalker();
        ChatimplList listener = new ChatimplList( tokens );
        walker.walk( listener, tree );

        return listener.rewriter.getText();

    }

}
