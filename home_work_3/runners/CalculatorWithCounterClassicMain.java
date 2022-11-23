package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain extends CalculatorWithCounterClassic {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calcu = new CalculatorWithCounterClassic();
        double result = calcu.Multiply(15, 7);
        calcu.incrementCountOperation();
        double result1 = calcu.Summation(4.1, result);
        calcu.incrementCountOperation();
        double result2 = calcu.Division(28, 5);
        calcu.incrementCountOperation();
        double result3 = calcu.Pow(result2, 2);
        calcu.incrementCountOperation();
        double result4 = calcu.Summation(result1, result3);
        calcu.incrementCountOperation();
        System.out.println(result4);
        System.out.println(calcu.getCountOperation());
    }

}
