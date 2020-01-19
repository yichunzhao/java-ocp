package GarbageCollection;

import java.util.stream.IntStream;

/**
 * Demo Java Garbage collector(GC)
 * stack: references
 * heap: instances
 *
 * GC: mark instances that are referred, and put them close to each other in the heap ;
 * and sweep out those not referred any more.
 *
 * */
class Customer {
  private String name;
  private int id;

  public Customer(int id) {
    this.id = id;
  }

  public Customer(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  //GC implements this method after GC operation
  public void finalize(){
    System.out.println("this object is being gc");
  }
}

public class DemoJavaGC {

  public static void main(String[] args) throws InterruptedException {
    currentFreeMemory();

    // creating a ton of garbage ...
    IntStream.range(0, 100_000)
        .forEach(
            i -> {
              Customer c = new Customer(i); // stack:  c reference var. heap: new Instance
            });

    currentFreeMemory();

    System
        .gc(); // gc() is not guaranteed  when it is carried out. gc will stop all threads
               // temporarily.

    currentFreeMemory();
  }

  private static void currentFreeMemory() {
    // get current jvm free memory
    Runtime runtime = Runtime.getRuntime();
    Long freeMemory = runtime.freeMemory();
    System.out.println("free memory :" + freeMemory / 1024 + "k");
  }
}
