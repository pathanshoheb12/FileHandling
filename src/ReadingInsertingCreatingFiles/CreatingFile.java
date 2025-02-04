package ReadingInsertingCreatingFiles;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

    public static void main(String[] args) {

        File file = new File("C:/Users/ShohebPathan/student.txt");
        try {
            if (file.exists()) {
                System.out.println("File is already exists .");
            } else {

                if (file.createNewFile()) {
                    System.out.println("File " + file.getName() + " is Created ");
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
