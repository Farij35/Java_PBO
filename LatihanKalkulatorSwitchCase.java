package com.pboreg;

import java.util.Scanner;

public class LatihanKalkulatorSwitchCase {
    public static void main(String[] args) {
        Scanner inputUser;
        float a,b, hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        switch (operator){
            case "+":
                //Penjumlahan
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case "-":
                //Pengurangan
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case "*":
                //Perkalian
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case "/":
                //Pembagian
                hasil = a / b;
                System.out.println("hasil = " + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }
    }
}
