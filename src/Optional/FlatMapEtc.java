/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Optional;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class FlatMapEtc {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("5.6", "7.4", "4", "1", "2.3");
        System.out.println("" + list);

        List<String> a1 = list.stream().map(a -> a + 2).collect(toList());
        System.out.println("" + a1);
        
        Stream<String> a2 =list.stream().flatMap(Stream::of);
        a2.forEach(System.out::println);
        
        

    }

}
