package AssignmentFilehandlingproblems;

import java.io.*;

public class MergingFiles {
    public static void main(String[] args) throws IOException {
   String paths[]= {
           "C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\AssignmentFilehandlingproblems\\File1.txt",
           "C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\AssignmentFilehandlingproblems\\File2.txt",
           "C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\AssignmentFilehandlingproblems\\File3.txt",
           "C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\AssignmentFilehandlingproblems\\File4.txt",
              };

   BufferedWriter mergeFile = new BufferedWriter(new FileWriter("C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\AssignmentFilehandlingproblems\\MergedFile.txt"));
   String line;
   for(String path :paths)
   {
       BufferedReader files = new BufferedReader(new FileReader(path));
       while ((line= files.readLine())!=null)
       {
           mergeFile.write(line+"\n");
       }
       mergeFile.newLine();
   }
   mergeFile.close();

    }
}
