/*
 * How to traverse a collection; in java 7 we use iterator
 * In java 8, we may use stream to pipline elements.
 *
 */
package Collection.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
public class CollectionsIterable {

  public static void main(String[] args) {

    List<BigDecimal> list =
        new ArrayList<>(
            Arrays.asList(
                BigDecimal.valueOf(10),
                BigDecimal.valueOf(20),
                BigDecimal.valueOf(30),
                BigDecimal.valueOf(40)));

    // Java 7  (4 lines)
    Iterator it = list.iterator();
    while (it.hasNext()) {
      System.out.println("" + it.next());
    }

    System.out.println("list hashcode: " + list.hashCode());

    // lamada expression: a formal method method
    // predict functional interface: receive a single type return boolean
    boolean clist = list.removeIf(x -> x.compareTo(BigDecimal.valueOf(20)) > 0);
    System.out.println("clist : " + clist);
    System.out.println("list: " + list);

    List<BigDecimal> extra =
        Stream.of(BigDecimal.valueOf(100), BigDecimal.valueOf(200)).collect(toList());
    System.out.println("list hashcode: " + list.hashCode());
    list.addAll(extra);
    System.out.println("list + extra: " + list);
    System.out.println("list hashcode: " + list.hashCode());
    System.out.println("extra hashcode: " + extra.hashCode());

    list.replaceAll(x -> x.negate()); // unary operator interface; receive and return the same type
    System.out.println("list after operator replace all : " + list);

    System.out.println("count list :" + list.stream().count());
    System.out.println("list distinct " + list.stream().distinct().collect(toList()));
    list.add(BigDecimal.ONE);
    System.out.println("list distinct " + list.stream().distinct().collect(toList()));

    System.out.println(
        "list filtering : "
            + list.stream()
                .filter(x -> x.compareTo(BigDecimal.valueOf(-10)) > 0)
                .collect(toList()));
    System.out.println("current list " + list);
    list.add(BigDecimal.valueOf(1000));
    list.add(BigDecimal.valueOf(1000));
    System.out.println("current list " + list);

    System.out.println("first index " + list.indexOf(BigDecimal.valueOf(1000))); // content equal
    System.out.println("last index " + list.lastIndexOf(BigDecimal.valueOf(1000))); // conent equal
  }
}
