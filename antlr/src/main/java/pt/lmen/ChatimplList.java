package pt.lmen;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import src.main.antlr4.pt.lmen.ChatBaseListener;
import src.main.antlr4.pt.lmen.ChatParser;
import src.main.antlr4.pt.lmen.ChatParser.EqualityExpressionContext;
import src.main.antlr4.pt.lmen.ChatParser.IdentifierNameContext;
import src.main.antlr4.pt.lmen.ChatParser.IdentifierNameExpressionContext;
import src.main.antlr4.pt.lmen.ChatParser.LiteralExpressionContext;

public class ChatimplList extends ChatBaseListener {

	TokenStreamRewriter rewriter;
    public ChatimplList(TokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
    }
    
    String finalText = "";

//    @Override
//    public void exitEqualityExpression(EqualityExpressionContext ctx) {
//    	
//    	String text = ctx.Equals().getText();
//    	System.out.println("sss: " + text);
//    	finalText += " " + text + " "; 
//    }
    
//    @Override
//    public void enterLiteralExpression(LiteralExpressionContext ctx) {
//    	finalText += ctx.getText();
//    }
    
    @Override
    public void enterIdentifierName(IdentifierNameContext ctx) {
    	String text = ctx.IdentifierWithDot().getText();
    	System.out.format("=== %s \n", text);
    	finalText += "context(" + text + ")";  
    	
    	rewriter.insertBefore(ctx.start, "tekPanelModel('");
    	rewriter.insertAfter(ctx.start, "')");
    }
    
//    @Override
//    public void enterIdentifierNameExpression(IdentifierNameExpressionContext ctx) {
//    }
//        
    
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    	System.out.format("%s %s (%s %s) : %s [%s %s] [%s %s] \n",
    			pad(ctx.depth()),
    			ctx.getClass().getSimpleName(),
    			ctx.getRuleIndex(),
    			ChatParser.ruleNames[ ctx.getRuleIndex()],
    			ctx.getText(), 
    			ctx.start.getText(),
    			ctx.stop.getText(),
    			ctx.start.getStartIndex(),
    			ctx.start.getStopIndex()
    			);
    	
    	//finalText += " !" + ctx.getRuleIndex() + " " + ctx.start.getText() + "  - "  + ctx.stop.getText();
    	//finalText += "" + ctx.toStringTree();
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