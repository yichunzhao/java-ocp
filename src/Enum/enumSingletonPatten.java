package Enum;

/**
 * Using enum creating Singleton pattern is quite easy, for each constant is defined as public static final instance.
 * It is naturally a single instance.
 */
enum DataConnector {
    INSTANCE;

    synchronized public String getConnection() {
        return "connection";
    }
}

public class enumSingletonPatten {
    public static void main(String[] args) {
        String con = DataConnector.INSTANCE.getConnection();
        System.out.println(con);
    }

}
