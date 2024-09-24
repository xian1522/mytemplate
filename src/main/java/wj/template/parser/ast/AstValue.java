package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

import java.beans.Expression;
import java.io.IOException;

public class AstValue extends AstStatement{
    private AstExpression expression;

    public AstValue(AstExpression expression) {
        this.expression = expression;
    }

    @Override
    public void execute(InterpretContext ctx) {
        Object value = expression.execute(ctx);
        if(value != null) {
            try {
                ctx.getWriter().write(value.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
