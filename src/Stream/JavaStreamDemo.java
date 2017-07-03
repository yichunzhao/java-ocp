/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    }

}
