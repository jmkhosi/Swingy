package za.co.wethinkcode.student.joyce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{

    String filePath = "heroes.txt";
    BufferedReader br = null;
    String line;

  {
        try {
            br = new BufferedReader(new FileReader(filePath));
            line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
  }
}