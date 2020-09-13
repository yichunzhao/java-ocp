package Collection.Sorting;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchCollection {
    private static LocalDate target;
    private static List<LocalDate> dates = new ArrayList<>();

    static {
        target = LocalDate.of(2012, 10, 13);
        dates.add(target);
        dates.add(LocalDate.of(2013, 11, 14));
        dates.add(LocalDate.of(2014, 10, 15));
        dates.add(LocalDate.of(2008, 10, 15));
        dates.add(LocalDate.of(2007, 10, 15));
    }

    public static void main(String[] args) {
        System.out.println("LocalDate is comparable? " + (target instanceof Comparable));
        System.out.println("un-sorted dates: " + dates);

        Collections.sort(dates);
        System.out.println("sorted dates: " + dates);

        int index = Collections.binarySearch(dates, target);
        System.out.println("search result: " + index);
    }
}
