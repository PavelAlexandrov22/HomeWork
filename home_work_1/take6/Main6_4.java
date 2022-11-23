package home_work_1.take6;

import java.util.Objects;
import java.util.Scanner;

public class Main6_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = console.nextLine();

        String friend = "Вася";
        String girlfriend = "Анастасия";

        if(Objects.equals(friend, name)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else {
            if(Objects.equals(name, girlfriend)){
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}
