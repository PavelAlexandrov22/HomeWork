package home_work_4.hw3_test.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoAgregationInterfaceTest {
    private home_work_3.calcs.simple.CalculatorWithMathCopy CalculatorWithMathCopy;
    private CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(CalculatorWithMathCopy);
    @Test
    public void Summation() {
        Assertions.assertEquals(5, calculator.Summation(2, 3));
    }

}




