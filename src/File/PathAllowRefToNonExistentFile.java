package File;


import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * A Path object can refer to an non-existent file and/or directory(s)
 * <p>
 * Path is an abstraction, which is independent of OS, the physical file system.
 * It is not tied up with a real file or directory.
 * <p>
 * It can be achieved as a Path abstraction
 * without having a physical counterpart.
 * <p>
 * Path can be achieved by factory method of Paths, and FileSystems
 * <p>
 * Note: must escape backslash in Java String
 * don't need escape forward slash.
 * <p>
 * from Java 7, a toPath() method was added to File class, to bridge the gap between File OLD IO and File New IO.
 * <p>
 * when creating a Path from a zero length String, it returns the current Absolute path.
 * <p>
 * Behind the scene, both Paths.get and File.toPath can FileSystems.getDefault().getPath()
 */
public class PathAllowRefToNonExistentFile {

    public static void main(String[] args) {

        //creating a path Abstraction; this path is not existed at all.
        Path path = FileSystems.getDefault().getPath("notExistedFile.txt");
        System.out.println(path);

        //creating a path Abstraction by Paths
        //Path consists of sub-dir(s) and a file-name.
        Path anotherPath = Paths.get("myDirectory", "myAnotherFile.txt");
        System.out.println(anotherPath);

        //Path implements Iterable
        System.out.println("for each of a Path object: ");
        anotherPath.forEach(System.out::print);
        System.out.println("\n========================== ");

        //After Java 7, it is able to convert Old Java IO File to Java new IO Path
        Path fileToPath = new File("myDirectory", "myAnotherFile.txt").toPath();
        System.out.println(fileToPath);

        Path fileToPathAbsolute = new File("myDirectory", "myAnotherFile.txt").toPath();

        //escape backward slash in the Java String as it is used as a directory separator.
        Path absolutePath = FileSystems.getDefault().getPath("c:\\", "notExistedFile.txt");
        System.out.println(absolutePath);

        //don't need escape forward slash
        Path forwardAbsolutePath = FileSystems.getDefault().getPath("c:/", "notExistedFile.txt");
        System.out.println(forwardAbsolutePath);

        //creating path from a "" string, returns a Path that refers to the current path.
        Path emptyStringPath = Paths.get("");
        System.out.println("from empty string " + emptyStringPath);

        System.out.println("from empty string absolute path:  " + emptyStringPath.toAbsolutePath());
    }

}
