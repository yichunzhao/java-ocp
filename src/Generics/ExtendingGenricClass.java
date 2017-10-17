/*
 * Generic class extends Generic class
 * An extended class mush be able to pass type arguments to its base class
 * 
 */
package Generics;

/**
 *
 * @author YNZ
 */
//base class is a generic class
// T: formal type parameter
class Parcel<T> {

    private T coponent;

    public Parcel() {
        System.out.println("base parcel");
    }

    public Parcel(T coponent) {
        this.coponent = coponent;
    }

    public T getCoponent() {
        return coponent;
    }

    public void setCoponent(T coponent) {
        this.coponent = coponent;
    }
}

class Book {

    public Book() {
    }
}

class BookParcel<T> extends Parcel<T> {

    public BookParcel() {
        System.out.println("book parcel");
    }

}

public class ExtendingGenricClass {

    public static void main(String[] args) {
        //parameterised type, actuall type is Book 
        Parcel<Book> parcel = new BookParcel<>();
        parcel.setCoponent(new Book());
        Book book = parcel.getCoponent();
        boolean yes = book instanceof Book;
        System.out.println("" + Boolean.toString(yes));
    }

}
