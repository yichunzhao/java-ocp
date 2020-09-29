package Collection.sync;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SyncMap {
    private static final Map<UUID, String> stringIntegerMap = Collections.synchronizedMap(new HashMap<>());

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(6);

        IntStream.range(0, 6).forEach(i -> service.submit(() -> {
            int count = 100;
            do {
                stringIntegerMap.put(UUID.randomUUID(), Thread.currentThread().getName() + i);
                count--;
            } while (count > 0);
        }));

        service.shutdown();
        try {
            service.awaitTermination(1000, TimeUnit.MILLISECONDS);
            if (service.isShutdown())
                System.out.println("final hashmap size is 600? " + (stringIntegerMap.size() == 600));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
