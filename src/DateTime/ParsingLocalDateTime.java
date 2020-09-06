package DateTime;

import java.time.LocalDateTime;

public class ParsingLocalDateTime {

    public static void main(String[] args) {
        //localDateTime pattern:yyyy-MM-ddThh:mm:ss
        System.out.println(LocalDateTime.parse("2012-08-09T13:23:24"));
    }
}
