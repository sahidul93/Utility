package Utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    public static void main(String[] args) {






        String container;
        String finalText = null;
        try {
            FileReader fileReader = new FileReader("/Users/sahiandalvi/IdeaProjects/CoreJava/src/Utility/infromation.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((container = bufferedReader.readLine()) != null) {
                finalText = container;
            }

            fileReader.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(finalText);

    }
}


