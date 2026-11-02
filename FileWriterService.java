package BoilerplateConsole;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FileWriterService {

    public void save(String className, String code)
            throws IOException {

        Path path = Path.of(className + ".java");

        Files.writeString(path, code);

        System.out.println("File generated: " + path);
    }
}