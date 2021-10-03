package File.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Files offers path operations.
 *
 * <p>if target file is already existed, throw exception FileAlreadyExistedException
 *
 * <p>if source file is not existed in the file system, it throws NoSuchFileException
 */
public class FileCopy {

  public static void main(String[] args) {

    Path source = Paths.get("myTest.txt");
    Path target = Paths.get("myDirectory", "myTestCopy.txt");

    try {
      Files.copy(source, target);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
