package Collection.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayList Contains O(n)
 * ArrayList Add O(1)
 * ArrayList Remove O(n)
 * ArrayList Get O(1)
 *
 * @author YNZ
 */
public class ListContains {

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

        List<BigDecimal> question = new ArrayList<>();
        question.add(new BigDecimal("20"));
        question.add(new BigDecimal("30"));

        //check containing Object
        System.out.println("list contains 20 ? " + prices.contains(BigDecimal.valueOf(20)));

        //check containing Collection
        System.out.println("list contains 20 and 30 ? " + prices.containsAll(question));

    }
}
