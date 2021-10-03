package Collection.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * ArrayDeque implements Deque interface
 *
 * <p>it can be used to implement both stack and queue.
 *
 * <p>It is not thread safe.
 *
 * <p>add, offer: add throws illegalState exception as the Q having no space. element, peek: element
 * throws an exception as the Q is empty.
 *
 * @author YNZ
 */
public class ImplementingQueueUsingArrayDeQue {

  public static void main(String[] args) {
    // head pointer  index=0 and tail pointer index=length-1
    Queue<String> products = new ArrayDeque<>(Arrays.asList("p1", "p2", "p3"));

    // elements in the Q:  p1 p2 p3
    System.out.printf("original Q: %s \n", products);

    // insert an element at the tail.
    products.offer("P0");

    // elements in the Q:  p1 p2 p3
    System.out.printf("original Q: %s \n", products);

    // peek the head  p1
    System.out.printf("peek head element: %s \n", products.peek());
  }
}
