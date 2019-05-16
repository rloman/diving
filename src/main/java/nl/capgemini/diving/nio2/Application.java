package nl.capgemini.diving.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("input.people");

        Files.readAllLines(path).forEach(System.out::println);
    }
}
