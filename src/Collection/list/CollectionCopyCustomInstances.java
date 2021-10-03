package Collection.list;

import models.Name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * copy(dest, source)
 *
 * <p>dest.size() >= source.size()
 *
 * <p>if dest.size > source.size, then partial dest replaced by source; the rest of dest at the
 * tail; element index of the dest keep the same.
 */
public class CollectionCopyCustomInstances {

  public static void main(String[] args) {
    Name name = Name.of("Kathy", "Sierra");
    Name name1 = Name.of("Bert", "Bates");

    List<Name> names = new ArrayList<>();
    names.add(name);
    names.add(name1);

    List<Name> anotherNames = new ArrayList<>();
    anotherNames.add(Name.of("Peter", "Saint"));

    Collections.copy(names, anotherNames);
    System.out.println(names);

    // hashcode() is not overridden; search API constantly return null
    Name name2 = Name.of("Bert", "Bates");
    System.out.println(anotherNames.contains(name2));

    List<Integer> numbers = Arrays.asList(1, 2, 3);

    System.out.println("Integer is immutable, but hashcode is overridden.");
    System.out.println(numbers.contains(Integer.valueOf(3)));
  }
}
