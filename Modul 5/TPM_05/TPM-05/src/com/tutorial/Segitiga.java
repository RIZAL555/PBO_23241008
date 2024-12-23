package com.tutorial;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return (alas * tinggi) / 2;
    }

    public float keliling() {
        return 3 * alas;
    }

}