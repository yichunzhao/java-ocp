package functionalProgramming.Lamada;

import java.time.LocalDate;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumerAndSupplier {

  public static void main(String[] args) {
    Consumer<String> consumer = s -> System.out.println(s);
    consumer.accept("what");

    Supplier<LocalDate> dateSupplier = () -> LocalDate.of(2010, 12, 10);

    consumeDate(consumer);

    // supplier: y=f() function has no input, but return a specified type instance.
    TreeSet<Integer> numSorted =
        Stream.of(11, 2, 53).collect(Collectors.toCollection(TreeSet::new));
    System.out.println(numSorted);

    // date supplier
    consumeDate(dateSupplier);
    consumeDate(ConsumerAndSupplier::get);
  }

  private static void consumeDate(Consumer consumer) {
    consumer.accept("that");
  }

  private static void consumeDate(Supplier<LocalDate> dateSupplier) {
    System.out.println("time supplied: " + dateSupplier.get());
  }

  private static LocalDate getDate() {
    return LocalDate.of(2012, 12, 10);
  }

  private static LocalDate get() {
    return LocalDate.of(2012, 10, 10);
  }
}
