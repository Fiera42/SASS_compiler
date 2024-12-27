grammar ExpressionMath;

prog : expression EOF;

expression : ID
    | INT
    | expression SYMBOLE2 expression
    | expression SYMBOLE1 expression
    | '(' expression ')';

ID : [a-z]+;
SYMBOLE1 : '+' | '-';
SYMBOLE2 : '*' | '/';
INT : [0-9]+ ;
NEWLINE : [\r\n]+ -> skip;
SPACE : ' ' -> skip;