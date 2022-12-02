package home_work_1.take1;

public class Take1 {
    public static void main(String[] args) {
        // 22 - 10110
        // 74 - 1001010
        //  System.out.println(42.5|3); операция & и | не может быть применина к нецелому числу
        //int a = (int)42.5; // решение проблемы с нецелыми числами ( 42.5 - 101010.1)
        System.out.println(binaryAhd(22,74));
        System.out.println(binaryOr(22,74));
    }
    public static int binaryAhd(int a, int b){
        return a & b;

    }
    public static int binaryOr(int a, int b){
        return a | b;
    }
}
