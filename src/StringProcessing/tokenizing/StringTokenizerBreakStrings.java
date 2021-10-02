package StringProcessing.tokenizing;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * StringTokenizer is a legacy code; Oracle recommend to use String.split(regEx) to achieve the same
 * functionality.
 */
public class StringTokenizerBreakStrings {
  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("start your startup");
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    // delimiter is null
    StringTokenizer st1 = new StringTokenizer("start your startup", null);
    try {
      System.out.println(st1.hasMoreElements());
    } catch (Exception e) {
      System.out.println(e);
    }

    // using String.split(regEx) to achieve the same.
    System.out.println("++++++++++");
    Arrays.stream("start your startup".split("\\s")).forEach(s -> System.out.println(s));
  }
}
