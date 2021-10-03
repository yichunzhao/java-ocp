package File;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Working with directory.
 *
 * <p>Directory is a File without .
 *
 * <p>Using file name filter to pickup directories; and making a new directory.
 */
public class DirectoryExample {

  public static void main(String[] args) {
    // find only file names; fileName filter
    FilenameFilter filenameFilter =
        (file, fileName) -> {
          return fileName.contains(".");
        };
    // list directories
    String[] contents = new File(".").list(filenameFilter);
    Arrays.asList(contents).forEach(System.out::println);

    // create a directory
    new File("myDirectory").mkdir();
  }
}
