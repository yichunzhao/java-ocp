package Math;

import java.util.Arrays;

public class Modules {

  public static void main(String[] args) {
    //
    System.out.println(7 % 4);
    System.out.println(7 / 4);

    String[] strs = {"str1", "str2", "str3"};
    Arrays.stream(strs).forEach(x -> System.out.println(x));

    Modules m = new Modules();
    m.printSome("mem  str ...");
  }

  public void printSome(String x) {
    System.out.println(x);
  }
}
