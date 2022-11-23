package home_work_1.take6;


import java.util.Objects;
import java.util.Scanner;

public class MainIfelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = sc.next();
        System.out.println(take6_1_2(name));
    }
        public static String take6_1_2(String name){
            if(Objects.equals("Вася", name)){
                return "Привет!\nЯ тебя так долго ждал";
            } else {
                if(Objects.equals(name, "Анастасия")){
                    return "Я тебя так долго ждал";
                } else {
                    return "Добрый день, а вы кто?";
                }
            }
        }






}
