package home_work_1.take4;

import java.util.Scanner;

public class Take4 {
    public static void main(String[] args) {

        System.out.println(print());


    }
    public static int getHonest(){
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        if(number %2 == 0){
            return number +1;
        }else {
            return number ;
        }

    }
    public static int getOdd(){
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        if(number %2 == 0){
            return number ;
        }else {
            return number +1;
        }

    }
    public static String print( ){
        int num = getHonest();
        int num1 = getOdd();
        return "Число чётное " + num + num1;
    }
}
