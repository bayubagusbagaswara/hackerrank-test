package com.example.demo;

public class Test11 {
    public static void main(String[] args) {
//        try {
//            return;
//        } finally {
//            System.out.println("Finally"); // dieksekusi
//        }
        String str = "java";
        str.chars().forEach(System.out::println); // diprint angka biner nya
    }
}
