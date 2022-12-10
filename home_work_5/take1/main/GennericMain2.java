package home_work_5.take1.main;

import home_work_5.take1.genneric.DataContainer;

public class GennericMain2 {
    public static void main(String[] args) {

        DataContainer<Integer> container = new DataContainer<>(new Integer[0]);
        int num1 = container.add(5);
        int num2 = container.add(6);
        int num3 = container.add(3);
        int num4 = container.add(2);
        int num5 = container.add(7);
        System.out.println(num1 + num2 + num3 + num4 + num5);



    }
}
