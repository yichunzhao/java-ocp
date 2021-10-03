package DateAndLocale.Java8DateTime;

/**
 * This class may be used when modeling date-time concepts in more detail, or when communicating to
 * a database or in a network protocol. it is used with handling database and communication
 * protocol.
 *
 * <p>
 *
 * <p>offset date time output format:
 *
 * <p>2021-03-14T22:31:29.330+01:00
 *
 * <p>Precision to Nano sec. 1.0 E-9; Ms sec. 1.0 1.0 E-3
 *
 * <p>offset data time is an instant value differing from the UTC time instant; adding two values
 * then get the local time based on the zoned rule.
 *
 * <p>so the offsetDateTime output is your localTime at the Nano-Sec precision and with your zoned
 * information.
 */
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class UsingOffSetDateTime {

  public static void main(String[] args) {
    OffsetDateTime offsetDateTime = OffsetDateTime.now();
    System.out.println("current offset dataTime: " + offsetDateTime);
    // output format: current offset dataTime: 2021-03-14T22:31:29.330+01:00

    // how to form an offsetDateTime from LocalDateTime and Zone.
    // create offsetDateTime from current instant and zoneId
    System.out.println("System default zoneId: " + ZoneId.systemDefault());
    OffsetDateTime formedOffsetDateTime =
        OffsetDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());

    // how to translate an instant to an OffsetDateTime
    System.out.println("current local dateTime: " + LocalDateTime.now());

    System.out.println("... How to get current ZOneOffset ... ");
    System.out.println("current instant:  " + Instant.now());
    ZoneOffset zoneOffset = ZoneOffset.systemDefault().getRules().getOffset(Instant.now());
    System.out.println("current instant zoneOffset : " + zoneOffset);

    System.out.println("translate localDateTime with ZoneOffset to OffSetDateTime");
    System.out.printf(
        "current localDateTime: %s is translated into \n   offSetDateTime: %s ",
        LocalDateTime.now(), OffsetDateTime.of(LocalDateTime.now(), zoneOffset));
  }
}
