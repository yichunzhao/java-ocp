package Collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

/** LinkedList double linked list. */
public class UsingLinkedList {

  public static void main(String[] args) {
    // LinkedList head -> first element and tail-> null

    LinkedList<Integer> myLinkedList =
        Stream.of(1, 2, 3, 4, 5).collect(toCollection(LinkedList::new));
    // current content in the linked list.
    System.out.println(myLinkedList.toString());

    System.out.println("last element in the list: " + myLinkedList.getLast());

    //ListIterator init with the size; pointing to the last
    ListIterator<Integer> iterator = myLinkedList.listIterator(myLinkedList.size());
    while (iterator.hasPrevious()) System.out.println(iterator.previous());
  }
}
