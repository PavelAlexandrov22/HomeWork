package home_work_4.hw3_test.calcs.simple;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathCopyTest {
    private CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
    @Test
    public void  Multiply(){
        Assertions.assertEquals(6, calculator.Multiply(2, 3));

    }
    @Test
    public void Division(){
        Assertions.assertEquals(5, calculator.Division(10, 2));

    }
    @Test
    public void Subtraction(){
        Assertions.assertEquals(3, calculator.Subtraction(10, 7));

    }
    @Test
    public void Summation(){
        Assertions.assertEquals(5, calculator.Summation(2, 3));

    }
    @Test
    public void TheSquareRootOfTheNumber(){
        Assertions.assertEquals(2, calculator.TheSquareRootOfTheNumber(4));

    }
    @Test
    public void pow(){
        Assertions.assertEquals(25, calculator.Pow(5, 2));

    }
    @Test
    public void TheNumberModule(){
        Assertions.assertEquals(1, calculator.TheNumberModule(-1));

    }

}
