package Collection;

import Collection.Stack.MyStack;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

/** LinkedList double linked list. */
public class UsingLinkedList {

  public static void main(String[] args) {
    // LinkedList head -> first element and tail-> null


    LinkedList<Integer> myLinkedList =
        Stream.of(1, 2, 3, 4, 5).collect(toCollection(LinkedList::new));
    // current content in the linked list.
    System.out.println(myLinkedList);

    System.out.println("peak the first: " + myLinkedList.peek());
    System.out.println("pop the first: " + myLinkedList.pop());
    System.out.println(myLinkedList);
    //so LinkedList is able to do peep, pop as a queue and stack.
    myLinkedList.offer(998); //offer add at the tail.
    System.out.println(myLinkedList);
    myLinkedList.offerFirst(996);  //add at the head.
    System.out.println(myLinkedList);

    System.out.println("last element in the list: " + myLinkedList.getLast());

    //ListIterator init with the size; pointing to the last
    ListIterator<Integer> iterator = myLinkedList.listIterator(myLinkedList.size());
    while (iterator.hasPrevious()) System.out.println(iterator.previous());

  }
}
