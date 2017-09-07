package com.example.kaiju_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by allysonwilson on 9/6/17.
 */

public class GodzillaTest {
    Godzilla godzilla;


    @Before
    public void before() {
        godzilla = new Godzilla();
    }

    @Test
    public void testGodzillaHasName() {
        assertEquals("Godzilla", godzilla.getName() );
    }

    @Test
    public void testGodzillaHasHealthValue() {
        assertEquals(100, godzilla.getHealthValue() );
    }

    @Test
    public void testGodzillaHasAttackValue() {
        assertEquals(10, godzilla.getAttackValue() );
    }


}

