package com.xeniascrafts.algoritmi.petlja.osnovni.razgranati;

import java.util.Scanner;

public class Skolarina {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double skolarina = input.nextDouble();
        double uspeh = input.nextDouble();
        int nagrada = input.nextInt();

        double popustCetrdeset = skolarina * 0.60;
        double popustTrideset = skolarina * 0.70;
        double popustDvadeset = skolarina * 0.80;
        double popustDeset = skolarina * 0.90;


        if (4.50 <= uspeh && uspeh <= 5.00) {
            System.out.printf("%1.0f", popustCetrdeset);
        } else if ((3.50 <= uspeh && uspeh < 4.50) && (nagrada == 0)) {
            System.out.printf("%1.0f", popustDvadeset);
        } else if ((2.50 <= uspeh && uspeh < 3.50) && (nagrada == 0)) {
            System.out.printf("%1.0f", popustDeset);
        } else {
            if ((3.50 <= uspeh && uspeh < 4.50) && (nagrada == 1)) {
                System.out.printf("%1.0f", popustTrideset);
            } else if ((2.50 <= uspeh && uspeh < 3.50) && (nagrada ==1)) {
                System.out.printf("%1.0f", popustTrideset);
            } else if ((2.0 <= uspeh && uspeh < 2.50) && (nagrada == 1)) {
                System.out.printf("%1.0f",popustTrideset);
            } else {
                System.out.printf("%1.0f", skolarina);
            }
        }


//        if (4.50 <= uspeh) {
//            System.out.printf("%1.0f", popustCetrdeset);
//        } else {
//            if (nagrada == 1) {
//                System.out.printf("%1.0f",popustTrideset);
//            } else {
//                if ((3.50 <= uspeh && uspeh < 4.50)) {
//                    System.out.printf("%1.0f", popustDvadeset);
//                } else if ((2.50 <= uspeh && uspeh < 3.50)) {
//                    System.out.printf("%1.0f", popustDeset);
//                } else {
//                    System.out.printf("%1.0f", skolarina);
//                }
//            }
//        }

    }
}
