package programming.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathApis {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("/tmp/foo");
        //what information is included in the path object?
        p1.toAbsolutePath(); //Path object
        System.out.println(p1.toAbsolutePath()); //path's toString method

        //check a path exists or not
        System.out.println(Files.exists(p1));

        //create a path using Path api
        Files.createDirectories(Paths.get("/tmp/foo"));
        Files.createDirectories(Paths.get("tmp/foo"));  //relative to project: home.dir

    }
}
