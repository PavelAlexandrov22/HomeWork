package home_work_1.take4;

import java.util.Scanner;

public class ParityOfTheNunber {
    public static void main(String[] args) {
        System.out.println("введите любое число");
        System.out.println(potn());

    }
    public static String potn( ){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = 2;
        if(a % b == 0){
            return "вы ввели чётное число";

        }else {
            return "вы ввели нечётное число";
        }

    }
}
