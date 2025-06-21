package com.dicoding.javafundamental.basic;

import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.println("Masukan angka pertama: ");
        int value = sc.nextInt();
        System.out.println("Masukan angka kedua: ");
        int anotherValue = sc.nextInt();
        int result = value + anotherValue;
        System.out.println("Data Pada Value: " + result);
    }
}
