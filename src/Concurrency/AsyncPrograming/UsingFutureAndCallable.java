package Concurrency.AsyncPrograming;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class UsingFutureAndCallable {

  public static void main(String[] args) {

    System.out.println("Main thread: " + Thread.currentThread().getName());

    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Future<Long> futureResult = executorService.submit(new MyTask());

    System.out.println("get the result in the future...");

    while (!futureResult.isDone()) {
      System.out.println("I am doing something else");
    }

    try {
      System.out.println("final result: " + futureResult.get());
    } catch (ExecutionException | InterruptedException e) {
      e.printStackTrace();
    }

    executorService.shutdown();
    if (!executorService.isShutdown()) {
      try {
        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private static class MyTask implements Callable<Long> {
    @Override
    public Long call() throws InterruptedException {
      Thread.sleep(10);
      return 1997L;
    }
  }
}
