/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections.emptyList() return an immutable empty List; which cannot be modified later on.
 * <p>
 * adding an item leads to an java.lang.UnsupportedOperationException
 *
 * @author YNZ
 */
public class EmptyList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("list is empty: " + list.isEmpty());

        // creating an empty list
        List<Double> myList = Collections.emptyList();

        //myList is immutable. You can modify its content.
        //adding will cause java.lang.UnsupportedOperationException
        //myList.add(1D);

        System.out.println(myList.toString());
    }

}
