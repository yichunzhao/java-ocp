package DateAndLocale;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateFromString {

  public static void main(String[] args) {

    // LocalDate has a default format, i.e. yyyy-MM-dd
    System.out.println("default date format: " + LocalDate.now());

    // the date string in the default format can be parsed directly.
    System.out.println(LocalDate.parse("2020-04-20"));

    // y: year-of-era M: month of year dd day-of-month;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");
    System.out.println("custom format: " + LocalDate.parse("2030 10 10", dateTimeFormatter));

    // another format
    System.out.println(
        "another format:"
            + LocalDate.parse("19/04/1987", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    // print LocalDate in a format
    System.out.println(
        "print LocalDate in a custom format: " + LocalDate.now().format(dateTimeFormatter));

    // Long format with a lot of details.
    System.out.println(
        "Long format: "
            + LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

    // Full format with a weekday details.
    System.out.println(
        "Full format: "
            + LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    System.out.println(
        "Medium format: "
            + LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
    System.out.println(
        "Short format: "
            + LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
  }
}
