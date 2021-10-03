package Collection.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Map contains, it returns ture and false
 *
 * <p>boolean containsKey(key): using hashcode() and equalTo() boolean containsValue(value): using
 * equalTo()
 *
 * <p>You need to watch out here, if both methods have been overridden correctly.
 */
class Emp {
  private String name;

  public Emp(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Emp)) return false;
    return name.equals(((Emp) o).name);
  }
}

public class MapContains {

  public static void main(String[] args) {
    Map<String, Integer> stringLengthMap =
        Arrays.stream("we like java programing".split("\\s"))
            .collect(Collectors.toMap(s -> s, String::length, (s1, s2) -> s2, HashMap::new));

    System.out.println("contains we? " + stringLengthMap.containsKey("we"));
    System.out.println("contains 2? " + stringLengthMap.containsValue(2));

    System.out.println("contains value xxx? " + stringLengthMap.containsValue("xxx"));
    System.out.println("contains key yyy? " + stringLengthMap.containsValue("yyy"));

    Map<Emp, Emp> empEmpMap = new HashMap<>();
    empEmpMap.put(new Emp("mike"), new Emp("shara"));
    // You cannot find the original emp mike, for the hashcode decide the bucket index
    System.out.println(empEmpMap.containsKey(new Emp("mike")));
    // You can find this shara
    System.out.println(empEmpMap.containsValue(new Emp("shara")));
  }
}
