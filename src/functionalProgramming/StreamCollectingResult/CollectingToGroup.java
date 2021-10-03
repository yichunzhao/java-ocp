package functionalProgramming.StreamCollectingResult;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingToGroup {

  public static void main(String[] args) {
    // group by displayCountry
    Map<String, List<Locale>> countryLocaleMap =
        Stream.of(Locale.getAvailableLocales())
            .collect(Collectors.groupingBy(Locale::getDisplayCountry));

    countryLocaleMap
        .entrySet()
        .forEach(
            stringListEntry ->
                System.out.println(
                    stringListEntry.getKey()
                        + " "
                        + stringListEntry.getValue().stream()
                            .map(locale -> locale.getDisplayLanguage())
                            .collect(Collectors.joining(" :", "++", "-"))));
  }
}
