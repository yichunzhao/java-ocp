/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author YNZ
 */
public class UsingLinkedHashMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("what", 10);
        map.put("you", 20);
        map.put("are", 30);
        map.put("doing", 40);
        map.put("now", 50);
        
        System.out.println("map " + map.toString());
        
        
        Map<String,Integer> hashMap = new HashMap<>(map);
        System.out.println("linkend map -> hashmap : " + hashMap);
        
        Set<Entry<String,Integer>> setMap = map.entrySet().stream().filter(e->e.getValue()==30).collect(Collectors.toSet());
        System.out.println("what left: " + setMap);
        
        System.out.println("First element: " + map.entrySet().stream().findFirst());
                

    }

}
