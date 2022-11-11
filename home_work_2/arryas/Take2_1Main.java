package home_work_2.arryas;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;
import static home_work_2.utils.ArraysUtils.arrayRandom;

public class Take2_1Main {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        printArray(container);
        System.out.println("  ");
        int[] container1 = arrayRandom(5, 100);
        printArray(container1);

    }

    public static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
    }
}
