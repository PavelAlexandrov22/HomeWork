package home_work_1.take6;

import java.util.Objects;
import java.util.Scanner;

public class Main6_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = console.nextLine();
        System.out.println(grisha(name));
    }
    public static String grisha(String name){
        String friend = "Вася";
        String girlfriend = "Анастасия";

        if(Objects.equals(friend, name)){
           return "Привет!\nЯ тебя так долго ждал";

        } else {
            if(Objects.equals(name, girlfriend)){
                return"Я тебя так долго ждал";
            } else {
                return"Добрый день, а вы кто?";
            }
        }

    }
}
