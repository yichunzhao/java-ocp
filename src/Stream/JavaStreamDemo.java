/*
 * how to convert stream to array
 * 
 * 
 */
package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class JavaStreamDemo {

    public static List<Integer> list = new ArrayList<>();

    static {
        list.add(12);
        list.add(13);
        list.add(17);
        list.add(19);
        list.add(56);
    }

    public static void main(String[] args) {
        List<Integer> filtered = list.stream().filter((x) -> x > 19).collect(Collectors.toList());
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
        
        
    }

}
