package home_work_2.loops;

import java.util.Scanner;

public class Take1_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int n = console.nextInt();
        System.out.println(take1(n));
    }
    public static String take1(int n){
        int multiply = 1;

        for (int i = 1; i < n; i++) {
            System.out.print(i + " * ");
            multiply *= i;

        }
        multiply *= n;

        return n + " = " + multiply;

    }
}
