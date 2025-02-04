package AssignmentFilehandlingproblems;

import java.io.*;

public class CopyFileByUsingBuffer {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("C:/Users/ShohebPathan/IdeaProjects/FileHandling/src/SourceFile.txt");
            BufferedReader sourceFile = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("C:/Users/ShohebPathan/IdeaProjects/FileHandling/src/Destination.txt");
            BufferedWriter destinationFile = new BufferedWriter(fileWriter);

            String line;

            while ((line=sourceFile.readLine())!=null) {

                destinationFile.write(line+"\n");
            }
            destinationFile.close();

        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    }

