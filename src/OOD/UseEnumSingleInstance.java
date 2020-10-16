package OOD;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Using enum to implement singleton pattern.
 * <p>
 * an enum is a set of constants, each of them has only one instance, which is created in its super class Enum.
 * <p>
 * enum name() method is final; but toString() method can be overridden.
 * <p>
 * enum constructor cannot be public and protected, but only default and private access level.
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

        @Override
        public String toString() {
            return INSTANCE.getClass().toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(Transmitter.INSTANCE.sendMessage("where are you?"));
        System.out.printf("Instance name: %s \n ", Transmitter.INSTANCE);

        System.out.printf("INSTANCE class: %s \n ", Transmitter.INSTANCE);
    }
}
