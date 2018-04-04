/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalInterface;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public class FilterPatternInJava8 {
    
    public static void main(String[] args) {
        List<User> users = Stream.of(new User("Yichun Zhao"), new User("Mike xxx")).collect(toList());
        System.out.println("before filtering" + users);
        
        Criteria<User> criteriaByName =  (us) -> {
            return us.stream().filter(u->u.getName().equalsIgnoreCase("Yichun Zhao")).collect(toList());
        };
        
        List<User> filtered = criteriaByName.meetCriteria(users);
        System.out.println("after filtering : " + filtered);
        
        List<Criteria> criterias = Stream.of(criteriaByName).collect(toList());
        
        
                
        
        
        
    }
    
}
