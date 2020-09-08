package DateAndLocale;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeDemo {

    public static void main(String[] args) {
        // LocalDateTime, ZoneId, Offset.
        System.out.println(ZonedDateTime.now());

        //Zoned time at the current, determined by ZonedId
        System.out.println("current UTC time");
        System.out.println(ZonedDateTime.now(ZoneId.of("UTC")));

        System.out.println("current Shanghai time");
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Shanghai")));


        //ZonedDateTime to String
        //showing the time zone offset, we can use the formatter "Z" or "X"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss Z");

        ZonedDateTime copenhagenTime = ZonedDateTime.now();
        System.out.println("without format:" +copenhagenTime);

        System.out.println("formatted: " + formatter.format(copenhagenTime));

        //showing the time zone name
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss z");
        System.out.println("formatted 2: " + formatter2.format(copenhagenTime));

        //is able to show both zone offset and name?
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss Zz");
        System.out.println("formatted 3: " + formatter3.format(copenhagenTime));

        
    }
}
