package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

import java.util.List;

public class AstDirectiveIf extends AstDirective{

    private AstExpression astExpression;
    private AstStatementList astStatementList;
    private List<AstDirectiveIf> astElseifList;
    private AstDirectiveIf astElse;

    public AstDirectiveIf (AstExpression astExpression, AstStatementList astStatementList,
                           List<AstDirectiveIf> astElseifList, AstDirectiveIf astElse) {
        this.astExpression = astExpression;
        this.astStatementList = astStatementList;
        this.astElseifList = astElseifList;
        this.astElse = astElse;
    }

    @Override
    public void execute(InterpretContext ctx) {
        //代表else
        if(astExpression == null) {
            astStatementList.execute(ctx);
            return;
        }
        //代表 if/elseif
        Boolean result = (Boolean) astExpression.execute(ctx);

        ctx.getValueStack().getIfExpreStack().push(result);

        if(result) {
            astStatementList.execute(ctx);
            return;
        }

        if(astElseifList != null) {
            for(AstDirectiveIf astElseIf : astElseifList) {
                result = ctx.getValueStack().getIfExpreStack().pop();
                if(result) {
                   ctx.getValueStack().getIfExpreStack().push(result);
                   break;
                }
                astElseIf.execute(ctx);
            }
        }

        if(astElse != null) {
            result = ctx.getValueStack().getIfExpreStack().pop();
            if (result != null && !result) {
                astElse.execute(ctx);
            }
        }
        return;
    }
}
