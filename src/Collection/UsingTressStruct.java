/*
 * Data Struct: Tree - auto-sorted. 
 * 
 * 
 */
package Collection;

import java.math.BigDecimal;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class UsingTressStruct {

    public static void main(String[] args) {

        TreeSet<Float> treeSet = new TreeSet<>();
        treeSet.add(1.22f);

        TreeMap<Double, BigDecimal> treeMap = new TreeMap<>();
        treeMap.put(12.0d, new BigDecimal(122));
        treeMap.put(21.0d, new BigDecimal(231));
        treeMap.put(13.0d, new BigDecimal(113));
        
        System.out.println("Tree map key set : " + treeMap.keySet());
        System.out.println("Tree map entry set : " + treeMap.entrySet());
    }

}
