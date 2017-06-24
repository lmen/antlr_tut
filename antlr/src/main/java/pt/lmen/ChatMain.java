package pt.lmen;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import src.main.antlr4.pt.lmen.ChatLexer;
import src.main.antlr4.pt.lmen.ChatParser;

public class ChatMain {

    public static void main(String[] args) {
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


/*
public class App
{
    public static void main( String[] args )
    {
        ANTLRInputStream inputStream = new ANTLRInputStream(
            "I would like to [b][i]emphasize[/i][/b] this and [u]underline [b]that[/b][/u] ." +
            "Let's not forget to quote: [quote author=\"John\"]You're wrong![/quote]");
        MarkupLexer markupLexer = new MarkupLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        MarkupParser markupParser = new MarkupParser(commonTokenStream);

        MarkupParser.FileContext fileContext = markupParser.file();
        MarkupVisitor visitor = new MarkupVisitor();
        visitor.visit(fileContext);
    }
}
*/