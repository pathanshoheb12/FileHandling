package ReadingInsertingCreatingFiles;


import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:/Users/ShohebPathan/student.txt");
          int r=0 ;

          while (true)
          {
              if (r==-1)
              {
                  break;
              }
              r = fileReader.read();
              System.out.print((char)r);
          }


        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
