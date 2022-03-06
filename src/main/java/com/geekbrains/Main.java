package com.geekbrains;

import com.geekbrains.fruits.Apple;
import com.geekbrains.packaging.Box;
import com.geekbrains.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // 2. Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList<T> toArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {

        System.out.println("Задача №1");
        String[] a1 = new String[]{"1", "2", "4"};
        System.out.println(Arrays.toString(a1));
        swap(a1, 1, 2);
        System.out.println(Arrays.toString(a1));

        System.out.println("Задача №2");
        ArrayList<String> al1 = toArrayList(a1);

        for(String e : al1){
            System.out.println(e);
        }

        System.out.println("Задача №3");
        Box<Apple> box1 = new Box<>();
        for (int i = 0; i<15; i++){
            box1.add(new Apple());
        }
        Box<Orange> box2 = new Box<>();
        for (int i = 0; i<10; i++){
            box2.add(new Orange());
        }

        Box<Orange> box3 = new Box<>();
        for (int i = 0; i<9; i++){
            box3.add(new Orange());
        }

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
        System.out.println("box1 vs box2  : " + box1.compare(box2) + " " +  box2.compare(box1));
        System.out.println("box1 vs box3  : " + box1.compare(box3) + " " +  box3.compare(box1));
        System.out.println("box2 vs box3  : " + box2.compare(box3) + " " +  box3.compare(box2));

        box3.poorOut(box2);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());

        box2.poorOut(box3);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());

    }
}
