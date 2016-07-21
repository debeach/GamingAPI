/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants.item;

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
public class QualityTypeTest {
    
    public QualityTypeTest() {
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
        QualityType[] result = QualityType.values();
        assertNotNull(result);
        System.out.println("DONE");
    }

    @Test
    public void testValueOf() {
        System.out.print("TESTING valueOf...");
        String name = "VERY_POOR";
        QualityType expResult = QualityType.VERY_POOR;
        QualityType result = QualityType.valueOf(name);
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testGetId() {
        System.out.print("TESTING getId...");
        int expResult = 1;
        int result = QualityType.VERY_POOR.getId();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testGetName() {
        System.out.print("TESTING getName...");
        String expResult = "Very Poor";
        String result = QualityType.VERY_POOR.getName();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testGetValueAdjust() {
        System.out.print("TESTING getValueAdjust...");
        double expResult = 0.25;
        double result = QualityType.VERY_POOR.getValueAdjust();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void testFromString() {
        System.out.print("TESTING fromString...");
        String quality = "Very Poor";
        QualityType result = QualityType.fromString(quality);
        assertEquals(QualityType.VERY_POOR, result);
        System.out.println("DONE");
    }

    @Test
    public void testFromNumber() {
        System.out.print("TESTING fromNumber...");
        int number = 1;
        QualityType result = QualityType.fromNumber(number);
        assertEquals(QualityType.VERY_POOR, result);
        System.out.println("DONE");
    }
    
}
