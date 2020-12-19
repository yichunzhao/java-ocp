package Collection.Map.HashMap;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

public class FindItemsCombination {
    private static Map<Character, Integer> itemAmountMap = new HashMap<>();

    static {
        itemAmountMap.put('A', 3);
        itemAmountMap.put('B', 5);
        itemAmountMap.put('C', 3);
        itemAmountMap.put('D', 1);
    }

    public static void main(String[] args) {
        System.out.println("item and amount table: " + itemAmountMap);
        System.out.println("how many A? " + itemAmountMap.get('A'));
        System.out.println("how many B? " + itemAmountMap.get('B'));

        //how many combination C and D
        findCombination(itemAmountMap, 'C', 'D').ifPresent(System.out::println);
        findCombination(itemAmountMap, 'A', 'B', 'C', 'D').ifPresent(System.out::println);
        findCombination(itemAmountMap, 'A', 'C').ifPresent(System.out::println);
    }

    public static OptionalInt findCombination(Map<Character, Integer> itemAmountMap, Character... characters) {
        if (!itemAmountMap.keySet().containsAll(Arrays.asList(characters))) return OptionalInt.of(0);
        return Arrays.stream(characters).mapToInt(itemAmountMap::get).min();
    }
}
