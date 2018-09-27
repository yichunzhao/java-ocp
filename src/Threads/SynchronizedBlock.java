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
class Ticket {

    int counter = 0;

    synchronized public void buyOne() {
        ++counter;
    }

    synchronized public void returnOne() {
        --counter;
    }

}

public class SynchronizedBlock {

    public static void main(String[] args) throws InterruptedException {

        Ticket ticket = new Ticket();

        Thread th1 = new Thread(ticket::buyOne);
        th1.start();

        Thread th2 = new Thread(ticket::buyOne);
        th2.start();

        Thread th3 = new Thread(ticket::returnOne);
        th3.start();

        Thread.sleep(100);
        System.out.println("counter: " + ticket.counter);

    }
}
