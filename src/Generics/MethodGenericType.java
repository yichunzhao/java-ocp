package Generics;

public class MethodGenericType {

  public static void main(String[] args) {
    System.out.println("Generic type parameter is determined by the method argument type.");
    System.out.println(getObject(Integer.valueOf(100)) instanceof Integer);
  }

  // method generics type <T> is defined before return type, but after access modifier and static
  // Generic type parameter is instantiated by the method argument type.
  public static <T extends Number> T getObject(T t) {
    return t;
  }
}
