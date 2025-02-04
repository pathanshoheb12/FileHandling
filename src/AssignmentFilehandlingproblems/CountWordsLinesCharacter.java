package AssignmentFilehandlingproblems;

import java.io.*;

public class CountWordsLinesCharacter {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("C:/Users/ShohebPathan/IdeaProjects/FileHandling/src/AssignmentFilehandlingproblems/FileDemo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            long numberOfWords = 0;
            long numberOfLines = 0;
            long numberOfCharacters = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] s = line.split(" ");
                numberOfWords += s.length;
                numberOfLines++;
                char[] characters = line.toCharArray();
                numberOfCharacters += characters.length;
            }


            BufferedWriter bufferedWriter = getBufferedWriter(numberOfLines, numberOfWords, numberOfCharacters);

            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static BufferedWriter getBufferedWriter(long numberOfLines, long numberOfWords, long numberOfCharacters) throws IOException {
        FileWriter fileWriter = new FileWriter("C:/Users/ShohebPathan/IdeaProjects/FileHandling/src/AssignmentFilehandlingproblems/CountNumberOfWordsLinesCharcters.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Number Of Lines in Given text file :" + numberOfLines + "\n");
        bufferedWriter.write("Number Of Words in Given text file :" + numberOfWords + "\n");
        bufferedWriter.write("Number Of Characters in Given text file :" + numberOfCharacters);
        return bufferedWriter;
    }

}
