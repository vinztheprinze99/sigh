package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;
import java.util.List;

public class QuestionCallNode extends StatementNode{

    public final ExpressionNode def;
    public final List<ExpressionNode> arguments;

    @SuppressWarnings("unchecked")
    public QuestionCallNode (Span span, Object function, Object arguments) {
        super(span);
        this.def = Util.cast(function, ExpressionNode.class);
        this.arguments = Util.cast(arguments, List.class);
        System.out.println(contents());
    }

    @Override public String contents ()
    {
        String args = "(";
        for(ExpressionNode arg : this.arguments){
            args += " "+ arg.getClass() + ":" + arg.contents()+"; ";
        }
        args += ")";
        return def.contents() + args;
    }
}