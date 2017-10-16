/*
 * How to traverse a collection; in java 7 we use iterator  
 * In java 8, we may use stream to pipline elements. 
 * 
 */
package Collection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class CollectionsIterable {

    public static void main(String[] args) {

        List<BigDecimal> list = new ArrayList<>(
                Arrays.asList(
                        BigDecimal.valueOf(10),
                        BigDecimal.valueOf(20),
                        BigDecimal.valueOf(30),
                        BigDecimal.valueOf(40)
                ));

        //Java 7  (4 lines)
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println("" + it.next());
        }

        //Java 8  (1 line)
        list.stream().forEach(System.out::println);
    }

}
