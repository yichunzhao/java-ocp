/*
 *
 * How to convert a primitive array into a ArrayList
 *
 */
package StreamExp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Converting a char array char[] to List<Character>. It cannot directly use Arrays.asList(T... args), for the Type
 * parameter T will be inferred as char[].
 * <p>
 * The easiest way to use Java 8 String to IntStream, and then mapToObject Character. You need cast a int to Character.
 *
 * @author YNZ
 */
public class ConvertPrimArrayIntoList {

    public static void main(String[] args) {

        List<Character> charList = new ArrayList<>();

        // a primitive array
        char[] chars = "I dislike it.".toCharArray();
        for (char c : chars) {
            charList.add(c);
        }

        // in java 8
        String str = "what is happening?";
        List<Character> listOfChar = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println("List chars : " + listOfChar);
    }
}
