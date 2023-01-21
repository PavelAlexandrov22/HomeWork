package additional.collections.regular_collections;

import additional.collections.regular_collections.utils.Animal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegularCollections {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Animal> list = new ArrayList<>();
        Animal a = new Animal(2, "Valera", true, "horse");
        for (int i = 0; i < 3; i++) {
            list.add(a);

        }
        System.out.println(list);
        long stop = System.currentTimeMillis();
        System.out.println("speed: " + (stop - start));

        long start1 = System.currentTimeMillis();
        Set<Animal> listSet = new HashSet<>();
        Animal b = new Animal( 1, "Grisha", true, "dog");
        for (int i = 0; i < 3; i++) {
            listSet.add(b);

        }
        System.out.println(listSet);
        long stop1 = System.currentTimeMillis();
        System.out.println("speed: " + (stop1 - start1));


    }
}
