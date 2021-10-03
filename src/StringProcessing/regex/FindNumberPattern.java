package StringProcessing.regex;

/** when recognizing a pattern in a number series, this maybe a short cut. */
public class FindNumberPattern {
  private static final String pattern = "[false]+[true]+";
  private static final String patternA = "[0]+[1]+";

  public static void main(String[] args) {

    String p = "falsefalsefalsetruetruetruetrue";
    String p1 = "falsetruefalsetruetruetruetrue";
    String p2 = "truetrueturetruetrueturetruetrue";
    String p3 = "falsetruetruetruetruetruetruetrue";

    System.out.println("p");
    System.out.println(p);

    System.out.println("matching the pattern: " + p.matches(pattern));

    System.out.println("p1");
    System.out.println(p1);
    System.out.println("matching the pattern: " + p1.matches(pattern));

    System.out.println("p2");
    System.out.println(p2);
    System.out.println("matching the pattern: " + p2.matches(pattern));

    System.out.println("p3");
    System.out.println(p3);
    System.out.println("matching the pattern: " + p3.matches(pattern));

    String p4 = "0000011111";
    System.out.println(p4);
    System.out.println("matching the pattern: " + p4.matches(patternA));

    String p5 = "1111111111";
    System.out.println(p4);
    System.out.println("matching the pattern: " + p5.matches(patternA));
  }
}
