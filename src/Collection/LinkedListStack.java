/*
 * Using Deque to implement a stack:   push pop
 * Using Deque to implemnt a Queue: offer poll
 *
 */
package Collection;

import java.util.Deque;
import java.util.LinkedList;

/** @author YNZ */
class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}

public class LinkedListStack {

  public static void main(String[] args) {

    Deque<Person> stack = new LinkedList<>();

    stack.push(new Person("alpha"));
    stack.push(new Person("yang"));
    stack.push(new Person("mom"));

    System.out.println("last first: " + stack.pop().toString());

    Deque<Person> queue = new LinkedList<>();
    queue.add(new Person("Alpha")); // 1
    queue.add(new Person("Niels")); // 2
    queue.add(new Person("Yang")); // 3

    System.out.println("first first: " + queue.poll().toString());

    System.out.println("first first: " + queue.peek().toString());
    System.out.println("first first: " + queue.peek().toString());
  }
}
