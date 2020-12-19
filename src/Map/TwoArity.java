/*
* @FunctionalInterface
  public interface BiFunction<R,T,U>{
       R appply(T t, U u);
 }
*
*
*/
package Map;

import java.util.HashMap;
import java.util.Map;

/** @author YNZ */
public class TwoArity {

  public static void main(String[] args) {

    Map<String, Integer> salaries = new HashMap<>();
    salaries.put("John", 15000);
    salaries.put("Mike", 25000);
    salaries.put("Samuel", 19000);

    salaries.replaceAll(
        (name, salary) -> {
          return name.equals("Mike") ? salary + 10000 : salary;
        });

    System.out.println("" + salaries);

    salaries.forEach(
        (t, u) -> {
          System.out.println("key:" + t + "value: " + u);
        });
  }
}
