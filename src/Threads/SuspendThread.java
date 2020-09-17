package Threads;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * to access a protected resource, a thread need to achieve its monitor first.
 * <p>
 * one object has a monitor; once object holds his monitor, all external threads that intend to access the object, then
 * have to suspend their actions; until the object release the monitor by sending a notification, i.e. object.notify().
 * <p>
 * Object methods
 * notify(): wake up threads that are waiting for this object's monitor.
 * wait(): causes current thread that own the object monitor to give up the monitor;
 */

class DataStore {
    public static final int qSize = 20;
    private Queue<Integer> q = new ArrayDeque<>(qSize);

    synchronized public void insert(Integer integer) {
        //if the queue has a certain amount of elements, then allow threads to achieve the monitor.
        if (q.size() == qSize) notifyAll();
        q.offer(integer);
    }

    synchronized public Integer fetch() throws InterruptedException {
        //if queue is empty, threads waiting
        if (q.isEmpty()) wait();
        return q.poll();
    }

}

class Consumer implements Runnable {
    private DataStore dataStore;

    public Consumer(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void run() {
        Integer x = null;
        try {
            x = this.dataStore.fetch();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("fetched task: " + x);
    }
}

class Producer implements Runnable {
    private DataStore dataStore;

    public Producer(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void run() {

    }
}

public class SuspendThread {

    public static void main(String[] args) {
        //simulating to suspend a thread.
        DataStore dataStore = new DataStore();
        Producer producer = new Producer(dataStore);
        Producer producer1 = new Producer(dataStore);
        Producer producer2 = new Producer(dataStore);
        Producer producer3 = new Producer(dataStore);
        Producer producer4 = new Producer(dataStore);
        Producer producer5 = new Producer(dataStore);

        Consumer consumer1 = new Consumer(dataStore);
        Consumer consumer2 = new Consumer(dataStore);
        Consumer consumer3 = new Consumer(dataStore);
        Consumer consumer4 = new Consumer(dataStore);

        ExecutorService executorService = Executors.newFixedThreadPool(6);


    }

}
