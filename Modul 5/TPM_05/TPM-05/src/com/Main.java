
package com;

import com.tutorial.BangunDatar;
import com.tutorial.Lingkaran;
import com.tutorial.Persegi;
import com.tutorial.PersegiPanjang;
import com.tutorial.Segitiga;

public class Main {
    public static void main(String[] args) {

        BangunDatar bgndtr = new BangunDatar();
        bgndtr.cetak();

        Persegi persegi = new Persegi(4);
        System.out.println("Luas Persegi: " + persegi.luas() + "\nKeliling Persegi: " + persegi.keliling());

        PersegiPanjang psgpnjng = new PersegiPanjang(3, 5);
        System.out.println("Luas Persegi Panjang: " + psgpnjng.luas() + "\nKeliling: " + psgpnjng.keliling());

        Lingkaran lingkaran = new Lingkaran(4);
        System.out.println("Luas Lingkaran: " + lingkaran.luas() + "\nKeliling Lingkaran: " + lingkaran.keliling());

        Segitiga segitiga = new Segitiga(4, 5);
        System.out.println("Luas Segitiga: " + segitiga.luas() + "\nKeliling Segitiga: " + segitiga.keliling());

    }
}