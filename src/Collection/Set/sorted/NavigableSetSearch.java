package Collection.Set.sorted;

import java.time.LocalDate;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * TreeSet implements NavigableSet that extends SortedSet.
 * <p>
 * Navigable provides searching APIs.
 * <p>
 * The main features of Navigable interface:
 * ceiling(key):  find the least key >= key
 * floor(key): find the least key <=key
 *
 * <p>
 * higher(key) find the least key > key
 * lower(key) find the least key < key
 *
 * <p>
 * subSet(key1, b*, key2,b*): find elements between two keys, b* inclusive boolean.
 * headSet(key, b*): find elements that < key, b* inclusive boolean
 * tailSet(key,b*): find elements that > key, b* inclusive boolean
 * </p>
 */
public class NavigableSetSearch {

    public static void main(String[] args) {

        //TreeSet is-a NavigableSet
        NavigableSet<LocalDate> dates = new TreeSet<>();
        dates.add(LocalDate.of(2020, 10, 1));
        dates.add(LocalDate.of(2020, 10, 2));
        dates.add(LocalDate.of(2020, 10, 3));
        dates.add(LocalDate.of(2020, 10, 5));
        dates.add(LocalDate.of(2020, 10, 6));
        dates.add(LocalDate.of(2020, 10, 7));
        dates.add(LocalDate.of(2020, 10, 8));
        System.out.println(dates);

        //the least date >= key: it must be LocalDate.of(2020, 10, 6)
        System.out.println("celling date: " + dates.ceiling(LocalDate.of(2020, 10, 6)));

        //the least date <= key:
        System.out.println("floor date: " + dates.floor(LocalDate.of(2020, 10, 4)));

        //the least date > key
        System.out.println("higher date: " + dates.higher(LocalDate.of(2020, 10, 4)));

        //the least date < key
        System.out.println("lower date: " + dates.lower(LocalDate.of(2020, 10, 4)));

        //reversed set
        System.out.println("reversed order: " + dates.descendingSet());

        //finding elements < the key, inclusive: boolean
        System.out.println("head set exclusive: " + dates.headSet(LocalDate.of(2020, 10, 6), false));
        System.out.println("head set inclusive: " + dates.headSet(LocalDate.of(2020, 10, 6), true));

        //finding elements > the key
        System.out.println("tail set exclusive: " + dates.tailSet(LocalDate.of(2020, 10, 6), false));
        System.out.println("tail set inclusive: " + dates.tailSet(LocalDate.of(2020, 10, 6), true));

        //finding a span of elements in the collection, excluding both keys.
        System.out.println("sub set: " + dates.subSet(
                LocalDate.of(2020, 10, 3), false, LocalDate.of(2020, 10, 6), false));
        System.out.println("sub set: " + dates.subSet(
                LocalDate.of(2020, 10, 3), true, LocalDate.of(2020, 10, 6), true));
    }

}
