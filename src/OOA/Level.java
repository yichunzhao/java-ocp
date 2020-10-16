package OOA;

import java.util.Arrays;

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

    public static final Level[] values;

    private static int count;
    private String label;
    private int value;

    static {
        System.out.println("Class static init block: ");
        BEGINNER = new Level("BEGINNER");
        INTERMEDIATE = new Level("INTERMEDIATE");
        SENIOR = new Level("SENIOR");
        values = new Level[]{BEGINNER, INTERMEDIATE, SENIOR};
    }

    private Level(String label) {
        System.out.println("Instance Constructor: ");
        this.label = label;
        value = count++;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.label;
    }

    public static void main(String[] args) {
        System.out.println("Senior value: " + Level.SENIOR.value);

        System.out.printf("values: %s \n ", Arrays.toString(Level.values));
    }
}
