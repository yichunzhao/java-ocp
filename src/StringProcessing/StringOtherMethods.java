package StringProcessing;

/**
 * endsWith(String suffix) startsWith(String prefix) startWith(String prefix, int offset)
 * compareTo(String anotherStr) compareToIgnoreCase(String anotherStr) equals(Object object)
 * equalsIgnoreCase(String anotherStr)
 */
public class StringOtherMethods {
  private static String str = "Start startup, time to start";
  private static String a = "a";
  private static String bigA = "A";

  public static void main(String[] args) {
    System.out.println(str.startsWith("Start")); // true
    System.out.println(str.startsWith("Start", 0)); // true
    System.out.println(str.startsWith("Start", 1)); // false
    System.out.println(str.startsWith("start", 0)); // false
    System.out.println(str.startsWith("start", -1)); // false
    System.out.println(a.compareTo(bigA)); // >0

    System.out.println(bigA.compareTo(a)); // <0
    System.out.println(bigA.compareToIgnoreCase(a)); // =0
    System.out.println(str.substring(0, 1).compareTo(str.substring(6, 7))); // <0

    System.out.println(a.equals(bigA)); // false
    System.out.println(a.equalsIgnoreCase(bigA)); // true
  }
}
