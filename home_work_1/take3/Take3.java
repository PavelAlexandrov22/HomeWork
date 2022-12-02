package home_work_1.take3;

public class Take3 {
    public static void main(String[] args) {
        // Я рассмотрел принцип работы метода Math.random()
        //На примере выбара случайного числа в диапозоне от 0 до 30

        System.out.println("1-ое случайное число:" + randomNamber(0,30));   // генерация 1-го числа
        System.out.println("2-ое случайное число:" + randomNamber(0,30));  //генерация 2-го числа
        System.out.println("3-ое случайное число:" + randomNamber(0,30));  //генерация 3-го числа
    }
    public static int randomNamber(int a, int b){
        return a +(int) (Math.random() * b);
    }


}
