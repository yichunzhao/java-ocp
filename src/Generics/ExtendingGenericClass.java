/*
 * Generic class extends Generic class
 * An extended class mush be able to pass type arguments to its base class
 *
 */
package Generics;

/**
 * Class generics
 *
 * @author YNZ
 */
class Parcel<T> {

    private T component;

    public Parcel() {
        System.out.println("Base parcel");
    }

    public Parcel(T component) {
        this.component = component;
    }

    public T getComponent() {
        return component;
    }

    public void setComponent(T component) {
        this.component = component;
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

public class ExtendingGenericClass {

    public static void main(String[] args) {
        // parameterised type T, is replaced by an Actual type Book, as compiling time.
        Parcel<Book> parcel = new BookParcel();

        parcel.setComponent(new Book());
        Book book = parcel.getComponent();

        boolean yes = book instanceof Book;
        System.out.println("" + Boolean.toString(yes));
    }
}
