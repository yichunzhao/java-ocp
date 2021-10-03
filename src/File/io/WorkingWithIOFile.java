package File.io;

import java.io.File;

/**
 * Old IO file, representing both Path and File; and including File service functions.
 *
 * <p>File(File parent, String child) File(String parent, String child) File(String pathName)
 */
public class WorkingWithIOFile {

  public static void main(String[] args) {
    // File(String pathName)
    File parent = new File("myDirectory");

    // File(File parent,String)
    File path = new File(parent, "myNewDir");

    if (!path.exists()) {
      if (path.mkdir()) System.out.println("path: " + path.toString() + " is created. ");
    } else {
      // File(String parent, String child)
      File dir = new File("myDirectory", "myNewDir");
      System.out.printf("does path %s exist? %b", dir.toString(), dir.exists());
      System.out.println();
    }
  }
}
