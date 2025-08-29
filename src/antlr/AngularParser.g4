parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

// Parser Rules
program
    : statement* EOF
    ;

statement
    : importStatement               # ImportStmnt
    | decorator                     # DecoratorLbl
    | componentDefinition           # CompDef
    | variableStatement             # VarStmnt
    | functionDeclaration           # FunDec
    | classDeclaration              # ClassDec
    | interfaceDeclaration          # InterfaceDec
    | exportStatement               # ExportStmnt
    | assignment SEMI               # AssignmentStmnt
    ;

assignment : Identifier DOT Identifier EQUAL expression ;

decorator
    : AT_COMPONENT LPAREN LBRACE componentOptions RBRACE RPAREN
    ;

componentDefinition
    : decorator block
    ;

componentOptions
    : componentPropertyList?
    ;

componentPropertyList
    : componentProperty (commaComponentProperty)* COMMA?  // Allows for an optional trailing comma
    ;

commaComponentProperty
    : COMMA componentProperty
    ;

componentProperty
    : SELECTOR COLON StringLiteral
    | TEMPLATE COLON template
    | STYLES COLON (LBRACE? RBRACE?)
    | STANDALONE COLON TRUE
    | IMPORTS COLON array
    ;

template
    : BACKTICK htmlContent? BACKTICK
    ;


htmlContent
    : (htmlElement | interpolation | angularDirective | angularEvent | angularBinding)*
    ;


angularDirective
    : NG_FOR EQUAL StringLiteral
    | NG_IF EQUAL StringLiteral
    ;

htmlElement
    : divElement
    | pElement
    | imgElement
    | h2Element
    | genericElement
    ;


divElement
    : HTML_TAG_OPEN DIV_TAG HTML_TAG_CLOSE htmlContent? HTML_TAG_END DIV_TAG HTML_TAG_CLOSE
    ;


pElement
    : HTML_TAG_OPEN P_TAG pAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END P_TAG HTML_TAG_CLOSE
    ;

imgElement
    : HTML_TAG_OPEN Identifier imgAttributes* HTML_SELF_CLOSING
    ;

imgAttributes
    : angularBinding
    | styleAttribute
    | srcAttribute
    | altAttribute
    ;



angularBinding
    : BINDING EQUAL (angularExpression | StringLiteral)
    ;

angularExpression
    : Identifier (dotIdentifier)* // تحليل تعبيرات مثل selectedProduct.src
    ;

dotIdentifier
    : DOT Identifier
    ;

styleAttribute
    : STYLE EQUAL StringLiteral
    ;

srcAttribute
    : Src EQUAL angularExpression
    ;

altAttribute
    : Alt EQUAL angularExpression
    ;


h2Element
    : HTML_TAG_OPEN H2_TAG htmlAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END H2_TAG HTML_TAG_CLOSE
    ;

genericElement
    : HTML_TAG_OPEN Identifier htmlAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END Identifier HTML_TAG_CLOSE
    ;


htmlAttributes
    : (angularDirective | angularEvent | angularBinding | styleAttribute | srcAttribute | altAttribute | StringLiteral)*
    ;

divAttributes
    : (angularDirective | angularEvent | angularBinding | styleAttribute)*
    ;

pAttributes
    : (angularBinding | interpolation | styleAttribute)*
    ;



h2Attributes
    : (angularBinding | interpolation | styleAttribute)*
    ;

angularEvent
    : CLICK_EVENT EQUAL StringLiteral
    ;







variableStatement
    : Identifier (COLON Identifier)? EQUAL (value | array | object) SEMI
    ;


array
    : ARRAY_START arrayElements? ARRAY_END
    ;


arrayElements
    : arrayElement (commaArrayElement)*
    ;

commaArrayElement
    : COMMA arrayElement
    ;

arrayElement
    : object
    | value  // To handle identifiers, literals, and nested arrays
    ;

object
    : LBRACE (property (commaProperty)*)? RBRACE
    ;

commaProperty
    : COMMA property
    ;

property
    : (Identifier | StringLiteral) COLON value
    ;

value
    : StringLiteral
    | NumberLiteral
    | BooleanLiteral
    | object
    | array
    | Identifier
    ;


functionDeclaration
    : Identifier LPAREN parameterList? RPAREN block
    ;


interpolation
    : PROPERTY_BINDING
    ;



classDeclaration
    : CLASS Identifier LBRACE classBody* RBRACE
    ;




classBody
    : variableStatement
    | functionDeclaration
    | constructorDeclaration
    ;

constructorDeclaration
    : CONSTRUCTOR LPAREN parameterList? RPAREN block
    ;

interfaceDeclaration
    : INTERFACE Identifier LBRACE interfaceBody* RBRACE
    ;

interfaceBody
    : Identifier COLON type SEMI
    ;

importStatement
    : IMPORT (importClause FROM StringLiteral)? SEMI
    ;

importClause
    : (LBRACE importSpecifier (commaImportSpecifier)* RBRACE | Identifier)
    ;

commaImportSpecifier
    : COMMA importSpecifier
    ;

importSpecifier
    : Identifier
    ;


exportStatement
    : EXPORT (variableStatement | functionDeclaration | classDeclaration)
    ;

expression
    : literal
    | Identifier
    | propertyBinding
    | twoWayBinding
    | ngDirective
    | LPAREN expression RPAREN
    ;

literal
    : StringLiteral
    | NumberLiteral
    | BooleanLiteral
    ;

propertyBinding
    : BINDING EQUAL StringLiteral
    ;

twoWayBinding
    : TWO_WAY_BINDING EQUAL StringLiteral
    ;

ngDirective
    : DIRECTIVE EQUAL StringLiteral
    ;

parameterList
    : Identifier COLON Identifier (commaParamterList)*
    ;

commaParamterList
    :COMMA parameterList
    ;




type
    : Identifier ( Identifier (commaIdentifier)* )?
    ;

commaIdentifier
    : COMMA Identifier
    ;

expressionList
    : expression (commaExpression)*
    ;

commaExpression
    : COMMA expression
    ;

block
    : LBRACE statement* RBRACE
    ;
