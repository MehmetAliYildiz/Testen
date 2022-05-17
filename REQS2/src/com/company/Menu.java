package com.company;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menu = new ArrayList<>();

    public void addMenu() {
        menu.add("Lijst klanten");
        menu.add("Lijst facturens");
        menu.add("Nieuwe klant maken");
        menu.add("Nieuwe factuur maken");
    }

    public void printMenu(){
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + 1 + ". " + menu.get(i));
        }
    }

}
