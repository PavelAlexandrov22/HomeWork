package collections.concurrent;


import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList();
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
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(4);
            list.add("Masha");
        };

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
        long stop = System.currentTimeMillis();
        System.out.println("speed: " + (stop - start));
    }
}
