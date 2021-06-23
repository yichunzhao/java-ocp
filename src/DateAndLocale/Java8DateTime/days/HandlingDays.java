package DateAndLocale.Java8DateTime.days;

import java.time.LocalDate;
import java.time.LocalTime;

public class HandlingDays {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.printf("current date %s \n", date);

        LocalDate startOfJun = LocalDate.of(2021, 6, 1);
        System.out.printf("1st day minus 5 day: %s \n", startOfJun.minusDays(5));

        System.out.printf("get the day of month of StartOfJun: %s \n", startOfJun.getDayOfMonth());
        System.out.printf("get the day of month of StartOfJun and minus 5: %s \n", startOfJun.getDayOfMonth() - 5);

        LocalTime time = LocalTime.now();
        System.out.printf("current time : %s \n ", time);

    }

}
