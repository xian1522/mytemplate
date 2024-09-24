package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

public class AstDefaultValue extends AstExpression{

    private AstExpression expression;
    private String defaultValue;

    public AstDefaultValue(AstExpression expression, String defaultValue) {
        this.expression = expression;
        this.defaultValue = defaultValue;
    }

    @Override
    public Object execute(InterpretContext ctx) {

        Object value = expression.execute(ctx);

        if(value == null) {
            return defaultValue;
        }
        return value;
    }
}
