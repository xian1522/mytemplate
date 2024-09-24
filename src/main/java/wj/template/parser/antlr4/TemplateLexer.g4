lexer grammar TemplateLexer;

TEXT_PLAIN              : ~('$'|'<')+                      ;
TEXT_CHAR_SINGLE        : ('$'|'<')                        ;
CLOSE_IF                : '</#if>'                         ;
OPEN_IF                 : '<#if'                                ->pushMode(INSIDE);
ELSEIF                  : '<#elseif'                            ->pushMode(INSIDE);
ELSE                    : '<#else>'                             ;
OPEN_FOR                : '<#list'                              ->pushMode(INSIDE);
CLOSE_FOR               : '</#list>'                            ;
VALUE_OPEN              : '${'                                  ->pushMode(INSIDE);


mode INSIDE;
WHITESPACE              : [ \t\r\n]+                       -> skip ;
AS                      : 'as'                             ;
TRUE                    : 'true'                           ;

AND                     : '&&'                             ;
OR                      : '||'                             ;

DOT                     : '.'                              ;
QUESTION                : '?'                              ;
DOUBLEQ                 : '??'                             ;
NOT                     : '!'                              ;
COMMA                   : ','                              ;
LPAREN                  : '('                              ;
RPAREN                  : ')'                              ;
LBRACE                  : '{'                              ;
RBRACE                  : '}'                                   ->popMode;
GT                      : '>'                                   ->popMode;
EQUAL                   : '=='                             ;
NE                      : '!='                             ;
GTO                     : 'gt'                             ;
LTO                     : 'lt'                             ;

PLUS                    : '+'                              ;
MINUS                   : '-'                              ;
MUL                     : '*'                              ;
DIV                     : '/'                              ;
MOD                     : '%'                              ;


IDENTIFIER              : [_a-zA-Z][_a-zA-Z0-9]*           ;
STRING_DOUBLE           : '"' OTHERS*? '"'                 ;
STRING_SINGLE           : '\''OTHERS*? '\''                ;
INTEGER                 : '0' | [1-9][0-9]*                ;
fragment OTHERS         : ~('\\' | '\r' | '\n')            ;