package com.pboreg;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        //Ternary Operator

        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukkan nilai : ");
        input = inputUser.nextInt();

        //Variable x = ekspresi ? statement_true : statement_false

        x = (input == 10) ? (input*input) : (input/2);

        //Jika memakai if
        /*if (input==10){
            x = input*input;
        }else{
            x = input/2;
        }*/

        System.out.println("hasilnya " + x);
    }
}
