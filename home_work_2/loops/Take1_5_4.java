package home_work_2.loops;

import java.util.Scanner;

public class Take1_5_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int a = console.nextInt();
        printFibonacci(a);

    }
    public static void printFibonacci(int size) {
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        System.out.print("0 1 ");
        for(int i = 2; i < size; i++) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.print(array[i] + " ");
        }
    }
}
