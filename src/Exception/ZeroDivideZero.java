package Exception;

public class ZeroDivideZero {
  public static void main(String[] args) {
    int i = 0;
    int j = 0;
    try {
      System.out.println(i / j);
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
  }
}
