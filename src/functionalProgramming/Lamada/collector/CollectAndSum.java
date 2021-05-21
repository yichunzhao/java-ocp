package functionalProgramming.Lamada.collector;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collector offers many useful helpers
 */
public class CollectAndSum {

    public static void main(String[] args) {
        IntSummaryStatistics intSummaryStatistics = Stream.of(1, 3, 5, 7, 9).collect(Collectors.summarizingInt(Integer::intValue));
        intSummaryStatistics.getSum();
    }
}
