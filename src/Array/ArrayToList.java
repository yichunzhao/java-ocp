package Array;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * List<T> list = Array.asList(T... t) ; List<T> list = Array.asList(T[] ts) ;
 *
 * <p>when using asList(), the array and the list become joined at the hip. When you updating one of
 * them, another one is updated too.
 */
public class ArrayToList {

  public static void main(String[] args) {
    LocalDate[] a = {
      LocalDate.of(2012, 12, 1), LocalDate.of(2013, 10, 1), LocalDate.of(2014, 4, 12)
    };
    System.out.println("a[] :" + Arrays.toString(a));

    List<LocalDate> b = Arrays.asList(a);
    System.out.println("a[] to List<LocalDate> : " + b);

    System.out.println("Changing one element of the array");
    a[0] = LocalDate.now();
    System.out.println("List after updating array element:" + b);

    // After changing one element of Array,
    b.set(b.size() - 1, LocalDate.of(2012, 12, 12));
    System.out.println("Array after updating List element:" + Arrays.toString(a));
  }
}
