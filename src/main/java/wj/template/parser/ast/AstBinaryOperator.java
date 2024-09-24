package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

public class AstBinaryOperator extends AstExpression {

    private AstExpression leftExpression;
    private String operator;
    private AstExpression rightExpression;

    public AstBinaryOperator(AstExpression leftExpression, String operator, AstExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.operator = operator;
        this.rightExpression = rightExpression;
    }

    @Override
    public Object execute(InterpretContext ctx) {
        String left = leftExpression.execute(ctx).toString();

        if("&&".equals(operator)) {
            if(!Boolean.valueOf(left)){
                return Boolean.valueOf(left);
            }else {
                String right = rightExpression.execute(ctx).toString();
                return Boolean.valueOf(left) && Boolean.valueOf(right);
            }
        }else if("||".equals(operator)) {
            if(Boolean.valueOf(left)) {
                return Boolean.valueOf(left);
            }else {
                String right = rightExpression.execute(ctx).toString();
                return Boolean.valueOf(left) || Boolean.valueOf(right);
            }
        }

        String right = rightExpression.execute(ctx).toString();
        if("==".equals(operator)) {
            return left.equals(right);
        }else if("!=".equals(operator)) {
            return !left.equals(right);
        }else if("gt".equals(operator)) {
            return Integer.valueOf(left) > Integer.valueOf(right);
        }else if("lt".equals(operator)){
            return Integer.valueOf(left) < Integer.valueOf(right);
        }else if("+".equals(operator)) {
            return Integer.valueOf(left) + Integer.valueOf(right);
        }else if("-".equals(operator)){
            return Integer.valueOf(left) - Integer.valueOf(right);
        }else if("*".equals(operator)) {
            return Integer.valueOf(left) * Integer.valueOf(right);
        }else if("/".equals(operator)) {
            return Integer.valueOf(left) / Integer.valueOf(right);
        }else {
            return Integer.valueOf(left) % Integer.valueOf(right);
        }
    }
}
