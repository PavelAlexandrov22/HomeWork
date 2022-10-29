package home_work_1.take4;

import java.util.Scanner;

public class Take4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число");
        int number = reader.nextInt();
        if(number %2 == 0){
            System.out.println(number +  "это чётное число");
        }else{
            System.out.println(number +  "это число нечётное");}



    }
}
