parser grammar TemplateParser;

options{
    tokenVocab = TemplateLexer;
}

template        :   block EOF
                ;

block           :   (text | value | directive)*
                ;

text            :   TEXT_PLAIN
                |   TEXT_CHAR_SINGLE;

value           :   VALUE_OPEN expression '}';

expression      :   constant                                                #expression_constant
                |   identifier                                              #expression_identifier
                |   expression '.' IDENTIFIER                               #expression_field
                |   expression ('*' | '/' | '%') expression                 #expression_binary_operator
                |   expression ('==' | '!=') expression                     #expression_binary_operator
                |   expression ('gt' | 'lt') expression                     #expression_binary_operator
                |   expression ('+' | '-' ) expression                      #expression_binary_operator
                |   expression '?'  IDENTIFIER ('(' expression_list? ')')?  #expression_method
                |   expression '.'  IDENTIFIER ('(' expression_list? ')')   #expression_buildmethod
                |   expression '??'                                         #expression_is_exsit
                |   expression '!' IDENTIFIER?                              #expression_default_value
                |   expression ('&&' | '||' ) expression                    #expression_binary_operator
                ;
expression_list :   expression (',' expression)*;
identifier      :   IDENTIFIER
                ;
constant        :   STRING_DOUBLE
                |   STRING_SINGLE
                |   INTEGER
                |   TRUE;

directive       :   directive_if
                |   directive_for;

directive_if    :   '<#if' expression '>' block directive_elseif* directive_else? CLOSE_IF ;
directive_elseif:   '<#elseif' expression '>' block;
directive_else  :   '<#else>' block;

directive_for   :   '<#list' expression AS identifier '>' block '</#list>';