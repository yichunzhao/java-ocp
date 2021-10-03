package Concurrency.AsyncPrograming;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class UsingScheduledExecutorService {

  public static void main(String[] args) {
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    ScheduledFuture<?> futureFuture =
        scheduledExecutorService.scheduleWithFixedDelay(
            () -> System.out.println("sending out notification"),
            1000,
            3000,
            TimeUnit.MILLISECONDS);

    // show down the executor after 20 sec.
    scheduledExecutorService.schedule(
        () -> scheduledExecutorService.shutdown(), 20, TimeUnit.SECONDS);
  }
}
