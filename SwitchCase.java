package com.pboreg;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // ekspresinya berupa satuan (int, long, byte,short), String atau enum

        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama : ");
        input = inputUser.next();

        //ekspresinya berupa satuan (int, long, byte, short), String atau enum
        switch(input){
            case "otong":
                System.out.println("Saya Otong dan hadir bos!!!");
                break;
            case "ucup":
                System.out.println("Saya Ucup dan hadir bos!!!");
                break;
            case "mario":
                System.out.println("Saya Mario dan hadir bos!!!");
                break;
            default :
                System.out.println(input = "Tidak hadir bos!!!");
        }

        System.out.println("Selesai program");
    }
}
