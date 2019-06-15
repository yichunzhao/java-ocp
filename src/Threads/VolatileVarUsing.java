/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/** @author YNZ */
class Accounter implements Runnable {

  private volatile int number; //
  private volatile boolean switcher;

  public Accounter() {
    this.number = 0;
    this.switcher = true;
  }

  public void increase() {
    number += 1;
  }

  public int getAmount() {
    return this.number;
  }

  public void close() {
    this.switcher = false;
  }

  public boolean getSwitcher() {
    return this.switcher;
  }

  @Override
  public void run() {
    while (this.switcher) {
      increase();
      System.out.println("counter: " + this.number + " timestamp: " + System.currentTimeMillis());
    }
  }
}

class ReadValue implements Runnable {

  private Accounter ba;

  public ReadValue(Accounter ba) {
    this.ba = ba;
  }

  @Override
  public void run() {
    while (ba.getSwitcher()) {
      if (ba.getAmount() > 500) {
        ba.close();
      }
      System.out.println(
          "currnet value : " + ba.getAmount() + " timestamp: " + System.currentTimeMillis());
    }
  }
}

public class VolatileVarUsing {

  public static void main(String[] args) {
    Accounter account = new Accounter();

    Thread t1 = new Thread(account);
    t1.start();

    Thread t3 = new Thread(new ReadValue(account));
    t3.start();

    // System.out.println("how much we have: " + account.getAmount());
  }
}
