package File.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** .. how to get current and parent path */
public class GetCurrentParentPath {

  public static void main(String[] args) {
    // how to get the current path.
    System.out.println(Paths.get("").toAbsolutePath());
    System.out.println("name count: " + Paths.get("").toAbsolutePath().getNameCount());

    // get current parent path.
    System.out.println(Paths.get("").toAbsolutePath().getParent());

    System.out.println("relative path: ");
    Path myDir = Paths.get("myDirectory");
    System.out.println("myDir exists? " + Files.exists(myDir));
    // relative path has a null parent
    System.out.println("parent path is null: " + myDir.getParent());
    System.out.println(myDir.toAbsolutePath());
  }
}
