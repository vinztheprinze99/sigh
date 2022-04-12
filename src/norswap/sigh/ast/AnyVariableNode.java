package norswap.sigh.ast;

import norswap.autumn.positions.Span;

public class AnyVariableNode extends ExpressionNode{
    public AnyVariableNode (Span span) {
        super(span);
    }

    @Override
    public String contents () {
        return "#";
    }
}
