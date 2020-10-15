package OOA;

/**
 * The following code demo the implicit operations of an Enum
 *
 * <p>
 * Java enum has an internal static init block to instantiate each Constant; once a Enum type is loaded in the memory
 * this static block will be executed implicitly first.
 */
public class Level {
    public static final Level BEGINNER;
    public static final Level INTERMEDIATE;
    public static final Level SENIOR;

    private static int count;
    private int value;

    static {
        System.out.println("Class static init block: ");
        BEGINNER = new Level();
        INTERMEDIATE = new Level();
        SENIOR = new Level();
    }

    private Level() {
        System.out.println("Instance Constructor: ");
        value = count++;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println("Senior value: " + Level.SENIOR.value);
    }
}
