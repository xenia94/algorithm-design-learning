package com.xeniascrafts;


import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Upisite prvi sabirak");
        int prviSabirak = ulaz.nextInt();
        System.out.println("Upisite drugi sabirak");
        int drugiSabirak = ulaz.nextInt();

        // nesto promenim
        System.out.printf("%d + %d = %d", prviSabirak, drugiSabirak, prviSabirak + drugiSabirak);

    }
}
