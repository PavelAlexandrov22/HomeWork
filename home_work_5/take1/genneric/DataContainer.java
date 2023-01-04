package home_work_5.take1.genneric;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer <T>{
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item){
        if(item == null){
            return -1;
        }

        int indexForInsert = -1;
        for (int i = 0; i < this.data.length; i++) {
            if(this.data[i] == null){
                indexForInsert = i;
                break;
            }
        }

        if(indexForInsert == -1){
            indexForInsert = this.data.length;
            this.data = addSize(this.data, 1);
        }

        this.data[indexForInsert] = item;

        return indexForInsert;
    }

    public T get(int index){
        if(!checkCorrectIndex(index)){
            return null;
        }
        return this.data[index];
    }

    public T[] getItems(){
//        return this.data;
        return Arrays.copyOf(this.data, this.data.length);
    }

    public boolean delete(int index){
        if(!checkCorrectIndex(index)){
            return false;
        }

        for (int i = index + 1; i < this.data.length; i++) {
            this.data[i - 1] = this.data[i];
        }

        this.data = addSize(this.data, -1);

        return true;
    }

    public boolean delete(T item){
        if(item == null){
            return false;
        }

        for (int i = 0; i < this.data.length; i++) {
            if(Objects.equals(this.data[i], item)){
                return delete(i);
            }
        }
        return false;
    }

    public void sort(Comparator<T> cmp){
        sort(this, cmp);
    }

    public static void sort(DataContainer<? extends Comparable> container){
        sort(container, new ComparableComparator());
    }

    public static <T> void sort(DataContainer<T> container, Comparator<? super T> cmp){
        Comparator<? super T> nullFirstCmp = Comparator.nullsFirst(cmp);
        for (int i = 0; i < container.data.length -1; i++) {
            for (int j = container.data.length -1; j > i; j--) {
                if(nullFirstCmp.compare(container.data[j -1], container.data[j]) > 0) {
                    T tmp = container.data[j -1];
                    container.data[j -1] = container.data[j];
                    container.data[j] = tmp;
                }
            }
        }
    }

    private T[] addSize(T[] data, int add){
        return Arrays.copyOf(data, data.length + add);
    }

    private boolean checkCorrectIndex(int index){
        return index < this.data.length && index >= 0;
    }

    @Override
    public String toString() {
        if(this.data.length == 0){
            return "{}";
        }

        StringBuilder data = new StringBuilder("{");
        boolean needComma = false;
        for (T element : this.data) {
            if (element != null) {
                if (needComma) {
                    data.append(", ");
                }
                data.append(element);
                needComma = true;
            }
        }
        data.append("}");

        return data.toString();
    }

    private static class ComparableComparator implements Comparator<Comparable>{

        @Override
        public int compare(Comparable o1, Comparable o2) {

            return o1.compareTo(o2);
        }
    }
}