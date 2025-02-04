package createFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
    public static void main(String[] args) {

        try(FileWriter f1 = new FileWriter("C:/Users/ShohebPathan/IdeaProjects/FileHandling/src/Achal.txt");
        )
       {
            f1.write("Hi Achal !\n");
            f1.write("Hi Shoheb");
           System.out.println("written Successfully");





       }

       catch (IOException e) {
           throw new RuntimeException(e);
       }


    }
}
