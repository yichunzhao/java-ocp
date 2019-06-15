/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamada;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** @author YNZ */
public class Prices {

  public static void main(String[] args) {
    List<BigDecimal> prices =
        Arrays.asList(
            new BigDecimal("10"),
            new BigDecimal("30"),
            new BigDecimal("17"),
            new BigDecimal("20"),
            new BigDecimal("15"),
            new BigDecimal("18"),
            new BigDecimal("45"),
            new BigDecimal("12"));

    List<BigDecimal> filtered =
        prices.stream()
            .filter(
                p -> {
                  return p.compareTo(BigDecimal.valueOf(20)) > 0;
                })
            .collect(Collectors.toList());

    System.out.println("filtered:  " + filtered);

    List<BigDecimal> mapped =
        prices.stream().map(p -> p = p.add(BigDecimal.valueOf(20))).collect(Collectors.toList());
    System.out.println("mapped: " + mapped);
  }
}
