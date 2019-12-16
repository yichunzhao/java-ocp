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


  }
}
