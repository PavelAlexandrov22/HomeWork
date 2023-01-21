package additional.collections.concurrent;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetEx {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Set<String> set = new CopyOnWriteArraySet<>();
        set.add("Ivan");
        set.add("Lexa");
        set.add("Grisha");

        Iterator<String> itr1 = set.iterator();
        set.add("Masha");
        set.add("Lena");

        Iterator<String> itr2 = set.iterator();

        System.out.println("____Iterator1____");
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println("____Iterator2____");
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        long stop = System.currentTimeMillis();
        System.out.println("speed: " + (stop - start));


    }
}
