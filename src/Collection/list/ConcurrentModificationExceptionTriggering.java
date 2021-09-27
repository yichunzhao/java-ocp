package Collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/** it is used to fail-fast when iterating a collection while it is modified, and solutions. */
public class ConcurrentModificationExceptionTriggering {
  private static List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));

  public static void main(String[] args) {
    List<Integer> integersCopy1 = new ArrayList<>(integers);

    try {
      for (Integer i : integersCopy1) {
        integersCopy1.remove(1);
      }

    } catch (ConcurrentModificationException e) {
      System.out.println(e);
    }

    List<Integer> integersCopy2 = new ArrayList<>(integers);

    try {
      integersCopy2.stream().forEach(integer -> integersCopy2.remove(1));

    } catch (Exception e) {
      System.out.println(e);
    }

    List<Integer> integersCopy3 = new ArrayList<>(integers);
    try {
      integersCopy3.forEach(integer -> integersCopy3.remove(1));

    } catch (Exception e) {
      System.out.println(e);
    }

    // solution: don't remove during iterating
    List<Integer> integersCopy5 = new ArrayList<>(integers);
    List<Integer> listToRemove = new ArrayList<>();
    for (Integer integer : integersCopy5) {
      if (integer == 1) listToRemove.add(integer);
    }
    integersCopy5.removeAll(listToRemove);
    System.out.println("integersCopy5 after removing 1 " + integersCopy5);

    // solution using removeIf, it won't be verbose
    // internally removeIf is implemented using iterator
    List<Integer> integersCopy4 = new ArrayList<>(integers);
    try {
      integersCopy3.removeIf(integer -> integer == 2);
    } catch (Exception e) {
      System.out.println(e);
    }

    // using java 8 filter
    List<Integer> integersCopy6 = new ArrayList<>(integers);
    List<Integer> removeOne =
        integersCopy6.stream().filter(integer -> integer != 1).collect(Collectors.toList());
    System.out.println(removeOne);

    // using iterator
    List<Integer> integersCopy7 = new ArrayList<>(integers);
    Iterator<Integer> it = integersCopy7.iterator();
    for (; it.hasNext(); ) {
      if (it.next() == 1) {
        it.remove();
      }
    }

    System.out.println(integersCopy7);
  }
}
