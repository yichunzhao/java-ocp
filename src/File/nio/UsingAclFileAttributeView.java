package File.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;

/**
 * AclFileAttributeView is only for windows;
 * <p>
 * AclFileAttributeView extends FileOwnerAttributeView
 * <p>
 * we can set a List of AclEntry here.
 */
public class UsingAclFileAttributeView {

    public static void main(String[] args) {
        Path path = Paths.get("mytest.txt");

        //get view instance from Files for the path
        AclFileAttributeView aclFileAttributeView = Files.getFileAttributeView(path, AclFileAttributeView.class);

        try {
            List<AclEntry> entries = aclFileAttributeView.getAcl();
            System.out.printf("AclEntry list: %s \n ", entries);

            UserPrincipal userPrincipal = aclFileAttributeView.getOwner();
            System.out.printf("user principal: %s \n ", userPrincipal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
