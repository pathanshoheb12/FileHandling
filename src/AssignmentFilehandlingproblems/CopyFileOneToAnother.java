package AssignmentFilehandlingproblems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFileOneToAnother {
    public static void main(String[] args) {

        Path source = Paths.get("C:/Users/ShohebPathan/IdeaProjects/FileHandling/src/SourceFile.txt");
        Path destination = Paths.get("C:/Users/ShohebPathan/IdeaProjects/FileHandling/src/Destination.txt");

        try {

            Files.copy(source, destination, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
