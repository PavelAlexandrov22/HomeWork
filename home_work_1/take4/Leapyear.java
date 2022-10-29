package home_work_1.take4;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println( "Введите год в формате уууу");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year % 4 == 0){
            System.out.println(year + "Год високосный");
        }else {
            System.out.println(year + "Год невисокосный");
        }




    }
}
