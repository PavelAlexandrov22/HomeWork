package home_work_1.take4;


import java.util.Scanner;

public class BItsbytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число 1 что бы перевести байты");
        System.out.println("введите чило 2 что бы перевести в килобайты");
        double a = scanner.nextDouble();
        if (a == 1){
            System.out.println("введите количество байт");
            double b = scanner.nextDouble();
            double result1 = b / 1024;
            System.out.println( result1 + " килобайт");

        }else if(a == 2){
            System.out.println("введите количество килобайт");
            double c = scanner.nextDouble();
            double result2 = c * 1024;
            System.out.println( result2 + "байт");
        }
    }



}
