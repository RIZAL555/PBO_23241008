package com.tutorial;

import com.terminal.console;

//visibillity default
//hanya bisa diakses oleh package sama
class Player {
    private String nama;

    Player(String nama) {
        this.nama = nama;

    }

    void cetak() {
        // System.out.println("Player nama : " + this.nama);
        console.log("Menggunakan Console");
        console.log("Player name : " + this.nama);
    }

}
