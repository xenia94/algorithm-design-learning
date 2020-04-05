package com.xeniascrafts.algoritmi.petlja.osnovni.aritmetika;

import java.util.Scanner;

public class StepenIKoren {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        int n = input.nextInt();

        double y1 = Math.pow(x,n);
        double y2 = Math.pow(x,1.0/n);

        System.out.printf("%1.5f\n",y1);
        System.out.printf("%1.5f", y2);


    }
}
