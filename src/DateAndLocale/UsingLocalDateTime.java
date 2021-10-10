package DateAndLocale;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class UsingLocalDateTime {
  public static void main(String[] args) {
    // localDateTime having no zonedId
    var currentDateTime = LocalDateTime.now();
    System.out.printf("Local Current: %s \n", currentDateTime);

    // zonedDateTime having a zoneId ref. to the local
    var currentZoneDatTime = ZonedDateTime.now();
    System.out.printf("Zoned Current: %s \n", currentZoneDatTime);

    // creating a dateTime ref. to a specific time zone on the Now()
    var currentZonedDateTimeUTC = ZonedDateTime.now(ZoneOffset.UTC);
    System.out.printf("Zoned DateTime UTC %s \n", currentZonedDateTimeUTC);
    System.out.printf("Zoned DateTime CPH TIME %s \n", ZonedDateTime.now(ZoneOffset.of("+2")));

    var zonedDateTime = ZonedDateTime.of(currentDateTime, ZoneOffset.UTC);
    System.out.printf("convert a LocalDateTime to zoned DateTime:  %s \n ", zonedDateTime);
  }
}
