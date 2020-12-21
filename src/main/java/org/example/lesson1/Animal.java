package org.example.lesson1;

public abstract class Animal {
    public static int count = 0;

    String name;

    int maxDistanceRun;
    int maxDistanceSwim;

    public Animal(String name, int maxDistanceRun, int maxDistanceSwim) {
        count++;
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
    }

    public  void run(int distance){
        if (distance <= maxDistanceRun){
            System.out.println(name + " Успешно пробежал " + distance + " м");
        } else {
            System.out.println(name + " Не смог справиться с кроссом");
        }
    }

    public  void swim(int distance){
        if (maxDistanceSwim == 0){
            System.out.println(name + " не умеет плавать");
            return;
        }
        if (distance <= maxDistanceSwim){
            System.out.println(name + " Успешно проплыл " + distance + " м");
        } else {
            System.out.println(name + " Не смог справиться с заплывом");
        }
    }

}
