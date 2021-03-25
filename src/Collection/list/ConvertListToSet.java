package Collection.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author YNZ
 */
public class ConvertListToSet {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("wo", "he", "ni", "xin", "lian", "xin");
        System.out.println("original list of String:" + strList);

        // convert a List to Set using Set constructor
        Set<String> strSet = new HashSet<>(strList);
        System.out.println("set : " + strSet);

        Set<String> strTreeSet = new TreeSet<>(strList);
        System.out.println("tree set : " + strTreeSet);
    }

}
