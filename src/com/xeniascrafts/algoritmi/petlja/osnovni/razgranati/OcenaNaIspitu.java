package com.xeniascrafts.algoritmi.petlja.osnovni.razgranati;

import java.util.Scanner;

public class OcenaNaIspitu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int brojPoena = input.nextInt();

        if (brojPoena < 51) {
            System.out.println("5");
        } else if (brojPoena >= 51 && brojPoena < 61) {
            System.out.println("6");
        } else if (brojPoena >= 61 && brojPoena < 71) {
            System.out.println("7");
        } else if (brojPoena >= 71 && brojPoena < 81) {
            System.out.println("8");
        } else if (brojPoena >= 81 && brojPoena < 91) {
            System.out.println("9");
        } else if (brojPoena >= 91 && brojPoena <= 100) {
            System.out.println("10");
        }



    }
}
