package com.xeniascrafts.algoritmi.petlja.osnovni.razgranati;

import java.util.Scanner;

public class KoJePreStigao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int peraSati = input.nextInt();
        int peraMinuti = input.nextInt();
        int peraSekundi = input.nextInt();

        int mikaSati = input.nextInt();
        int mikaMinuti = input.nextInt();
        int mikaSekundi = input.nextInt();

        if (peraSati < mikaSati) {
            System.out.println("Pera");
        } else if (peraSati > mikaSati) {
            System.out.println("Mika");
        } else {
            if (peraMinuti < mikaMinuti) {
                System.out.println("Pera");
            } else if (peraMinuti > mikaMinuti) {
                System.out.println("Mika");
            } else {
                if (peraSekundi < mikaSekundi) {
                    System.out.println("Pera");
                } else if (peraSekundi > mikaSekundi) {
                    System.out.println("Mika");
                } else {
                    System.out.println("istovremeno");
                }
            }

        }

//        int peraSve = peraSati;
//        peraSve = peraSve * 100 + peraMinuti;
//        peraSve = peraSve * 100 + peraSekundi;
//
//        int mikaSve = mikaSati;
//        mikaSve = mikaSve * 100 + mikaMinuti;
//        mikaSve = mikaSve * 100 + mikaSekundi;
//
//        if (peraSve < mikaSve) {
//            System.out.println("Pera");
//        } else if (mikaSve < peraSve) {
//            System.out.println("Mika");
//        } else {
//            System.out.println("istovremeno");
//        }

        // leksikografsko poredjenje
//        String peraString = String.format("%02d%02d%02d", peraSati, peraMinuti, peraSekundi);
//        String mikaString = String.format("%02d%02d%02d", mikaSati, mikaMinuti, mikaSekundi);
//        if (peraString.compareTo(mikaString) < 0) {
//            System.out.println("Pera");
//        } else if (peraString.compareTo(mikaString) > 0) {
//            System.out.println("Mika");
//        } else { // peraString.equals(mikaString)
//            System.out.println("istovremeno");
//        }



    }
}
