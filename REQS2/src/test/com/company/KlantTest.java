package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class KlantTest {

    @Test
    public void alleKlanten() {
        WerkTarief werkTarief1 = new WerkTarief(20,"Programming");
        Klant klant1 = new Klant(werkTarief1,"Mehmet","Yildiz","0685416936", "j", "n");
        ArrayList<Klant> klanten= new ArrayList<>();
        klanten.add(klant1);
        for (int i = 0; i < klanten.size(); i++) {
            System.out.println(i + 1 + ". " + klanten.get(i).getNaam() + " | " +
                    klanten.get(i).getAchternaam()+ " | " + klanten.get(i).getTelefoonNm());
        }
        assertEquals(klanten.size(), 1);
        assertEquals(klanten.get(0).getTelefoonNm(), "0685416936");
        assertEquals(klanten.get(0).getNaam(), "Mehmet");
    }

    @Test
    public void projectKlantAanmaken() {
        Tarief tarief1 = new ProjectTarief(20, "Gebouwen project");
        Klant klant1 = new Klant(tarief1, "Mehmet", "Yildiz", "0685416936","j", "n");
        assertEquals(klant1.getTelefoonNm(), "0685416936");
        assertEquals(klant1.getNaam(), "Mehmet");
    }

    @Test
    public void werkKlantAanmaken() {
        Tarief tarief1 = new WerkTarief(25, "Programmeren");
        Klant klant1 = new Klant(tarief1, "Mehmet", "Yildiz", "0685416936","j", "n");
        assertEquals(klant1.getAchternaam(), "Yildiz");
        assertEquals(klant1.getNaam(), "Mehmet");
    }

    @Test
    public void verdienstKlant() {
        Tarief tarief1 = new ProjectTarief(0, "Programmeren");
        System.out.println("Verdienst: "+ tarief1.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief1.getVerdient(), "Laag");
        assertNotNull(tarief1.getVerdient());
        Tarief tarief2 = new ProjectTarief(1, "Programmeren");
        System.out.println("Verdienst: "+ tarief2.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief2.getVerdient(), "Laag");
        assertNotNull(tarief2.getVerdient());
        Tarief tarief3 = new ProjectTarief(9, "Programmeren");
        System.out.println("Verdienst: "+ tarief3.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief3.getVerdient(), "Laag");
        assertNotNull(tarief3.getVerdient());
        Tarief tarief4 = new ProjectTarief(10, "Programmeren");
        System.out.println("Verdienst: "+ tarief4.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief4.getVerdient(), "Laag");
        assertNotNull(tarief4.getVerdient());
        Tarief tarief5 = new ProjectTarief(11, "Programmeren");
        System.out.println("Verdienst: "+ tarief5.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief5.getVerdient(), "Middel");
        assertNotNull(tarief5.getVerdient());
        Tarief tarief6 = new ProjectTarief(12, "Programmeren");
        System.out.println("Verdienst: "+ tarief6.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief6.getVerdient(), "Middel");
        assertNotNull(tarief6.getVerdient());
        Tarief tarief7 = new ProjectTarief(19, "Programmeren");
        System.out.println("Verdienst: "+ tarief7.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief7.getVerdient(), "Middel");
        assertNotNull(tarief7.getVerdient());
        Tarief tarief8 = new ProjectTarief(20, "Programmeren");
        System.out.println("Verdienst: "+ tarief8.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief8.getVerdient(), "Middel");
        assertNotNull(tarief8.getVerdient());
        Tarief tarief9 = new ProjectTarief(21, "Programmeren");
        System.out.println("Verdienst: "+ tarief9.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief9.getVerdient(), "Hoog");
        assertNotNull(tarief9.getVerdient());
        Tarief tarief10 = new ProjectTarief(22, "Programmeren");
        System.out.println("Verdienst: "+ tarief10.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief10.getVerdient(), "Hoog");
        assertNotNull(tarief10.getVerdient());
        Tarief tarief11 = new ProjectTarief(59, "Programmeren");
        System.out.println("Verdienst: "+ tarief11.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief11.getVerdient(), "Hoog");
        assertNotNull(tarief11.getVerdient());
        Tarief tarief12 = new ProjectTarief(60, "Programmeren");
        System.out.println("Verdienst: "+ tarief12.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief12.getVerdient(), "Hoog");
        assertNotNull(tarief12.getVerdient());
        Tarief tarief13 = new ProjectTarief(61, "Programmeren");
        System.out.println("Verdienst: "+ tarief13.getVerdient());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        assertEquals(tarief13.getVerdient(), "Error");
        assertNotNull(tarief13.getVerdient());
    }
}