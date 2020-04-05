package com.xeniascrafts.algoritmi.petlja.osnovni.aritmetika;

import java.util.Scanner;

public class TrougaoPrava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Povrsina pravougaonog trougla : P = a * b/2
        // Obim pravougaonog trougla O = a + b +c


        double a = input.nextDouble();
        double b = input.nextDouble();
        double x = Math.abs(-b/a);
        double y = Math.abs(b);

        double P = x * y/2;
        double z = Math.sqrt(x * x + y * y);
        double O = x + y + z;

        System.out.printf("%1.2f\n", P);
        System.out.printf("%1.2f\n", O);

    }
}
