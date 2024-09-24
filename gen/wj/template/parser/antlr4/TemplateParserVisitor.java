// Generated from java-escape by ANTLR 4.11.1
package wj.template.parser.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TemplateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TemplateParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(TemplateParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(TemplateParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_buildmethod}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_buildmethod(TemplateParser.Expression_buildmethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_identifier}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_identifier(TemplateParser.Expression_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_field}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_field(TemplateParser.Expression_fieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_is_exsit}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_is_exsit(TemplateParser.Expression_is_exsitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_method}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_method(TemplateParser.Expression_methodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_default_value}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_default_value(TemplateParser.Expression_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_binary_operator}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_binary_operator(TemplateParser.Expression_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(TemplateParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TemplateParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(TemplateParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(TemplateParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#directive_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_if(TemplateParser.Directive_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#directive_elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_elseif(TemplateParser.Directive_elseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#directive_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_else(TemplateParser.Directive_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#directive_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_for(TemplateParser.Directive_forContext ctx);
}