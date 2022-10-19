package com.example.androidtests.Models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMake() {
        Car car = new Car("Yo!");
        assertEquals("Yo!", car.getMake());
    }

    @Test
    public void setMake() {
        //fail();
    }
}