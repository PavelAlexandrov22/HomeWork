package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    int countOperation = 0;
    @Override
    public float abs(float a) {
        countOperation++;
        return super.abs(a);
    }

    @Override
    public double Pow(double a, double b) {
        countOperation++;
        return super.Pow(a, b);
    }

    @Override
    public double TheSquareRootOfTheNumber(double a) {
        countOperation++;
        return super.TheSquareRootOfTheNumber(a);
    }

    @Override
    public double TheNumberModule(int a) {
        countOperation++;
        return super.TheNumberModule(a);
    }

    @Override
    public double Multiply(double a, double b) {
        countOperation++;
        return super.Multiply(a, b);
    }

    @Override
    public double Division(double a, double b) {
        countOperation++;
        return super.Division(a, b);
    }

    @Override
    public double Subtraction(double a, double b) {
        countOperation++;
        return super.Subtraction(a, b);
    }

    @Override
    public double Summation(double a, double b) {
        countOperation++;
        return super.Summation(a, b);
    }
    public long getCountOperation(){
        return countOperation;
    }

    public long incrementCountOperation() {
        return countOperation;
    }
}
