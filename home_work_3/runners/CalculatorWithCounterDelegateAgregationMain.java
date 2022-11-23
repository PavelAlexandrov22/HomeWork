package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calcu = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        double result = calcu.Summation(4.1, (calcu.Multiply(15, 7)));
        double result1 = calcu.Pow(calcu.Division(28, 5), 2);
        double result2 = calcu.Summation(result1, result);
        System.out.println(result2); // 140.45999999999998
        System.out.println(calcu.getCountOperation()); // 5
    }
}
