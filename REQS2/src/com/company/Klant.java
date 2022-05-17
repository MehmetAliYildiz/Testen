package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Klant {
    private String naam;
    private String achternaam;
    private String telefoonNm;
    private Tarief tarief;
    private String korting;
    private String weekendWerk;
    public static ArrayList<Klant> klanten= new ArrayList<>();

    public Klant(Tarief tarief, String naam, String achternaam, String telefoonNm, String korting, String weekendWerk) {
        this.naam = naam;
        this.tarief = tarief;
        this.achternaam = achternaam;
        this.telefoonNm = telefoonNm;
        this.korting = korting;
        this.weekendWerk = weekendWerk;
        klanten.add(this);
    }

    public Klant() {}

    public Tarief getTarief() {
        return tarief;
    }

    public String getNaam() {
        return naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getTelefoonNm() {
        return telefoonNm;
    }

    public static ArrayList<Klant> getKlanten() {
        return klanten;
    }

    public String getKorting() {
        return korting;
    }

    public String getWeekendWerk() {
        return weekendWerk;
    }

    public void alleKlanten() {
        for (int i = 0; i < klanten.size(); i++) {
            System.out.println(i + 1 + ". " + klanten.get(i).getNaam() + " | " +
                    klanten.get(i).getAchternaam()+ " | " + klanten.get(i).getTelefoonNm());
        }
    }

//    public String kortingKlant() {
//        String kortingCheck = " ";
//
//    }

//    public ArrayList<Klant> addStudent() {
//        Tarief tarief1 = new ProjectTarief(20, "Gebouwen bouwen");
//        klanten.add(new Klant(tarief1,"Mehmet","Yildiz", "0685416936"));
//        return klanten;
//    }

    public void projectKlantAanmaken() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat is uw naam");
        String naam = sc.nextLine();
        System.out.println("Wat is uw achternaam");
        String achternaam = sc.nextLine();
        System.out.println("Wat is uw telefoonnummer");
        String telefoonNm = sc.nextLine();
        System.out.println("Heeft u een kortings pas j/n?");
        String kortingsPas = sc.nextLine();
        System.out.println("Werkt u in de weekend j/n?");
        String weekendWerkend = sc.nextLine();
        System.out.println("Hoeveel verdient u per uur");
        double tarief = sc.nextDouble();
        sc.nextLine();
        System.out.println("Wat voor project is het?");
        String project = sc.nextLine();
        Tarief tarief1 = new ProjectTarief(tarief, project);
        Klant klant1 = new Klant(tarief1, naam, achternaam, telefoonNm, kortingsPas, weekendWerkend);
        System.out.println("Klant " + naam +" "+ achternaam + " is aangemaakt " + telefoonNm);
        System.out.println("Verdient: "+ tarief1.getVerdient());
        System.out.println("Korting: " + kortingsPas);
        System.out.println("Werkt in weekend: " + weekendWerkend);
        System.out.println("Zijn tarief per uur is: "+ tarief);
    }

    public void werkKlantAanmaken() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat is uw naam");
        String naam = sc.nextLine();
        System.out.println("Wat is uw achternaam");
        String achternaam = sc.nextLine();
        System.out.println("Wat is uw telefoonnummer");
        String telefoonNm = sc.nextLine();
        System.out.println("Heeft u een kortings pas j/n?");
        String kortingsPas = sc.nextLine();
        System.out.println("Werkt u in de weekend j/n?");
        String weekendWerkend = sc.nextLine();
        System.out.println("Hoeveel verdient u per uur");
        double tarief = sc.nextDouble();
        sc.nextLine();
        System.out.println("Wat voor werk doet u?");
        String werk = sc.nextLine();
        Tarief tarief1 = new WerkTarief(tarief, werk);
        Klant klant1 = new Klant(tarief1, naam, achternaam, telefoonNm,kortingsPas,weekendWerkend);
        System.out.println("Klant " + naam +" "+ achternaam + " is aangemaakt " + telefoonNm);
        System.out.println("Verdient: "+ tarief1.getVerdient());
        System.out.println("Korting: " + kortingsPas);
        System.out.println("Werkt in weekend: " + weekendWerkend);
        System.out.println("Zijn tarief per uur is: "+ tarief);
    }

    public static void main(String[] args) {
        Klant klant = new Klant();
        klant.werkKlantAanmaken();
    }

}
