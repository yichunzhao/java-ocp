package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * here I want to simulate many threads concurrently click a counter; without using synchronised
 * method, we use an atomic integer. atomic something aims to solve concurrent issue.
 */
class SharedCounter {
  private AtomicInteger counter = new AtomicInteger();

  public AtomicInteger getCounter() {
    return counter;
  }

  public int increaseOne() {
    return counter.incrementAndGet();
  }
}

// many threads to access the counter
class Task implements Runnable {
  private SharedCounter sharedCounter;
  private int seqNum;

  public Task(SharedCounter counter, int seqNum) {
    this.sharedCounter = counter;
    this.seqNum = seqNum;
  }

  @Override
  public void run() {
    System.out.println(
        "thread: "
            + this.seqNum
            + " concurrently increase one and result in: "
            + sharedCounter.increaseOne());
  }
}

public class AtomicIntegerDemo {
  public static void main(String[] args) throws InterruptedException {
    SharedCounter sharedCounter = new SharedCounter();

    // may carrying out in a thread pool.
    ExecutorService executorService = Executors.newFixedThreadPool(4);
    // concurrently increase counter without using synchronised modifier.
    IntStream.rangeClosed(1, 100).forEach(i -> executorService.submit(new Task(sharedCounter, i)));
    executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
    executorService.shutdown();
  }
}
