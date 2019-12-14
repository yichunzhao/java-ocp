/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/** @author YNZ */
public class ConcurrentHashMapVsHashmap {
  private static ConcurrentMap<String, Number> myMap = new ConcurrentHashMap<>(5, 0.9f);

  public static void main(String... args) {
    // HashMap is not synchronized. if accessing a HashMap in multiple threads, then it needs to
    // lock the entire HashMap.
    //
    // ConcurrentMap interface and its impl. Concurrent HashMap lock partially.
    // it allows the multiple threads accessing simultaneously. It doesn't throw
    // ConcurrentModification exception.
    // meaning that it allows add and traverse at the same time. it maybe traverse on a copy of the
    // map, while the
    // modification.

    System.out.println("Size: " + myMap.size());

    myMap.putIfAbsent("1", new Double(1.0));
    myMap.putIfAbsent("2", new Double(2.0));
    myMap.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));

    myMap.putIfAbsent("1", new Double(1.0));
    myMap.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));

    // HashMap
    Map<String, String> myAnotherMap = new HashMap<>();
    myAnotherMap.putIfAbsent("1", "one");
    myAnotherMap.put("1", "two");
    System.out.println("size: " + myAnotherMap.size());

    // duplicated key overrides each other; the newly added one overrides the old one.
    System.out.println(myAnotherMap.get("1"));

    // so as manipulate concurrent HashMap, it needs to watch out if it is atomic.
    manipulateCurrentHashMapUsingReplace("2", Double.valueOf(2));
  }

  private static void manipulateCurrentHashMap(String key, Number value) {
    // If a map is concurrently accessed by multiple threads, the key-value could be overridden.
    // the same key can be put by another thread.
    // so what is the risk in the following statement in a concurrent context?
    if (!myMap.containsKey(key)) myMap.put(key, value);
    // when operating containsKey method, the map may be concurrently modified, for the concurrent
    // map is not locked.
    // an individual operation, containsKey or put key-value is thread-safe, but together they are
    // not.
  }

  private static Number manipulateCurrentHashMapUsingReplace(String key, Number value) {
    // the replace do the dame as the above, as well as it is atomic.
    return myMap.replace(key, value);  //replace is atomic.
  }
}
