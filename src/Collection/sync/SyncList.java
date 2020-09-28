package Collection.sync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Collections.synchronizedList(new ArrayList<>()); making List thread-safe.
 */
public class SyncList {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> unSyncList = new ArrayList<>();
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());

        ExecutorService service = Executors.newFixedThreadPool(6);
        IntStream.range(0, 3)
                .forEach(i -> service.submit(() -> {
                            int count = 100;
                            while (count > 0) {
                                unSyncList.add(count);
                                count--;
                            }
                        })
                );

        IntStream.range(0, 3).forEach(i -> {
            service.submit(() -> {
                int count = 100;
                while (count > 0) {
                    syncList.add(i);
                    count--;
                }

            });

        });

        service.shutdown();
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        System.out.println("is shut down" + service.isShutdown());
        if (service.isShutdown()) {

            System.out.println("un-sync-list size < 300: " + (unSyncList.size() < 300));
            System.out.println("   sync-list size = 300: " + (syncList.size() == 300));
        }


    }
}
