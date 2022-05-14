package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

import java.util.List;

public class RuleDeclarationNode extends ProlNode{
    public final String name;
    public final List<ParameterNode> params;
    public final ExpressionNode rule;

    @SuppressWarnings("unchecked")
    public RuleDeclarationNode(Span span, Object name, Object params, Object rule) {
        super(span);
        this.name = Util.cast(name, String.class);
        this.params = Util.cast(params, List.class);
        this.rule = Util.cast(rule, ExpressionNode.class);
    }

    @Override public String name () {
        return name;
    }

    @Override public String contents () {
        return "rule " + name;
    }

    @Override public String declaredThing () {
        return "rule";
    }
}
