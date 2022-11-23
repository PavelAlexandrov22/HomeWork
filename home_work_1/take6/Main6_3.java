package home_work_1.take6;


import java.util.Scanner;

public class Main6_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = sc.next();
        switch (name )  {
            case "Вася":
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("А вы кто?");
        }


        }

    }



