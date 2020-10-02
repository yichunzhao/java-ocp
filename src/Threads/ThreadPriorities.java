package Threads;

import java.util.stream.IntStream;

/**
 * Priorities from 1-10 integers. Default value = 5.
 * <p>
 * The OS normally selects the highest priority to run, and make a lower one in the pool runnable.
 * <p>
 * Thread.yield() is a static method of the thread, it is used to handle all threads having the same priorities.
 * It makes currently running thread head back to runnable.
 * <p>
 * yield() is often used to make running running thread give up its slot to another runnable thread of the same
 * priority, there is no guarantee.
 */


public class ThreadPriorities {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Current thread priority: " + getPriority());
        }
    }

    public static void main(String[] args) {

        IntStream.range(0, 10).forEach(i -> new MyThread().start());

    }
}
