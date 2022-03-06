package com.geekbrains.packaging;

import com.geekbrains.fruits.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();
    private double weight;

    public void add(T fruit) {
        fruits.add(fruit);
        weight += fruit.getWeight();
    }


    public boolean compare(Box<?> box) {
        return (this.getWeight() == box.getWeight());
    }

    public void poorOut(Box<T> toBox) {
        for (T fruit : fruits) {
            toBox.add(fruit);
        }
        fruits.clear();
        weight = 0f;
    }

    public double getWeight() {
        return weight;
    }

}
