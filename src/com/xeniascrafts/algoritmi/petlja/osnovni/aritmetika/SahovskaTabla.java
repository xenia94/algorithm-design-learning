package com.xeniascrafts.algoritmi.petlja.osnovni.aritmetika;

import java.util.Scanner;

public class SahovskaTabla {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int crnaPolja = 0;

        if (m % 2 == 0) {
            int brojRedovaBelaPrva = m / 2;
            int brojCrnihUReduSaBelomPrvom = n/2;

            int brojRedovaCrnaPrva = m / 2;
            int brojCrnihUReduSaCrnomPrvom = (n+1)/2;

            crnaPolja = (brojRedovaBelaPrva * brojCrnihUReduSaBelomPrvom)
                    + (brojRedovaCrnaPrva * brojCrnihUReduSaCrnomPrvom);
        } else {
            int brojRedovaBelaPrva = m / 2 + 1;
            int brojCrnihUReduSaBelomPrvom = n / 2;

            int brojRedovaCrnaPrva = m / 2;
            int brojCrnihUReduSaCrnomPrvom = (n+1)/2;

            crnaPolja = (brojRedovaBelaPrva * brojCrnihUReduSaBelomPrvom)
                    + (brojRedovaCrnaPrva * brojCrnihUReduSaCrnomPrvom);

        }

        System.out.println(crnaPolja);

    }


}
