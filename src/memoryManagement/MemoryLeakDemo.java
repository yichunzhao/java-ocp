package memoryManagement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

/** how to create memory leak? */
public class MemoryLeakDemo {

  public static void main(String[] args) {
    long freeMemory = Runtime.getRuntime().freeMemory();
    System.out.println("free memory: " + freeMemory);

    // let's see hashcode generation.
    Customer c1 = new Customer("ynz");
    Customer c2 = new Customer("ynz");

    if (c1.hashCode() != c2.hashCode()) System.out.println("c1 and c2 has different hash code");
    if (c1.equals(c2)) System.out.println("c1 equal to c2");

    // if we add c1 and c2 into a set? unique or duplicated?
    Set<Customer> customers = new HashSet<>();
    customers.add(c1);
    customers.add(c1);
    System.out.println("size of customers: " + customers.size());

    // if we using customer as a key,
    Map<Customer, String> customerStringMap = new HashMap<>();
    customerStringMap.put(c1, "first customer");
    customerStringMap.put(c2, "2rd customer");
    System.out.println("size of map: " + customerStringMap.size());

    freeMemory = Runtime.getRuntime().freeMemory();
    System.out.println("free memory: " + freeMemory);
    //I can see the memory consumption dramatically increased from a jdk memory monitoring tool
    IntStream.range(0, 1000).forEach(i -> customerStringMap.put(new Customer("ynz"), "first"));
    freeMemory = Runtime.getRuntime().freeMemory();
    System.out.println("free memory: " + freeMemory);

    System.out.println("size of map: " + customerStringMap.size());
    //Customer equalTo method is not correctly defined. The above created 1000 customer instances.
    //is this a kind of memory leak? there is a part of memory is not supposed to be consumed.

    //how to java GC works? mark and sweep, meaning that it marks the instance that is referred from the stack, and its
    //dependencies. then collecting them together and put them in a contigious memory space.
    //so actually it is not garbage collecting.

    //when GC, all threads will have to be stopped.

    //if an instance survives for once, then its life-cycle may last until the end of application.

    //the heap is divided into young generation and old generation.
    //new instances are generated in the young, but the survival will be moved to the old.

    //per-gem has no GC; but from java 8 it has been removed and outside the heap, and called meta space.


  }
}
