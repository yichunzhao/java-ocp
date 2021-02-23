package File.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;

/**
 * file attributes: read, write, executable etc
 * <p>
 * Methods Files.setAttribute() and Files.getAttribute()
 * can be used to access a file or directory attribute and modify it (if allowed).
 * The attribute name is passed to these methods as a string value.
 * <p>
 * Accessing individual file attributes or accessing a group of attributes
 */
public class AccessingFileAttributes {

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
        System.out.printf("is symbolic link?  %b \n", Files.isSymbolicLink(path));

        System.out.printf("get attribute creation time: %s \n", Files.getAttribute(path, "creationTime"));

        //instead, accessing all basic attributes by once, so as to improve the performance.
        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        System.out.printf("BasicFileAttributeView %s\n", basicFileAttributeView.readAttributes());
        System.out.printf("last modified time  %s \n", basicFileAttributeView.readAttributes().lastModifiedTime());

        //BasicFileAttributes interface defines API to access attributes
        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.printf("is directory %b; is regular file? %b \n ", attributes.isDirectory(), attributes.isRegularFile());

        //BasicFileAttributeView interface defines API to modify attributes
        BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);

        //basicFileAttributeView modify all timeStamps
        long now = System.currentTimeMillis();
        FileTime creationTime = FileTime.fromMillis(now);
        FileTime accessTime = FileTime.fromMillis(now - 1000);
        FileTime modifyTime = FileTime.fromMillis(now - 2000);
        view.setTimes(creationTime, accessTime, modifyTime);

        BasicFileAttributes basicAttributes = view.readAttributes();
        basicAttributes.creationTime();
        System.out.printf("creationTime: %s,  accessTime: %s, modifyTime %s \n", basicAttributes.creationTime(), basicAttributes.lastAccessTime(), basicAttributes.lastModifiedTime());

        //get all attributes from view
        BasicFileAttributes attributesFromView = view.readAttributes();
        System.out.printf("File size: %d \n ", attributesFromView.size());

        //Files.setAttribute(path, "basic:readable", false);
        System.out.printf("After modification; is readable?  %b \n", Files.isReadable(path));

        //another way to read all attributes
        Map<String, Object> attributesMap = Files.readAttributes(path, "*");
        System.out.println("attributeMap: " + attributesMap);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.printf("DosFileAttributes: isArchive? %b \n ", dosFileAttributes.isArchive());
        System.out.printf("DosFileAttributes: isSystem? %b \n ", dosFileAttributes.isSystem());

        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("basicFileAttributes: " + basicFileAttributes.isRegularFile());

    }

}
