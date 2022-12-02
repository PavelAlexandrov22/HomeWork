package home_work_4.hw3_test.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoSuperTest {
    private CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
    @Test
    public void Multiply() {
        Assertions.assertEquals(6, calculator.Multiply(2, 3));

    }

    @Test
    public void Pow() {
        Assertions.assertEquals(25, calculator.pow(5));

    }

    @Test
    public void TheSquareRootOfTheNumber() {
        Assertions.assertEquals(4, calculator.TheSquareRootOfTheNumber(16));

    }

    @Test
    public void TheNumberModule() {
        Assertions.assertEquals(1, calculator.abs(-1));
    }

    @Test
    public void Division() {
        Assertions.assertEquals(5, calculator.Division(10, 2));

    }

    @Test
    public void Subtraction() {
        Assertions.assertEquals(3, calculator.Subtraction(10, 7));

    }

    @Test
    public void Summation() {
        Assertions.assertEquals(5, calculator.Summation(2, 3));

    }
    @Test
    public void use(){
        Assertions.assertEquals(0, calculator.getCountOperation());

    }
    @Test
    public void fd(){
        Assertions.assertEquals(0, calculator.incrementCountOperation());
    }
}
