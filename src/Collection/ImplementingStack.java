/*
  Using a stack to reverse a string.
 stack is represented by a Deque, implemented by a linkedList
* push() insert element on the head, pop() remove element from the head.
* add() to the tail.
*/
package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/** @author YNZ */
public class ImplementingStack {

  public static void main(String[] args) {
    String str = "I love Java.";
    //Stack class
    Stack<Person> personStack = new Stack<>();
    personStack.push(new Person("name"));
    personStack.peek();

    // Deque implemented by a LinkedList.
    // deque is able to impl. both stack and queue.
    Deque<Character> stack = new LinkedList<>();
    str.chars().mapToObj(i -> (char) i).forEach(c -> stack.push(c));

    Deque<Character> stack1 = new ArrayDeque<>();


    stack.stream().forEach(System.out::print);
  }
}
