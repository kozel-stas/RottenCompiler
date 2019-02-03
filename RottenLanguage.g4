grammar RottenLanguage;

program : 'main_program' block;

block :BEGIN statement* END;

statement :  assign_int | operations | assign_var | while_cicle | print_string | if_then | method_invokation | assign_el | assing_set | print_id | operarions_with_set;

BEGIN : 'begin';
SET : 'set';
ELEMENT : 'element';
ADD:'add';
REMOVE:'remove';
END : 'end';
PRINT: 'print';
INT : 'int';
WHILE: 'while';
IF : 'if';
THEN : 'then';
CALL : 'call';
RETURN : 'return';
SEPARATOR : ';';
DELIMITER : '.';

ID : [a-zA-Z_][a-zA-Z_0-9]*;
STRING : '"'(.)+?'"';
NUMBER : [0-9]+;
WS     : [ \n\t\r]+ -> skip;

PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';

NEGATION : '!';
EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
LESS_OR_EQUALS: '<=';
GREATER: '>';
GREATER_OR_EQUALS: '>=';

O_BRACKET : '(';
C_BRACKET : ')';

K_O_BRACKET : '{';
K_C_BRACKET : '}';

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

assign_var : type ID '=' method_invokation;
assign_int : INT ID '=' digit_expression SEPARATOR;
assign_el : ELEMENT ID '=' STRING SEPARATOR;
assing_set : SET ID '=' ((K_C_BRACKET K_O_BRACKET)|(K_O_BRACKET (ID ',')* (ID) K_C_BRACKET)|(ID(MULTIPLY|DIVIDE|PLUS|MINUS)ID)) SEPARATOR;
print_id : PRINT O_BRACKET (digit_expression) C_BRACKET SEPARATOR;
print_string : PRINT O_BRACKET (STRING) C_BRACKET SEPARATOR;
operations : ID '=' digit_expression SEPARATOR;
operarions_with_set: ID DELIMITER (ADD|REMOVE) (O_BRACKET ID C_BRACKET) SEPARATOR;

simple_compare : (digit_expression) (EQUAL|NON_EQUAL|LESS|GREATER|LESS_OR_EQUALS|GREATER_OR_EQUALS) (digit_expression);
hard_compare : NEGATION? O_BRACKET simple_compare C_BRACKET;

while_cicle: WHILE O_BRACKET (simple_compare|hard_compare) C_BRACKET block;
if_then: IF O_BRACKET (simple_compare|hard_compare) C_BRACKET block THEN block;

type: INT|ELEMENT|SET;
signature: (O_BRACKET (type ID ',')* (type ID) C_BRACKET);
subprogram_return : 'sub_program' type ID (signature|(O_BRACKET C_BRACKET)) block_return;
subprogram_non_return : 'sub_program' ID (signature|(O_BRACKET C_BRACKET)) (block_non_return|block);

block_return : BEGIN statement* RETURN ID SEPARATOR END;
block_non_return : BEGIN statement* RETURN SEPARATOR END;

signature_method_invokation: (O_BRACKET (ID ',')* (ID) C_BRACKET);
method_invokation : CALL ID (signature_method_invokation|(O_BRACKET C_BRACKET)) SEPARATOR;

global_program: program{1}(subprogram_non_return|subprogram_return)*;