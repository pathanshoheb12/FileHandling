package createFile;

import java.io.File;
import java.io.IOException;

public class CreateFileByUsingFiles {

    public static void main(String[] args) throws IOException {

        File f1 = new File("C:/Users/ShohebPathan/IdeaProjects/FileHandling/src/Achal.txt");

        
        try {
          if(f1.createNewFile())
           {
               System.out.println("file created successfully");
           }

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}
