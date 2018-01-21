/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class ListRetain {

    public static void main(String[] args) {

        List<String> list = Stream.of("wo", "ai", "beijing", "tiananmen").collect(Collectors.toList());
        List<String> retained = Stream.of("wo", "ai").collect(Collectors.toList());
        if (list.retainAll(retained)) {
            System.out.println(" " + list);
        }

    }

}
