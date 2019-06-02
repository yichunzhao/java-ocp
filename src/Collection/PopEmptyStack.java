package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class PopEmptyStack {

    //what happen as pop from an empty stack?
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        Integer result = stack.pop();
        System.out.println(result); //throw NoSuchElementException.
    }

}
