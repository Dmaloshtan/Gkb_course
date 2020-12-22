package org.example.lesson4;

import java.util.*;

public class Box<T extends Fruit> {

    private ArrayList<T> container;

    public Box() {
        this.container = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public void addFruitsToBox(T fruit){
        this.container.add(fruit);
    }

    public void addFruitsToBox(T... fruits){
        this.container.addAll(Arrays.asList(fruits));
    }

    public float getWeight(){
        if(container.size() == 0){
            return 0.0f;
        }
        return container.size() * container.get(0).getWeight();

    }

    public boolean compare(Box<?> another){
        return this.getWeight() == another.getWeight();
    }

    public void changeBox (Box<? super T> another){
        if (this == another){
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();

    }

}
