package Concurrency.lock;

/**
 * once a thread start to acquire an implicit locks, it cannot help stopping do that.
 * <p>
 * If th1 is holding lock1 over the resource r1; meanwhile, it is acquiring the lock2, to reach r2.
 * If th2 is holding lock2 over the resource r2; meanwhile, it is acquiring the lock1, to reach r1.
 * <p>
 * if both threads are asking two implicit locks, then they both cannot quite from the actions of acquiring locks.
 * <p>
 * try to re-build this scenario
 * <p>
 * Depending on how an underlying scheduler executes the threads s1 and s2, they
 * might or might not deadlock.
 */

class Inventory {
    private int amount;
    private String name;

    public Inventory(String inventoryName) {
        name = inventoryName;
    }

    public void stockIn(int qty) {
        amount += qty;
    }

    public void stockOut(int qty) {
        amount -= qty;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }
}

class Shipment implements Runnable {
    private Inventory loc1;
    private Inventory loc2;
    private int qty;

    public Shipment(Inventory target, Inventory source, int qty) {
        this.loc1 = target;
        this.loc2 = source;
        this.qty = qty;
    }

    //moving out qty from inventory a to inventory b; the shipment is an atomic process.
    //acquiring locks from both inventories.
    @Override
    public void run() {
        synchronized (loc1) {
            synchronized (loc2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                loc2.stockOut(qty);
                loc1.stockIn(qty);
            }
        }
    }
}

public class ImplicitLockDeadLock {

    public static void main(String[] args) throws InterruptedException {
        Inventory inv1 = new Inventory("Copenhagen");
        inv1.setAmount(1000);

        Inventory inv2 = new Inventory("Paris");
        inv2.setAmount(5000);

        //moving item 240 from inv2 to inv1; inv1 should have 340: inv2 260
        Shipment shipment1 = new Shipment(inv1, inv2, 1);

        //moving item 100 from inv1 to inv2; inv1 = 240 inv2= 360
        Shipment shipment2 = new Shipment(inv2, inv1, 10);

        Thread th1 = new Thread(shipment1);
        Thread th2 = new Thread(shipment2);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.printf("inventory : %s stock amount: %d  \n", inv1.getName(), inv1.getAmount());
        System.out.printf("inventory : %s stock amount: %d  \n", inv2.getName(), inv2.getAmount());
    }

}
