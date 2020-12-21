package org.example.lesson1;

public class Pet_Cat extends Cat {
    public static int count;

    public Pet_Cat(String name, int maxDistanceRun) {
        super(name, maxDistanceRun,0);
        count++;
    }

}
