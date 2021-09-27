package DateAndLocale.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class ParsingDateTime {

  public static void main(String[] args) {
    // localDateTime pattern:yyyy-MM-ddThh:mm:ss
    System.out.println(LocalDateTime.parse("2012-08-09T13:23:24"));

    LocalDate date = LocalDate.parse("2021-12-12");
    System.out.printf("dateTime : %s \n", date);

    var zonedDateTime = ZonedDateTime.parse("2012-08-09T13:23:24Z");
    System.out.printf("zoned DateTime : %s \n", zonedDateTime);

    var offSetDateTime = OffsetDateTime.parse("2012-08-09T13:23:24Z");
    System.out.printf("offset DateTime : %s \n", offSetDateTime);
  }
}
