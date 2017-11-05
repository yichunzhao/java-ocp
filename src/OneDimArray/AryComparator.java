/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDimArray;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
class Book {

    String title;
    int pages;
    String author;

    public Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title + " " + this.pages + " " + this.author;
    }

}

public class AryComparator {

    public static void main(String[] args) {
        Book b1 = new Book("design pattern", 1233, "freeman");
        Book b2 = new Book("java basics", 890, "Yang");
        Book b3 = new Book("optimisation", 1900, "Ruszczyski");

        Book[] books = {b1, b2, b3};

        Arrays.sort(books, (book1, book2) -> book1.pages - book2.pages);
        System.out.println("" + Arrays.toString(books));

    }

}
