package com.tutorial;

public class Player {
    // atribut
    private String name;
    // atribut static
    private static int jumlahPlayaer;

    // constructor
    // opsi 1
    public Player(String name) {
        this.name = name;
    }

    // overloading constructor
    // opsi 2
    Player() {
        Player.jumlahPlayaer++;
        this.name = "player " + Player.jumlahPlayaer;
    }

    // cetak
    public void cetak() {
        System.out.println("name : " + this.name);
        System.out.println("jumlah pemain:" + jumlahPlayaer);
    }
}
