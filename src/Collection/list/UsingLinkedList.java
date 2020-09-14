package Collection.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * LinkedList is a double linked list, which implement Deque that extends Queue; we also use LinkedList to implement
 * Stack and Queue.
 * <p>
 * Add: O(1)
 * Remove: O(1)
 * Get: O(n)
 * Contains: O(n)
 */
public class UsingLinkedList {

    public static void main(String[] args) {
        // LinkedList head -> first element and tail-> null
        Random r = new Random();

        LinkedList<Integer> myLinkedList = new LinkedList<>();
        IntStream.range(0, 10).forEach(i -> myLinkedList.add(r.nextInt(100)));
        System.out.println("list of random int(0-100): " + myLinkedList);

        //elements are added from left to right; tail at the right.
        System.out.println("first: " + myLinkedList.getFirst());
        System.out.println("last: " + myLinkedList.getLast());

        //insertion on element
        myLinkedList.add(myLinkedList.size() / 2, 250);
        System.out.println("after insertion: " + myLinkedList);

        //insert a collection
        myLinkedList.addAll(myLinkedList.size() / 2, Arrays.asList(38, 290));
        System.out.println("after insertion: " + myLinkedList);

        //element(), peek(), first() doing the same thing
        System.out.println("peak the first: " + myLinkedList.element());

        //pop(), remove(), removeFirst()
        System.out.println("pop the first: " + myLinkedList.pop());
        System.out.println("after pop: "+ myLinkedList);
    }
}
