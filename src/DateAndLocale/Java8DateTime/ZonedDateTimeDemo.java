package DateAndLocale.Java8DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeDemo {

  public static void main(String[] args) {
    // LocalDateTime, ZoneId, Offset.
    System.out.println(ZonedDateTime.now());

    // Zoned time at the current, determined by ZonedId
    System.out.println("current UTC time");
    System.out.println(ZonedDateTime.now(ZoneId.of("UTC")));

    System.out.println("current Shanghai time");
    System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Shanghai")));

    System.out.println("............... From ZonedDateTime to String .....................");
    // showing the time zone offset, we can use the formatter "Z" or "X"
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss Z X ");

    ZonedDateTime copenhagenTime = ZonedDateTime.now();
    System.out.println("without format:" + copenhagenTime);

    System.out.println("formatted: " + formatter.format(copenhagenTime));

    // showing the time zone name small z showing zone id(name in a String)
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss z");
    System.out.println("formatted 2: " + formatter2.format(copenhagenTime));

    // is able to show both zone offset and name?
    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss Zz");
    System.out.println("formatted 3: " + formatter3.format(copenhagenTime));

    System.out.println("............... From String to ZonedDateTime .....................");
    ZonedDateTime parsed = ZonedDateTime.parse("2020-09-08T12:18:34.114Z[UTC]");
    ZonedDateTime parsed1 = ZonedDateTime.parse("2020-09-08T12:18:34.114Z[Asia/Shanghai]");

    System.out.println(parsed);
    System.out.println(parsed1);

    ZonedDateTime parsed2 =
        ZonedDateTime.parse(
            "09/08/2020 12:18:34 Asia/Shanghai",
            DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss z"));
    System.out.println(parsed2.format(DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss X")));

    System.out.println(
        "............... From String to LocalDateTime, then Zoned .....................");

    ZonedDateTime zonedLocalDateTime =
        LocalDateTime.parse("2008-11-01T10:29:20").atZone(ZoneId.systemDefault());
    System.out.println(
        "Zoned local datetime: " + zonedLocalDateTime.format(DateTimeFormatter.ISO_OFFSET_TIME));

    System.out.println("current default zoned date-time: " + ZonedDateTime.now());
    System.out.println(
        "current Asia/Shanghai date-time: "
            + ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Shanghai")));
  }
}
