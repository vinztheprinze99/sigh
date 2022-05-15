package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

public class ExpressionStatementNode extends StatementNode
{
    public final ExpressionNode expression;

    public ExpressionStatementNode (Span span, Object expression) {
        super(span);
        this.expression = Util.cast(expression, ExpressionNode.class);
        System.out.println(this.expression.contents());
    }

    @Override public String contents () {
        return expression.contents();
    }
}
