package norswap.sigh.types;

import norswap.utils.NArrays;
import java.util.Arrays;

public final class DefType extends Type
{
    public final Type[] paramTypes;

    public DefType (Type... paramTypes) {
        this.paramTypes = paramTypes;
    }

    @Override public String name() {
        String[] params = NArrays.map(paramTypes, new String[0], Type::name);
        return String.format("(%s)", String.join(",", params));
    }

    @Override public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof DefType)) return false;
        DefType other = (DefType) o;

        return Arrays.equals(paramTypes, other.paramTypes);
    }

    @Override public int hashCode () {
        return 31 * Arrays.hashCode(paramTypes);
    }
}
