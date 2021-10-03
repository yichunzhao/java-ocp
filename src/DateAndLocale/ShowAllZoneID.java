package DateAndLocale;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShowAllZoneID {

    public static void main(String[] args) {
        System.out.println("+++++++++++++++++ All ZoneId(String) +++++++++++++++++++++++++++++++++");

        System.out.println(
                ZoneId.getAvailableZoneIds()
                        .stream()
                        .collect(Collectors.joining(" ", "++", "++"))
        );


        //ZoneOffset map to ZoneId(there are keys overwritten.)
        System.out.println("+++++++++++++++++ ZoneOffSet map to ZoneId(String) +++++++++++++++++++");

        Map<ZoneOffset, String> zoneOffsetMap = ZoneId.getAvailableZoneIds().stream()
                .collect(Collectors.toMap(
                        s -> ZonedDateTime.now(ZoneId.of(s)).getOffset(),
                        s -> s,
                        (s1, s2) -> s2)//when the same key happens.
                );

        zoneOffsetMap.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        Map<ZoneOffset, List<ZonedDateTime>> zoneOffsetListMap = ZoneId.getAvailableZoneIds().stream()
                .map(s -> ZonedDateTime.now(ZoneId.of(s)))
                .collect(Collectors.groupingBy(ZonedDateTime::getOffset));

        System.out.println("#################### ZoneOffSet map to its ZoneIds ######################");

        zoneOffsetListMap.forEach((zoneOffset, zonedDateTimes) ->
                System.out.println(zoneOffset + "\n" + zonedDateTimes.stream().map(z -> z.getZone().getId())
                        .collect(Collectors.joining(" & "))));

        System.out.println("#################### ZoneOffSet map to its Count(ZoneIds) ######################");
        ZoneId.getAvailableZoneIds().stream()
                .map(s -> ZonedDateTime.now(ZoneId.of(s)))
                .collect(Collectors.groupingBy(ZonedDateTime::getOffset, Collectors.counting()))
                .forEach((zoneOffset, count) -> System.out.println(zoneOffset + ": " + count));

    }
}
