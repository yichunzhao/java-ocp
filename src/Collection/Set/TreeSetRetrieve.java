package Collection.Set;


import java.time.LocalDate;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet implement SortedSet, which offers methods
 * <p>
 * Add, Contains, remove takes O(log(n))
 * <p>
 * first(), last()
 * headSet(), tailSet()
 * <p>
 * before java 7, it was possible to add null elements to an empty tree set, however it was considered as a bug.
 */

public class TreeSetRetrieve {

    private static SortedSet<LocalDate> dates = new TreeSet<>();
    private static LocalDate target;


    static {
        target = LocalDate.of(2012, 10, 13);
        //Add O(log(n))
        dates.add(target);
        dates.add(LocalDate.of(2013, 11, 14));
        dates.add(LocalDate.of(2014, 10, 15));
        dates.add(LocalDate.of(2008, 10, 15));
        dates.add(LocalDate.of(2007, 10, 15));
        dates.add(target);
    }

    public static void main(String[] args) {
        System.out.println("dates in tree: " + dates);

        //contains O(log(n))
        System.out.println("contains target: " + (dates.contains(target)));

        //first() and last()
        System.out.println("the first in the tree: " + dates.first());
        System.out.println("the last in the tree: " + dates.last());

        //subset(a, b) b is excluded
        System.out.println("Subset of the tree: " + dates.subSet(target, LocalDate.of(2014, 10, 15)));

        //tailSet(a) return >=a
        System.out.println("tail set: " + dates.tailSet(target));

        //headSet(a) return <a;
        System.out.println("head set: " + dates.headSet(target));

    }
}
