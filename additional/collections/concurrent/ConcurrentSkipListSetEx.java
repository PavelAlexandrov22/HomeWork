package additional.collections.concurrent;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetEx {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        NavigableSet<String> animalSet = new ConcurrentSkipListSet<>();
        animalSet.add("Тигр");
        animalSet.add("Лев");
        animalSet.add("Зебра");
        animalSet.add("Енот");
        animalSet.add("Слон");

        System.out.println("______Обход набора______");

        Iterator<String> itr = animalSet.iterator();
        while (itr.hasNext()){
            System.out.println("Значение: " + itr.next());
        }

        String s = animalSet.higher("C");
        String q = animalSet.lower("Л");
        System.out.println(q);
        System.out.println(s);

        System.out.println("_______Tail Set_____");
        Set<String> set = animalSet.tailSet("Слон");
        itr = set.iterator();
        while (itr.hasNext()){
            System.out.println("Значение: " + itr.next());
        }
        long stop = System.currentTimeMillis();
        System.out.println("speed: " + (stop - start));
    }
}
