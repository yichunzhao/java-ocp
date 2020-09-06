package DateAndLocale;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

    public static void main(String[] args) {
        // LocalDateTime, ZoneId, Offset.
        System.out.println(ZonedDateTime.now());

        //Zoned time at the current, determined by ZonedId
        System.out.println("current UTC time");
        System.out.println(ZonedDateTime.now(ZoneId.of("UTC")));

        System.out.println("current Shanghai time");
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Shanghai")));


    }
}
