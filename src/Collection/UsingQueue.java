package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {
  public static void main(String[] args) {
    // FIFO
    // Using LinkedList to impl.
    //LinkedList impl. Deque interface.
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < 10; i++) {
      //
      queue.add(i);
    }
    System.out.println("Elements in the queue: " + queue);

    int removed = queue.remove();
    System.out.println("removed: " + removed);
    int top = queue.peek();
    System.out.println("top: " + top);

    System.out.println(queue);
  }
}
