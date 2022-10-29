package home_work_1.take4;

import java.util.Scanner;

public class ParityOfTheNunber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите любое число");
        int a = scanner.nextInt();
        int b = 2;
        if(a % b == 0){
            System.out.println("вы ввели чётное число");

        }else {
            System.out.println("вы ввели нечётное число");
        }
    }
}
