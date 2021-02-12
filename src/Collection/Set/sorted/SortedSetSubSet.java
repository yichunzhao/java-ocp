package Collection.Set.sorted;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * TreeSet<E> IS-A sorted set, subSet(E fromElement, E toElement); fromElement is inclusive; and toElement(exclusive)
 * tailSet(E fromElement) >= fromElement
 * headSet(E toElement) < toElement
 */
public class SortedSetSubSet {

    public static void main(String[] args) {

        SortedSet<String> sortedStrings = Arrays.stream("we have a meeting today".split("\\s"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("sorted Strings: " + sortedStrings);

        System.out.println("from element b to element w: " + sortedStrings.subSet("b", "w"));
        System.out.println("tail set from b: " + sortedStrings.tailSet("b"));
        System.out.println("head set from t: " + sortedStrings.headSet("t"));
    }
}
