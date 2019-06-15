/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeLine;

import java.time.*;

/** @author YNZ */
public class UsingInstantTimeAPI {

  public static void main(String[] args) {
    Instant start = Instant.now();

    Instant end = Instant.now();

    Duration d = Duration.between(start, end);
    System.out.println("Duration = " + d.toString());
    System.out.println("Duration in ms = " + d.toMillis());

    System.out.println("Local date now : " + LocalDate.now());

    LocalDate ofDate = LocalDate.of(1965, Month.MARCH, 12);
    System.out.println("" + ofDate);

    ZonedDateTime dateTime = ZonedDateTime.now();
    System.out.println("" + dateTime);
  }
}
