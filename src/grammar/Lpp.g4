/** Gramatica del Lenguaje LPP en ENBNF para ser procesado por ANTLR4 */
grammar Lpp;

programa
    : NL* declaracionesRegistros declaracionesVariables declaracionesSubprogramas accionesPrograma
    ;

declaracionesRegistros
    : ( declaracionRegistro )*
    ;

declaracionRegistro
    : REGISTRO ID NL+ declaracionesVariables FIN REGISTRO NL+
    ;

declaracionesSubprogramas
    : ( declaracionProcedimiento | declaracionFuncion )*
    ;

declaracionProcedimiento
    : PROCEDIMIENTO ID ( '(' parametros ')' )? NL+ declaracionesVariables accionesSubprograma
    ;

declaracionFuncion
    : FUNCION ID ( '(' parametros ')' )? ':' tipoFuncion NL+ declaracionesVariables accionesFuncion
    ;

parametros
    : parametro ( ',' parametro )*
    ;

parametro
    : VAR? tipo ID
    ;

declaracionesVariables
    : declaracionVariables*
    ;

declaracionVariables
    : tipo listaIDs NL+
    ;

tipo
    : ENTERO
    | REAL
    | BOOLEANO
    | CARACTER
    | CADENA ( '[' VALOR_ENTERO ']')?
    | ARREGLO '[' listaEnteros ']' DE tipo
    | ID
    ;

tipoFuncion
    : ENTERO
    | REAL
    | BOOLEANO
    | CARACTER
    | CADENA ( '[' VALOR_ENTERO ']')?
    | ID
    ;

listaIDs
    : ID ( ',' ID )*
    ;

listaEnteros
    : VALOR_ENTERO ( ',' VALOR_ENTERO )*
    ;

accionesSubprograma
    : INICIO NL+ acciones FIN NL+
    ;

accionesFuncion
    : INICIO NL+ acciones ( retorne )? FIN NL+
    ;
accionesPrograma
    : INICIO NL+ acciones FIN NL* EOF
    ;

acciones
    : accion*
    ;

accion
    : escriba
    | lea
    | asignar
    | llamar
    | si
    | caso
    | mientras
    | para
    | repita
    ;

escriba
    : ESCRIBA listaExpr NL+
    ;

lea
    : LEA listaExpr NL+
    ;

asignar
    : expr '<-' expr NL+
    ;

llamar
    : LLAMAR procedimientoLibreriaEstandar NL+
    | LLAMAR ID ( '(' listaExpr? ')' )? NL+
    ;

procedimientoLibreriaEstandar
    : PROC_NUEVA_LINEA
    ;

si
    : SI expr NL* ENTONCES NL+ acciones sino? FIN SI NL+
    ;

sino
    : SINO si
    | SINO NL+ acciones
    ;

caso
    : CASO expr NL+ opcionCaso+ casoSino? FIN CASO NL+
    ;

opcionCaso
    : listaExprOpcion ':' NL+ acciones
    ;

listaExprOpcion
    : expr ( ',' expr ) *
    ;

casoSino
    : SINO ':' NL* acciones
    ;

mientras
    : MIENTRAS expr NL* HAGA NL+ acciones FIN MIENTRAS NL+
    ;

para
    : PARA expr '<-' expr HASTA expr NL* HAGA NL+ acciones FIN PARA NL+
    ;

repita
    : REPITA NL+ acciones HASTA expr NL+
    ;

retorne
    : RETORNE expr NL+
    ;

listaExpr
    : expr ( ',' expr )*
    ;

expr
    : '(' expr ')'
    | valor
    | ID
    | expr '.' ID
    | expr '[' listaExpr ']'
    | ID '(' listaExpr? ')'
    | '-' expr
    |<assoc=right> expr '^' expr
    | expr ( '*' | '/' | DIV_ENTEROS | MOD ) expr
    | expr ( '+' | '-' ) expr
    | expr ( '=' | '<>' | '<=' | '>=' | '<' | '>' ) expr
    | expr OP_Y expr
    | expr OP_O expr
    ;

valor
    : VALOR_REAL
    | VALOR_ENTERO
    | VALOR_CADENA
    | VALOR_CARACTER
    | VERDADERO
    | FALSO
    ;

// REGLAS LEXICAS
INICIO : I N I C I O ;
FIN : F I N ;
ESCRIBA : E S C R I B A ;
LEA : L E A ;
LLAMAR : L L A M A R ;
SI : S I ;
ENTONCES : E N T O N C E S ;
SINO : S I N O ;
CASO : C A S O ;
MIENTRAS : M I E N T R A S ;
HAGA : H A G A ;
PARA : P A R A ;
HASTA : H A S T A ;
REPITA : R E P I T A ;
PROCEDIMIENTO : P R O C E D I M I E N T O ;
VAR : V A R ;
FUNCION : F U N C I O N ;
RETORNE : R E T O R N E ;

// TIPOS PREDEFINIDOS
ENTERO : E N T E R O ;
REAL : R E A L ;
CARACTER : C A R A C T E R ;
BOOLEANO : B O O L E A N O ;
CADENA : C A D E N A ;
REGISTRO : R E G I S T R O ;
ARREGLO : A R R E G L O ;
DE : D E ;

// LIBRERIA ESTANDAR
PROC_NUEVA_LINEA : N U E V A '_' L I N E A ;

// OPERADORES
PODER : '^';
MULT : '*' ;
DIV : '/' ;
MOD : M O D ;
DIV_ENTEROS :D I V ;
SUMA : '+' ;
RESTA : '-' ;
IGUAL : '=' ;
DESIGUAL : '<>' ;
MAYOR : '>' ;
MAYOR_IGUAL : '>=' ;
MENOR : '<' ;
MENOR_IGUAL : '<=' ;
OP_Y : Y ;
OP_O : O ;

// VALORES
VALOR_REAL : DIGITO+ '.' DIGITO*
    | '.' DIGITO+
    ;
VALOR_ENTERO : DIGITO+ ;
fragment DIGITO : [0-9] ;

VALOR_CADENA : '"' CARACTERES_CADENA* '"' ;
fragment CARACTERES_CADENA : ~["] | '\\"' | '\\\\' ;

VALOR_CARACTER : '\'' CARACTERES_CARACTER '\'' ;
fragment CARACTERES_CARACTER : ~['] | '\\\'' | '\\\\' ;

VERDADERO : V E R D A D E R O ;
FALSO : F A L S O ;

// FRAGMENTOS PARA QUE EL PARSER NO DISTINGA MAYUS/MINUS EN PALABRAS RESERVADAS
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

// IDENTIFICADOR (Debe de aparecer despues de todas las palabras reservadas en la gramatica)
ID : [a-zA-Z$_] [a-zA-Z0-9$_]* ;

// NUEVA LINEA, ESPACIO BLANCO (WHITESPACE) Y COMENTARIOS
NL : [\r\n]+ ;
WS : [ \t]+ -> skip ;
COMENTARIO : '/*' .*? '*/' -> skip ;
COMENTARIO_LINEA : '//' ~[\r\n]* -> skip ;