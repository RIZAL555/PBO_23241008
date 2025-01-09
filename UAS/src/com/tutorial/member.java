package com.tutorial;

class member {
    protected String nama;

    member(String nama) {
        this.nama = nama;
    }

    public double hitungDiskon(double totalBelanja) {
        if (totalBelanja > 500_000) {
            return totalBelanja * 0.1;
        } else if (totalBelanja >= 100_000 && totalBelanja <= 499_000) {
            return totalBelanja * 0.05;
        } else if (totalBelanja < 100_000) {
            return totalBelanja * 0.03;
        }
        return 0;
    }

    public String getNama() {
        return nama;
    }

    void member1() {
        System.out.println("ini adalah member");
    }
}