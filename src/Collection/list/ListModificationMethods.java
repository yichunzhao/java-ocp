package Collection.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ArrayList Contains O(n) ArrayList Add O(1) ArrayList Remove O(n) ArrayList Get O(1)
 *
 * @author YNZ
 */
public class ListModificationMethods {

  public static void main(String[] args) {

    List<BigDecimal> prices =
        Stream.of(
                new BigDecimal("10"),
                new BigDecimal("30"),
                new BigDecimal("17"),
                new BigDecimal("20"),
                new BigDecimal("15"),
                new BigDecimal("18"),
                new BigDecimal("45"),
                new BigDecimal("12"))
            .collect(Collectors.toList());

    /**
     * Add elements List modification methods: add(E e), add(int index, E e), addAll(Collection<E>
     * collection), addAll(int index, Collection<E> collection)
     *
     * <p>removing a single element: remove(int index),
     *
     * <p>removing a collection of elements removeAll(Collection<E> collection)
     *
     * <p>keeping all elements given in the collection retainAll(Collection<E> collection)
     *
     * <p>modify elements set(int index, E e)
     */

    // List insert an element at a specific index
    prices.add(2, BigDecimal.valueOf(250));
    System.out.println(prices);

    List<BigDecimal> question = new ArrayList<>();
    question.add(new BigDecimal("20"));
    question.add(new BigDecimal("30"));

    // List insert an Collection at a specific index
    prices.addAll(prices.size(), question);
    System.out.println(prices);

    // List remove an element at a specific position
    prices.remove(0);
    if (!prices.contains(10)) System.out.println("index 0 is removed");
    System.out.println(prices);

    // retain a collection of elements
    System.out.println("before retain modification: " + prices);
    prices.retainAll(
        Arrays.asList(
            new BigDecimal("17"),
            new BigDecimal("20"),
            new BigDecimal("15"),
            new BigDecimal("18"),
            new BigDecimal("45")));

    System.out.println("after retain modification: " + prices);
  }
}
