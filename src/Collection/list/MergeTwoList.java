package Collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * How to merge two Lists.
 *
 * <p>The List used as a container should be mutable.
 *
 * <p>List addAll() method, which appending a Collection to the end of current Collection.
 *
 * <p>
 *
 * @author YNZ
 */
public class MergeTwoList {

  public static void main(String[] args) {

    List<Integer> list1 = Stream.of(1, 2, 3).collect(Collectors.toList());
    List<Integer> list2 = Arrays.asList(3, 5, 6);

    System.out.println("before merge: " + list1);

    list1.addAll(list2);
    System.out.println("after merge: " + list1);
  }
}
