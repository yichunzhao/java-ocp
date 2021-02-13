package File.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Two ways to create a file in the old File IO
 * <p>
 * File file = new File("xxx.yy)
 * file.createNewFile
 * or
 * new FileWriter(file)
 * new outputStream(file)
 * <p>
 * creating a writer or stream instance, they creating the File automatically, if it is not existed.
 * <p>
 * in the old File IO, a directory is a file too. You may create a File representing a dir, and another File
 * representing a file and its path.
 * <p>
 * This is so bad
 */
public class ChainedIOClasses {

    public static void main(String[] args) throws IOException {
        //directory cannot be auto-created by writer or stream
        File myDir = new File("myDirectory");
        if (!myDir.exists()) {
            myDir.mkdir();
        }

        System.out.println("is " + myDir.toString() + " a directory? " + myDir.isDirectory());

        //dir and fileName
        File file = new File(myDir, "newFile.txt");

        if (!file.exists()) {

            //write creating the file, if it is not existed.
            PrintWriter printWriter = new PrintWriter(file);

            printWriter.append("this is an existing file ");
            printWriter.append("this is an existing file ");
            printWriter.append("this is an existing file ");

            printWriter.flush();
            printWriter.close();
        }

        //appending to an existing file;
        if (file.exists()) {
            //if the file is existed, the file instance pointing to this physical file.
            //open an existing file, and append
            FileWriter fw = new FileWriter(file, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("");
            pw.println("append to the end of a file");
            pw.println("append to the end of a file");
            pw.flush();
            pw.close();
        } else {
            System.out.println("the file is not existed.");
        }
    }

}
