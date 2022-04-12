package norswap.sigh.ast;

import norswap.autumn.positions.*;
import norswap.utils.*;

public class ConstructorFactNode extends ExpressionNode
{
    public final ReferenceNode ref;

    public ConstructorFactNode (Span span, Object ref) {
        super(span);
        this.ref = Util.cast(ref, ReferenceNode.class);
    }

    @Override public String contents () {
        return "$" + ref.name;
    }
}
