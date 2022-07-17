package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ramesh", 30);
        Person person2 = new Person("Sathish", 31);
        Person person3 = new Person("Sathish", 31);
        Person person4 = person1;

        Map<Person, Integer> personMap = new HashMap<>();
        personMap.put(person1, 1);
        personMap.put(person2, 2);
        personMap.put(person3, 3);
        personMap.put(person4, 4);
        System.out.println("Size: " + personMap.size());

        for (Integer value : personMap.values()) {
            System.out.println(value);
        }

        // person1 sudah ditimpa dengan person4
        // karena object person4 itu sama dengan person1
    }
}
