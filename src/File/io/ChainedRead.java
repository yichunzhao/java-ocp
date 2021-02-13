package File.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ChainedRead {

    public static void main(String[] args) throws FileNotFoundException {
        //read a text from a dir
        File targetDir = new File("myDirectory");
        File targetFile = new File(targetDir, "newFile.txt");

        if (targetFile.exists()) System.out.println("file is not existed");

        FileReader fr = new FileReader(targetFile);
        BufferedReader br = new BufferedReader(fr);

        br.lines().forEach(System.out::println);
    }
}
