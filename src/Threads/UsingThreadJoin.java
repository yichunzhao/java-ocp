/*
   A call B.join() suspend A's thread.
 * A call B.join() means A waits B until it acomplish its all tasks.
 *
 *
*/
package Threads;

/**
 * Join() is used for inter-thread synchronization, just like notify(), notifyAll() and wait();
 * Join() is defined on the Thread class; <code>
 * public final void join() throws InterruptedException
 * public final void join(long millis) throws InterruptedException
 * public final void join(long millis,int nanos) throws InterruptedException
 * </code> <strong>When we invoking a thread join() method, the calling thread go into waiting
 * state. It remains waiting state until the referenced thread terminates.</strong>
 *
 * <p>When a developer finishes a development, a tester may start to test it.
 *
 * @author YNZ
 */
class Tester extends Thread {

  private Developer developer;

  public Tester(Developer developer) {
    this.developer = developer;
  }

  @Override
  public void run() {
    System.out.println("start testing ");

    try {
      // calling developer thread join method to make current thread wait until developer carrying
      // out its task
      // start to wait() for developer.
      this.developer.join(3000);

      // simulate a test task that spends 1 sec.
      sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("testing done. ");
  }
}

class Developer extends Thread {

  @Override
  public void run() {

    System.out.println("start developing");

    try {
      // developing the system
      sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(" development done! ");
  }
}

class Delivery extends Thread {
  private Tester tester;

  public Delivery(Tester tester) {
    this.tester = tester;
  }

  @Override
  public void run() {
    System.out.println("start to delivery ");

    try {
      tester.join(3000);

      sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Delivery department deliver the product ");
  }
}

public class UsingThreadJoin {

  public static void main(String[] args) {
    Developer developer = new Developer();
    developer.start();

    Tester tester = new Tester(developer);
    tester.start();

    Delivery delivery = new Delivery(tester);
    delivery.start();
  }
}
