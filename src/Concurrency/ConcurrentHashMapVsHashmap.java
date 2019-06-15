/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/** @author YNZ */
public class ConcurrentHashMapVsHashmap {

  public static void main(String... args) {
    Map<String, Integer> hasMap = new HashMap<>();

    Map<String, Integer> weakHashMap = new WeakHashMap<>();

    // sorted by the key natural order
    Map<String, Integer> treeMap = new TreeMap<>();

    // concurrent map, repleacing hashtable
    ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

    List<String> arrayList = new ArrayList<>();
    arrayList.add("Dell");
    arrayList.add("Dell");

    List<String> linkedList = new LinkedList<>();
    linkedList.add("Lenovo");
    linkedList.add("Lenovo");

    System.out.println("" + arrayList);
    System.out.println("" + linkedList);

    // keeping the insertion order
    Map<String, Integer> linkedMap = new LinkedHashMap<>();
    linkedMap.put("Dell", 1);
    linkedMap.put("Dell", 2);
    System.out.println("" + linkedMap);

    // hashset internally implemented by a hashmap.
    Set<String> hashSet = new HashSet<>();
    hashSet.add("add");
    hashSet.add("add");
    hashSet.add(null);
    System.out.println("" + hashSet);

    hashSet.removeIf(x -> x == null);
    System.out.println("" + hashSet);
  }
}
