package DateAndLocale.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ParsingLocalDateTime {

    public static void main(String[] args) {
        //localDateTime pattern:yyyy-MM-ddThh:mm:ss
        System.out.println(LocalDateTime.parse("2012-08-09T13:23:24"));

        LocalDate date = LocalDate.parse("2021-12-12");
        System.out.printf("dateTime : %s", date);
    }

}
