//lexer grammar AngularLexer;

lexer grammar AngularLexer;

SEMI             : ';' ;
DOT              : '.' ;
ARRAY_START      : '[' ;
ARRAY_END        : ']' ;
LBRACE           : '{' ;
RBRACE           : '}' ;
LPAREN           : '(' ;
RPAREN           : ')' ;
COLON            : ':' ;
COMMA            : ',' ;
EQUAL            : '=' ;
BACKTICK         : '`' ;
AT               : '@' ;
HTML_TAG_OPEN    : '<' ;
HTML_TAG_CLOSE   : '>' ;
HTML_TAG_END     : '</' ;
HTML_SELF_CLOSING: '/>' ;

//Key words
LET           : 'let' ;
CONST         : 'const' ;
FUNCTION      : 'function' ;
CLASS         : 'class' ;
CONSTRUCTOR   : 'constructor' ;
INTERFACE     : 'interface' ;
IMPORT        : 'import' ;
FROM          : 'from' ;
EXPORT        : 'export' ;
TRUE          : 'true' ;
FALSE         : 'false' ;
THIS          : 'this' ;

// 3. Angular-specific tokens (higher priority)
AT_COMPONENT   : '@Component' ;
SELECTOR       : 'selector' ;
TEMPLATE       : 'template' ;
STANDALONE     : 'standalone' ;
IMPORTS        : 'imports' ;
STYLES         : 'styles' ;
STYLE          : 'style' ;
NG_FOR         : '*ngFor' ;
NG_IF          : '*ngIf' ;
CLICK_EVENT    : '(click)' ;

// 4. HTML Tags (before Identifier)
DIV_TAG        : 'div' ;
P_TAG          : 'p' ;
IMG_TAG        : 'img' ;
H2_TAG         : 'h2' ;
Alt            : 'alt';
Src            : 'src';

// 5. Literals
StringLiteral  : '"' ~["]* '"' | '\'' ~[']* '\'' ;
NumberLiteral  : [0-9]+ ('.' [0-9]+)? ;
BooleanLiteral : TRUE | FALSE ;

// 6. الأنماط المعتمدة على Identifier
BINDING          : '[' Identifier ']' ;
TWO_WAY_BINDING  : '[(' Identifier ')]' ;
PROPERTY_BINDING : '{{' ~[}]* '}}' ;

// 7. General patterns (lower priority)
Identifier       : [a-zA-Z_$][a-zA-Z0-9_$]* ;
DIRECTIVE        : '\\*[a-zA-Z][a-zA-Z0-9_]*' ;
EVENT_BINDING    : '\\([a-zA-Z][a-zA-Z0-9_]*\\)' ;

// 8. Whitespace and comments
WHITESPACE       : [ \t\r\n]+ -> skip ;
COMMENT          : '//' ~[\r\n]* -> skip ;