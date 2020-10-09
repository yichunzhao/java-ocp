package StringProcessing.formating;

/**
 * to use methods format() and printf(), you need to define a format string that defines how to format text and
 * an object argument list that defines what to format.
 * <p>
 * format specifiers
 * A format specification must start with a % sign and end with conversion character
 * %[argument_index$][flags][width][.precision]conversion_char
 * <p>
 * argument_index: optional decimal integer indicating the position of the argument in the argument list.  the first
 * argument is referred by 1$, the second by 2$, and so forth.
 * <p>
 * conversion_char: required.  The conversion characters on the exam are %b, %c, %d, %f ,and %s
 * A character indicating how the argument should be formatted. The set of valid conversions
 * for a given argument depends on the argument's data type.
 *
 * You can pass any type of primitive variable or object reference
 * to %b.
 */
public class DefineBooleanFormatParameter {

    public static void main(String[] args) {
        //%b defines how to format boolean or Boolean:
        // if an instance is not null, it returns true; if instance is null it returns true
        //you can pass any type of primitive variable or object reference to %b.
        String name = "whatever";
        Integer age = null;
        boolean isShort = true;
        System.out.format("Name %b, age %b, isShort %b", name, age, isShort);

        //a mismatch in the number of arguments passed to method format() and printf()
        //if passed arguments are more than formatting parameters, the extras are ignored.
        System.out.printf("Name %b", name, age, isShort);

        //formatting parameters is more than the arguments passed to methods format() or printf(),
        //it throws java.util.MissingFormatArgumentException in a runtime
        try {
            System.out.format("\nName %b, age %b, isShort %b\n", name);
        } catch (Exception e) {
            System.out.println(e);
        }

        //%[arg_index$][flags][width][.precision]conversion_char; the following demo [width]
        System.out.format("\nName defined %10b", name);
        System.out.format("\nName defined %5b", name);
        System.out.format("\nName defined %b", name);

    }
}
