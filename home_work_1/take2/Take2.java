package home_work_1.take2;

public class Take2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c = 5;
         int resul1 = c + b / a;
        System.out.println(resul1); // должно получиться 5.25,
                                    // но переменная int теряет дробную часть, остается 5

        int resul2 = (c + b) / a;
        System.out.println(resul2); // результат 0.875
                                    // но переменная int теряет дробную часть, остается 0

        int resul3 = (c + b++) / 8;
        System.out.println(resul3); // инкремент b++ не выводит +1 итого получается 0.875,
                                    // но переменная int теряет дробную часть, остается 0

        int resul4 = (c + b++) / --a;
        System.out.println(resul4); // инкремент b++ не выводит +1
                                    // декремент --а дает 7    ( 8- 1 )
                                    // итого получается  (7) / 7 = 1

        int resul5 = (c * b >> b++) / --a;
        System.out.println(resul5); // декремент --а дает 7 ; инкремент b++ не увеличил значение b на +1
                                   // с * b = 10 ( 2 * 5) ; Сдвиг битов вправо дает 10 = 2
                                   // но переменная int теряет дробную часть, остается 0

        int d =7;
        int e = 20;
        int i = 68;
        int f = 22;
        int resul6 = (c + d > e ? i : f * b >> b++) / --a;
        System.out.println(resul6);  // декремент --а дает 7; инкремент b++ не увеличил значение b на +1
                                     //но переменная int теряет дробную часть, остается 0

       // int resul7 = (c + d > e ? i >= i : f * b >> b++) / --a;
        System.out.println("Ошибка"); //при проверки двух половин равенств возникает "ошибка типов"

        int h = 119;
        int q = 6;
        int w = 3;
        int r = 12;
        boolean resul8 = q - b > w && r *r <= h;
        System.out.println(resul8); // вырожение будет true если обе его части будут true, в данном случае false


        boolean j = true;
        boolean u = false;
        boolean resul9 = j && u;
        System.out.println(resul9); // вырожение будет true если обе его части будут true, в данном случае false















    }
}
