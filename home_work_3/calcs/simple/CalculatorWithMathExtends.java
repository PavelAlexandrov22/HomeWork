package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double pow(double a) {
        return super.pow(a);
    }

    @Override
    public float abs(float a) {
        return super.abs(a);
    }

    public double Pow(double a, double b){
        return Math.pow(a, b);
    }

    public double TheSquareRootOfTheNumber( double a){
        return Math.sqrt(a);
    }

    public double TheNumberModule(int a){
        return Math.abs(a);
    }
}


