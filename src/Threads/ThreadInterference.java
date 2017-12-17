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
class Book {

    private String title;
    private int numSold = 0;

    public Book(String title) {
        this.title = title;
    }

    synchronized public void newSale() {
        numSold++;
    }

    synchronized public void returnBook() {
        numSold--;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getNumSold() {
        return numSold;
    }

}

class OnlineBuy extends Thread {

    private Book book;

    public OnlineBuy(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        this.book.newSale();
    }

}

class OnlineReturn extends Thread {

    private Book book;

    public OnlineReturn(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        this.book.returnBook();

    }
}

public class ThreadInterference {

    public static void main(String[] args) {

        Book book = new Book("Java Generics and Collections");

            OnlineBuy buy1 = new OnlineBuy(book);
            buy1.start();  // +1
            OnlineBuy buy2 = new OnlineBuy(book);
            buy2.start();   // +2
            OnlineReturn onlineReturn1 = new OnlineReturn(book);

            onlineReturn1.start(); // -1 
            System.out.println("num of sold: " + book.getNumSold());

    }

}
