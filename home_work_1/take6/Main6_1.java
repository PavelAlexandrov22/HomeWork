package home_work_1.take6;

import java.util.Scanner;

public class Main6_1 {
    private static String name;

    public static void main(String[] args) {
        System.out.println("Введите ваше имя");
        Scanner console = new Scanner(System.in);
        name = console.nextLine();
        System.out.println(Main6(name));

    }
    public static String Main6(String name){


        if(name == "Вася"){
            return "Привет!\nЯ тебя так долго ждал";
        } else {
            if(name == "Анастасия"){
                return"Я тебя так долго ждал";
            } else {
                return "Добрый день, а вы кто?";
            }
        }

    }
}
