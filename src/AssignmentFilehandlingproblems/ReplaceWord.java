package AssignmentFilehandlingproblems;

import java.io.*;
import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\AssignmentFilehandlingproblems\\ReplaceWordFile.txt"));

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Word to Find");
            String wordToFind = sc.nextLine();

            System.out.println("Enter the Word_to_Replace");
            String wordToReplace = sc.nextLine();

            String fileData = "";
            String newFileData;
            String line;
            while ((line = bufferedReader.readLine()) != null) {


                fileData += line + "\n";

            }
            System.out.println("Old Content \n"+ fileData);
            if (fileData.isEmpty()) {
                throw new RuntimeException("File is Empty!");
            } else {
                if (fileData.contains(wordToFind)) {
                    newFileData = fileData.replace(wordToFind, wordToReplace);

                }
                else {
                    throw new RuntimeException("Couldn't find the Word");
                }
            }

            BufferedWriter b1 = new BufferedWriter(new FileWriter("C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\AssignmentFilehandlingproblems\\ReplaceWordFile.txt"));
            b1.write(newFileData);
            b1.close();
            System.out.println("Successfully Replaced the word.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
