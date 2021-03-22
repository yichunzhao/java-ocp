package Collection.list;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * an Iterable of Strings, joining into a single String
 */
public class ListToString {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("I", "Like", "This", "Game");
        System.out.printf("array to string %s \n", String.join(" ", strings));

        Deque<String> stack = new LinkedList<>();
        strings.forEach(s -> stack.push(s));

        System.out.printf("deque to string %s \n", String.join(" ", stack));
    }

}
