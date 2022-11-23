package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain extends CalculatorWithMathCopy {
    public static void main(String[] args) {
        CalculatorWithOperatorMain calcu = new CalculatorWithOperatorMain();
        double result = calcu.Multiply(15, 7);
        double result1 = calcu.Summation(4.1, result);
        double result2 = calcu.Division(28, 5);
        double result3 = calcu.pow(result2);
        double result4 = calcu.Summation(result1, result3);
        System.out.println(result4); // 140.45999999999998


    }
}










