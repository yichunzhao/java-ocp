/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class CollectionMap {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 22, 33, 64);
        System.out.println("the rest: " + numbers.filter(n -> !n.equals(22)).collect(Collectors.toList()));

    }

}
