grammar Chat;

/* parser rules start with lower case letter */

r  : ID OP NUMBER
   | ID ;         // match keyword hello followed by an identifier

/*
    Lexical
*/
// lexer/terminal rules start with an upper case letter

fragment
NameChar
   : NameStartChar
   | '0'..'9'
   | '.'
   | '('
   | ')'
   | '['
   | ']'
   /*| '\u00B7'
   | '\u0300'..'\u036F'
   | '\u203F'..'\u2040'
   */
   ;

fragment
NameStartChar
   : 'A'..'Z' | 'a'..'z'
   | '_'
   /*| '\u00C0'..'\u00D6'
   | '\u00D8'..'\u00F6'
   | '\u00F8'..'\u02FF'
   | '\u0370'..'\u037D'
   | '\u037F'..'\u1FFF'
   | '\u200C'..'\u200D'
   | '\u2070'..'\u218F'
   | '\u2C00'..'\u2FEF'
   | '\u3001'..'\uD7FF'
   | '\uF900'..'\uFDCF'
   | '\uFDF0'..'\uFFFD'
   */
   ;

ID : NameStartChar NameChar*;

OP
   : '=='
   | '!='
   | '!=='
   | '>'
   | '>='
   | '<='
   | '<>';

NEG : '!';

NUMBER
   : ('+' | '-')? '0'..'9' '0'..'9'* ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

