package norswap.sigh.interpreter;

import norswap.sigh.ast.*;


/**
 * Class representing structure constructors in the interpreter, simply wrapping the declaration
 * node. Such a wrapper is necessary, because the node is already used to represent the structure
 * type.
 */
public final class FactConstructor
{
    public final FactDeclarationNode declaration;

    public FactConstructor (FactDeclarationNode declaration) {
        this.declaration = declaration;
    }

    @Override public int hashCode () {
        return 31 * declaration.hashCode() + 1;
    }

    @Override public boolean equals (Object other) {
        return other instanceof FactConstructor && ((FactConstructor) other).declaration == declaration;
    }
}
