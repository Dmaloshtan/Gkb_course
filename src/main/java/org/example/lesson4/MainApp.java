package org.example.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

    public static void changeElement(Object[] array, int indexOfFirstElement, int indexOfSecondElement) {
        Object temp = array[indexOfFirstElement];
        array[indexOfFirstElement] = array[indexOfSecondElement];
        array[indexOfSecondElement] = temp;
    }

    public static <T> ArrayList<T> arrayToList(T[] array) {
        ArrayList<T> list = new ArrayList(Arrays.asList(array));
        return list;
    }


    public static void main(String[] args) {

//        Integer [] array = {1, 2, 3, 4, 5, 6};
//        changeElement(array, 2, 4);
//        for (int i : array){
//            System.out.println(i);
//        }

//        Integer[] array1 = {1, 2, 3, 4, 5, 6}; // Пересмотреть про обертки, можно ли это обойти.
//        ArrayList<Integer> list = arrayToList(array1);
//        list.add(8);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        Box<Apple> boxWithApple = new Box<>();
        Box<Orange> boxWithOrange = new Box<>();
        Box<Fruit> boxWithFruit = new Box<>();

        boxWithApple.changeBox(boxWithFruit);


    }
}
