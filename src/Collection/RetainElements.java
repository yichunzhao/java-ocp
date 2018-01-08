/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class RetainElements {

    
    public static void main(String[] args) {
        List<String> strlist = Stream.of("wo", "da", "si", "ni").collect(Collectors.toList());
        System.out.println("strlist is arraylist " + (strlist instanceof ArrayList ));
        
        List<String> strs = Stream.of("wo", "da").collect(Collectors.toList());
        if(strlist.retainAll(strs))
            System.out.println("what left in strlist: " + strlist);

    }

}
