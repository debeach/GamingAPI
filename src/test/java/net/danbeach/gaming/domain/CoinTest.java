/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain;

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
    
    private Coin coin;
    
    public CoinTest() {
        coin = new Coin();
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
     * Test of getCopper method, of class Coin.
     */
    @Test
    public void copper_Test() {
        System.out.print("TESTING copper...");
        int expResult = 10;
        coin.setCopper(10);
        int result = coin.getCopper();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void copperNegativeValue_Test(){
        System.out.print("TESTING copper Negative Value...");
        int expResult = 0;
        coin.setCopper(-10);
        int result = coin.getCopper();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    

    /*
     * Test of getSilver method, of class Coin.
     */
    @Test
    public void silver_Test() {
        System.out.print("TESTING Silver...");
        int expResult = 10;
        coin.setSilver(expResult);
        int result = coin.getSilver();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void silverNegativeValue_Test(){
        System.out.print("TESTING Silver Negative Value...");
        int expResult = 0;
        coin.setSilver(-10);
        int result = coin.getSilver();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


    /*
     * Test of getElectrum method, of class Coin.
     */
    @Test
    public void electrum_Test() {
        System.out.print("TESTING electrum...");
        int expResult = 10;
        coin.setElectrum(expResult);
        int result = coin.getElectrum();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void electrumNegativeValue_Test(){
        System.out.print("TESTING electrum Negative Value...");
        int expResult = 0;
        coin.setElectrum(-10);
        int result = coin.getElectrum();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    

    /*
     * Test of getGold method, of class Coin.
     */
    @Test
    public void gold_Test() {
        System.out.print("TESTING gold...");
        int expResult = 10;
        coin.setGold(expResult);
        int result = coin.getGold();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void goldNegativeValue_Test(){
        System.out.print("TESTING gold Negative Value...");
        int expResult = 0;
        coin.setGold(-10);
        int result = coin.getGold();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /*
     * Test of getPlatinum method, of class Coin.
     */
    @Test
    public void platinum_Test() {
        System.out.print("TESTING platinum...");
        int expResult = 10;
        coin.setPlatinum(expResult);
        int result = coin.getPlatinum();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    
    @Test
    public void platinumNegativeValue_Test(){
        System.out.print("TESTING platinum Negative Value...");
        int expResult = 0;
        coin.setPlatinum(-10);
        int result = coin.getPlatinum();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

}
