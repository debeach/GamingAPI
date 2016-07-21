/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.constants.treasure;

import net.danbeach.gaming.domain.treasure.TreasureType;
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
public class TreasureTypeTest {
    
    public TreasureTypeTest() {
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
     * Test of getArt method, of class TreasureType.
     */
    @Test
    public void getArt_Test() {
        System.out.print("TESTING getArt...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getArt();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getArtPercent method, of class TreasureType.
     */
    @Test
    public void getArtPercent_Test() {
        System.out.print("TESTING getArtPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getArtPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getCopper method, of class TreasureType.
     */
    @Test
    public void getCopper_Test() {
        System.out.print("TESTING getCopper...");
        TreasureType instance = new TreasureType(10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getCopper();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getCopperPercent method, of class TreasureType.
     */
    @Test
    public void getCopperPercent_Test() {
        System.out.print("TESTING getCopperPercent...");
        TreasureType instance = new TreasureType(0,10,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getCopperPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getElectrum method, of class TreasureType.
     */
    @Test
    public void getElectrum_Test() {
        System.out.print("TESTING getElectrum...");
        TreasureType instance = new TreasureType(0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getElectrum();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getElectrumPercent method, of class TreasureType.
     */
    @Test
    public void getElectrumPercent_Test() {
        System.out.print("TESTING getElectrumPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getElectrumPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getGem method, of class TreasureType.
     */
    @Test
    public void getGem_Test() {
        System.out.print("TESTING getGem...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getGem();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getGemPercent method, of class TreasureType.
     */
    @Test
    public void getGemPercent_Test() {
        System.out.print("TESTING getGemPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getGemPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getGold method, of class TreasureType.
     */
    @Test
    public void getGold_Test() {
        System.out.print("TESTING getGold...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getGold();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getGoldPercent method, of class TreasureType.
     */
    @Test
    public void getGoldPercent_Test() {
        System.out.print("TESTING getGoldPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getGoldPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getMagical method, of class TreasureType.
     */
    @Test
    public void getMagical_Test() {
        System.out.print("TESTING getMagical...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getMagical();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getMagicalPercent method, of class TreasureType.
     */
    @Test
    public void getMagicalPercent_Test() {
        System.out.print("TESTING getMagicalPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getMagicalPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getMagicalArmor method, of class TreasureType.
     */
    @Test
    public void getMagicalArmor_Test() {
        System.out.print("TESTING getMagicalArmor...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getMagicalArmor();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getMagicalArmorPercent method, of class TreasureType.
     */
    @Test
    public void getMagicalArmorPercent_Test() {
        System.out.print("TESTING getMagicalArmorPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getMagicalArmorPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getMagicalWeapon method, of class TreasureType.
     */
    @Test
    public void getMagicalWeapon_Test() {
        System.out.print("TESTING getMagicalWeapon...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getMagicalWeapon();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getMagicalWeaponPercent method, of class TreasureType.
     */
    @Test
    public void getMagicalWeaponPercent_Test() {
        System.out.print("TESTING getMagicalWeaponPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0);
        int expResult = 10;
        int result = instance.getMagicalWeaponPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getPlatinum method, of class TreasureType.
     */
    @Test
    public void getPlatinum_Test() {
        System.out.print("TESTING getPlatinum...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getPlatinum();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getPlatinumPercent method, of class TreasureType.
     */
    @Test
    public void getPlatinumPercent_Test() {
        System.out.print("TESTING getPlatinumPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getPlatinumPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getPotion method, of class TreasureType.
     */
    @Test
    public void getPotion_Test() {
        System.out.print("TESTING getPotion...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0);
        int expResult = 10;
        int result = instance.getPotion();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getPotionPercent method, of class TreasureType.
     */
    @Test
    public void getPotionPercent_Test() {
        System.out.print("TESTING getPotionPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,10,0,0);
        int expResult = 10;
        int result = instance.getPotionPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getScroll method, of class TreasureType.
     */
    @Test
    public void getScroll_Test() {
        System.out.print("TESTING getScroll...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0);
        int expResult = 10;
        int result = instance.getScroll();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getScrollPercent method, of class TreasureType.
     */
    @Test
    public void getScrollPercent_Test() {
        System.out.print("TESTING getScrollPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,10);
        int expResult = 10;
        int result = instance.getScrollPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getSilver method, of class TreasureType.
     */
    @Test
    public void getSilver_Test() {
        System.out.print("TESTING getSilver...");
        TreasureType instance = new TreasureType(0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getSilver();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getSilverPercent method, of class TreasureType.
     */
    @Test
    public void getSilverPercent_Test() {
        System.out.print("TESTING getSilverPercent...");
        TreasureType instance = new TreasureType(0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getSilverPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getTrinket method, of class TreasureType.
     */
    @Test
    public void getTrinket_Test() {
        System.out.print("TESTING getTrinket...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getTrinket();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }

    /*
     * Test of getTrinketPercent method, of class TreasureType.
     */
    @Test
    public void getTrinketPercent_Test() {
        System.out.print("TESTING getTrinketPercent...");
        TreasureType instance = new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0);
        int expResult = 10;
        int result = instance.getTrinketPercent();
        assertEquals(expResult, result);
        System.out.println("DONE!");
    }
    
}
