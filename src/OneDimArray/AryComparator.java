/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDimArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/** @author YNZ */
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
    Book b4 = new Book("java basics", 890, "Yang");

    Book[] books = {b1, b2, b3, b4};

    Arrays.sort(books, (book1, book2) -> book1.pages - book2.pages);
    System.out.println("" + Arrays.toString(books));

    Set<Book> bookSet = new HashSet<>();

    bookSet.add(b1);
    bookSet.add(b2);
    bookSet.add(b3);
    bookSet.add(b4);
    System.out.println("" + bookSet);

    Set<Book> bokSet =
        new TreeSet<>(
            (book1, book2) -> {
              return book1.pages - book2.pages;
            });

    bokSet.add(b1);
    bokSet.add(b2);
    bokSet.add(b3);
    bokSet.add(b4);

    System.out.println("" + bokSet);
  }
}
