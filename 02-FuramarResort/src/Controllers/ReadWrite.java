package Controllers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static void writeFile(String pathFile,String line){

        try {
            FileWriter fileWrite = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter (fileWrite);

            bufferedWriter.write(line);
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> readFile(String pathFile){
        List<String> listLine = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while((line = bufferedReader.readLine())!= null)
            {
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
