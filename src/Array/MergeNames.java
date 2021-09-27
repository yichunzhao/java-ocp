package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** merge two String[] and keeping unique elements. */
public class MergeNames {

  public static String[] uniqueNames(String[] names1, String[] names2) {
    Set<String> mergedNames = new HashSet<>(Arrays.asList(names1));
    mergedNames.addAll(Arrays.asList(names2));
    return mergedNames.toArray(new String[0]);
  }

  public static void main(String[] args) {
    String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
    String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
    System.out.println(
        String.join(
            ", ",
            MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
  }
}
