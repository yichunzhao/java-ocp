/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.Lamada;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class SortingInteger {
    public static int[] numbs = {1, 99, 1234, 34, 56, 89};
    public static Integer[] numbInstances = {1, 99, 1234, 34, 56, 89};

    public static void main(String[] args) {

        //very easy to sort an array of number by Arrays helper class
        int[] copyOfNumbs = Arrays.copyOf(numbs, numbs.length);
        System.out.println("copyOfNumbs" + Arrays.toString(copyOfNumbs));

        Arrays.sort(numbs);
        System.out.println("after sorting: " + Arrays.toString(numbs));

        //sorting by List and Comparator; it is verbose; actually underneath it uses Arrays.sort
        int[] copyOfNumbs_ = Arrays.copyOf(numbs, numbs.length);
        List<Integer> numList = Arrays.stream(copyOfNumbs_).mapToObj(i -> Integer.valueOf(i)).collect(toList());
        numList.sort(Integer::compareTo);
        System.out.println("after sorting: " + numList);

        System.out.println("after sorting: ");
        System.out.println(Arrays.stream(numbInstances).sorted().collect(toList()));

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Comparator<String> comparator = String::compareTo;

        List<String> words = Arrays.asList("Kd", "Whatever", "Goodbye");
        System.out.println("before sorting : " + words);
        words.sort(comparator);
        System.out.println("sorted : " + words);

        String testStr = "see you later on. ";
        testStr.compareToIgnoreCase(testStr);

        List<String> strings = Arrays.asList("Kd", "Whatever", "Goodbye");
        strings.sort(String::compareToIgnoreCase);
        System.out.println("after sorting:  " + strings);
    }
}
