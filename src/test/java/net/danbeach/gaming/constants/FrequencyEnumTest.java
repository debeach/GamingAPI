/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deb
 */
public class FrequencyEnumTest {
    
    FrequencyEnum frequencyEnum;
    
    public FrequencyEnumTest() {
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

    @Test
    public void testValues() {
        System.out.print("TESTING values...");
        FrequencyEnum[] result = FrequencyEnum.values();
        assertNotNull(result);
        System.out.println("DONE");
    }

    @Test
    public void testValueOf() {
        System.out.print("TESTING valueOf...");
        String name = "COMMON";
        FrequencyEnum expResult = FrequencyEnum.COMMON;
        FrequencyEnum result = FrequencyEnum.valueOf(name);
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testGetValue() {
        System.out.print("TESTING getValue...");
        int expResult = 1;
        int result = FrequencyEnum.COMMON.getValue();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testGetName() {
        System.out.print("TESTING getName...");
        String expResult = "Common";
        String result = FrequencyEnum.COMMON.getName();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testFromString() {
        System.out.print("TESTING fromString...");
        String freq = "Common";
        FrequencyEnum expResult = null;
        FrequencyEnum result = FrequencyEnum.fromString(freq);
        assertEquals(FrequencyEnum.COMMON, result);
        System.out.println("DONE");
    }

    @Test
    public void testFromNumber() {
        System.out.print("TESTING fromNumber...");
        int number = 1;
        FrequencyEnum result = FrequencyEnum.fromNumber(number);
        assertEquals(FrequencyEnum.COMMON, result);
        System.out.println("DONE");
    }
    
}
