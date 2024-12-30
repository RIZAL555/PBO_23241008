package com.tutorial;

public class main {
    public static void main(String[] args) {

        mahasiswa mhs = new mahasiswa();

        karyawan kar = new karyawan();

        manusia mns = new manusia();

        mns.setNama("rizal");
        System.out.println(mns.getNama());

        kar.setNama("rizal");
        System.out.println(kar.getNama());

        mhs.setNama("rizal");
        System.out.println(mhs.getNama());

    }

}