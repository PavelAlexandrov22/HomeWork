package home_work_4.hw2_test.utils;

import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class ArraysUtilsTest {

    @Test
    @DisplayName("Проверка корректного размера массива")
    public void arrayRandom1(){
       int[] ints = ArraysUtils.arrayRandom(10, 20);

        Assertions.assertEquals(10, ints.length);

    }

    @RepeatedTest(20)
    public void arrayRandom2(){
        int[] ints = ArraysUtils.arrayRandom(10, 20);

        for (int element : ints) {
            Assertions.assertTrue(element < 20);
            Assertions.assertTrue(element >= 0);

        }

    }

    @Test
    public void arrayRandom3(){
        int[] ints = ArraysUtils.arrayRandom(0, 20);

        Assertions.assertEquals(0, ints.length);



    }

    @Test
    public void arrayRandom4(){

        Assertions.assertThrows(NegativeArraySizeException.class, ()-> {
            int[] ints = ArraysUtils.arrayRandom(-1, 20);
        });



    }
}
