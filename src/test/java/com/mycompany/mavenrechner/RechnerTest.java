/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenrechner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class RechnerTest {
    
    public RechnerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of addieren method, of class Rechner.
     */
    @Test
    public void testAddieren() {
        System.out.println("addieren");
        double z1 = 6.0;
        double z2 = 4.0;
        Rechner instance = new Rechner();
        double expResult = 10;
        double result = instance.addieren(z1, z2);
        assertEquals(expResult, result, 10.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtrahieren method, of class Rechner.
     */
    @Test
    public void testSubtrahieren() {
        System.out.println("subtrahieren");
        double z1 = 0.0;
        double z2 = 0.0;
        Rechner instance = new Rechner();
        double expResult = 0.0;
        double result = instance.subtrahieren(z1, z2);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplizieren method, of class Rechner.
     */
    @Test
    public void testMultiplizieren() {
        System.out.println("multiplizieren");
        double z1 = 0.0;
        double z2 = 0.0;
        Rechner instance = new Rechner();
        double expResult = 0.0;
        double result = instance.multiplizieren(z1, z2);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividieren method, of class Rechner.
     */
    @Test
    public void testDividieren() {
        System.out.println("dividieren");
        double z1 = 0.0;
        double z2 = 0.0;
        Rechner instance = new Rechner();
        double expResult = 1.388889;
        double result = instance.dividieren(z1, z2);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    
}
