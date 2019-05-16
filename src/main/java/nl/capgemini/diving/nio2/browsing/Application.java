package nl.capgemini.diving.nio2.browsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {


    public static void main(String[] args) throws IOException {
        iterateOverDirectoryAndDirectories();
    }

    private static void iterateOverDirectoryAndDirectories() throws IOException {

        Path src = Paths.get("src/main/java");

        System.out.println("The absolute path is:"+src.toAbsolutePath());

        // deep(er) recursively iterate over files and subdirectories // only print java files
        Files.walk(src)
                .filter(p -> !Files.isDirectory(p))
                .map(p -> p.toAbsolutePath())
                .forEach(System.out::println);


        // deep(er) recursively iterate over files and subdirectories // only print folders
        Files.walk(src)
                .filter(p -> Files.isDirectory(p))
                .map(p -> p.toAbsolutePath())
                .forEach(System.out::println);


        // iterate over files in directory
        // one level deep ... hence nothing ...
        Files.list(src)
                .filter(p -> !Files.isDirectory(p))
                .map(p -> p.toAbsolutePath())
                .filter(p -> p.endsWith(".java"))
                .peek(n -> {
                    assert false : "Should not be here since not expected java files in this src/main/java dir";
                })
                .forEach(System.out::println);



        // deep(er)
        long amountOfFiles = Files.walk(src)
                .filter(p -> !Files.isDirectory(p))
                .count();

        System.out.printf("There are %d .java files in this project%n", amountOfFiles);
    }
}
