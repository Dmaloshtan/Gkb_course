package org.example.lesson5;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneCatalog {

    private HashMap<String, HashSet <String>> catalog;

    public PhoneCatalog() {
        catalog = new HashMap<>();
    }

    public void add(String givenName, String phoneNumber) {
        if (!catalog.containsKey(givenName)){
            catalog.put(givenName, new HashSet<>());
        }
       catalog.get(givenName).add(phoneNumber);
    }

    public HashSet<String> get(String givenName) {
        return catalog.get(givenName);
    }
}
