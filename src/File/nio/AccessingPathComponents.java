package File.nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Path: consisting of root, pathName, pathName ..., fileName, and separated by OS-specific
 * delimiters
 *
 * <p>getParent(): root, name, name, name(absolute path); name, ... (relative path)
 *
 * <p>getFileName(): excluding the parentPath. getRoot(): for win os C:\ for unix: \home
 */
public class AccessingPathComponents {

  public static void main(String[] args) {
    Path p = FileSystems.getDefault().getPath("myDirectory", "myFile.txt");
    System.out.println("path to string: " + p.toString());

    // for the relative path, null
    System.out.println("root: " + p.getRoot());

    // parent: the path excluding the fileName; or say the path leading to the file.
    System.out.println("parent: " + p.getParent());

    // including both path name and file name, excluding root
    System.out.println("name count: " + p.getNameCount());
    System.out.println("name 0: " + p.getName(0));
    System.out.println("name 1: " + p.getName(1));

    // path segments; take a partial section of path, excluding the root and fileName
    System.out.println("sub path: " + p.subpath(0, 2));

    // getFileName returns a Path instance; fileName is the last component.
    System.out.println("file Name: " + p.getFileName());
  }
}
