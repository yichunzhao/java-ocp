/*
 * Java 8 new time pack.
 *
 *
 */
package DateAndLocale;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

/** @author YNZ */
public class JavaTime {

  /** @param args the command line arguments */
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println("" + date);

    LocalDate dateAgain = LocalDate.now();
    System.out.println("" + dateAgain);

    System.out.println("" + (date.compareTo(dateAgain) == 0));

    Date myDate = new Date();
    System.out.println("myDate: " + myDate);

    //create a local date time by a factory method
    LocalDateTime past = LocalDateTime.of(2018, Month.FEBRUARY,9,12,13,25,190);
    System.out.println(past.toString());
  }
}
