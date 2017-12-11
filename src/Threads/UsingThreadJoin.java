/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
class Tester extends Thread {

    private Developer developer;

    public Tester(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void run() {
        try {
            this.developer.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("testing " + i);
        }

        System.out.println("testing done. ");
    }
}

class Developer extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("developing");
        }
        System.out.println(" development done! ");
    }
}

class Delivery extends Thread {
    private Tester tester;

    public Delivery(Tester tester) {
        this.tester = tester;
    }

    @Override
    public void run() {
        try {
            tester.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Delivery.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Delivery department deliver the product ");
    }
}

public class UsingThreadJoin {

    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.start();

        Tester tester = new Tester(developer);
        tester.start();

        Delivery delivery = new Delivery(tester);
        delivery.start();

    }

}
