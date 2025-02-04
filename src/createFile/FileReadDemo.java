package createFile;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class FileReadDemo {
    public static void main(String[] args) {
        try (FileReader f1 = new FileReader("C:/Users/ShohebPathan/IdeaProjects/FileHandling/src/Achal.txt");
        ) {
            int r = 0;
            while (true) {
                if (r == -1) {
                    break;
                }
                r = f1.read();
                System.out.print((char) r);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
