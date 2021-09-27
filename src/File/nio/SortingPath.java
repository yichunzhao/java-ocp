package File.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Path implements comparable<Path> interface;
 *
 * <p>path instances sorted by its natural order, lexicographically.
 */
public class SortingPath {

  public static void main(String[] args) {
    Path p = Paths.get("myDirectory");
    Path p1 = Paths.get("otherDirectory");
    Path p2 = Paths.get("hisDirectory");

    SortedSet<Path> sortedSet = new TreeSet<>();
    sortedSet.add(p);
    sortedSet.add(p1);
    sortedSet.add(p2);

    System.out.println(sortedSet);

    System.out.println("existed? : " + Files.exists(p));
  }
}
