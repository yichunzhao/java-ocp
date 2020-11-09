/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.Volatile;

/** @author YNZ */
class Accouter implements Runnable {

  private volatile int number; //
  private volatile boolean switcher;

  public Accouter() {
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

  private Accouter ba;

  public ReadValue(Accouter ba) {
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
    Accouter account = new Accouter();

    Thread t1 = new Thread(account);
    t1.start();

    Thread t3 = new Thread(new ReadValue(account));
    t3.start();

    // System.out.println("how much we have: " + account.getAmount());
  }
}
