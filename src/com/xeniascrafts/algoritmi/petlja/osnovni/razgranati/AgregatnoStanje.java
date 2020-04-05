package com.xeniascrafts.algoritmi.petlja.osnovni.razgranati;

import java.util.Scanner;

public class AgregatnoStanje {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int temp = input.nextInt();

        if (0 < temp && temp < 100) {
            System.out.println("tecno");
        } else if (temp >= 100) {
            System.out.println("gasovito");
        } else {
            System.out.println("cvrsto");
        }

//
//        if (temp <= 0) {
//            System.out.println("cvrsto");
//        } else if (temp > 0 && temp < 100) {
//            System.out.println("tecno");
//        } else {
//            System.out.println("gasovito");
//        }


    }
}
