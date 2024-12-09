package com.tutorial;

class Player {
    private String name;

    // Constructor dengan parameter
    public Player(String name) {
        this.name = name;
    }

    // Constructor default
    public Player() {
        this.name = "Rizal"; // Atau bisa diisi dengan nilai default lainnya
    }

    // Method untuk mencetak nama player
    public void cetak() {
        System.out.println("Player name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek
        Player player1 = new Player("senku"); // Menggunakan constructor dengan parameter
        Player player2 = new Player(); // Menggunakan constructor default (overloading)
        Player player3 = new Player(); // Menggunakan constructor default (overloading)
        Player player4 = new Player("naruto"); // Menggunakan constructor dengan parameter

        // Memanggil method cetak untuk setiap objek player
        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
    }
}