/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class ConvertListToSet {

    public static void main(String[] args) {
        Stream<String> strs = Stream.of("wo", "he", "ni", "xin", "lian", "xin");
        List<String> strList = strs.collect(Collectors.toList());
        
        //convert to set
        
        Set<String> strSet = new HashSet<>(strList);
        
        System.out.println("set : " + strSet);
        

    }
}
