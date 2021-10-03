/*
 * What is functional interface? an interface has a single method to impl.
 * before java 8, when we need to transfer a method as an argument; we have
 * to declare its generic type, an interface, which is implemented by a class.
 * by such a complex way, we may transfer a behviour into anther class.
 */
package functionalProgramming.FunctionalInterface;

/** @author YNZ */
class MyTask implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("i=" + i);
    }
  }
}

class OtherTask implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("" + System.currentTimeMillis());
    }
  }
}

public class WhatFunInterface {

  public static void main(String[] args) {
    Thread t = new Thread(new MyTask());
    t.start();

    Thread t1 = new Thread(new OtherTask());
    t1.start();

    // in java 8
    Thread t2 =
        new Thread(
            () -> {
              for (int j = 0; j < 10; j++) {
                System.out.println("task3 : ");
              }
            });
    t2.start();
  }
}
