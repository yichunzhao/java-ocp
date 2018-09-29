/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 *
 * @author YNZ
 */
public class ConcurrentHashMapVsHashmap {

    public static void main(String... args) {
        Map<String, Integer> hasMap = new HashMap<>();
        
        Map<String,Integer> weakHashMap = new WeakHashMap<>();
        
        //keeping the insertion order
        Map<String,Integer> linkedMap = new LinkedHashMap<>();
        
        //sorted by the key natural order
        Map<String,Integer> treeMap = new TreeMap<>();
        
        //concurrent map, repleacing hashtable
        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        
         
    }

}
