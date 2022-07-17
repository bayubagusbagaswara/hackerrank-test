package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Generics
 */
public class Test3<T> {
    T value;

    public Test3(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {

        Test3<String> first = new Test3<>("a string");
        Test3<Integer> two = new Test3<>(123);
        System.out.print(first.getValue());
        System.out.print(two.getValue());

        Set<? extends IOException> set = new HashSet<FileNotFoundException>();
        // Exception -> IOException -> FileNotFoundException
        // jadi yang bisa hanya tipe IOException dan FileNotFoundException
        // Turunan Exception ada RuntimeException
        // ? extends artinya siapa saja yang extends class IOException yang bisa menggunakan object set
    }
}
