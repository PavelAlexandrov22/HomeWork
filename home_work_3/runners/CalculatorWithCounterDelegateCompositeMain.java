package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain  {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calcu = new CalculatorWithCounterAutoComposite();

        double result = calcu.Summation(4.1, (calcu.Multiply(15, 7)));
        double result1 = calcu.Pow(calcu.Division(28, 5), 2);
        double result2 = calcu.Summation(result1, result);
        System.out.println(result2); // 140.45999999999998
        System.out.println(calcu.getCountOperation()); // 5

    }

}
