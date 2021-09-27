package File.nio;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Files is a utility class, which provides apis to operate a Path object.
 *
 * <p>Files.createDirectory(Path p); if the path exists, it throws
 * java.nio.file.FileAlreadyExistsException: myDirectory
 */
public class FilesClass {

  public static void main(String[] args) {
    Path p = FileSystems.getDefault().getPath("myDirectory");
    System.out.printf("is path %s exists? %b", p, Files.exists(p));
    System.out.println("");

    try {
      Files.createDirectory(p);
    } catch (IOException e) {
      if (e instanceof FileAlreadyExistsException)
        System.out.println("the folder has already existed");
    }
  }
}
