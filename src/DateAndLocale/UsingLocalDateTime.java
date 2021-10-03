package DateAndLocale;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class UsingLocalDateTime {
  public static void main(String[] args) {
    var currentDateTime = LocalDateTime.now();
    System.out.printf("Local Current: %s \n", currentDateTime);

    var currentZoneDatTime = ZonedDateTime.now();
    System.out.printf("Zoned Current: %s \n", currentZoneDatTime);

    var currentZonedDateTimeUTC = ZonedDateTime.now(ZoneOffset.UTC);
    System.out.printf("Zoned DateTime UTC %s \n", currentZonedDateTimeUTC);
    System.out.printf("Zoned DateTime CPH TIME %s \n", ZonedDateTime.now(ZoneOffset.of("+2")));

    var zoneDateTime = ZonedDateTime.of(currentDateTime, ZoneOffset.UTC);
    System.out.printf("convert to zoned time:  %s \n ", zoneDateTime);
  }
}
