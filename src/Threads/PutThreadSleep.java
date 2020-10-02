package Threads;

import java.util.stream.IntStream;

class MyThread extends Thread {

    @Override
    public void run() {
        IntStream.range(0, 100).forEach(i -> {
            try {
                Thread.sleep(500);
                if (i % 10 == 0)
                    System.out.println("Current thread state: " + Thread.currentThread().getState() + " current num:" + i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}

public class PutThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        myThread.join();
        System.out.println("main thread goto end");
    }
}
