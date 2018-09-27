/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class FlatMapAndFiltering {

    public static void main(String[] args) {

        String[][] strs = {{"I", "saw", "it"}, {"nothing", "was", "there"}};
        System.out.println("" + Arrays.toString(strs));

        //A pipe line of string arrays
        Arrays.stream(strs).forEach(x -> System.out.println(Arrays.toString(x)));

        //A double 
        Stream<String[]> strAryStream = Arrays.stream(strs);

        //
        Stream<String> strStream = strAryStream.flatMap(Arrays::stream);
        
        //
        List<String> result = strStream.filter(x -> !x.equals("was")).collect(toList());
        System.out.println("" + result);
        
        //
        Arrays.stream(strs).map(s->s.length);

    }
}
