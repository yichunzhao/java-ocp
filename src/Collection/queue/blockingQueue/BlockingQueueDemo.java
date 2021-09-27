package Collection.queue.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class BlockingQueueDemo {
  private static final AtomicInteger counter = new AtomicInteger(100);
  private static final AtomicInteger totalConsumed = new AtomicInteger(0);
  private static final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10, true);
  private static ExecutorService service = Executors.newFixedThreadPool(2);

  public static void main(String[] args) throws InterruptedException {
    service.submit(new Producer());
    service.submit(new Consumer());

    service.shutdown();
    if (service.awaitTermination(1000, TimeUnit.MILLISECONDS)) {
      System.out.println("shut down.");
    }
  }

  private static class Consumer implements Runnable {
    @Override
    public void run() {
      try {
        while (counter.get() >= 0) {
          Integer consumed = blockingQueue.take();
          if (consumed == Integer.MAX_VALUE) break;
          System.out.println(
              "consume: " + consumed + "  totalConsumed :" + totalConsumed.addAndGet(1));
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private static class Producer implements Runnable {

    @Override
    public void run() {
      try {
        while (counter.get() >= 0) {
          // position-pill
          if (counter.get() == 0) {
            blockingQueue.put(Integer.MAX_VALUE);
            break;
          } else {
            blockingQueue.put(counter.get());
          }

          counter.decrementAndGet();
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
