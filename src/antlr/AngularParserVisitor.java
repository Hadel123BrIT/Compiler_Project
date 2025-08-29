// Generated from D:/AngularCompiler/Final/compiler1/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmnt(AngularParser.ImportStmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorLbl}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorLbl(AngularParser.DecoratorLblContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompDef}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompDef(AngularParser.CompDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStmnt(AngularParser.VarStmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunDec}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDec(AngularParser.FunDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDec}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDec(AngularParser.ClassDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDec}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDec(AngularParser.InterfaceDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStmnt(AngularParser.ExportStmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStmnt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmnt(AngularParser.AssignmentStmntContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDefinition(AngularParser.ComponentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentOptions(AngularParser.ComponentOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentPropertyList(AngularParser.ComponentPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#commaComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaComponentProperty(AngularParser.CommaComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentProperty(AngularParser.ComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#divElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivElement(AngularParser.DivElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#pElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPElement(AngularParser.PElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#imgElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgElement(AngularParser.ImgElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#imgAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgAttributes(AngularParser.ImgAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularBinding(AngularParser.AngularBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularExpression(AngularParser.AngularExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#dotIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotIdentifier(AngularParser.DotIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttribute(AngularParser.StyleAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#srcAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrcAttribute(AngularParser.SrcAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#altAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAttribute(AngularParser.AltAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#h2Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2Element(AngularParser.H2ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#genericElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericElement(AngularParser.GenericElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#divAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivAttributes(AngularParser.DivAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#pAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPAttributes(AngularParser.PAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#h2Attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2Attributes(AngularParser.H2AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularEvent(AngularParser.AngularEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngularParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElements(AngularParser.ArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#commaArrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaArrayElement(AngularParser.CommaArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(AngularParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AngularParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#commaProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaProperty(AngularParser.CommaPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AngularParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportClause(AngularParser.ImportClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#commaImportSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaImportSpecifier(AngularParser.CommaImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#twoWayBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgDirective(AngularParser.NgDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#commaParamterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaParamterList(AngularParser.CommaParamterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AngularParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#commaIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaIdentifier(AngularParser.CommaIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#commaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaExpression(AngularParser.CommaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
}