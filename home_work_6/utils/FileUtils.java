package home_work_6.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {
    public static String readFile(String path) throws FileNotFoundException {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            StringBuilder builder = new StringBuilder();
            String line = null;
            boolean needComma = false;
            while ((line = reader.readLine()) != null){
                if(needComma){
                    builder.append("\n");
                } else {
                    needComma = true;
                }
                builder.append(line);
            }
            return builder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
