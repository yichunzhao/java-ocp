package File;

import java.io.File;
import java.io.IOException;

/**
 * File stands for an File abstraction, but not a physical existence on the hard disk. It needs to
 * invoke a File api to create a File later on.
 */
public class FileCreation {
  public static void main(String[] args) {

    File myFile = new File("myFile.txt");
    try {
      boolean fileCreated = myFile.createNewFile();
      System.out.println(fileCreated);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
