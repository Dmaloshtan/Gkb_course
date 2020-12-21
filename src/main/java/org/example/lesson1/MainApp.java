package org.example.lesson1;

import org.example.lesson1.*;

public class MainApp {

    public static void main(String[] args) {

        Animal [] animals = {
                new Dog("Bobik", 500, 10),
                new Pet_Cat("Barsik", 200),
                new Tiger("Boris", 800, 200)
        };


        for (Animal allAnimals : animals){

            allAnimals.run(150);
            allAnimals.swim(100);

        }
        System.out.println("Всего животных: " + Animal.count + " " + ",в том числе Собак - " + Dog.count + " Котов - " + Cat.count + " Тигров " + Tiger.count + " Доманих котов " + Pet_Cat.count);



    }
}
