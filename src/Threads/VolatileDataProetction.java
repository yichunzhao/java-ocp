/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author YNZ
 */
class BankAcount {

    volatile boolean closeAcct = false;

    public void markClosure() {
        this.closeAcct = true;
    }

    public void markOpen() {
        this.closeAcct = false;
    }
}

public class VolatileDataProetction {

    public static void main(String[] args) throws InterruptedException {

        BankAcount account = new BankAcount();

        Thread th1 = new Thread(account::markClosure);
        th1.start();

        Thread th2 = new Thread(account::markOpen);
        th2.start();

        Thread th3 = new Thread(account::markClosure);
        th3.start();

        Thread.sleep(100);
        System.out.println("closeAcct = " + account.closeAcct);

    }

}
