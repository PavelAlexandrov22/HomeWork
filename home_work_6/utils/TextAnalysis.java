package home_work_6.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextAnalysis {
    private static final String SPLIT_REGEX = "(^|[^\\p{L}\\p{Mn}\\p{Nd}\\p{Pc}-]|(--)|(\\s-)|$)+";



    public static int fileToSet (Set<String> set, File textFile) {

        set.addAll(Arrays.asList(fileToString(textFile).split(SPLIT_REGEX)));

        return set.size();
    }


    public static List <Map.Entry<String, Integer>> topOfWords (File textFile, int topSize) {

        Map <String, Integer> map = new HashMap<>();

        String [] arrayOfWords = fileToString(textFile).split(SPLIT_REGEX);

        for (String word : arrayOfWords) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word)+1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new EntryIntegerValueComparator());
        Collections.reverse(list);

        return list.subList(0, topSize);
    }


    public static String fileToString (File textFile) {

        StringBuilder builder = new StringBuilder();
        String nextLine;

        try (BufferedReader fileReader = new BufferedReader(new FileReader(textFile))) {
            while ((nextLine = fileReader.readLine()) != null) {
                builder.append(nextLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }


    private static class EntryIntegerValueComparator implements Comparator <Map.Entry<?, Integer>> {
        @Override
        public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2) {
            return Integer.compare(o1.getValue(), o2.getValue());
        }
    }
}
