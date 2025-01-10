package com.tutorial;

public class Main {
    public static void main(String[] args) {
        member pelanggan1 = new member("Rizal");
        nonMember pelanggan2 = new nonMember("Fita");

        double totalBelanja1 = 600_000;
        double totalBelanja2 = 150_000;

        System.out.println("Pelanggan: " + pelanggan1.getNama());
        pelanggan1.member1();
        System.out.println("Total Belanja: " + totalBelanja1);
        System.out.println("Diskon: " + pelanggan1.hitungDiskon(totalBelanja1));
        System.out.println("Total Setelah Diskon: " + (totalBelanja1 - pelanggan1.hitungDiskon(totalBelanja1)));

        System.out.println();

        System.out.println("Pelanggan: " + pelanggan2.getNama());
        pelanggan2.nonMember1();
        System.out.println("Total Belanja: " + totalBelanja2);
        System.out.println("Diskon: " + pelanggan2.hitungDiskon(totalBelanja2));
        System.out.println("Total Setelah Diskon: " + (totalBelanja2 - pelanggan2.hitungDiskon(totalBelanja2)));
    }
}
