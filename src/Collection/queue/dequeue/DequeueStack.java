package Collection.queue.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueStack {
  public static void main(String[] args) {
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(123);
    stack.push(45);
    stack.push(666);

    System.out.println("pop up the head element: " + stack.pop());

    Deque<String> stringStack = new LinkedList<>();
    stringStack.push("this");
    stringStack.push("is");
    stringStack.push("a");
    stringStack.push("winter");

    System.out.println("popup the head: " + stringStack.pop());
  }
}
