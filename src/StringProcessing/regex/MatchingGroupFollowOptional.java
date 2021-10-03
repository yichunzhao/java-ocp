package StringProcessing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingGroupFollowOptional {

  private static final String tPattern = "((\\s[0-9]{4}\\s|\\s[A-Z]+\\s)([A-Z]{2})?)";

  private static final String target = "9/14/2020 Sell CBMG $18.39 $18.16 $18.49 $18.38 $18.38";

  private static final String specificTarget =
      "9/10/2020 Sell 8473 JP $2,655.98 $2,613.00 $2,685.00 $2,685.00 $2,685.00";

  public static void main(String[] args) {

    Matcher matcher1 = Pattern.compile(tPattern).matcher(target);
    while (matcher1.find()) {
      System.out.printf(
          "Group: %s, SubString %s \n",
          matcher1.group(), target.substring(matcher1.start(), matcher1.end()));
    }

    System.out.println("");

    Matcher matcher2 = Pattern.compile(tPattern).matcher(specificTarget);
    while (matcher2.find()) {
      System.out.printf(
          "Group: %s, SubString %s \n",
          matcher2.group(), specificTarget.substring(matcher2.start(), matcher2.end()));
    }
  }
}
