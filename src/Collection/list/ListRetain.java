package Collection.list;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

/** List retainAll() method is used to keep a list of retained elements, but removing the rest. */
public class ListRetain {

  public static void main(String[] args) {
    Period p1 =
        Period.between(LocalDate.of(2020, Month.AUGUST, 21), LocalDate.of(2020, Month.AUGUST, 25));
    Period p2 =
        Period.between(LocalDate.of(2020, Month.FEBRUARY, 12), LocalDate.of(2020, Month.MARCH, 10));
    Period p3 =
        Period.between(LocalDate.of(2019, Month.APRIL, 2), LocalDate.of(2019, Month.MAY, 21));
    Period p4 =
        Period.between(LocalDate.of(2018, Month.JANUARY, 2), LocalDate.of(2019, Month.FEBRUARY, 8));

    var periods = List.of(p1, p2, p3, p4);

    List<Period> theRemained = List.of(p2, p3);
    if (periods.retainAll(theRemained)) {
      System.out.println(
          "left periods is equal to retained list:  " + (periods.equals(theRemained)));
    }
  }
}
