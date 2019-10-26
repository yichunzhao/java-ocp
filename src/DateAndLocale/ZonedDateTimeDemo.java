package DateAndLocale;

import java.time.*;

public class ZonedDateTimeDemo {

  public static void main(String[] args) {
    // LocalDateTime, ZoneId, Offset.
    System.out.println(ZonedDateTime.now());

    LocalDate homeMade = LocalDate.of(2010, 2, 12);
    System.out.println(homeMade);

    LocalDate homeMade001 = LocalDate.of(2018, Month.FEBRUARY, 21);
    System.out.println(homeMade001);

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    //
    Instant instant = ZonedDateTime.now().toInstant();
    System.out.println("instance " + instant);

    System.out.println(ZonedDateTime.now().getDayOfMonth());
    System.out.println(ZonedDateTime.now().getMonth());
    System.out.println(ZonedDateTime.now().getDayOfWeek());
    System.out.println(ZonedDateTime.now().getDayOfYear());
    System.out.println(ZonedDateTime.now().getOffset());

    // Zone id
    System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()));
    System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Berlin")));
    System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Copenhagen")));
    System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Shanghai")));

    // System.out.println(ZoneId.getAvailableZoneIds());

    System.out.println(ZoneId.getAvailableZoneIds().contains("Europe/Copenhagen"));
  }
}
