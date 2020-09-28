package Collection.Map.sorted.navigable;

import java.util.Arrays;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * celling finds the least key, which >= key
 * <p>
 * floor finds the least key, which <=key
 * <p>
 * higherKey finds the least key that > key
 * lowerKey finds the greatest key < key
 */
public class CeilingAndFloorApi {
    private static final String str = "Not all collections in the Collections Framework actually implement the " +
            "Collection interface";

    public static void main(String[] args) {
        NavigableMap<String, Integer> strLengthMap = Arrays.stream(str.split("\\s"))
                .collect(Collectors.toMap(s -> s, String::length, (s1, s2) -> s2, TreeMap::new));

        System.out.println("String-Length map: " + strLengthMap);

        //the least entry that is >= Z
        System.out.println("the least entry >= Z: " + strLengthMap.ceilingEntry("Z"));
        //the least entry that is <= >
        System.out.println("the least entry <= Z: " + strLengthMap.floorEntry("Z"));

        //the least key that is >= Z
        System.out.println("the least key >=Z: " + strLengthMap.ceilingKey("Z"));
        //the least ley that is <= Z
        System.out.println("the least key <=Z: " + strLengthMap.floorKey("Z"));

        //the least key that > a
        System.out.println("the least key >a: " + strLengthMap.higherKey("a"));

        //the greatest key that < t
        System.out.println("the greatest key <t: " + strLengthMap.lowerKey("t"));

    }
}
