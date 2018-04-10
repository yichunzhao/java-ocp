/*
 * You may collect elements in a stream into a specific container. 
 * 
 * 
 */
package StreamCollectingResult;

import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author YNZ
 */
public class CollectingResultToHashSet {

    public static void main(String[] args) {
        
        HashSet<String> wordSet = Pattern.compile("[\\s]").splitAsStream("when you are done with a stream").collect(Collectors.toCollection(HashSet::new));
        System.out.println("Does it contain the word stream? " + wordSet.contains("stream"));
    }

}
