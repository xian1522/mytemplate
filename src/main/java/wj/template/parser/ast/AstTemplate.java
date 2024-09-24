package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

public class AstTemplate extends AstStatement{

    private AstStatementList astStatementList;
    public AstTemplate(AstStatementList astStatementList) {
        this.astStatementList = astStatementList;
    }


    @Override
    public void execute(InterpretContext ctx) {
        astStatementList.execute(ctx);
    }
}
