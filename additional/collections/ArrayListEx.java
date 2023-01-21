package additional.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Grisha");
        list.add("Egor");
        list.add("Pasha");
        list.add("Leha");
        System.out.println(list);

        Runnable r1 = () -> {
            Iterator<String> it = list.iterator();
            while (it.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(it.next());
            }
        };

        Runnable r2 = () -> {
            try {
                Thread.sleep(222);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(5);
            list.add("Masha");
        };

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
    
}
