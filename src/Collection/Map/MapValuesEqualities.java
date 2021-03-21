package Collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Map returns keys, a Set, which maybe a sortedSet up to its Map impl.
 * However, Map returns values in Collections
 * <p>
 * we can compare two sets; how about comparing two Collections?
 * <p>
 * map return values in a Collection, Collection equals comparing the references of instances.
 * set equals comparing each elements within the Set, if both Set contains the same elements, 'equals' return the true
 */
public class MapValuesEqualities {
    private static final Map<Character, Integer> charCountMap1 = new HashMap<>();
    private static final Map<Character, Integer> charCountMap2 = new HashMap<>();

    static {
        char[] chars1 = "stop".toCharArray();
        for (char c : chars1) {
            if (charCountMap1.containsKey(c)) {
                int count = charCountMap1.get(c);
                charCountMap1.put(c, ++count);
            } else {
                charCountMap1.put(c, 1);
            }
        }

        char[] chars2 = "tops".toCharArray();
        for (char c : chars2) {
            if (charCountMap2.containsKey(c)) {
                int count = charCountMap2.get(c);
                charCountMap2.put(c, ++count);
            } else {
                charCountMap2.put(c, 1);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("map1:");
        System.out.println(charCountMap1);

        System.out.println("map2:");
        System.out.println(charCountMap2);

        Set<Character> keys1 = charCountMap1.keySet();
        Set<Character> keys2 = charCountMap2.keySet();

        //set equals comparing the elements
        System.out.printf("two key sets == ? %b \n", (keys1 == keys2));
        System.out.printf("two key sets contains the same? %b \n", keys1.equals(keys2));
        System.out.printf("two key sets contains the same? %b \n", keys2.equals(keys1));

        //
        Collection<Integer> values1 = charCountMap1.values();
        Collection<Integer> values2 = charCountMap2.values();
        System.out.printf("values1 == values2 ? %b \n", (values1 == values2));
        System.out.printf("values1 equals values2 ? %b \n", (values1.equals(values2)));

        System.out.println("putting values in the set...");
        System.out.printf("values1 equals values2 ? %b \n", (new HashSet<>(values1).equals(new HashSet<>(values2))));
    }
    
}
