/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndLocale.Local;

import java.time.*;

/** @author YNZ */
public class LocaleDateJava8 {

  public static void main(String[] args) {

    LocalDate currentDate = LocalDate.now();
    System.out.println("current date: " + currentDate);

    LocalTime currentTime = LocalTime.now();
    System.out.println("current time: " + currentTime);

    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("current date-time: " + currentDateTime);

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println("cururent zone date-time: " + zonedDateTime);

    LocalDate createdLocalDate = LocalDate.of(2018, Month.MARCH, 12);
    System.out.println("created local date: " + createdLocalDate);

    Period period = Period.between(currentDate, createdLocalDate);
    System.out.println("Period : " + period);

    LocalDate lDate1 = LocalDate.of(2018, Month.MARCH, 30);
    System.out.println("local date_1: " + lDate1);
  }
}
