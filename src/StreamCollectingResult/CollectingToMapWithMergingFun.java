/*
 * Collecting to a map with a merge function
 * Collectors.collect(keyMapper, valueMapper, binaryOperator)
 * 
 */
package StreamCollectingResult;

import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class CollectingToMapWithMergingFun {

    public static void main(String[] args) {

        Stream<Locale> locals = Stream.of(Locale.getAvailableLocales());
        Map<String, String> languages = locals.collect(Collectors.toMap(Locale::getDisplayLanguage, l -> l.getDisplayCountry(l), (x, y) -> x));
        System.out.println("" + languages);

    }

}
