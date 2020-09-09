package Collection.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Queue
 * <p>
 * add()-used to add elements to the end;
 * peek()-returns a copy of the first element;
 * remove()-removes the element: error if empty, throws NoSuchElementException.
 * poll()-removes from the top;
 */

public class UsingQueue {
    public static void main(String[] args) {
        // FIFO
        // Using LinkedList to impl.
        //LinkedList impl. Deque interface, which implements Queue interface.
        Queue<Integer> queue = IntStream.range(0, 10).boxed().collect(Collectors.toCollection(LinkedList::new));
        System.out.println("Elements in the queue: " + queue);

        queue.add(250);
        System.out.println("add() a new element at the tail: " + queue);

        System.out.println("looking at the first element: " + queue.peek());

        int removed = queue.remove();
        System.out.println("removed: " + removed);

        System.out.println(queue);

        queue.poll();
        System.out.println("Poll the element at the top: " + queue);

        System.out.println("difference between poll() and remove() as Q is empty:");
        System.out.println("poll() return null but remove throw NoSuchElementException");
    }
}
