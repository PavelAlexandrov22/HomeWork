package home_work_1.take3;

public class Take3 {
    public static void main(String[] args) {
        // Я рассмотрел принцип работы метода Math.random()
        //На примере выбара случайного числа в диапозоне от 0 до 30
        int a = 0;
        int b = 30;
        int randomNamber1 = a + (int) (Math.random() * b); // генерация 1-го числа
        System.out.println("1-ое случайное числ:" + randomNamber1);

        int randomNamber2 = a + (int) (Math.random() * b); //генерация 2-го числа
        System.out.println("2-ое случайное числ:" + randomNamber2);

        int randomNamber3 = a + (int) (Math.random() * b); //генерация 3-го числа
        System.out.println("1-ое случайное числ:" + randomNamber3);





    }
}
