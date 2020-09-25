package Collection.list.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * LinkedList implements Deque and Queue interfaces. It means we can read from both ends via its APIs.
 */
public class ReadLinkedListFromTail {

    public static void main(String[] args) {
        LinkedList<String> linkedStrings = Arrays.stream("we love java programming".split("\\s"))
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedStrings);

        IntStream.range(0, linkedStrings.size()).forEach(i -> System.out.print(linkedStrings.pollLast() + " "));
        System.out.println();
        System.out.println("after pollLast():" + linkedStrings);
    }
}
