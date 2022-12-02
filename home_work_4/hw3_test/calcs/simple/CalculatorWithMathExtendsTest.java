package home_work_4.hw3_test.calcs.simple;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathExtendsTest {
    private CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

    @Test
    public void Pow(){
        Assertions.assertEquals(25, calculator.pow(5));

    }
    @Test
    public void  TheSquareRootOfTheNumber(){
        Assertions.assertEquals(4, calculator.TheSquareRootOfTheNumber(16));

    }
    @Test
    public void TheNumberModule(){
        Assertions.assertEquals(1, calculator.abs(-1));
    }


}
