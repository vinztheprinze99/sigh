package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

import java.util.List;

public abstract class ProlNode extends DeclarationNode{

    public final String name;
    public final List<ParameterNode> parameters;

    @SuppressWarnings("unchecked")
    public ProlNode
            (Span span, Object name, Object parameters) {
        super(span);
        this.name = Util.cast(name, String.class);
        this.parameters = Util.cast(parameters, List.class);
    }
}
