package Collection.queue.blockingQueue;


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class BlockingQueueDemo {

    private static ExecutorService service = Executors.newFixedThreadPool(2);

    private static final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10, true);

    public static void main(String[] args) {
        service.submit(new Producer());
        service.submit(new Consumer());
    }

    private static class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("consume: " + blockingQueue.take());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private static class Producer implements Runnable {
        private Random r = new Random();

        @Override
        public void run() {
            try {
                while (true) {
                    blockingQueue.put(ThreadLocalRandom.current().nextInt(100));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
