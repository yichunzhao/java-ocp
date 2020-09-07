/*
 * java.util.Date and java.sql.Date
 * DateFormat abstract class;
 *
 */
package DateAndLocale;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;

/**
 *
 * Java.util.date can be mapped to sql date, sql time, sql timestamp which are ref. to database data type;
 *
 * @author YNZ
 */
public class SqlDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        /**
         * java sql date yyyy-MM-dd
         */
        Date today = new Date(currentTimeMillis);
        System.out.println("Sql Date: " + today);

        /**
         * java sql time  hh:mm:ss
         */
        Time sqlTime = new Time(currentTimeMillis);
        System.out.println("Sql time: " + sqlTime);

        /**
         * java sql time stamp yyyy-MM-dd hh:mm:ss.ms
         */
        Timestamp timestamp = new Timestamp(currentTimeMillis);
        System.out.println("Sql time stamp: " + timestamp);

        // how to convert util date into sql date
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
        java.util.Date uDate = new Date(System.currentTimeMillis());
        System.out.println("uDate: " + df.format(uDate));

        System.out.println("sDate: " + convert(uDate));

        Date.valueOf(LocalDate.now());

        ZonedDateTime.now().toInstant();
    }

    public static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new Date(uDate.getTime());
        return sDate;
    }
}
