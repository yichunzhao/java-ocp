package File.io;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

/**
 * The Console has no public constructor, can be only obtained from the System.
 *
 * <p>Console cannot be achieved in a IDE, but only from a commandline.
 *
 * <p>javac xxx.java java xxx
 */
public class FileIOConsole {
  public static Map<String, String> userPwdMap = new HashMap<>();

  static {
    userPwdMap.put("user", "user");
    userPwdMap.put("ynz", "pwd");
  }

  public static void main(String[] args) {
    // if current jvm is not associated with a character input device, the console is null.
    Console console = System.console();

    if (console == null) {
      System.out.println("current jvm is not associated with a device to input characters.");
      return;
    }

    System.out.println("please input your userName: ");
    String userName = console.readLine().trim();

    System.out.println("please input your passWord: ");
    String password = console.readLine().trim();

    if (userName.isEmpty() || password.isEmpty())
      System.out.println("useName and or password empty");

    String storedPwd = userPwdMap.get(userName);
    if (storedPwd == null) System.out.println("the user is not existed");
    else if (storedPwd.equals(password)) System.out.println("you are right man");
    else {
      System.out.println("sorry! you are wrong guy.");
    }
  }
}
