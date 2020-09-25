package Collection.list.linkedlist;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * iterating a list, meanwhile removing it; it should cause a ConcurrentModificationException
 */
public class TriggerConcurrentModificationException {

    public static void main(String[] args) {
        String originalString = "We love Java programming";
        LinkedList<String> linkedList = Arrays.stream(originalString.split("\\s")).collect(Collectors.toCollection(LinkedList::new));

        System.out.println(linkedList);

        try {
            linkedList.forEach(s -> System.out.print(linkedList.pop()));
        } catch (ConcurrentModificationException e) {
            System.out.println(e);
        }
    }

}
