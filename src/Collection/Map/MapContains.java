package Collection.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Map contains, it returns ture and false
 */
public class MapContains {

    public static void main(String[] args) {
        Map<String, Integer> stringLengthMap = Arrays.stream("we like java programing".split("\\s"))
                .collect(Collectors.toMap(s -> s, s -> s.length(), (s1, s2) -> s2, HashMap::new));

        System.out.println("contains we? " + stringLengthMap.containsKey("we"));
        System.out.println("contains 2? " + stringLengthMap.containsValue(2));

        System.out.println("contains value xxx? " + stringLengthMap.containsValue("xxx"));
        System.out.println("contains key yyy? " + stringLengthMap.containsValue("yyy"));

        //watch out NullPointerException here
        System.out.println("get key that is not existed: " + stringLengthMap.get("xxx"));
    }
}
