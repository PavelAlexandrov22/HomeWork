package home_work_2.loops;

import java.util.Scanner;

public class Take1_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int multiply = 1;
        do {
            for (int i = 1; i < n; i++) {
                System.out.print(i + " * ");
                multiply *= i;

            }
            multiply *= n;

            System.out.println(n + " = " + multiply);
            if (n == 0 || n == 1) {
                System.out.println(multiply);
            }

            if (n < 0) {
                System.out.println(" вы ввели отрицательное число");
            }
        }while (n < 0);
        System.out.println();




    }
}
