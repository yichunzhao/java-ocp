package Array;

import java.util.Arrays;

/**
 * Converting a char[] into a String.
 * <p>
 * Arrays.toString(char[] chars) return a string which contains '[' ']' and ','
 */
public class CharArrayToString {

    public static void main(String[] args) {
        char[] chars = {'t', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'g', 'a', 'm', 'e'};
        System.out.printf("convert char array to String : %s \n ", convert(chars));

        System.out.printf("convert char array to String : %s \n ", convertByBuilder(chars));
    }

    private static String convert(char[] chars) {
        return Arrays.toString(chars);
    }

    private static String convertByBuilder(char[] chars) {
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }

}
