/*
 *
 * conv. String to Primitive
 * empty string return exception
 *
 */
package Wrapper;

/** @author YNZ */
public class StringToNumber {

  public static void main(String[] args) {
    String numStr = "0";
    double numStrDouble = Double.parseDouble(numStr);

    System.out.println("numStr : " + numStrDouble);
  }
}
