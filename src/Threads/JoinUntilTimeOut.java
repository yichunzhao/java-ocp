package Threads;

/**
 * Thread.join(long millis) methods with Timeout when Invoker thread wait more than timeout time,
 * then it will return from wait() at once, and continue its own task until its end.
 */
class Invoked extends Thread {

  @Override
  public void run() {
    System.out.println("Invoked: do its job");
    try {
      sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Invoked: finish the job");
  }
}

class Invoker extends Thread {
  private Thread invoked;

  public Invoker(Thread invoked) {
    this.invoked = invoked;
  }

  @Override
  public void run() {
    System.out.println("Invoker: wait the invoked to finish his task until the time out");

    try {
      invoked.join(1500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("wait too long time, start to do my own job ");

    System.out.println("Invoker: finish my own task");
  }
}

public class JoinUntilTimeOut {

  public static void main(String[] args) {
    Invoked invoked = new Invoked();
    Invoker invoker = new Invoker(invoked);

    invoked.start();
    invoker.start();
  }
}
