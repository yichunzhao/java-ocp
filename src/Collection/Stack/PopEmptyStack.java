package Collection.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

/**
 * What happens as pop from an empty stack?
 */
public class PopEmptyStack {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        try {
            Integer result = stack.pop();
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
        }
    }
}
