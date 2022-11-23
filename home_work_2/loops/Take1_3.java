package home_work_2.loops;

import java.util.Scanner;

public class Take1_3 {
    public static void main(String[] args) {
        System.out.println("Введите число и степень");
        Scanner consle = new Scanner(System.in);
        double base = consle.nextDouble();


        double result = 1;
        int power;
        for (power = consle.nextInt(); power != 0; power--) {
            result = result * base;
        }
        power = consle.nextInt();

        System.out.println(base + " ^ " + power + " = " + result);

    }

}
