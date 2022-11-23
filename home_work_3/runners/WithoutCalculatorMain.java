package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double b = 4.1;
        double c = 15;
        double e = 28;
        double w = 5;
        double d = 7;
        double result = e / w;
        double result1 = result * result;
        double result2 = b + c * d + (result1); // 140.45999999999998
        System.out.println(result2);
    }
}
