package Array.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sorting by an external Comparator.
 */

public class ArraySortingByComparator {

    class Book {
        private String title;
        private String author;
        private int pages;

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

    private Book[] books;

    {
        Book b1 = new Book("design pattern", 1233, "freeman");
        Book b2 = new Book("java basics", 890, "Yang");
        Book b3 = new Book("optimisation", 1900, "Ruszczyski");
        Book b4 = new Book("java basics", 890, "Yang");

        books = new Book[]{b1, b2, b3, b4};
    }

    public static void main(String[] args) {
        Book[] books = new ArraySortingByComparator().books;
        System.out.println("books before sorting: " + Arrays.toString(books));

        //soring by the page numbers.
        Arrays.sort(books, Comparator.comparingInt(b -> b.pages));
        System.out.println("" + Arrays.toString(books));
    }
}
