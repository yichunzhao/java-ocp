package File.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Resolving path: joining two path together
 * <p>
 * p.resolve(p1), it read as path p resolve path p1 within the path context of p.
 * it means path p join path p1 based on its path.
 * <p>
 * So you need to watch out if making sense as joining two paths. for instance, a relative path resolves an absolute
 * path doesn't any sense, because an absolute path doesn't depend on any other path, so the java will return the
 * absolute path again.
 *
 * <p>
 * resolve(String) and resolve(Path) is used to join a relative path to another path.
 * <p>
 * what happens when resolve(null)? overloading methods are confused, so compiler throw compiling error.
 * <p>
 * the resolve action doesn't work on the real file system;
 */
public class ResolvingPath {

    public static void main(String[] args) {
        //relative paths
        Path p1 = Paths.get("myFolder", "myDoc");
        Path p2 = Paths.get("myDetails", "myNext");

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        //this totally fine; both are relative path
        Path pBoth = p1.resolve(p2);
        System.out.println("p1 resolve p2: " + pBoth);

        Path pBothAnother = p2.resolve(p1);
        System.out.println("p2 resolve p1: " + pBothAnother);

        System.out.println("+++ absolute path resolve relative path +++ ");
        System.out.println("p1: " + p1);
        Path ab = Paths.get("myDirectory").toAbsolutePath();
        System.out.printf("absolute ab solve relative p1: %s \n ", ab.resolve(p1));

        System.out.println("+++ relative path resolve absolute path +++ ");
        System.out.printf("absolute ab solve relative p1: %s \n ", p1.resolve(ab));
        System.out.println(" java return absolute path alone ");

        System.out.println("+++ ............... ");
        //resolveSibling, it means to resolve against the given parent, and given sibling
        ///parent: /mydir combine newworld.java
        //used to rename a file
        Path path = Paths.get("/mydir/eWorld.java");
        Path renamePath = path.resolveSibling(Paths.get("newWorld.java"));
        System.out.println(renamePath);
    }

}
