package File.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * file attributes: read, write, executable etc
 * <p>
 * Methods Files.setAttribute() and Files.getAttribute()
 * can be used to access a file or directory attribute and modify it (if allowed).
 * The attribute name is passed to these methods as a string value.
 */
public class FileAttributes {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("mytest.txt");

        //if file is not existed, throw NoSuchFileException
        System.out.printf("file size %d \n", Files.size(path));
        System.out.printf("is executable?  %b \n", Files.isExecutable(path));
        System.out.printf("is readable?  %b \n", Files.isReadable(path));
        System.out.printf("is writeable?  %b \n", Files.isWritable(path));
        System.out.printf("is directory?  %b \n", Files.isDirectory(path));
        System.out.printf("is hidden?  %b \n", Files.isHidden(path));
        System.out.printf("last modified time  %s \n", Files.getLastModifiedTime(path));
        System.out.printf("owner  %s \n", Files.getOwner(path));
        System.out.printf("is the same file?  %b \n", Files.isSameFile(path, path));
        System.out.printf("is symbolic link?  %b \n", Files.isSameFile(path, path));
    }
}
