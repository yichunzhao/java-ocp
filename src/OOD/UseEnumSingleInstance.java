package OOD;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Using enum to implement singleton pattern.
 * <p>
 * an enum is a set of constants, each of them has only one instance, which is created in its super class Enum. 
 */
public class UseEnumSingleInstance {
    enum Transmitter {
        INSTANCE;

        Lock lock = new ReentrantLock();

        public String sendMessage(String msg) {
            try {
                lock.lock();
                System.out.println("sending your message");
                return msg;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Transmitter.INSTANCE.sendMessage("where are you?"));
        System.out.printf("Instance name: %s \n ", Transmitter.INSTANCE);
    }
}
