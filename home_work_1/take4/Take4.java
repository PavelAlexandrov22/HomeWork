package home_work_1.take4;

import java.util.Scanner;

public class Take4 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        System.out.println(take());

    }
    public static String take(){
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        if(number %2 == 0){
            return number + " - " + " это чётное число";
        }else{
           return number +  " - " + " это число нечётное";}

    }
}
