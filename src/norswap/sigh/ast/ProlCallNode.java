package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

import java.sql.Ref;
import java.util.List;

public class ProlCallNode extends ExpressionNode {

    public final ExpressionNode function;
    public final List<ExpressionNode> arguments;

    @SuppressWarnings("unchecked")
    public ProlCallNode (Span span, Object function, Object arguments) {
        super(span);
        this.function = Util.cast(function, ExpressionNode.class);
        this.arguments = Util.cast(arguments, List.class);
    }

    @Override public String contents ()
    {
        String args = "(";
        for(ExpressionNode arg : this.arguments){
            args += " "+ arg.getClass() + ":" + arg.contents()+"; ";
        }
        args += ")";
        return function.contents() + args;
    }
}
