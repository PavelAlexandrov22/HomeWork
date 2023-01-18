package home_work_6.take2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



public class Words2 {
    public static void main(String[] args) throws IOException {
      String path = Files.readString(Path.of("C:\\Users\\alexa\\IdeaProject\\Course\\JD1\\HomeWork\\src\\home_work_6\\Война и мир_книга.txt"));
        int count = 0;
        if(path.length() != 0){
            count++;
            for (int i = 0; i < path.length(); i++) {
                if(path.charAt(i) == ' '){
                    count++;

                }

            }

        }
        System.out.println("Колличество слов: " + count);






       

       




    }



}
