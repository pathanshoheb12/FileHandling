package AssignmentFilehandlingproblems;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class ConvertCSVtoJSON {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\AssignmentFilehandlingproblems\\Student.csv"));
            bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\ShohebPathan\\IdeaProjects\\FileHandling\\src\\AssignmentFilehandlingproblems\\Students.json"));

            JSONArray jsonArray = new JSONArray();
            String jsonContent;
            String line = bufferedReader.readLine();
            String[] heading = line.split(",");

            while ((line = bufferedReader.readLine()) != null) {
                JSONObject jsonObject = new JSONObject();
                String[] split = line.split(",");

                for (int i = 0; i < split.length; i++) {

                    jsonObject.put(heading[i], split[i]);

                }
                jsonArray.put(jsonObject);


            }
            jsonArray.toString();

            bufferedWriter.write(jsonArray.toString());

//            String[] jsonContentSplit = jsonContent.split(",");
//            for (int i = 0; i < jsonContentSplit.length; i++) {
//                if (i == jsonContentSplit.length - 1) {
//                    bufferedWriter.write(jsonContentSplit[i]);
//                } else {
//                    bufferedWriter.write(jsonContentSplit[i] + "," + "\n");
//                }
//            }
            System.out.println("success");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
