package home_work_6.utils;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
;

public class TextAnalysis {


    /**
     * Метод который позволяет прочесть текстовый файл
     * и помещает весь текст из файла в строку
     * @param text имя файла
     * @return возврощает строку в которой содержится файл
     */
    public static String textWords(String text) {
        String words = " ";
        try (BufferedReader reader
                     = new BufferedReader(
                new FileReader(text)
        )
        ) {
            StringBuilder builder = new StringBuilder();
            String data;
            while ((data = reader.readLine()) != null) {
                builder.append(data).append(" ");
            }
            words = builder.toString();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении : " + e.getMessage());
        }
        return words;
    }




}
