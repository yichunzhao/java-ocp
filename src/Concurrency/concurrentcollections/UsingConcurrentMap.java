package Concurrency.concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Stream;

/**
 * A concrete implementation of the ConcurrentMap interface, class ConcurrentHashMap
 * is a concurrent class analogous to class HashMap.
 * <p>
 * Operations on a ConcurrentMap are made atomic, so as to avoid synchronisation.
 */
public class UsingConcurrentMap {
    private static final String iphone8 = "Iphone-8";
    private static final String iphone11 = "Iphone-11";
    private static final String laptop = "Lenovo T40";

    private static final ConcurrentMap<String, Integer> itemAmountMap = new ConcurrentHashMap<>();

    static {
        itemAmountMap.put(iphone8, 2);
        itemAmountMap.put(iphone11, 20);
        itemAmountMap.put(laptop, 32);
    }

    /*
     in a m-thread env. the following method is not thread-safe, because it contains both read and write operations.
     the state of target map may be simultaneously modified, but without current thread knowing the change. It may
     cause the wrong result.

     when the current thread reading the map state, meanwhile another thread is modifying its state. So as using
     with a HashMap, this method needs to be sync. in a m-thread context.
     */
    static void manipulateMap(String item, Integer amount) {
        if (itemAmountMap.containsKey(item)) //read operation
        {
            String currentThreadName = Thread.currentThread().getName();

            System.out.printf("current thread %s: item = %s; amount=%d \n", currentThreadName, item, amount);
            itemAmountMap.put(item, amount); //write operation
        }
    }

    public static void main(String[] args) {
        System.out.printf("current amount of iphone 8 %s \n ", itemAmountMap.get(iphone8));

        manipulateMap(iphone8, 12);

        Thread t1 = new Thread(() -> manipulateMap(iphone8, 12));
        Thread t2 = new Thread(() -> manipulateMap(iphone8, 30));
        Thread t3 = new Thread(() -> manipulateMap(iphone8, 10));

        Stream.of(t1, t2, t3).forEach(Thread::start);

        Stream.of(t1, t2, t3).forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.printf("after modification %s \n ", itemAmountMap.get(iphone8));
    }

}
