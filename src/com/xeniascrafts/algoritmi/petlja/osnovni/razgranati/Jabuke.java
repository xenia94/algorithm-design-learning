package com.xeniascrafts.algoritmi.petlja.osnovni.razgranati;

import java.util.Scanner;

public class Jabuke {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pera = input.nextInt();
        int mika = input.nextInt();

        if (pera > mika) {
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }
    }
}
