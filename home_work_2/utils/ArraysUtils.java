package home_work_2.utils;


import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    /**
     * Данный метод создаёт массив, введённый через консоль
     */

    public static int [] arrayFromConsole(){
        Scanner console = new Scanner(System.in);
        int count;
        do {
            System.out.println("Введите размер массива");
            count = console.nextInt();
        } while (count < 0);

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для ячейки " + i);
            array[i] = console.nextInt();
        }
        return array;

    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        /*
          Метод, который рандомно генерирует массив чисел
          @param size Количество элементов в массиве
         * @param maxValueExclusion Число выше которого не могут быть элементы массива
         * @return Заполняет массив
         */
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;

    }

}
