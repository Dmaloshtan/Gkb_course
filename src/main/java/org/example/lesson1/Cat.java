package org.example.lesson1;

public abstract class Cat extends Animal {

    public static int count;

    public Cat(String name, int maxDistanceRun, int maxDistanceSwim) {
        super(name, maxDistanceRun, maxDistanceSwim);
        count++;
    }
}
