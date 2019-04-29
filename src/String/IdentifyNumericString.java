package String;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class IdentifyNumericString {

    public static void main(String[] args) {

        String num1 = "123u357";

        boolean r1 = identify(num1);
        System.out.println(r1);

        boolean r2 = identify8(num1);
        System.out.println(r2);


    }

    public static boolean identify(String numbers) {

        char[] chars = numbers.toCharArray();
        boolean result = true;

        for (int i = 0; i < chars.length; i++) {
            result &= Character.isDigit(chars[i]);
        }

        return result;

    }

    public static boolean identify8(String numbers) {
        return numbers.length() == numbers.chars().map(c -> (char) c).filter(c -> Character.isDigit(c)).count();
    }

}
