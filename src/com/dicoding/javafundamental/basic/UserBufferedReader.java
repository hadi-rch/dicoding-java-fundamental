package com.dicoding.javafundamental.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Program Penjumlahan Sangat sederhana: ");
        int value = 0;
        int anotherValue = 0;

        try{
            System.out.println("Masukan angka pertama: ");
            value = Integer.parseInt(br.readLine());
            System.out.println("Masukan angka kedua: ");
            anotherValue = Integer.parseInt(br.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah: " + result);
    }
}
