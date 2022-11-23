package home_work_2.loops;

import java.util.Scanner;

public class Take1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int multiply = 1;

        while (n != 0){
            multiply *= (n %10);
            n /= 10;

        }

        System.out.println(n  +  " = " +  multiply);
    }

}

