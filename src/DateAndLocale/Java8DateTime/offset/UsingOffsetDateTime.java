package DateAndLocale.Java8DateTime.offset;

import java.time.OffsetDateTime;

/**
 * DateTime and including the offset from the UTC
 *
 * <p>Offset DateTime: 2021-06-23T11:27:41.622253200+02:00
 *
 * <p>current local date and time, and including 9-digit nano second, then followed by a time zone
 *
 * <p>Java 8 has introduced the java.time packages, and the JDBC 4.2 API added support for the
 * additional SQL types TIMESTAMP WITH TIME ZONE and TIME WITH TIME ZONE. @Column(name =
 * "offset_time", columnDefinition = "TIME WITH TIME ZONE") private OffsetTime
 * offsetTime; @Column(name = "offset_date_time", columnDefinition = "TIMESTAMP WITH TIME ZONE")
 * private OffsetDateTime offsetDateTime;
 *
 * <p>Before Java 8 and JPA 2.2, developers usually had to convert date/time types to UTC before
 * persisting them. JPA 2.2 now supports this feature out of the box by supporting the offset to UTC
 * and by leveraging JDBC 4.2 support for the timezone.
 *
 * <p>JPA @Column attribute columnDefinition (Optional) The SQL fragment that is used when
 * generating the DDL for the column.
 */
public class UsingOffsetDateTime {

  public static void main(String[] args) {
    System.out.printf("Offset DateTime: " + OffsetDateTime.now());
  }
}
