package DateAndLocale;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.stream.Collectors;

public class ShowAllZoneID {

    public static void main(String[] args) {
        //All ZoneIds
        System.out.println(
                ZoneId.getAvailableZoneIds()
                        .stream()
                        .collect(Collectors
                                .joining(" ", "++", "++"))
        );


        //ZoneOffset map to ZoneId(there are keys overwritten.)
        Map<ZoneOffset, String> zoneOffsetMap = ZoneId.getAvailableZoneIds().stream()
                .collect(Collectors.toMap(
                        s -> ZonedDateTime.now(ZoneId.of(s)).getOffset(),
                        s -> s,
                        (s1, s2) -> s2)//when the same key happens.
                );

        zoneOffsetMap.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

    }
}
