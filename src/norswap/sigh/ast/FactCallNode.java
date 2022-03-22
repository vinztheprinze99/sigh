package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;
import java.util.List;

public final class FactCallNode extends ExpressionNode
{
    public final ExpressionNode def;
    public final List<ExpressionNode> arguments;

    @SuppressWarnings("unchecked")
    public FactCallNode (Span span, Object function, Object arguments) {
        super(span);
        this.def = Util.cast(function, ExpressionNode.class);
        this.arguments = Util.cast(arguments, List.class);
    }

    @Override public String contents ()
    {
        String args = arguments.size() == 0 ? "()" : "(...)";
        return def.contents() + args;
    }
}
