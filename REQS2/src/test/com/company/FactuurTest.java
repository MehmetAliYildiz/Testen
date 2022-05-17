package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class FactuurTest {

//    @Test
//    public void alleFacturen() {
//        for (int i = 0; i < Factuur.getFactuurs().size(); i++) {
//            System.out.println("kvk nummer: " + Factuur.getFactuurs().get(i).getKvkNummer());
//            System.out.println("Datum: " + Factuur.getFactuurs().get(i).getDatum());
//            System.out.println("Factuur Nummer: " + Factuur.getFactuurs().get(i).getFactuurNummer());
//            System.out.println("BTW bedrag: " + Factuur.getFactuurs()S.get(i).getBtwBedrag()
//                    + "    " + "Uren gewerkt: " + Factuur.getFactuurs().get(i).getUrenWerken());
//            assertNotNull(Factuur.getFactuurs());
//            assertEquals(Factuur.getFactuurs().size(), 1);
//        }
//    }
//
//    @Test
//    public void getBedrag() {
//        double total = 0;
//        for (int i = 0; i < Klant.getKlanten().size(); i++) {
//            for (int y = 0; y < Factuur.getFactuurs().size(); y++) {
//                total = Klant.getKlanten().get(i).getTarief().getTarief() * Factuur.getFactuurs().get(y).getUrenWerken();
//                assertNotNull(Klant.getKlanten());
//                assertEquals(Klant.getKlanten().size(), 1);
//            }
//        }
//    }
//
//    @Test
//    public void factuurMaken() {
//        WerkTarief werkTarief1 = new WerkTarief(20,"Programming");
//        Klant klant1 = new Klant(werkTarief1,"Mehmet","Yildiz","0685416936","j", "n");
//        Factuur factuur1 = new Factuur(klant1, "211087", 21, "5-5-2022", 1, 40);
//        assertEquals(factuur1.getUrenWerken(), 40);
//        assertEquals(factuur1.getFactuurNummer(), 1);
//    }

    @Test
    public void voorwaardenTesten() {
        ArrayList<Factuur> facturen = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
        Tarief tarief1 = new WerkTarief(20, "Programmeren");
        Klant klant = new Klant(tarief1, "Mehmet", "Yildiz", "0685416936","j", "n");
        System.out.println("Wat is uw tarief?");
        Double tarief = 20.0;
        System.out.println("Wat is uw naam?");
        String naam = "Mehmet";
        System.out.println("Wat is uw kvk nummer?");
        String nummer = "21108";
        Factuur factuur = new Factuur(klant, "21108", 21, "16-5-2022", 1, 40);
        assertEquals(factuur.getFactuurNummer(), 1);
        assertEquals(factuur.getUrenWerken(), 40);
        assertEquals(factuur.getBtwBedrag(), 21);
        assertNotNull(factuur);
        if (tarief1.getTarief() == tarief && klant.getNaam().equals(naam) && factuur.getKvkNummer().equals(nummer)) {
            facturen.add(factuur);
        } else {
            System.out.println("de ingevulde gegevens zijn onjuist");
        }

    }
    @Test
    public void pairwiseTesting() {
        ArrayList<Klant> klanten = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
        Tarief tarief1 = new WerkTarief(6, "Programmeren");
        Tarief tarief2 = new ProjectTarief(6, "Huizen bouwen");
        Tarief tarief3 = new WerkTarief(17, "Programmeren");
        Tarief tarief4 = new ProjectTarief(17, "Huizen bouwen");
        Tarief tarief5 = new WerkTarief(40, "Programmeren");
        Tarief tarief6 = new ProjectTarief(40, "Huizen bouwen");
        Klant klant1 = new Klant(tarief1, "Mehmet", "Yildiz", "0685416936","j", "n");
        Klant klant2 = new Klant(tarief2, "Mehmet", "Yildiz", "0685416936","n", "j");
        Klant klant3 = new Klant(tarief4, "Mehmet", "Yildiz", "0685416936","n", "j");
        Klant klant4 = new Klant(tarief3, "Mehmet", "Yildiz", "0685416936","j", "n");
        Klant klant5 = new Klant(tarief5, "Mehmet", "Yildiz", "0685416936","n", "n");
        Klant klant6 = new Klant(tarief6, "Mehmet", "Yildiz", "0685416936","j", "j");
        assertEquals(klant1.getWeekendWerk(), "n");assertEquals(klant2.getWeekendWerk(), "j");assertEquals(klant3.getWeekendWerk(), "j");
        assertEquals(klant4.getWeekendWerk(), "n");assertEquals(klant5.getWeekendWerk(), "n");assertEquals(klant6.getWeekendWerk(), "j");
        assertEquals(klant1.getKorting(), "j");
        assertEquals(klant2.getKorting(), "n");
        assertEquals(klant3.getKorting(), "n");
        assertEquals(klant4.getKorting(), "j");
        assertEquals(klant5.getKorting(), "n");
        assertEquals(klant6.getKorting(), "j");
        klanten.add(klant1);klanten.add(klant2);klanten.add(klant3);klanten.add(klant4);klanten.add(klant5);klanten.add(klant6);
        for (int i = 0; i < klanten.size(); i++){
            if (klanten.get(i).getWeekendWerk().equals("j")) {
                System.out.println("Verdienst: "+ klanten.get(i).getTarief().getTarief()*1.2);
            } else {
                System.out.println("Verdienst: "+ klanten.get(i).getTarief().getTarief());
            }
        }
    }
}