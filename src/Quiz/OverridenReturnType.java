package Quiz;

/**
 * about overriding: return types should follow the co-variant principle.
 * meaning that the overriding method should not return a super-class type of the overridden method return type.
 * In another word, the overriding method return an object type, that should narrow down. by this way, client don't
 * need to cast the return value.
 * <p>
 * co-variant principle doesn't apply on the primitive types, so keeping them the same.
 */

class Base {
    public short getValue() {
        return 1;
    }

    ;
}

class Base2 extends Base {
    public short getValue() {
        return 2;
    }

    ;
}

public class OverridenReturnType {
}
