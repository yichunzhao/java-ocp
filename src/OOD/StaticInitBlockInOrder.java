package OOD;

/**
 * a static block is executed once the class is loaded in memory, before any instance construction.
 *
 * a class may define several static init. block, they are executed in the order of their appearance in a class.
 * static var and static init they are executed in the order of their appearance in a class; so static var. declaration
 * should stand before static init block; otherwise, it gives a compilation error. It doesn't support forward
 * referencing.
 * <p>
 * Static method and var are loaded when the Class is loaded in memory, which happens before creations of instances.
 * <p>
 * Always referring a static var by its Class name, but not instances; for it confusing readers to think of it as a
 * instance var.
 * <p>
 * Static method is used to manipulate only static variables or to define utility methods.
 * <p>
 * static block allows conditional assignment, and handling exceptions as achieving values for the static variables.
 * For instance, values may be read from a file, and this process may throw a checked exception, so it has to be
 * handled.
 */
public class StaticInitBlockInOrder {
    static int var = 10;

    static {
        System.out.println("first init " + var++);
    }

    static {
        System.out.println("second init " + var++);
    }

    public StaticInitBlockInOrder() {
        System.out.printf("constructor: ");
    }

    public static void main(String[] args) {

        new StaticInitBlockInOrder();

    }
}
