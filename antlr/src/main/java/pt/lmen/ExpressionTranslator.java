package pt.lmen;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import src.main.antlr4.pt.lmen.ChatLexer;
import src.main.antlr4.pt.lmen.ChatParser;
import src.main.antlr4.pt.lmen.ChatParser.SingleExpressionContext;

public class ExpressionTranslator {

    public String translate( String expression ) {

        ANTLRInputStream input = new ANTLRInputStream( expression );

        ChatLexer lexer = new ChatLexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        ChatParser parser = new ChatParser( tokens );
        SingleExpressionContext tree = parser.singleExpression();

        ParseTreeWalker walker = new ParseTreeWalker();
        ExpressionListener listener = new ExpressionListener( tokens );
        walker.walk( listener, tree );

        return listener.rewriter.getText();

    }

}
