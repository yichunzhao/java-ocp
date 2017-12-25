/*
 * A shared var. produced by onlinekøb thread, and consumed by onlinequery. 
 * how to make the var. consistently shared. 
 * Consumer wait until object notify its consumer. 
 * 
 */
package Threads;

/**
 *
 * @author YNZ
 */
class Laptop {

    private int soldNum = 0; //shared variable produced by OnlineKøb and Consumed by OnlineQuery

    public void newSale() {
        soldNum++;
    }

    public int getSoldNum() {
        return soldNum;
    }

}

class OnlineKøb extends Thread {

    private Laptop laptop;

    public OnlineKøb(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("interrupted exception: " + ex);
        }

        synchronized (laptop) {
            laptop.newSale();
            
            //notify() waiting threads
            laptop.notify();
        }
    }
}

class OnlineQuery extends Thread {

    private Laptop laptop;

    public OnlineQuery(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void run() {

        //firstly, requiring the lock on this object, then it is able to call
        //its methods. 
        synchronized (laptop) {
            try {
                //wait() making current thread wait(), untill notify(); current 
                //thread release lock on this object. 
                this.laptop.wait();
            } catch (InterruptedException ex) {
                System.out.println("" + ex.getMessage());
            }
        }

        System.out.println("number sold: " + this.laptop.getSoldNum());
    }
}

public class InconsistentMemory {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        Thread køb = new OnlineKøb(laptop);
        Thread query = new OnlineQuery(laptop);

        query.start();
        køb.start();

    }

}
