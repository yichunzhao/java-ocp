package Collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * how to reverse a List, moving elements at the tail to the head.
 */
public class ReverseList {
    public static final List<String> listOne = new ArrayList<>(Arrays.asList("Jack", "Tom", "Sam", "John", "James"));

    public static void main(String[] args) {
        System.out.println("original:  " + listOne);

        System.out.println("reversed: " + reverse(listOne));
    }

    public static <T> List<T> reverse(List<T> original) {
        Deque<T> stack = new LinkedList<>();
        original.stream().forEach(e -> stack.push(e));

        original.clear();

        IntStream.range(0, stack.size()).forEach(i -> original.add(stack.pop()));
        return original;
    }
}
