package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;
import java.util.List;

public class DefDeclarationNode extends ProlNode
{
    @SuppressWarnings("unchecked")
    public DefDeclarationNode
            (Span span, Object name, Object parameters) {
        super(span,name, parameters);

    }

    @Override public String name () {
        return name;
    }

    @Override public String contents () {
        return "def " + name;
    }

    @Override public String declaredThing () {
        return "definition";
    }
}
