package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    CalculatorWithMathCopy calcu = new CalculatorWithMathCopy();
    int countOperation;
    public double Multiply(double a, double b){
        countOperation++;
        return   a * b;
    }
    public double Division(double a, double b){
        countOperation++;
        return a / b;
    }

    public double Subtraction(double a, double b){
        countOperation++;
        return a - b;
    }

    public double Summation(double a, double b){
        countOperation++;
        return a + b;
    }

    public double Pow(double a, double b){
        countOperation++;
        return Math.pow(a, b);
    }

    public double TheSquareRootOfTheNumber( double a){
        countOperation++;
        return Math.sqrt(a);
    }

    public double TheNumberModule(int a){
        countOperation++;
        return Math.abs(a);
    }

    public long getCountOperation(){
        return countOperation;
    }
}
