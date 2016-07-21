/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.treasure;

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
public class CoinTest {
    Coin coin;
    public CoinTest() {
        coin = new Coin(0,0,0,0,0);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        coin.setCopper(0);
        coin.setSilver(0);
        coin.setElectrum(0);
        coin.setGold(0);
        coin.setPlatinum(0);
    }
    
    @After
    public void tearDown() {
    }

    /*
     * Test of getCopper method, of class Coin.
     */
    @Test
    public void copper_Test() {
        System.out.print("TESTING getCopper...");
        int expResult = 1;
        coin.setCopper(1);
        assertEquals(expResult, coin.getCopper());
        System.out.print("DONE");
    }

    @Test
    public void copperNegativeValue_Test(){
        System.out.print("TESTING setCopper negative value...");
        int expResults = 0;
        coin.setCopper(-1);
        assertEquals(expResults, coin.getCopper());
        System.out.println("DONE");
    }
    /*
     * Test of getSilver method, of class Coin.
     */
    @Test
    public void silver_Test() {
        System.out.print("TESTING getSilver...");
        int expResult = 0;
        coin.setCopper(0);
        assertEquals(expResult, coin.getSilver());
        System.out.println("DONE");
    }

    @Test
    public void silverNegativeValue_Test(){
        System.out.print("TESTING setSilver negative value...");
        int expResults = 0;
        coin.setSilver(-1);
        assertEquals(expResults,coin.getSilver());
        System.out.println("DONE");
    }

    /*
     * Test of getElectrum method, of class Coin.
     */
    @Test
    public void electrum_Test() {
        System.out.print("TESTING getElectrum...");
        int expResult = 1;
        coin.setElectrum(1);
        assertEquals(expResult, coin.getElectrum());
        System.out.println("DONE");
    }

    /*
     * Test of setElectrum method, of class Coin.
     */
    @Test
    public void electrumNegativeValue_Test() {
        System.out.print("TESTING setElectrum negative value...");
        int expResult = 0;
        coin.setElectrum(-1);
        assertEquals(expResult, coin.getElectrum());
        System.out.println("DONE");
    }

    /*
     * Test of getGold method, of class Coin.
     */
    @Test
    public void gold_Test() {
        System.out.print("TESTING getGold...");
        int expResult = 1;
        coin.setGold(1);
        assertEquals(expResult, coin.getGold());
        System.out.println("DONE");
    }

    /*
     * Test of setGold method, of class Coin.
     */
    @Test
    public void goldNegativeValue_Test() {
        System.out.print("TESTING setGold negative value...");
        int expResults = 0;
        coin.setGold(-1);
        assertEquals(expResults,coin.getGold());
        System.out.println("DONE");
    }

    /*
     * Test of getPlatinum method, of class Coin.
     */
    @Test
    public void platinum_Test() {
        System.out.print("TESTING getPlatinum...");
        int expResult = 1;
        coin.setPlatinum(1);
        assertEquals(expResult, coin.getPlatinum());
        System.out.println("DONE");
    }

    /*
     * Test of setPlatinum method, of class Coin.
     */
    @Test
    public void platinumNegativeValue_Test() {
        System.out.print("TESTING setPlatinum negative value...");
        int expResults = 0;
        coin.setPlatinum(-1);
        assertEquals(expResults,coin.getPlatinum());
        System.out.println("DONE");
    }
    
    @Test
    public void addCopper_Test(){
        System.out.print("TESTING addCopper...");
        int expected = 5;
        coin.addCopper(expected);
        assertEquals(expected,coin.getCopper());
        System.out.println("DONE");
    }
    
    @Test
    public void addElectrum_Test(){
        System.out.print("TESTING addElectrum...");
        int expected = 5;
        coin.addElectrum(expected);
        assertEquals(expected,coin.getElectrum());
        System.out.println("DONE");
    }
    
    @Test
    public void addGold_Test(){
        System.out.print("TESTING addGold...");
        int expected = 5;
        coin.addGold(expected);
        assertEquals(expected,coin.getGold());
        System.out.println("DONE");
    }
    
    @Test
    public void addPlatinum_Test(){
        System.out.print("TESTING addPlatinum...");
        int expected = 5;
        coin.addPlatinum(expected);
        assertEquals(expected,coin.getPlatinum());
        System.out.println("DONE");
    }
    
    @Test
    public void addSilver_Test(){
        System.out.print("TESTING addSilver...");
        int expected = 5;
        coin.addSilver(expected);
        assertEquals(expected,coin.getSilver());
        System.out.println("DONE");
    }
}
