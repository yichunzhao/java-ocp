package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Accessing map by two-arity
 */
public class TwoArity {
    private static final Map<String, Integer> personSalaries = new HashMap<>();

    static {
        personSalaries.put("John", 15000);
        personSalaries.put("Mike", 25000);
        personSalaries.put("Samuel", 19000);
    }

    public static void main(String[] args) {
        System.out.println("Original Mike salary: " + personSalaries.get("Mike"));
        personSalaries.replaceAll((name, salary) -> name.equals("Mike") ? salary + 10000 : salary);

        System.out.println("after salary modification: ");
        personSalaries.forEach((person, salary) -> System.out.println("person: " + person + " ++ salary: " + salary));
    }
}
