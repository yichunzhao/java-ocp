package Threads.Synchronizing;

import java.util.Arrays;

/**
 * static method synchronized on the Class instance. Counter.class is called a class literal. It is a special feature in
 * the java language that tells the compiler(who tells the JVM): Go and find me the instance of Class that represents
 * the class called Counter. I think it is a Class template that is not in the heap memory.
 */
public class Counter {
    private static int count = 0;

    public static void addOne() {

        synchronized (Counter.class) {
            count++;
        }
    }

    synchronized public static int getCount() {
        return count;
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> Counter.addOne());
        Thread t2 = new Thread(() -> Counter.addOne());
        Thread t3 = new Thread(() -> Counter.addOne());
        Thread t4 = new Thread(() -> Counter.addOne());
        Thread t5 = new Thread(() -> Counter.addOne());

        Arrays.asList(t1, t2, t3, t4, t5).forEach(thread -> {
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("count is supposed to be 4? " + Counter.getCount());

    }
}
