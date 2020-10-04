package com.pboreg;

import java.util.Scanner;

public class LatihanKalkulatorIfElse {
    public static void main(String[] args) {
        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser =  new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("niai b = ");
        b = inputUser.nextFloat();

        System.out.println("input user : " + a + " " + operator + " " + b);

        //Operator Tersedia + / * -

        if (operator == '+'){
            //Penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            //perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
            //pemabagian
            if (b == 0){
                System.out.println("Pembagi nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else {
            System.out.println("Operator tidak ditemukan");
        }
    }
}
