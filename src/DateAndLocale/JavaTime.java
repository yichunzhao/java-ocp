/*
 * Java 8 new time pack.
 *
 *
 */
package DateAndLocale;

import java.time.LocalDate;
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
  }
}
