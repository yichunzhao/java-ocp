package Collection.Map.TreeMap;

import models.Meeting;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * Instead of using natural ordering, we may custom TreeMap ordering, for instance, making a reverse order.
 */
public class CustomSorting {

    public static void main(String[] args) throws ParseException {
        Meeting meeting1 = new Meeting("meeting1", "location1");
        Meeting meeting2 = new Meeting("meeting2", "location2");
        Meeting meeting3 = new Meeting("meeting3", "location3");

        DateFormat parser = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        Date date1 = parser.parse("2020-01-20 15:00:00");
        Date date2 = parser.parse("2020-01-19 16:00:10");
        Date date3 = parser.parse("2019-02-19 14:00:00");

        //specifying a custom comparator at the constructor.
        Map<Date, Meeting> myTreeMap = new TreeMap<>(Comparator.reverseOrder());

        myTreeMap.put(date1, meeting1);
        myTreeMap.put(date2, meeting2);
        myTreeMap.put(date3, meeting3);

        myTreeMap.entrySet().forEach(entry -> System.out.println("date: " + entry.getKey() + " " + entry.getValue()));
    }
}
