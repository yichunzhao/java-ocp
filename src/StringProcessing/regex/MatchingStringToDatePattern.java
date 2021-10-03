package StringProcessing.regex;

public class MatchingStringToDatePattern {
  private static final String pattern = "\\d{1,2}/\\d{1,2}/\\d{4}";

  public static void main(String[] args) {
    // date 9/14/2020
    String date = "9/14/2020";
    boolean matched = date.matches(pattern);
    System.out.println(matched);

    String date1 = "9/4/2020";
    System.out.println("match 1 = " + date1.matches(pattern));

    String date2 = "12/4/2020";
    System.out.println("match 2 = " + date2.matches(pattern));

    String date3 = "12/234/2020";
    System.out.println("match 3 = " + date3.matches(pattern));
  }
}
