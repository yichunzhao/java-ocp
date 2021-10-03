package File.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * path.normalise() removing redundant path information. only this method removing redundant info.
 * and Path instance is immutable.
 *
 * <p>path norm for removing . current path .. parent path
 */
public class NormalisePath {

  public static void main(String[] args) {
    // .. standing for the current directory; it is a redundant info.
    Path p = Paths.get("./", "mytest.txt").toAbsolutePath();
    System.out.println("ab path: " + p);
    System.out.println("ab. path norm : " + p.normalize());
    System.out.println("exists? " + Files.exists(p));
    System.out.println("./ is redundant info among the path names");

    System.out.println(".....................................................");

    // .. standing for the parent directory; it is a redundant info.
    System.out.println("current path: " + Paths.get("").toAbsolutePath());
    Path p1 = Paths.get("..\\", "myTest.txt");
    // it means that accessing a file located at the parent path C:\Users\zhaoy\IdeaProjects\
    System.out.println("ab. path : " + p1.toAbsolutePath());
    // .. is a redundant info, after norm, it should be removed from the path components.
    // and only showing the parent path component.
    System.out.println("path norm : " + p1.toAbsolutePath().normalize());
  }
}
