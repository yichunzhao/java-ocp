/*
 *  map is an intermediate operation
 *  map is used to transform each element in the stream;
 *  R function(T input) mapper
 *
 */
package StreamExpInterOp;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/** @author YNZ */
public class StreamInterOpMap {

  public static void main(String[] args) {
    List<BigDecimal> bigNumbers =
        Stream.of("10", "45", "78", "99").map(BigDecimal::new).collect(toList());
    System.out.println("big numbers: " + bigNumbers);

    // reduce: combine all elements in the stream in another way.
    Optional<BigDecimal> sum = bigNumbers.stream().reduce((x, y) -> x.add(y));
    sum.ifPresent(System.out::println);
  }
}
