/*
 *
 * Generate a stream by Static method iterate
 *
 */
package StreamExp;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
public class StreamIterate {

  public static void main(String[] args) {
    List<BigDecimal> bigNumbers =
        Stream.iterate(BigDecimal.ZERO, x -> x.add(BigDecimal.TEN)).limit(10).collect(toList());
    System.out.println("big numbers : " + bigNumbers);
  }
}
