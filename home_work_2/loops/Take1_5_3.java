package home_work_2.loops;

import java.util.Scanner;

public class Take1_5_3 {
    public static int even;
    public static int odd;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; a/i > 0; i *= 10) {
            if ((a / i) % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);

    }

}
