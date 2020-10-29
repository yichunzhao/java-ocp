package CodeCharllenge;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * This problem was asked by Google.
 * <p>
 * Given a string of words delimited by spaces, reverse the words in string. For example, given "hello world here", return "here world hello"
 */

public class ReverseWordsInString {
    private static String target = "hello world here";

    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        Arrays.stream(target.split("\\s")).forEach(stack::push);

        stack.forEach(s -> System.out.print(s + " "));
    }

}
