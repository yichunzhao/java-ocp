package Concurrency.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * Lock interface: abstracting an explicit lock behaviours
 * ReentrantLock: is a lock impl.
 * <p>
 * How to protect an arrayList in a multiple-thread env.?
 * <p>
 * when more than one thread to add element in the ArrayList, the newly added element may overwrite each other. So the
 * add method should be protected using a lock.
 */
public class UsingExplicitLock {
    public static final int DATA_SIZE = 100;
    public static final int VISITOR_SIZE = 2;
    public static final int WORKER_SIZE = 2;

    static class DataStore {

        private static final List<Integer> integers = new ArrayList<>();

        private Lock lock = new ReentrantLock();

        public void addInteger(Integer element) {
            try {
                lock.lock();
                integers.add(element);
            } finally {
                lock.unlock();
            }
        }

        public Boolean isExisted(Integer element) {
            return integers.contains(element);
        }

        public List<Integer> getIntegers() {
            return integers;
        }

    }

    public static void main(String[] args) {
        DataStore dataStore = new DataStore();

        //creating two separate threads, and each putting 100 numbers in the array.
        Runnable populatingTask = () -> {
            System.out.printf("%s populating array list \n", Thread.currentThread().getName());
            IntStream.range(0, DATA_SIZE).forEach(x -> dataStore.addInteger(x));
        };

        ExecutorService service = Executors.newFixedThreadPool(WORKER_SIZE);

        IntStream.range(0, VISITOR_SIZE).forEach(x -> service.submit(populatingTask));

        if (!service.isTerminated()) {
            try {
                service.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //release the service pool.
        service.shutdownNow();

        int actualDataSize = dataStore.getIntegers().size();
        if (actualDataSize == DATA_SIZE * VISITOR_SIZE) System.out.println("we didn't miss any data insertion");
    }

}
