/*
 *

thread scheduler,  underlying os.
thread state: new runbale termiated

  Thread lifecycle:  NEW, RUNABLE, WAITING, BLOCKED, TIMED-WAITING, TERMINATED.
RUNABLE state: READY, RUNNING;


 */
package Threads;

import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Don't be fooled into thinking that one thread can put another thread to sleep.
 *
 *  sleep() is a static method of Thread class. you have to be cautious here. It can be invoked from an instance, but
 *  it doesn't affect the instance thread; the sleep() is a static method of the Thread, and it is only used to make
 *  current thread return to a Runnable state.
 *
 * @author YNZ
 *
 * */
class Sing implements Runnable {

  @Override
  public void run() {
    Thread current = Thread.currentThread();
    System.out.println("current : " + current.getName());
    try {
      Thread.sleep(12000);
    } catch (InterruptedException ex) {
      Logger.getLogger(Sing.class.getName()).log(Level.SEVERE, null, ex);
    }

    System.out.println("sing ....");
  }
}

class Eat extends Thread {

  @Override
  public void run() {
    try {
      sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("eat .....");
  }
}

public class SleepIsStaticThreadMethod {

  public static void main(String[] args) {

    Thread t = new Thread(new Sing(), "YNZ"); // state new threads
    t.start(); // call start(), runnable state(ready and running)

    System.out.println("state: " + t.getState());
    Eat eat = new Eat();
    eat.start();

    System.out.println("state: " + t.getState());

    Set<Entry<Thread, StackTraceElement[]>> entries = Thread.getAllStackTraces().entrySet();
    entries.stream().forEach(e -> System.out.println(e.toString()));

    Set<Thread> ts = Thread.getAllStackTraces().keySet();
    ts.stream()
        .forEach(
            thread -> {
              System.out.println(thread.getName() + " " + thread.getState());
            });

    System.out.println(" Current thread : " + Thread.currentThread().getName());
  }
}
