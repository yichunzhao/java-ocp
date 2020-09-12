/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/** @author YNZ */
public class UsingArrayDeQue {

  public static void main(String[] args) {

    // Both ArrayDeque and LinkedList impl. Deque interface.
    Queue<String> products = new ArrayDeque<>();
    products.add("p1");
    products.add("p2");
    products.add("p3");

    // insert an element into the queue.
    products.offer("P4");

    // retrieve and remove an element from the queue.
    products.poll();

    System.out.print(products.peek());
    System.out.print(products.poll());
    System.out.println(products);
  }
}
