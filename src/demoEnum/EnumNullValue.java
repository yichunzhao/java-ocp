package demoEnum;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class EnumNullValue {

    public static void main(String[] args) {

        try {
            Level.valueOf(null);
        } catch (Exception e) {
            System.out.println(e);
        }

        Level reversed = Level.valueOf(Level.LOW.name());
        System.out.println(reversed == Level.LOW);
    }
}
