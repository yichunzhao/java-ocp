package Collection.Set;

import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 * NavigableSet interface offers a descendingSet() method which returns a reversed order of the current tree set.
 */
public class SetDescendingOrder {


    public static void main(String[] args) {
        Random r = new Random();

        TreeSet<Integer> myTree = new TreeSet<>();
        IntStream.range(0, 10).forEach(i -> myTree.add(r.nextInt(100)));
        System.out.println("My tree: " + myTree);

        NavigableSet<Integer> descendingOfMyTree = myTree.descendingSet();
        System.out.println("Descending of my tree: " + descendingOfMyTree);
    }
}
