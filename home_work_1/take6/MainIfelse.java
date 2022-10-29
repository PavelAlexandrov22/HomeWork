package home_work_1.take6;


import java.util.Scanner;

public class MainIfelse {
    public static void main(String[] args) {
        String str1 = "Вася";
        String str2 = "Анастасия";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = sc.next();
        if(name.equals(str1)) {
            System.out.println("Привет!");

        }else {
            if (name.equals((str2))) {
                System.out.println("Я тебя так долго  ждал!");
            }else {
                System.out.println("Добрый день, а вы кто?");
            }
        }





    }
}
