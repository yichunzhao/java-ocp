/*
 * then you need to privide 4th argument, a supplier.
 *
 *
 */
package StreamCollectingResult;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/** @author YNZ */
public class CollectingToSpecificMap {

  public static void main(String[] args) {

    Map<String, Integer> wordLengthMap =
        Pattern.compile("[\\s]")
            .splitAsStream("then you need to provide 4th argument")
            .collect(
                Collectors.toMap(
                    w -> w,
                    String::length,
                    (o, n) -> {
                      throw new IllegalStateException();
                    },
                    TreeMap::new));

    System.out.println("" + wordLengthMap);
  }
}
