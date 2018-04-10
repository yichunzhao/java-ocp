/*
 * how to convert stream to array
 * 
 * 
 */
package StreamExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class JavaStreamDemo {

    public static void main(String[] args) {
        //Stream creation
        List<Integer> list = Stream.of(12, 13, 17, 19, 56).collect(toList());
        List<Integer> filtered = list.stream().filter((x) -> x > 19).collect(toList());
        System.out.println(filtered);

        Stream<String> currencies = Stream.of("US", "RMB", "EUR");
        //String[] curs = currencies.toArray(String[]::new);
        String[] currss = currencies.toArray((value) -> {
            return new String[value]; //To change body of generated lambdas, choose Tools | Templates.
        });

        List<String> temp = Arrays.asList("China", "Japen", "Denmark");

        String[] countries = temp.toArray(new String[temp.size()]);
        System.out.println("" + Arrays.toString(countries));

        Stream<String> cs = Stream.of("China", "Japen", "Denmark");
        List<String> csList = cs.collect(Collectors.toList());
        
        //List<Double> randoms = Stream.iterate(temp, f), f)
        //System.out.println("" + randoms);
        String inputStr = "we are on the earth.";
        Stream<String> words = Stream.of(inputStr.split("[.\\s]"));
        System.out.println("word num: " + words.count());
        
                

    }

}
