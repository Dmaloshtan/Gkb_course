package org.example.lesson1;

public class Dog extends Animal{

    public static int count;

    public Dog(String name, int maxDistanceRun, int maxDistanceSwim) {
        super(name, maxDistanceRun, maxDistanceSwim);
        count++;
    }

}
