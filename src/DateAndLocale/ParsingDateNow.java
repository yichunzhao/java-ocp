package DateAndLocale;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * E = weekday(EEE: Mon, Sun)
 * y = year (yy or yyyy)
 * M = month (MM)
 * d = day in month (dd)
 * h = hour (0-12) (hh)
 * H = hour (0-23) (HH)
 * m = minute in hour (mm)
 * s = seconds (ss)
 * S = milliseconds (SSS)
 * z = time zone text (e.g.Pacific Standard Time...)
 * Z = time zone, time offset (e.g. -0800)
 */

public class ParsingDateNow {

    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        Date now = new Date();
        Date parsed = format.parse(now.toString());
        System.out.printf("now : "+ parsed);
    }
}
