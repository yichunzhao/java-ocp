/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author YNZ
 */
public class ConvertListToSet {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("wo", "he", "ni", "xin", "lian", "xin");
        System.out.println("original list of String:" + strList);

        // convert a List to Set using Set constructor
        Set<String> strSet = new HashSet<>(strList);
        System.out.println("set : " + strSet);

        Set<String> strTreeSet = new TreeSet<>(strList);
        System.out.println("tree set : " + strTreeSet);

        // collect the List into a Set
        Set<String> strSet2 = strList.stream().collect(Collectors.toSet());
        System.out.println("collect from a stream: " + strSet2);

        Set<String> strTreeSet2 = strList.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println("collect from a stream: " + strTreeSet2);
    }
}
