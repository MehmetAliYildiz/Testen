package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Factuur implements BerekenTarief{
    private String kvkNummer;
    private int btwBedrag;
    private String datum;
    private Klant klant;
    private int factuurNummer;
    private int urenWerken;
    private static ArrayList<Factuur> factuurs = new ArrayList<>();

    public Factuur(Klant klant, String kvkNummer, int btwBedrag, String datum, int factuurNummer, int urenWerken) {
        this.klant = klant;
        this.kvkNummer = kvkNummer;
        this.btwBedrag = btwBedrag;
        this.datum = datum;
        this.factuurNummer = factuurNummer;
        this.urenWerken = urenWerken;
        factuurs.add(this);
    }

    public Factuur(String kvkNummer, int btwBedrag, String datum, int factuurNummer, int urenWerken) {
        this.kvkNummer = kvkNummer;
        this.btwBedrag = btwBedrag;
        this.datum = datum;
        this.factuurNummer = factuurNummer;
        this.urenWerken = urenWerken;
        factuurs.add(this);
    }

    public Factuur() {}

    public String getKvkNummer() {
        return kvkNummer;
    }

    public Klant getKlant() {
        return klant;
    }

    public int getBtwBedrag() {
        return btwBedrag;
    }

    public String getDatum() {
        return datum;
    }

    public int getFactuurNummer() {
        return factuurNummer;
    }

    public int getUrenWerken() {
        return urenWerken;
    }

    public static ArrayList<Factuur> getFactuurs() {
        return factuurs;
    }

    public void alleFacturen() {
        for (int i = 0; i < Factuur.getFactuurs().size(); i++) {
            System.out.println("Naam: "+ Factuur.getFactuurs().get(i).getKlant().getNaam()+ " "
                    + Factuur.getFactuurs().get(i).getKlant().getAchternaam());
            System.out.println("Kvk nummer: " + Factuur.getFactuurs().get(i).getKvkNummer());
            System.out.println("Datum: " + Factuur.getFactuurs().get(i).getDatum());
            System.out.println("Factuur Nummer: " + Factuur.getFactuurs().get(i).getFactuurNummer());
            System.out.println("BTW bedrag: " + Factuur.getFactuurs().get(i).getBtwBedrag()
                    + "    " + "Uren gewerkt: " + Factuur.getFactuurs().get(i).getUrenWerken());
            System.out.println("Het totaal bedrag exclusief BTW is: "+ getBedrag());
        }
    }

    @Override
    public double getBedrag() {
        double total = 0;
        for (int i = 0; i < Klant.getKlanten().size(); i++) {
            for (int y = 0; y < Factuur.getFactuurs().size(); y++) {
                total = Klant.getKlanten().get(i).getTarief().getTarief() * Factuur.getFactuurs().get(y).getUrenWerken();
            }
        }
        return total;
    }

    public void factuurMaken() {
        Scanner scanner = new Scanner(System.in);
        boolean unknown = true;
        ProjectTarief projectTarief = null;
        WerkTarief werkTarief = null;
        System.out.println("Wat is uw naam?");
        String inlogNaam = scanner.nextLine();
        System.out.println("Wat is uw telefoonnummer?");
        String telefoonnummer = scanner.nextLine();
        for (int i = 0; i < Klant.getKlanten().size(); i++) {
            if (inlogNaam.equals(Klant.getKlanten().get(i).getNaam()) && (telefoonnummer.equals(Klant.getKlanten().get(i).getTelefoonNm()))) {
                unknown = false;
                System.out.println("U kunt nu een factuur maken");
                System.out.println("Wat voor factuur wilt u maken?" +
                        " 1: Project Factuur 2: Werk Factuur Voer nummer in");
                int watVoorFactuur = scanner.nextInt();
                if (watVoorFactuur == 1) {
                    System.out.println("Wat is uw kvk nummer?");
                    scanner.nextLine();
                    String kvkNummer = scanner.nextLine();
                    System.out.println("Wat is de BTW bedrag?");
                    int btwBedrag = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Wat is de datum?");
                    String datum = scanner.nextLine();
                    System.out.println("Wat is de factuur nummer?");
                    int factuurNummer = scanner.nextInt();
                    System.out.println("Hoe lang heeft u gewerkt?");
                    int urenWerken = scanner.nextInt();
                    Factuur factuur1 = new Factuur(Klant.getKlanten().get(i), kvkNummer, btwBedrag, datum, factuurNummer, urenWerken);
                    for (int y = 0; y < Factuur.getFactuurs().size(); y++) {
                        System.out.println("Klant: "+ Klant.getKlanten().get(i).getNaam()+ " "+ Klant.getKlanten().get(i).getTarief());
                        System.out.println("kvk nummer: " + Factuur.getFactuurs().get(y).getKvkNummer());
                        System.out.println("Datum: " + Factuur.getFactuurs().get(y).getDatum());
                        System.out.println("Factuur Nummer: " + Factuur.getFactuurs().get(y).getFactuurNummer());
                        System.out.println("BTW bedrag: " + Factuur.getFactuurs().get(y).getBtwBedrag()
                                + "    " + "Uren gewerkt: " + Factuur.getFactuurs().get(y).getUrenWerken());
                        System.out.println("Verdienst: " + Klant.getKlanten().get(i).getTarief().getVerdient());
                        System.out.println("Het totaal bedrag exclusief BTW is: "+ getBedrag());
//                        System.out.println("Het totaal bedrag inxclusief BTW is: "+ getBTWBedrag());
                    }
                } else if (watVoorFactuur == 2) {
                    System.out.println("Wat is uw kvk nummer?");
                    scanner.nextLine();
                    String kvkNummer = scanner.nextLine();
                    System.out.println("Wat is de BTW bedrag?");
                    int btwBedrag = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Wat is de datum?");
                    String datum = scanner.nextLine();
                    System.out.println("Wat is de factuur nummer?");
                    int factuurNummer = scanner.nextInt();
                    System.out.println("Hoe lang heeft u gewerkt?");
                    int urenWerken = scanner.nextInt();
                    Factuur factuur1 = new Factuur(Klant.getKlanten().get(i), kvkNummer, btwBedrag, datum, factuurNummer, urenWerken);
                    for (int y = 0; y < Factuur.getFactuurs().size(); y++) {
                        System.out.println("Klant: "+ Klant.getKlanten().get(i).getNaam()+ " "+ Klant.getKlanten().get(i).getTarief());
                        System.out.println("kvk nummer: " + Factuur.getFactuurs().get(y).getKvkNummer());
                        System.out.println("Datum: " + Factuur.getFactuurs().get(y).getDatum());
                        System.out.println("Factuur Nummer: " + Factuur.getFactuurs().get(y).getFactuurNummer());
                        System.out.println("------------------------------------------------------------");
                        System.out.println("BTW bedrag: " + Factuur.getFactuurs().get(y).getBtwBedrag());
                        System.out.println("Uren gewerkt: " + Factuur.getFactuurs().get(y).getUrenWerken());
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Het totaal bedrag exclusief BTW is: "+ getBedrag());
//                        System.out.println("Het totaal bedrag inxclusief BTW is: "+ getBTWBedrag());
                    }
                } else {
                    System.out.println("Tarief bestaat niet");
                }
            }
        }
        if (unknown) {
            System.out.println("Ongeldige combinatie van naam en telefoon nummer!");
        }
    }
}
