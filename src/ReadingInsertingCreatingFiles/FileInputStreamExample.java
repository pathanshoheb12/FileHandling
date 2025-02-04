package ReadingInsertingCreatingFiles;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) throws IOException {


        FileInputStream fileInputStream = new FileInputStream("C:/Users/ShohebPathan/image.jpg");

        int byteData;

        while ((byteData = fileInputStream.read()) != -1) {

            System.out.print(byteData + " ");

        }
        System.out.println();

        fileInputStream.close();
    }

}
