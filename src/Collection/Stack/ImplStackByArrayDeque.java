package Collection.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

/** Deque interface provides both stack and queue APIs */
public class ImplStackByArrayDeque {

  public static void main(String[] args) {
    Deque<String> stack = new ArrayDeque<>();

    Arrays.asList("i love this game".split("\\s")).forEach(stack::push);
    System.out.printf("original stack:%s \n", stack);

    stack.push("full-stop");
    System.out.printf("updated stack:%s \n", stack);

    System.out.printf("in a full sentence: %s \n", stack.stream().collect(Collectors.joining(" ")));
  }
}
