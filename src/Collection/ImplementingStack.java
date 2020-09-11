package Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * Using Deque to interface a LinkedList, to carry out a stack, by which to reverse a String.
 * <p>
 * Deque offers stack related interface
 * <p>
 * E  pop()
 * void push(E e)
 *
 * @author YNZ
 */
public class ImplementingStack {

    public static void main(String[] args) {
        //using a stack to reverse a String
        String str = "I love Java";
        System.out.println("before:" + str);

        // Deque implemented by a LinkedList.
        // deque is able to impl. both stack and queue.
        Deque<Character> stack = new LinkedList<>();
        str.chars().mapToObj(i -> Character.valueOf((char) i)).forEach(character -> stack.push(character));
        System.out.println("size of stack: " + stack.size());

        System.out.print("reversed:");
        IntStream.range(0, stack.size()).forEach(i -> System.out.print(stack.pop()));
        System.out.println();

        System.out.println("size of stack: " + stack.size());
    }
}
