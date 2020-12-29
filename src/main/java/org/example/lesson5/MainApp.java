package org.example.lesson5;

import java.util.*;

public class MainApp {


    public static void main(String[] args) {
        String[] array = {"Dog", "Cat", "Bird", "Dog", "Fish", "Rat", "Cat", "Dog", "Mouse", "Elephant", "Tiger", "Tiger"};
        Set<String> set = new HashSet<String>(Arrays.asList(array));
        System.out.println(set.size());

        for(String str : set){
            System.out.println(str + " " + Collections.frequency(Arrays.asList(array), str));
        }

//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//
//            int count = 0;
//            for (String s : array) {
//                if (str == s) {
//                    count++;
//                }
//            }
//            System.out.println(str + " " + count);
//        }


//        PhoneCatalog phoneCatalog = new PhoneCatalog();
//
//        phoneCatalog.add("Firsov", "89622222222");
//        phoneCatalog.add("Firsov", "89623333333");
//        phoneCatalog.add("Petrov", "89621234567");
//        phoneCatalog.add("Ivanov", "89689625814");
//        phoneCatalog.add("Sidorov", "89863214582");
//        phoneCatalog.add("Pitt", "89653214585");
//
//        System.out.println(phoneCatalog.get("Firsov"));
//        System.out.println(phoneCatalog.get("Pitt"));

    }
}
