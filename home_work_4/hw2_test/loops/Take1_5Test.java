package home_work_4.hw2_test.loops;

import home_work_2.loops.Take1_5_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Take1_5Test {
    @Test
    public void reversed(){
        int num = Take1_5_6.remove();

        Assertions.assertEquals(56, num);



    }
}
