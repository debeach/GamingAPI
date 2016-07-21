/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.toon;

import net.danbeach.gaming.domain.toon.AnimalCompanion;
import net.danbeach.gaming.domain.item.Armor;
import net.danbeach.gaming.domain.item.Item;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author deb
 */
public class AnimalCompanionTest {
    
    AnimalCompanion companion;
    public AnimalCompanionTest() {
        companion = new AnimalCompanion();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        companion = new AnimalCompanion();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCarryCapacity method, of class AnimalCompanion.
     */
    @Test
    public void testCarryCapacity() {
        System.out.print("TESTING Carry Capacity...");
        companion.setCarryCapacity(100.0);
        double expResult = 100.0;
        double result = companion.getCarryCapacity();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void testCarryCapacityNegativeValue() {
        System.out.print("TESTING Carry Capacity Negative Value...");
        companion.setCarryCapacity(-100.0);
        double expResult = 0.0;
        double result = companion.getCarryCapacity();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    

    /**
     * Test of getBarding method, of class AnimalCompanion.
     */
    @Test
    public void testBarding() {
        System.out.print("TESTING Barding...");
        Armor barding = new Armor();
        barding.setName("bard");
        companion.setBarding(barding);
        String expResult = "bard";
        String result = companion.getBarding().getName();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getSaddle method, of class AnimalCompanion.
     */
    @Test
    public void testSaddle() {
        System.out.print("TESTING Saddle...");
        Item saddle = new Item();
        saddle.setName("saddle");
        companion.setSaddle(saddle);
        String expResult = "saddle";
        String result = companion.getSaddle().getName();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

}
