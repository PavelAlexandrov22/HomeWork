package additional.control.numbers;

public class ThreeNumbers {
    public static void main(String[] args) {

        System.out.println(number(4, 5,6));
        System.out.println(number1(5,6,7));

    }

    public static int number(int a, int b, int c){
        return (a + b + c)/ 3;
    }
    public static int number1(int a, int b, int c){
        if(a > b & a > c){
            return a + c;
        }else {
            return b;
        }
    }

}
