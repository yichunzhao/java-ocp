package StringProcessing.tokenizing;

import java.util.Scanner;

/**
 * Scanner.hasNext() don't advance; only Scanner.next() and nextXXX() moving forward.
 *
 * <p>So being carefully or you will end up with a dead loop. The following case shows it.
 */
public class HasNextNotAdvance {

  public static void main(String[] args) {
    Scanner scanner = new Scanner("1 2 4 The new 55 Programmer 44 exam");
    // using space to cut off the input String. it contains integer and String both.
    scanner.useDelimiter("\\s");
    int total = 0;
    while (scanner.hasNext()) {
      if (scanner.hasNextInt()) {
        total += scanner.nextInt(); // when int scanner advance, but not a string. so it will stuck.
      }
    }
    System.out.println("total: " + total);
  }
}
