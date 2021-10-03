package coreUtil.Math;

public class ConvertDoubleToInt {

  public static void main(String[] args) {
    // casting
    double doubleValue = 3.1415926;
    System.out.println("double to int by casting " + (int) doubleValue);

    // Math.round()
    System.out.println("double to int by rounding " + Math.round(doubleValue));
    System.out.println("double to int by rounding " + Math.round(3.926));
  }
}
