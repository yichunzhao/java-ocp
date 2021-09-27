package Collection.Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SortListByStream {

  public static void main(String[] args) {
    // create a list
    List<Integer> myList = Arrays.asList(1, 33, 44, 4, 55);
    System.out.println("before sorted: " + myList);

    List<Integer> sortedMyList = myList.stream().sorted().collect(toList());
    System.out.println(sortedMyList);

    List<String> strList = Stream.of("ab", "xy", "cd").sorted().collect(toList());
    System.out.println("strList: " + strList);
  }
}
