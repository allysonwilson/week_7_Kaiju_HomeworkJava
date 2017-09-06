package com.example.kaiju_homework;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by allysonwilson on 9/6/17.
 */



public class AirplaneTest {
    Airplane airplane;

    @Before
    public void before(){ Airplane = new airplane(); }

    @Test
    public void testAirplaneHasType(){
        assertEquals("fighter jet", airplane.getType() );
    }

}

