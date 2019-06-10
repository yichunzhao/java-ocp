/*
 * java.util.Date and java.sql.Date
 * DateFormat abstract class;
 *
 */
package DateAndLocale;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/** @author YNZ */
public class SqlDate {

  /** @param args the command line arguments */
  public static void main(String[] args) {

    Date today = new Date(System.currentTimeMillis());
    System.out.println("" + today);

    // how to convert until date into sql date
    DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
    java.util.Date uDate = new Date(System.currentTimeMillis());
    System.out.println("uDate: " + df.format(uDate));

    System.out.println("sDate: " + convert(uDate));
  }

  public static java.sql.Date convert(java.util.Date uDate) {
    java.sql.Date sDate = new Date(uDate.getTime());
    return sDate;
  }
}
