package home_work_3.calcs.simple;

public class CalculatorWithOperator{
    public double Multiply(double a, double b){
        return   a * b;
    }
    public double Division(double a, double b){
        return a / b;
    }
    public double Subtraction(double a, double b){
        return a - b;
    }
    public double Summation(double a, double b){
        return a + b;
    }

    public double TheSquareRootOfTheNumber( double a){
        return Math.sqrt(a);
    }

    public double pow(double a){
        return a * a;
    }
    public  float abs(float a) {
        return (a <= 0.0F) ? 0.0F - a : a;
    }



}
