package com.xeniascrafts;

public class Main {

    public static void main(String[] args) {


        int brojGodina = 26;
        String ime = "Ksenija";
        String prezime = "Grgic";
        double visina = 156.55;
        int trenutnaGodina = 2020;

        String imeIPrezime = String.format("%s %s", ime, prezime);

        int danRodjenja = 31;
        int mesecRodjenja = 1;
        int godinaRodjenja = 1994;

        String srpskiDatum = String.format("%d.%02d.%d.", danRodjenja, mesecRodjenja, godinaRodjenja);

        String americkiDatum = String.format("%d/%d/%d/", mesecRodjenja, danRodjenja, godinaRodjenja);

        System.out.println("Moje ime je " + imeIPrezime + "!");
        // Ja sam rodjena u Srbiji <srpskiDatum>, a u Americi <americkiDatum>

        System.out.printf("Ja sam rodjena u Srbiji %s, a u Americi %s\n", srpskiDatum, americkiDatum);
        System.out.println("Ja imam " + brojGodina + " godina, sto znaci da sam se rodila " + (trenutnaGodina - brojGodina) + ". godine.");



        // Moja visina je 1.5655m

        System.out.println("Moja visina je " + (visina/100) + "m");

        System.out.printf("Moja visina je %1.4fm\n", visina / 100);


        System.out.printf("Moje ime je %s %s!\n", ime, prezime);

        System.out.printf("Ja imam %d godina, sto znaci da sam se rodila %d. godine.\n", brojGodina, trenutnaGodina - brojGodina);

        String formatiran = String.format("Ja imam %d godina, sto znaci da sam se rodila %d. godine.\n", brojGodina, (trenutnaGodina - brojGodina));

        System.out.println(formatiran);




        // operatori

        double dejanAge = 10;
        double dejanAgeInMonths = dejanAge * 12;
        long dejanVisina = -Math.round(185.5);

        System.out.println(dejanAge/7);
        System.out.println(dejanAge%7);

        //izracunati da li je dejanAge jednocifren broj
        // i smestiti u promenljivu dejanJeDete?

        boolean dejanJeDete = (0 < dejanAge) && (dejanAge < 10);

        System.out.printf("Dejan je dete: %b\n", dejanJeDete);


        //proveriti da li je dejanAge dvocifren broj
        // i smestiti u promenljivu dejanJeCovek

        boolean dejanJeCovek = (10 <= dejanAge) && (dejanAge < 100);

        System.out.printf("Dejan je covek: %b\n", dejanJeCovek);


//        System.out
//
//        System.in

    }
}
