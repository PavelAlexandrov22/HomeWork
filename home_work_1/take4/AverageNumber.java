package home_work_1.take4;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        int a = scanner.nextInt();
        System.out.println("введите второе число");
        int b = scanner.nextInt();
        System.out.println("введите третье число");
        int c = scanner.nextInt();
        int sumThreeNumbers = a + b + c ;
        int average = sumThreeNumbers / 3;
        System.out.println(" Среднее число" + average);

    }
}
