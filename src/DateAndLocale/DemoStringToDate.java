package DateAndLocale;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoStringToDate {

  public static void main(String[] args) {
    //
    String dateStr = "Mon, 14 May 2001 17:18:42 -0700 (PDT)";

    DateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z (z)");
    try {
      Date date = dateFormat.parse(dateStr);
      System.out.println("date: " + date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
