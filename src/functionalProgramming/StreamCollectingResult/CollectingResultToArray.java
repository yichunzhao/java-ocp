/*
 * When you are done with a stream and intermideate operations, you may
 * want to put them in an Array[]
 *
 */
package functionalProgramming.StreamCollectingResult;

import java.util.regex.Pattern;
import java.util.stream.Stream;

/** @author YNZ */
public class CollectingResultToArray {

  public static void main(String[] args) {
    Stream<String> words =
        Pattern.compile("\\s").splitAsStream("Building a Restful Web Service with Spring");
    String[] result =
        words.toArray(String[]::new); // String[] result = words.toArray(n->new String[n]);
    System.out.println("size of array : " + result.length);
    System.out.println(result[4]);
  }
}
