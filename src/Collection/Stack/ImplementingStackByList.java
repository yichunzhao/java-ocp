package Collection.Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Using a LinkedList to implement a stack, and then reversing a String.
 * <p>
 * Deque offers stack related interface
 *
 * @author YNZ
 */
public class ImplementingStackByList {

    public static void main(String[] args) {
        //using a stack to reverse a String
        String str = "I love Java";
        System.out.println("original:" + str);

        // Deque implemented by a LinkedList.
        // deque is able to impl. both stack and queue.
        Deque<Character> stack = new LinkedList<>();
        str.chars().mapToObj(i -> (char) i).forEach(stack::push);

        System.out.printf("reversed:%s \n", stack.stream().map(String::valueOf).collect(Collectors.joining("")));
    }

}
