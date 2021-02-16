package Collection.Set.sorted;

import java.time.LocalDate;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * how to reverse a sorted set?  an easy way to make it become a copy of NavigableSet
 */
public class ReverseSortedSet {

    public static void main(String[] args) {

        SortedSet<LocalDate> dates = new TreeSet<>();
        dates.add(LocalDate.of(2012, 10, 15));
        dates.add(LocalDate.of(2013, 11, 15));
        dates.add(LocalDate.of(2014, 10, 15));
        dates.add(LocalDate.of(2008, 10, 15));
        dates.add(LocalDate.of(2007, 10, 15));

        //in A-direction
        System.out.println("sorted by natural order: " + dates);

        //how to reverse it?
        NavigableSet<LocalDate> copyOfDates = new TreeSet(dates);
        NavigableSet<LocalDate> desCopyOfDates = copyOfDates.descendingSet();
        System.out.println("reverse sorted : " + desCopyOfDates);
    }

}
