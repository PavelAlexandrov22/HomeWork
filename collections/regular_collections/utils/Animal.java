package collections.regular_collections.utils;

import java.io.Serializable;

public class Animal implements Serializable {
    private int age;
    private String name;
    private boolean voice;
    private String view;

    public Animal(int age, String name, boolean voice, String view) {
        this.age = age;
        this.name = name;
        this.voice = voice;
        this.view = view;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", voice=" + voice +
                ", view='" + view + '\'' +
                '}';
    }
}
