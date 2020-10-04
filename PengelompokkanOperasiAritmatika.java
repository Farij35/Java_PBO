package com.pboreg;

import java.util.Scanner;

public class PengelompokkanOperasiAritmatika {
    public static void main(String[] args) {
        // Kesimpulannya adalah
        // Perkalian atau pembagian akan dilakukan terlebih dahulu

        // Jika dilakukan perkalian dan pembagian, maka
        // akan dilakukan operasinya dari kiri ke kanan

        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // Menggunakan pengelompokan operasi dengan ( )
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        //perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int  x, m, c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();
        int y = m * x * x + c;

        System.out.println("nilai y = " + y);
    }
}
