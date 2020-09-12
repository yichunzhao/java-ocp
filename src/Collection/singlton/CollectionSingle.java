package Collection.singlton;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Collection.singleton return an immutable Set, which contains one element.
 * Collection.singletonList return an immutable List, which contains one element.
 * Collection.singletonMap return an immutable Map, which contains one element.
 */
public class CollectionSingle {

    public static void main(String[] args) {
        Set<String> xx = Collections.singleton("one");

        try {
            xx.add("two");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.toString());
        }

        List<Period> yy = Collections.singletonList(Period.of(2012, 3, 18));

        try {
            yy.add(Period.ofMonths(2));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.toString());
        }

        Map<String, LocalDateTime> nameAppointMap = Collections.singletonMap(
                "mike", LocalDateTime.of(LocalDate.of(2012, 3, 18), LocalTime.of(11, 30)));
        try {
            nameAppointMap.put("jack", LocalDateTime.of(LocalDate.of(2012, 3, 18), LocalTime.of(11, 30)));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.toString());
        }

    }
}
