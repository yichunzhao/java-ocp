package Threads;

/**
 * join() creates a happen-before relationship between threads; just like synchronization, it
 * creates sequential accesses to a protected resource.
 *
 * <p>calling join() is a guarantee that changes in other threads are visible in the invoker thread.
 */
class SampleThread extends Thread {
  public int count = 0;

  public SampleThread(int count) {
    this.count = count;
    System.out.println("Thread is constructed...");
  }

  @Override
  public void run() {
    System.out.println("thread: " + this.getName() + " starts to run()");
    while (count > 0) {
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      count--;
    }

    System.out.println("thread: " + getName() + " go to the end.");
  }

  public int getCount() {
    return count;
  }
}

public class JoinHappenBefore {

  public static void main(String[] args) {
    SampleThread sampleThread = new SampleThread(10);
    sampleThread.start();

    // to properly sync with the code above, we still need to call join; for without it, we cannot
    // guarantee to
    // stop sampleThread even if it finishes.
    do {
      try {
        sampleThread.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(
          "Thread: " + Thread.currentThread().getName() + " do my job if SampleThread count >0");
    } while (sampleThread.getCount() > 0);
  }
}
