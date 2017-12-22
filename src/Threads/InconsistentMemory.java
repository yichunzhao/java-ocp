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
class Laptop {

    private int soldNum = 0;

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
        laptop.newSale();
    }

}

class OnlineQuery extends Thread {

    private Laptop laptop;

    public OnlineQuery(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void run() {
        System.out.println("number sold: " + this.laptop.getSoldNum()
        );
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
