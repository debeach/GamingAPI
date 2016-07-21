/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.controller;

import net.danbeach.gaming.domain.treasure.Coin;
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
public class CoinControllerTest {
    
    CoinController coinController;
    
    public CoinControllerTest() {
        coinController = new CoinController();
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

    /*
     * Test of generateCoins method, of class CoinController.
     */
    @Test
    public void generateCoins_Test() {
        System.out.print("TESTING generateCoins...");
        int maxNumber = 10;
        int result = coinController.generateCoins(maxNumber);
        assertTrue(result > 0);
        System.out.println("DONE");
    }

    /*
     * Test of addCoins method, of class CoinController.
     */
    @Test
    public void addCoins_Test() {
        System.out.print("TESTING addCoins...");
        Coin coin = new Coin();
        int numberOfCoins = 5;
        int coinType = Coin.COPPER;
        coinController.addCoins(coin, numberOfCoins, coinType);
        
        assertTrue(coin.getCopper() == numberOfCoins);
        System.out.println("DONE");
    }

    /*
     * Test of convertCopperToElectrum method, of class CoinController.
     */
    @Test
    public void convertCopperToElectrum_Test() {
        System.out.print("TESTING convertCopperToElectrum");
        int copper = 50;
        double expResult = 1.0;
        double result = coinController.convertCopperToElectrum(copper);
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    /*
     * Test of convertCopperToGold method, of class CoinController.
     */
    @Test
    public void convertCopperToGold_Test() {
        System.out.print("TESTING convertCopperToGold...");
        int copper = 100;
        double expResult = 1.0;
        double result = coinController.convertCopperToGold(copper);
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    /*
     * Test of convertCopperToPlatinum method, of class CoinController.
     */
    @Test
    public void convertCopperToPlatinum_Test() {
        System.out.print("TESTING convertCopperToPlatinum...");
        int copper = 1000;
        double expResult = 1.0;
        double result = coinController.convertCopperToPlatinum(copper);
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    /**
     * Test of convertCopperToSilver method, of class CoinController.
     */
    @Test
    public void testConvertCopperToSilver() {
        System.out.println("convertCopperToSilver");
        int copper = 0;
        CoinController instance = new CoinController();
        double expResult = 0.0;
        double result = instance.convertCopperToSilver(copper);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertElectrumToCopper method, of class CoinController.
     */
    @Test
    public void testConvertElectrumToCopper() {
        System.out.println("convertElectrumToCopper");
        int electrum = 0;
        CoinController instance = new CoinController();
        int expResult = 0;
        int result = instance.convertElectrumToCopper(electrum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertElectrumToGold method, of class CoinController.
     */
    @Test
    public void testConvertElectrumToGold() {
        System.out.println("convertElectrumToGold");
        int electrum = 0;
        CoinController instance = new CoinController();
        double expResult = 0.0;
        double result = instance.convertElectrumToGold(electrum);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertElectrumToPlatinum method, of class CoinController.
     */
    @Test
    public void testConvertElectrumToPlatinum() {
        System.out.println("convertElectrumToPlatinum");
        int electrum = 0;
        CoinController instance = new CoinController();
        double expResult = 0.0;
        double result = instance.convertElectrumToPlatinum(electrum);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertElectrumToSilver method, of class CoinController.
     */
    @Test
    public void testConvertElectrumToSilver() {
        System.out.println("convertElectrumToSilver");
        int electrum = 0;
        CoinController instance = new CoinController();
        int expResult = 0;
        int result = instance.convertElectrumToSilver(electrum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertGoldToCopper method, of class CoinController.
     */
    @Test
    public void testConvertGoldToCopper() {
        System.out.println("convertGoldToCopper");
        int gold = 0;
        CoinController instance = new CoinController();
        int expResult = 0;
        int result = instance.convertGoldToCopper(gold);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertGoldToElectrum method, of class CoinController.
     */
    @Test
    public void testConvertGoldToElectrum() {
        System.out.println("convertGoldToElectrum");
        int gold = 0;
        CoinController instance = new CoinController();
        int expResult = 0;
        int result = instance.convertGoldToElectrum(gold);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertGoldToPlatinum method, of class CoinController.
     */
    @Test
    public void testConvertGoldToPlatinum() {
        System.out.println("convertGoldToPlatinum");
        int gold = 0;
        CoinController instance = new CoinController();
        double expResult = 0.0;
        double result = instance.convertGoldToPlatinum(gold);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertGoldToSilver method, of class CoinController.
     */
    @Test
    public void testConvertGoldToSilver() {
        System.out.println("convertGoldToSilver");
        int gold = 0;
        CoinController instance = new CoinController();
        int expResult = 0;
        int result = instance.convertGoldToSilver(gold);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertPlatinumToCopper method, of class CoinController.
     */
    @Test
    public void testConvertPlatinumToCopper() {
        System.out.println("convertPlatinumToCopper");
        int platinum = 0;
        CoinController instance = new CoinController();
        int expResult = 0;
        int result = instance.convertPlatinumToCopper(platinum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertPlatinumToElectrum method, of class CoinController.
     */
    @Test
    public void testConvertPlatinumToElectrum() {
        System.out.println("convertPlatinumToElectrum");
        int platinum = 0;
        CoinController instance = new CoinController();
        int expResult = 0;
        int result = instance.convertPlatinumToElectrum(platinum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertPlatinumToGold method, of class CoinController.
     */
    @Test
    public void testConvertPlatinumToGold() {
        System.out.println("convertPlatinumToGold");
        int platinum = 0;
        CoinController instance = new CoinController();
        int expResult = 0;
        int result = instance.convertPlatinumToGold(platinum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertPlatinumToSilver method, of class CoinController.
     */
    @Test
    public void testConvertPlatinumToSilver() {
        System.out.println("convertPlatinumToSilver");
        int platinum = 0;
        CoinController instance = new CoinController();
        int expResult = 0;
        int result = instance.convertPlatinumToSilver(platinum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertSilverToCopper method, of class CoinController.
     */
    @Test
    public void testConvertSilverToCopper() {
        System.out.println("convertSilverToCopper");
        int silver = 0;
        CoinController instance = new CoinController();
        int expResult = 0;
        int result = instance.convertSilverToCopper(silver);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertSilverToElectrum method, of class CoinController.
     */
    @Test
    public void testConvertSilverToElectrum() {
        System.out.println("convertSilverToElectrum");
        int silver = 0;
        CoinController instance = new CoinController();
        double expResult = 0.0;
        double result = instance.convertSilverToElectrum(silver);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertSilverToGold method, of class CoinController.
     */
    @Test
    public void testConvertSilverToGold() {
        System.out.println("convertSilverToGold");
        int silver = 0;
        CoinController instance = new CoinController();
        double expResult = 0.0;
        double result = instance.convertSilverToGold(silver);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertSilverToPlatinum method, of class CoinController.
     */
    @Test
    public void testConvertSilverToPlatinum() {
        System.out.println("convertSilverToPlatinum");
        int silver = 0;
        CoinController instance = new CoinController();
        double expResult = 0.0;
        double result = instance.convertSilverToPlatinum(silver);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCoins method, of class CoinController.
     */
    @Test
    public void testRemoveCoins() {
        System.out.println("removeCoins");
        Coin coin = null;
        int numberOfCoins = 0;
        int coinType = 0;
        CoinController instance = new CoinController();
        instance.removeCoins(coin, numberOfCoins, coinType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
