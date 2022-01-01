package programming;

import java.io.File;
import java.nio.file.Paths;

/**
 * "user.dir"	User working directory
 * "user.home"	User home directory
 * "user.name"	User account name
 */
public class SystemProperties {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));  //project root, absolute path
        System.out.println(System.getProperty("user.home"));  //current user home
        System.out.println(System.getProperty("user.name"));  //user name

        /**
         * /Users/hxu/Workspace/java
         * /Users/hxu
         * hxu
         */
        String filePath = new File("").getAbsolutePath();
        System.out.println(filePath);
        printCurrentWorkingDirectory2();
    }
    // Path, Java 7
    private static void printCurrentWorkingDirectory2() {
        String userDirectory = Paths.get("")
                .toAbsolutePath()
                .toString();
        System.out.println(userDirectory);
    }
}
