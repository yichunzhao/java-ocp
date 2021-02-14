package File.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * In the old io, both path and file are defined as separated Files.
 *
 * FileReader and FileWriter are decorated by a BufferedReader or BufferedWriter so as to improve the performance.
 *
 */
public class ChainedRead {

    public static void main(String[] args) throws FileNotFoundException {
        //read a text from a dir
        File targetDir = new File("myDirectory");
        File targetFile = new File(targetDir, "newFile.txt");

        if (targetFile.exists()) {
            FileReader fr = new FileReader(targetFile);
            BufferedReader br = new BufferedReader(fr);
            br.lines().forEach(System.out::println);
        } else {
            System.out.println("file is not existed");
        }
    }
}
