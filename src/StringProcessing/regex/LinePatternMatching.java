package StringProcessing.regex;

public class LinePatternMatching {
    private static final String[] targets = {
            "9/14/2020 Sell CBMG $18.39 $18.16 $18.49 $18.38 $18.38",
            "9/14/2020 Buy EXAS $77.79 $76.75 $79.14 $77.60 $77.60"
    };

    private static final String pattern = "^\\d{1,2}/\\d{1,2}/\\d{4}\\s+(Sell|Buy).+[$]\\d+.\\d{2}$";

    public static void main(String[] args) {
        for (String target : targets) {
            System.out.println(target.matches(pattern));
        }
    }
}
