package Collection.Map;


import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * finding a key-value that is not existed in a map, it returns a null; however, in some cases it may cause
 * NullPointException when assigning it to a primitive variable.
 */
public class FindKeyNotExistedInMap {

    public static void main(String[] args) {

        Map<String, Integer> wordLengthMap = Arrays.stream("Java is a popular programing language".split("\\s"))
                .collect(Collectors.toMap(s -> s, s -> s.length(), (s1, s2) -> s2, TreeMap::new));

        System.out.println("map: " + wordLengthMap);

        System.out.println("java: " + wordLengthMap.get("Java"));
        System.out.println("XXX: " + wordLengthMap.get("xxx"));

        //assigning it to a primitive, it leads to a NullPointException
        try {
            int x = wordLengthMap.get("xxx");
        } catch (Exception e) {
            System.out.println(e);
        }

        int y = 0;
        if (wordLengthMap.containsKey("xxx")) {
            y = wordLengthMap.get("xxx");
        }
        System.out.println("y=" + y);

    }
}
