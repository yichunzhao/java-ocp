package DateAndLocale.Java8DateTime;

import java.time.ZoneId;

public class AchievingZoneId {

    public static void main(String[] args) {

        //factory method: creating zoneId instance from zone_id name
        System.out.printf("central Europe time zone id : %s \n", ZoneId.of("Europe/Paris"));

        //short to zone_id name
        System.out.printf("ECT zone-id: %s \n ", ZoneId.SHORT_IDS.get("ECT"));

        //system default time-zoneId
        System.out.printf("system default zone id : %s \n", ZoneId.systemDefault());
    }

}
