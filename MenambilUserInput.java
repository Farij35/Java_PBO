package com.pboreg;

import java.util.Scanner;

public class MenambilUserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int panjang, luas, lebar, tinggi, volume;
        // Membuat perhitungan menghitung luas
        // Luas =  Panjang * Lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();;

        luas = panjang * lebar;
        System.out.println(luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume = "+ volume);
    }
}
