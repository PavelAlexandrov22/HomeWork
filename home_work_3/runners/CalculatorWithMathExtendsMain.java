package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain extends CalculatorWithMathExtends {
    public static void main(String[] args) {
        CalculatorWithMathExtendsMain calcu = new CalculatorWithMathExtendsMain();
        System.out.println(calcu.Multiply(15, 7));
        System.out.println(calcu.Summation(4.1, 105));
        System.out.println(calcu.Division(28, 5));
        System.out.println(calcu.Pow(5.6, 2));
        System.out.println(calcu.Summation(109.1, 31.36));
    }
}






