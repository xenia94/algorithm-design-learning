package com.xeniascrafts.algoritmi.petlja.osnovni.aritmetika;

import java.util.Scanner;

public class Stolnjak {

    public static void main(String[] args) {

        //Povrsina kruga je P = r^2Pi ...pa je odatle r = sqrt(P/Pi)
        //Obim kruga je O = 2rPi

        Scanner input = new Scanner(System.in);

        double P = input.nextDouble();
        double r = Math.sqrt(P/Math.PI);
        double O = 2 * r * Math.PI;

        System.out.printf("%1.5f", O);



    }
}
