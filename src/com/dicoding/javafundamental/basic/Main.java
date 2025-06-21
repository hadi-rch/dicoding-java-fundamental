package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.music.Gitar;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        Gitar.bunyi();
//        Mobil.tampilkanJumlahBan();
//        Motor.tampilkanJumlahBan();
//        Kereta.tampilkanJumlahBan();

//        Hewan objekHewan = new Hewan();
//        objekHewan.cetakNama("Elang");

        Hewan elang = new Hewan("Elang");
        Hewan kucing = new Hewan("Kucing");

        elang.beratHewan(8);
        elang.jumlahKakiHewan(2);
        elang.cetakHewan();

        kucing.beratHewan(4);
        kucing.jumlahKakiHewan(4);
        kucing.cetakHewan();



    }
}
