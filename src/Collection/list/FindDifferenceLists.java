package Collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * if given two lists, how to find out how different listOne is different from listTwo? if given two
 * lists, how to find out the joint of two lists?
 */
public class FindDifferenceLists {

  private static final List<String> listOne =
      Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Jack");
  private static final List<String> listTwo =
      Arrays.asList("Jack", "Daniel", "Sam", "Alan", "James", "George");

  public static void main(String[] args) {

    System.out.println("listOne equalTo listTwo? " + listOne.equals(listTwo));

    System.out.println("difference listOne from listTwo: " + differenceTwoLists(listOne, listTwo));

    System.out.println("difference listTwo from listOne: " + differenceTwoLists(listTwo, listOne));

    System.out.println("joint listTwo and listOne: " + jointTwoLists(listOne, listTwo));
  }

  // find out difference between source and target
  private static <T> List<T> differenceTwoLists(List<T> source, List<T> target) {
    return source.stream().filter(t -> !target.contains(t)).collect(Collectors.toList());
  }

  // find out joint of two lists.
  private static <T> List<T> jointTwoLists(List<T> source, List<T> target) {
    List<T> copyOfSource = new ArrayList<>(source);
    copyOfSource.retainAll(target);
    return copyOfSource;
  }
}
