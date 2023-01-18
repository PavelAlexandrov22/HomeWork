package collections.concurrent;


import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.putIfAbsent(1, "Pasha");
        map.putIfAbsent(22, "Dasha");
        map.putIfAbsent(12, "Summer");
        System.out.println(map);

        Runnable r1 = () ->{
            Iterator<Integer> it = map.keySet().iterator();
            while (it.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                Integer i = it.next();
                System.out.println(i + ":" + map.get(i));
            }
        };

        Runnable r2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.putIfAbsent(4, "April");

        };

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(map);
        long stop = System.currentTimeMillis();
        System.out.println("speed: " + (stop - start));

    }
}
