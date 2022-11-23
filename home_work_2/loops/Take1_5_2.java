package home_work_2.loops;

import java.util.Scanner;

public class Take1_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веедите минимум и максимум и шаг");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int step = scanner.nextInt();

        for (int i = min; i < max ; i+= step) {
            System.out.println(" Шаг " + i);

            
        }
    }
}
