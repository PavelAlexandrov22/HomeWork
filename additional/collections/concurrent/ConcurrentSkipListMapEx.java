package additional.collections.concurrent;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapEx {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ConcurrentSkipListMap<Integer, Integer> con = new ConcurrentSkipListMap<>();

        for (int i = 0; i < 9; i++) {
            con.put(i, i);
            
        }

        System.out.println(con);
        System.out.println("Удаление последнего элемента: " + con.pollLastEntry());
        System.out.println(con);
        long stop = System.currentTimeMillis();
        System.out.println("speed: " + (stop - start));
    }
}
