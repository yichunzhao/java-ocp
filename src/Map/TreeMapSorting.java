package Map;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSorting {

  public static void main(String[] args) throws ParseException {
    //
    Map<Date, Integer> myTreeMap = new TreeMap<>();

    DateFormat parser = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
    Date date1 = parser.parse("2020-01-20 15:00:00");
    Date date2 = parser.parse("2020-01-19 16:10:10");

    System.out.println(date1);
    System.out.println(date2);

    myTreeMap.put(date1, 12);
    myTreeMap.put(date2, 12);
    myTreeMap.put(date1, 36);

    System.out.println(myTreeMap);
  }
}
