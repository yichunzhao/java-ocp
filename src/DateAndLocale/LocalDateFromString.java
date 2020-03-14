package DateAndLocale;

import java.time.LocalDate;

public class LocalDateFromString {

  public static void main(String[] args) {
    LocalDate date = LocalDate.parse("04/02/2020");
    System.out.println(date);


  }
}
