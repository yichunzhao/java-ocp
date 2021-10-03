package StringProcessing.formating;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StringFormatDouble {

  public static void main(String[] args) {
    double n = 1.567D;
    String formatted = String.format("%.1f", n);
    System.out.println("formatted: " + formatted);

    float m = 3.567f;
    String formattedFloat = String.format("%.1f", m);
    System.out.println("formatted float: " + formattedFloat);

    double tmp = BigDecimal.valueOf(n).setScale(1, RoundingMode.HALF_UP).doubleValue();
    System.out.println("after round up: " + tmp);
  }
}
