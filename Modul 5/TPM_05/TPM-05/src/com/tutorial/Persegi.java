package com.tutorial;

public class Persegi extends BangunDatar {
    float sisi;

    // Ubah konstruktor menjadi public
    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    public float luas() {
        return sisi * sisi;
    }

    public float keliling() {
        return 4 * sisi;
    }
}
