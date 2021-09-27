package DateAndLocale;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * E = weekday(EEE: Mon, Sun) y = year (yy or yyyy) M = month (MM) d = day in month (dd) h = hour
 * (0-12) (hh) H = hour (0-23) (HH) m = minute in hour (mm) s = seconds (ss) S = milliseconds (SSS)
 * z = time zone text (e.g.Pacific Standard Time...) Z = time zone, time offset (e.g. -0800)
 */
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
