/*
 * Java 8 Time
 *
 *
 */
package DateAndLocale.Java8DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.stream.IntStream;

/**
 * LocalTime, ChronoUnit, Duration.
 *
 * @author YNZ
 */
public class JavaTime {

  private static int sum = 0;

  /** @param args the command line arguments */
  public static void main(String[] args) {
    // constructing a time
    System.out.println("" + LocalTime.now());

    // create from a factory method
    System.out.println("" + LocalTime.of(10, 20, 30));

    // parsing a String
    System.out.println("parsed time:" + LocalTime.parse("20:30:20"));

    System.out.println(LocalTime.of(12, 0).equals(LocalTime.of(12, 0)));
    System.out.println("hashcode :");
    System.out.println(LocalTime.of(12, 0).hashCode() == LocalTime.of(12, 0).hashCode());

    System.out.println(
        LocalTime.parse("06:30").plus(1, ChronoUnit.MINUTES).isAfter(LocalTime.parse("06:30")));

    System.out.println("same time pointing to the same instance?");
    System.out.println(LocalTime.of(1, 0) == LocalTime.of(1, 0));
    System.out.println(LocalTime.of(12, 0) == LocalTime.of(12, 0));
    System.out.println(LocalTime.of(14, 50) == LocalTime.of(14, 50));
    System.out.println(LocalTime.of(13, 0) == LocalTime.of(13, 0));

    // create a local Time and format it.
    System.out.println(
        "ISO DateAndLocale.Local Time: "
            + LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
    System.out.println("ISO Time: " + LocalTime.now().format(DateTimeFormatter.ISO_TIME));

    // Duration Class for dealing with Time between Two Times; only support SECONDS and NANO
    Duration duration = Duration.between(LocalTime.of(20, 10), LocalTime.of(23, 10));
    System.out.println("Duration supports Seconds alone: " + duration.get(ChronoUnit.SECONDS));

    // Using Duration to calculate time elapsed
    Temporal start = Instant.now();

    IntStream.range(0, 1_000_000).forEach(i -> sum += i);

    Temporal end = Instant.now();
    System.out.println("time used: " + Duration.between(start, end).toMillis());
  }
}
