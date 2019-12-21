package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Java has Collection interface and Collections class. Collections contains static methods alone.
 */
public class UsingCollections {

  public static void main(String[] args) {
    // create a list
    List<Integer> myList = Arrays.asList(1, 33, 44, 4, 55);
    System.out.println("before sorted: " + myList);

    // Collections class offers sorting, search, reverse, etc
    Collections.sort(myList);

    System.out.println("after sorted: " + myList);

    Collections.sort(
        myList,
        (o1, o2) -> {
          int r = 0;
          if (o1 > o2) r = 1;
          if (o1 < o2) r = -1;
          return r;
        });
    System.out.println(myList);

    List<String> strList = Arrays.asList("ab", "xy", "cd");
    Collections.sort(strList);
    System.out.println("strList: " + strList);


  }
}
