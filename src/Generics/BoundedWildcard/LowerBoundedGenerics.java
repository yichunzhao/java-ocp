package Generics.BoundedWildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Lower bounded wildcard <? super Type>
 *
 * <p>T super Gift (class, interface or enum); restrict a unknown type to be a specific type or a
 * super type of that type.
 *
 * <p>
 *
 * <p>List<? super Number> list = new ArrayList<>(); Read as object and add as boundary type and its
 * subtype.
 */
class Gift {}

class Book extends Gift {}

class Watch extends Gift {}

class Phone extends Gift {}

public class LowerBoundedGenerics {
  public static void main(String[] args) {
    // A list with a lower bound, Gift,
    List<? super Gift> gifts = new ArrayList<>();
    gifts.add(new Gift());
    gifts.add(new Book());
    gifts.add(new Watch());
    gifts.add(new Phone());
    //        gifts.add(new Object());

    for (Object g : gifts) {
      System.out.println(g);
    }

    // you cannot add element upper bounded wildcard
    List<? extends Gift> gifts1 = new ArrayList<Gift>();
    // gifts1.add(new Book()); //a compilation error

    wrapGift(gifts);

    List<Object> books = new ArrayList<>();
    books.add(new Book());

    wrapGift(books);
  }

  // lower-bounded wildcard accept boundary type and its subtype;
  // it can add and read
  static void wrapGift(List<? super Gift> gifts) {
    for (Object gift : gifts) {
      System.out.println((Gift) gift);
    }

    gifts.add(new Gift());
    gifts.add(new Book());
    // gifts.add(new Object());

    gifts.forEach(System.out::print);
    System.out.println();
  }
}
