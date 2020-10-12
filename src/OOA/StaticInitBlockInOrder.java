package OOA;

/**
 * a class may define several static init. block, they are executed in the order of their appearance in a class.
 * static var and static init they are executed in the order of their appearance in a class; so static var. declaration
 * should stand before static init block; otherwise, it gives a compilation error. It doesn't support forward
 * referencing.
 * <p>
 * Static method and var are loaded when the Class is loaded in memory, which happens before creations of instances.
 */
public class StaticInitBlockInOrder {
    static int var = 10;

    static {
        System.out.println("first init " + var++);
    }

    static {
        System.out.println("second init" + var++);
    }

    public static void main(String[] args) {
        System.out.println(var);

    }
}
