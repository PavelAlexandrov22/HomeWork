package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregationInterface {
    ICalculator calcu;
    int countOperation;

    public CalculatorWithCounterAutoAgregationInterface(CalculatorWithMathCopy calculatorWithMathCopy) {
    }


    public double Multiply(double a, double b){
        countOperation++;
        return calcu.Multiply(a, b);
    }
    public double Division(double a, double b){
        countOperation++;
        return calcu.Division(a, b);
    }

    public double Subtraction(double a, double b){
        countOperation++;
        return calcu.Subtraction(a, b);
    }

    public double Summation(double a, double b){
        countOperation++;
        return calcu.Summation(a, b);
    }

    public double Pow(double a, int b){
        countOperation++;
        return calcu.Pow(a, b);
    }

    public double TheSquareRootOfTheNumber( double a){
        countOperation++;
        return calcu.TheSquareRootOfTheNumber(a);
    }

    public double TheNumberModule(int a){
        countOperation++;
        return calcu.TheNumberModule(a);
    }

    public long getCountOperation(){
        return countOperation;
    }
}
