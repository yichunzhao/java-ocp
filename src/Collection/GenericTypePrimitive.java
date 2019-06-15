/*
 * Can byte[] being a genric type? byte array is a generic type, for array is
 * a object, not a primitive type.
 *
 */
package Collection;

import java.util.ArrayList;
import java.util.List;

/** @author YNZ */
class Book {

  private String title;

  public Book(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}

public class GenericTypePrimitive {

  public GenericTypePrimitive() {

    // this is a list to hold byte[] instances, so what can be added? only byte[]
    List<byte[]> list = new ArrayList<>();
    list.add(new byte[10]);
    list.add(new byte[20]);

    // Generic variable, formal generic type; generic variable value
    List<Book> books = new ArrayList<>();
    books.add(new Book("java persistence with JPA"));
    books.add(new Book("Java Generics and Collections"));
  }
}
