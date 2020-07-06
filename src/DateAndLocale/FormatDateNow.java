package DateAndLocale;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateNow {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date now = new Date();
        System.out.println("Before formatting: " + now);
        String formatted = dateFormat.format(now);
        System.out.println("After formatted: " + formatted);
    }
}
