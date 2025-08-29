// Generated from D:/AngularCompiler/Final/compiler1/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStmnt(AngularParser.ImportStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStmnt(AngularParser.ImportStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorLbl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorLbl(AngularParser.DecoratorLblContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorLbl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorLbl(AngularParser.DecoratorLblContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompDef(AngularParser.CompDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompDef(AngularParser.CompDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarStmnt(AngularParser.VarStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarStmnt(AngularParser.VarStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunDec}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunDec(AngularParser.FunDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunDec}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunDec(AngularParser.FunDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDec}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassDec(AngularParser.ClassDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDec}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassDec(AngularParser.ClassDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceDec}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDec(AngularParser.InterfaceDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceDec}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDec(AngularParser.InterfaceDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExportStmnt(AngularParser.ExportStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExportStmnt(AngularParser.ExportStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmnt(AngularParser.AssignmentStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmnt(AngularParser.AssignmentStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComponentDefinition(AngularParser.ComponentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComponentDefinition(AngularParser.ComponentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentOptions}.
	 * @param ctx the parse tree
	 */
	void enterComponentOptions(AngularParser.ComponentOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentOptions}.
	 * @param ctx the parse tree
	 */
	void exitComponentOptions(AngularParser.ComponentOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterComponentPropertyList(AngularParser.ComponentPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitComponentPropertyList(AngularParser.ComponentPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#commaComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterCommaComponentProperty(AngularParser.CommaComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#commaComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitCommaComponentProperty(AngularParser.CommaComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterComponentProperty(AngularParser.ComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitComponentProperty(AngularParser.ComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void enterAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void exitAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#divElement}.
	 * @param ctx the parse tree
	 */
	void enterDivElement(AngularParser.DivElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#divElement}.
	 * @param ctx the parse tree
	 */
	void exitDivElement(AngularParser.DivElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#pElement}.
	 * @param ctx the parse tree
	 */
	void enterPElement(AngularParser.PElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#pElement}.
	 * @param ctx the parse tree
	 */
	void exitPElement(AngularParser.PElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imgElement}.
	 * @param ctx the parse tree
	 */
	void enterImgElement(AngularParser.ImgElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imgElement}.
	 * @param ctx the parse tree
	 */
	void exitImgElement(AngularParser.ImgElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imgAttributes}.
	 * @param ctx the parse tree
	 */
	void enterImgAttributes(AngularParser.ImgAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imgAttributes}.
	 * @param ctx the parse tree
	 */
	void exitImgAttributes(AngularParser.ImgAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularBinding}.
	 * @param ctx the parse tree
	 */
	void enterAngularBinding(AngularParser.AngularBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularBinding}.
	 * @param ctx the parse tree
	 */
	void exitAngularBinding(AngularParser.AngularBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularExpression}.
	 * @param ctx the parse tree
	 */
	void enterAngularExpression(AngularParser.AngularExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularExpression}.
	 * @param ctx the parse tree
	 */
	void exitAngularExpression(AngularParser.AngularExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#dotIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDotIdentifier(AngularParser.DotIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#dotIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDotIdentifier(AngularParser.DotIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttribute(AngularParser.StyleAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttribute(AngularParser.StyleAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#srcAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSrcAttribute(AngularParser.SrcAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#srcAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSrcAttribute(AngularParser.SrcAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#altAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAltAttribute(AngularParser.AltAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#altAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAltAttribute(AngularParser.AltAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#h2Element}.
	 * @param ctx the parse tree
	 */
	void enterH2Element(AngularParser.H2ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#h2Element}.
	 * @param ctx the parse tree
	 */
	void exitH2Element(AngularParser.H2ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#genericElement}.
	 * @param ctx the parse tree
	 */
	void enterGenericElement(AngularParser.GenericElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#genericElement}.
	 * @param ctx the parse tree
	 */
	void exitGenericElement(AngularParser.GenericElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#divAttributes}.
	 * @param ctx the parse tree
	 */
	void enterDivAttributes(AngularParser.DivAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#divAttributes}.
	 * @param ctx the parse tree
	 */
	void exitDivAttributes(AngularParser.DivAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#pAttributes}.
	 * @param ctx the parse tree
	 */
	void enterPAttributes(AngularParser.PAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#pAttributes}.
	 * @param ctx the parse tree
	 */
	void exitPAttributes(AngularParser.PAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#h2Attributes}.
	 * @param ctx the parse tree
	 */
	void enterH2Attributes(AngularParser.H2AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#h2Attributes}.
	 * @param ctx the parse tree
	 */
	void exitH2Attributes(AngularParser.H2AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularEvent}.
	 * @param ctx the parse tree
	 */
	void enterAngularEvent(AngularParser.AngularEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularEvent}.
	 * @param ctx the parse tree
	 */
	void exitAngularEvent(AngularParser.AngularEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngularParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngularParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void enterArrayElements(AngularParser.ArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void exitArrayElements(AngularParser.ArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#commaArrayElement}.
	 * @param ctx the parse tree
	 */
	void enterCommaArrayElement(AngularParser.CommaArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#commaArrayElement}.
	 * @param ctx the parse tree
	 */
	void exitCommaArrayElement(AngularParser.CommaArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(AngularParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(AngularParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AngularParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AngularParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#commaProperty}.
	 * @param ctx the parse tree
	 */
	void enterCommaProperty(AngularParser.CommaPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#commaProperty}.
	 * @param ctx the parse tree
	 */
	void exitCommaProperty(AngularParser.CommaPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AngularParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AngularParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AngularParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importClause}.
	 * @param ctx the parse tree
	 */
	void enterImportClause(AngularParser.ImportClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importClause}.
	 * @param ctx the parse tree
	 */
	void exitImportClause(AngularParser.ImportClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#commaImportSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterCommaImportSpecifier(AngularParser.CommaImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#commaImportSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitCommaImportSpecifier(AngularParser.CommaImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#twoWayBinding}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#twoWayBinding}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgDirective(AngularParser.NgDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgDirective(AngularParser.NgDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#commaParamterList}.
	 * @param ctx the parse tree
	 */
	void enterCommaParamterList(AngularParser.CommaParamterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#commaParamterList}.
	 * @param ctx the parse tree
	 */
	void exitCommaParamterList(AngularParser.CommaParamterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#commaIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCommaIdentifier(AngularParser.CommaIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#commaIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCommaIdentifier(AngularParser.CommaIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#commaExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommaExpression(AngularParser.CommaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#commaExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommaExpression(AngularParser.CommaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
}