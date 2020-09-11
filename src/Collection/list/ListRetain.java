/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.list;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * List retainAll() method is used to keep a list of retained elements, but removing the rest
 */
public class ListRetain {

    public static void main(String[] args) {

        Period p1 = Period.between(LocalDate.of(2020, Month.AUGUST, 21), LocalDate.of(2020, Month.AUGUST, 25));
        Period p2 = Period.between(LocalDate.of(2020, Month.FEBRUARY, 12), LocalDate.of(2020, Month.MARCH, 10));
        Period p3 = Period.between(LocalDate.of(2019, Month.APRIL, 2), LocalDate.of(2019, Month.MAY, 21));
        Period p4 = Period.between(LocalDate.of(2018, Month.JANUARY, 2), LocalDate.of(2019, Month.FEBRUARY, 8));

        List<Period> periods = Stream.of(p1, p2, p3, p4).collect(Collectors.toList());

        List<Period> retained = Arrays.asList(p2, p3);
        if (periods.retainAll(retained)) {
            System.out.println("left periods is equal to retained list:  " + (periods.equals(retained)));
        }
    }
}
