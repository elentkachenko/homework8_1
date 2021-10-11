package com.itAcademy;

import java.util.*;

public class Phonebook {

    private Map<Integer, String> phonebook = new HashMap<>();

    public void add(Integer number, String name) {
        phonebook.put(number, name);
    }

//    public void get(String name) {
//        phonebook.get(name);
//    }
}