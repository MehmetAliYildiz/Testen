package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class WerkTarief extends Tarief{
    String soortWerk;

    public WerkTarief(double tarief, String soortWerk) {
        super(tarief);
        this.soortWerk = soortWerk;
    }

    public String getSoortWerk() {
        return soortWerk;
    }

    @Override
    public String toString() {
        return "tarief: " + tarief +
                " soortWerk: '" + soortWerk + '\''+
                " verdient: " + verdient;
    }

        public ArrayList<WerkTarief> addWerkTarief() {
        WerkTarief tarief1 = new WerkTarief(20, "Programmeren");
        ArrayList<WerkTarief> tariefs = new ArrayList<>();
        tariefs.add(tarief1);
        return tariefs;
    }
    public static void main(String[] args) {
        WerkTarief tarief1 = new WerkTarief(19, "Programmeren");
        System.out.println(tarief1);
    }
}
