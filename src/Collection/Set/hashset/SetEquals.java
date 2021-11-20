package Collection.Set.hashset;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Determine if two sets that contains same elements
 *
 * hashSet re-order the elements ref. to the hashCode function. so even inserting in different
 * sequence, but consequently creating the same order.
 *
 * <p>so if two set equals to each other, we may know they contains the same elements and the same
 * size; but we are not sure about if they have the same insertion order.
 */
public class SetEquals {

  public static void main(String[] args) {
    var dates =
        Stream.of(LocalDate.of(2002, 12, 12), LocalDate.of(2002, 12, 15))
            .collect(Collectors.toCollection(HashSet::new));

    var dates1 =
        Stream.of(LocalDate.of(2002, 12, 15), LocalDate.of(2002, 12, 12))
            .collect(Collectors.toCollection(HashSet::new));

    System.out.printf("does dates equals dates1? %b \n ", dates.equals(dates1));
  }
}
