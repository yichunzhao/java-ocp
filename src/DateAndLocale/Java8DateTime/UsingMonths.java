package DateAndLocale.Java8DateTime;

import java.time.Month;
import java.util.Arrays;
import java.util.stream.IntStream;

public class UsingMonths {

  public static void main(String[] args) {
    var months = Month.values();
    System.out.println("months: " + Arrays.asList(months));

    IntStream.range(0, months.length).forEach(i -> System.out.print(months[i] + " "));
    System.out.println("\n");
  }
}
