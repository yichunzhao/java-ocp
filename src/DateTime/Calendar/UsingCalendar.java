package DateTime.Calendar;

import java.util.Calendar;

/**
 * some legacy code are still using Calendar to presenting date time.
 */
public class UsingCalendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("current time " + calendar.getTime());

        //get current month(from o-11)
        System.out.println("current month: " + calendar.get(Calendar.MONTH));

        //get current year
        System.out.println("current year: " + calendar.get(Calendar.YEAR));

        //get current day(from 1-31)
        System.out.println("current day: " + calendar.get(Calendar.DAY_OF_MONTH));

        //two month ago
        calendar.add(Calendar.MONTH, -2);
        System.out.println("two month ago " + calendar.getTime());

        //two day later on
        calendar.add(Calendar.DATE, 2);
        System.out.println("two days later " + calendar.getTime());

        //one year later
        calendar.add(Calendar.YEAR, 1);
        System.out.println("one year later" + calendar.getTime());

    }
}
