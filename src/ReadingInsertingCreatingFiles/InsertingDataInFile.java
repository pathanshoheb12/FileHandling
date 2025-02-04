package ReadingInsertingCreatingFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InsertingDataInFile {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C://Users//ShohebPathan//student.txt");
            fileWriter.write("Hi how are you !");
            fileWriter.close();
            System.out.println("successfully written Data in file ");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
