package DateAndLocale.instant;

import java.time.Instant;
import java.time.ZonedDateTime;

/**
 * Instant class
 *
 * This class models a single instantaneous point on the time-line. This might be used to record
 * event time-stamps in the application.
 *
 * <p>The range of an instant requires the storage of a number larger than a long. To achieve this,
 * the class stores a long representing epoch-seconds and an int representing nanosecond-of-second,
 * which will always be between 0 and 999,999,999.
 *
 * <p>when you create a new Instant instance, zoneId default to UTC. instant output:
 * yyyy-MM-ddThh:mm:ss.nanoZ, default to UTC. You cannot create an Instant object from a
 * LocalDateTime.
 */
public class UsingInstant {
  public static void main(String[] args) {
    System.out.println(Instant.now());
    System.out.println("Instant from system: " + Instant.ofEpochMilli(System.currentTimeMillis()));
    // you cannot create a instant from LocalDateTime instance, for it missing zone info.
    System.out.println("Instant from LocalDateTime: " + Instant.from(ZonedDateTime.now()));
  }
}
