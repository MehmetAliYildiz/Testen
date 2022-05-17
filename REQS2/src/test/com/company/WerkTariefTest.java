package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WerkTariefTest {

    @Test
    public void addWerkTarief() {
        WerkTarief tarief1 = new WerkTarief(20, "Programmeren");
        ArrayList<WerkTarief> tariefs = new ArrayList<>();
        tariefs.add(tarief1);
        assertNotNull(tariefs);
        assertEquals(tariefs.size(), 1);
        assertEquals(tariefs.get(0).getSoortWerk(), "Programmeren");
    }
}