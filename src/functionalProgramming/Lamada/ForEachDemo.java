package functionalProgramming.Lamada;

import java.util.stream.Stream;

public class ForEachDemo {

    public static void main(String... args) {
        Stream.of(24, 45, 23, 1).sorted().forEach(System.out::println);

        Stream.of(12, 7346, 88, 999)
                .filter(e -> e > 1000)
                .forEach(System.out::println);
    }
}
