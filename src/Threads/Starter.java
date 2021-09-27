package Threads;

/** a test question. Guessing printout. */
public class Starter extends Thread {
  private int x = 2;

  public Starter() {
    x = 5;
    start();
  }

  public static void main(String[] args) throws InterruptedException {
    new Starter().makeItSo();
  }

  public void makeItSo() throws InterruptedException {
    join();
    x = x - 1;
    System.out.println(x);
  }

  @Override
  public void run() {
    x *= 2;
  }
}
