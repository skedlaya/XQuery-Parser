lexer grammar XQLexer;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

QUOTE : '\''| '\"';

DOC : D O C | D O C U M E N T;

//RESERVED_WORD : DOC | FOR | IN | IS | TXT | LET | WHERE | RETURN | AND | OR | NOT |
//EQ | SOME | SATISFIES | EMPTY;


SINGLESLASH : '/';

DOUBLESLASH : '//';

OPENBRACKET : '(';

CLOSEBRACKET : ')';

COMMA : ',';

TXT : 'text()';

FOR : F O R;

LET : L E T;

WHERE : W H E R E;

RETURN : R E T U R N;

IN : I N;

IS : I S;

AND : A N D;

OR : O R;

NOT : N O T;

EQ :  E Q;

STAR : '*';

DOT :'.';

DOUBLEDOT : '..';

AT : '@';

OPENSQ : '[';

CLOSESQ : ']';

EQUAL : '=';

EQUALITY : '==';

ASSIGN : ':=';

SOME : S O M E;

SATISFIES : S A T I S F I E S;

EMPTY : E M P T Y;

OPENTAG : '<'|'</';

CLOSETAG: '>';

OPENCURL : '{';

CLOSECURL : '}';

WS  :  [ \t\r\n\u000C]+ -> skip;


ID : [^_A-Za-z][_A-Za-z0-9-]* ;

STRINGCONST : QUOTE (ID |'_'|'!'|'?'|'.'|','|';'|' ')* QUOTE;


VARNAME : '$'ID ;



