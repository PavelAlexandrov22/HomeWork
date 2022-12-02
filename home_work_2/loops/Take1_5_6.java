package home_work_2.loops;

import java.util.Scanner;

public class Take1_5_6 {
    public static void main(String[] args) {
        System.out.println(print());
    }
    public static int remove(){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int reversed = 0;
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;

    }
    public static String print(){
        int num = remove();
        return "Обратное число: " + num;
    }
}
