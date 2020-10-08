package StringProcessing.formating;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 * using Formatter class to write formatted string to a File, a IO stream, or a String builder object.
 * <p>
 * format(String format, Object... args)
 * format(Locale l,String format, Object... args)
 * <p>
 * System.out.println() can’t write formatted strings to the
 * standard output; System.out.format() and System.out.printf() can.
 */
public class UsingFormattingClass {
    public static void main(String[] args) throws FileNotFoundException {

        String name = "Shreya";
        //write a formatted stream into a file
        Formatter formatter = new Formatter(new File("data.text"));
        formatter.format("my name is %s", name);
        formatter.flush();

        //using printf, where it invokes Formatter
        System.out.printf("my name is %s", name);
    }
}
