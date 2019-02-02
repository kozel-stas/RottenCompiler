grammar RottenLanguage;

program : 'main_program' block;

block :BEGIN statement+ END;

statement :  assign_int | print_int | operations;

BEGIN : 'begin';
END : 'end';
PRINT: 'print';
INT : 'int';
STRING : 'string';
SEPARATOR : ';';

ID : [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER : [0-9]+;
WS     : [ \n\t\r]+ -> skip;

PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';

O_BRACKET : '(';
C_BRACKET : ')';

expression:	expression (MULTIPLY|DIVIDE) expression
    |	expression (PLUS|MINUS) expression
    |	ID
    |	O_BRACKET expression C_BRACKET
    ;

digit_expression:	digit_expression (MULTIPLY|DIVIDE) digit_expression
    |	digit_expression (PLUS|MINUS) digit_expression
    |	ID
    |	O_BRACKET digit_expression C_BRACKET
    | NUMBER
    ;

assign_int : INT ID '=' digit_expression SEPARATOR;
print_int : PRINT O_BRACKET (digit_expression) C_BRACKET SEPARATOR;
operations : ID '=' digit_expression SEPARATOR;

global_program: program{1};