package com.company;

public class Tarief {
    double tarief;
    String verdient;

    public Tarief(double tarief) {
        this.tarief = tarief;
        this.verdient = verdienstKlant();
    }

    public double getTarief() {
        return tarief;
    }

    public String getVerdient() {
        return verdient;
    }

    public String verdienstKlant() {
        String uitkomst = " ";
        if (tarief >= 0 && tarief <= 10) {
            uitkomst = "Laag";
        } else if (tarief >= 11 && tarief <= 20) {
            uitkomst = "Middel";
        } else if (tarief >= 21 && tarief <= 60) {
            uitkomst = "Hoog";
        } else {
            uitkomst = "Error";
        }
        return uitkomst;
    }
}
