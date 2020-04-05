package com.xeniascrafts.algoritmi.petlja.osnovni.aritmetika;

import java.util.Scanner;

public class Putovanje {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //v = s/t t = s/v

        double v = input.nextDouble();
        double s = input.nextDouble();
        double t = s/v;

        System.out.printf("%1.2f", t);

    }
}
