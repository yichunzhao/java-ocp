package DateAndLocale.DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Period is used to represent a time span between too dates.
 */
public class UsingPeriod {

    public static void main(String[] args) {
        Period p = Period.between(LocalDate.of(2019, Month.APRIL, 01), LocalDate.of(2020, Month.AUGUST, 31));
        System.out.println("Period between two dates " + p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + " days");
    }

}
