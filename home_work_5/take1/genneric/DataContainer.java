package home_work_5.take1.genneric;

import java.util.Arrays;

public class DataContainer <T>{
    private T[] data;
    private int element;
    public DataContainer(Integer[] integers) {
        this.data = data;
    }
    public int add(T item) {
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        return data.length - 1;
    }
    public T get(int index) {

        if (index >= element) {
            return null;
        } else {
            return data[index];
        }
    }
    public T[] getItems(){
        return  data;
    }
    public boolean delete(int index) {
        if (index >= element) {
            return false;
        }
        if (data.length - 1 - index >= 0) {
            System.arraycopy(data, index + 1, data, index, data.length - 1 - index);
        }
        data = Arrays.copyOf((data), data.length - 1);
        element--;
        return true;
    }
    public boolean delete(String text, int index) {
        for (int i = index + 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        data = Arrays.copyOf(data, data.length - 1);
        return true;
    }

}
