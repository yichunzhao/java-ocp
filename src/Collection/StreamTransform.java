/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class StreamTransform {
    public static String[] strings = {"Introduction", "to", "Java", "Programming"};

    public static void main(String[] args) {

        //limiting the elements in a stream and find out different ones
        Stream<String> nums = Stream.of("13", "2", "26", "9", "0").limit(3).distinct().sorted();

        //join elements in a stream
        System.out.println(Stream.of(strings).sorted().collect(joining(" ", "+", "-")));

        //transforming elements into another type.
        List<Character> firstChars = Arrays.stream(strings).map(s -> s.charAt(0)).collect(toList());
        System.out.println("first chars : " + firstChars);

        //limiting
        System.out.println("10 random num: " + Stream.generate(Math::random).limit(10).collect(toList()));
    }
}
