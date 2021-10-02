package StringProcessing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinePatternMatching {
  private static final String[] targets = {
    "9/14/2020 Sell CBMG $18.39 $18.16 $18.49 $18.38 $18.38",
    "9/14/2020 Buy EXAS $77.79 $76.75 $79.14 $77.60 $77.60"
  };

  private static final String specificTarget =
      "9/10/2020 Sell 8473 JP $2,655.98 $2,613.00 $2,685.00 $2,685.00 $2,685.00";

  private static final String dPattern = "\\d{1,2}/\\d{1,2}/\\d{4}";
  private static final String cPattern = "[$][,\\d]+.\\d{2}";
  private static final String c1Pattern = "[$][\\d]+.\\d{2}";

  private static final String pattern = "^\\d{1,2}/\\d{1,2}/\\d{4}\\s+(Sell|Buy).+[$]\\d+.\\d{2}$";

  public static void main(String[] args) {
    for (String target : targets) {
      System.out.println(target.matches(pattern));
    }

    Matcher matcherD = Pattern.compile(dPattern).matcher(specificTarget);
    while (matcherD.find()) {
      System.out.printf(
          "start: %s end: %s matched: %s \n ",
          matcherD.start(),
          matcherD.end(),
          specificTarget.subSequence(matcherD.start(), matcherD.end()));
    }

    System.out.println("");
    Matcher matcherC = Pattern.compile(cPattern).matcher(specificTarget);
    while (matcherC.find()) {
      System.out.printf(
          "\n c group: %s start: %s end: %s matched: %s",
          matcherC.group(),
          matcherC.start(),
          matcherC.end(),
          specificTarget.subSequence(matcherC.start(), matcherC.end()));
    }

    System.out.println("");
    Matcher matcherC1 = Pattern.compile(c1Pattern).matcher(targets[0]);
    while (matcherC1.find()) {
      System.out.printf(
          "\n c1 group: %s start: %s end: %s matched: %s",
          matcherC1.group(),
          matcherC1.start(),
          matcherC1.end(),
          targets[0].subSequence(matcherC1.start(), matcherC1.end()));
    }

    System.out.println("");
    Matcher matcherC2 = Pattern.compile(cPattern).matcher(targets[0]);
    while (matcherC2.find()) {
      System.out.printf(
          "\n c2 group: %s start: %s end: %s matched: %s",
          matcherC2.group(),
          matcherC2.start(),
          matcherC2.end(),
          targets[0].subSequence(matcherC2.start(), matcherC2.end()));
    }
  }
}
