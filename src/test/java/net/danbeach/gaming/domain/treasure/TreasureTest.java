/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.treasure;

import java.util.ArrayList;
import net.danbeach.gaming.domain.item.Armor;
import net.danbeach.gaming.domain.item.Item;
import net.danbeach.gaming.domain.item.Potion;
import net.danbeach.gaming.domain.item.Scroll;
import net.danbeach.gaming.domain.item.Weapon;
import net.danbeach.gaming.constants.treasure.GemTypeEnum;
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
public class TreasureTest {

    Treasure treasure;

    public TreasureTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        treasure = new Treasure();
    }

    @After
    public void tearDown() {
    }

    // TODO: NEED TO ADD addTreasure_Test()
    @Test
    public void coin_Test() {
        System.out.print("TESTING coin...");
        Coin coin = new Coin();
        coin.setCopper(5);
        treasure.setCoin(coin);

        int copper = treasure.getCopper();
        assertTrue(copper == 5);
        System.out.println("DONE");
    }

    /*
     * Test of getCopper method, of class Treasure.
     */
    @Test
    public void copper_Test() {
        System.out.print("TESTING Copper...");
        int expResult = 1;
        treasure.setCopper(expResult);
        int result = treasure.getCopper();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void copperNegative_Test() {
        System.out.print("TESTING copper with negative value...");
        int expected = 0;
        int initial = -1;
        treasure.setCopper(initial);
        assertEquals(expected, treasure.getCopper());
        System.out.println("DONE");
    }
    /*
     * Test of getSilver method, of class Treasure.
     */

    @Test
    public void silver_Test() {
        System.out.print("TESTING Silver...");
        int expResult = 1;
        treasure.setSilver(expResult);
        int result = treasure.getSilver();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void silverNegative_Test() {
        System.out.print("TESTING silver with negative value...");
        int expected = 0;
        int initial = -1;
        treasure.setSilver(initial);
        assertEquals(expected, treasure.getSilver());
        System.out.println("DONE");
    }

    /*
     * Test of getElectrum method, of class Treasure.
     */
    @Test
    public void electrum_Test() {
        System.out.print("TESTING Electrum...");
        int expResult = 1;
        treasure.setElectrum(expResult);
        int result = treasure.getElectrum();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void electrumNegative_Test() {
        System.out.print("TESTING electrum with negative value...");
        int expected = 0;
        int initial = -1;
        treasure.setElectrum(initial);
        assertEquals(expected, treasure.getElectrum());
        System.out.println("DONE");
    }

    /*
     * Test of getGold method, of class Treasure.
     */
    @Test
    public void gold_Test() {
        System.out.print("TESTING Gold...");
        int expResult = 1;
        treasure.setGold(expResult);
        int result = treasure.getGold();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void goldNegative_Test() {
        System.out.print("TESTING gold with negative value...");
        int expected = 0;
        int initial = -1;
        treasure.setGold(initial);
        assertEquals(expected, treasure.getGold());
        System.out.println("DONE");
    }

    /*
     * Test of getPlatinum method, of class Treasure.
     */
    @Test
    public void platinum_Test() {
        System.out.print("TESTING Platinum...");
        int expResult = 1;
        treasure.setPlatinum(expResult);
        int result = treasure.getPlatinum();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void platinumNegative_Test() {
        System.out.print("TESTING platinum with negative value...");
        int expected = 0;
        int initial = -1;
        treasure.setPlatinum(initial);
        assertEquals(expected, treasure.getPlatinum());
        System.out.println("DONE");
    }

    /*
     * Test of getGem method, of class Treasure.
     */
    @Test
    public void gemNotNull_Test() {
        System.out.print("TESTING Gem Not Null...");
        treasure.setGem(new ArrayList<Gem>());
        ArrayList<Gem> gem = treasure.getGem();
        assertNotNull(gem);
        System.out.println("DONE");
    }

    @Test
    public void gemAddGem_Test() {
        System.out.print("TESTING Gem Adding a Gem...");
        String expResult = "Darth Vader";
        Gem gem = new Gem(expResult, GemTypeEnum.FANCY_STONE);
        treasure.setGem(new ArrayList<Gem>());
        treasure.addGem(gem);
        assertTrue(expResult.equals(treasure.getGem().get(0).getGemName()));
        System.out.println("DONE");
    }

    /*
     * Test of getArt method, of class Treasure.
     */
    @Test
    public void artNotNull_Test() {
        System.out.print("TESTING Art Not Null...");
        assertNotNull(treasure.getArt());
        System.out.println("DONE");
    }

    @Test
    public void artAddGem_Test() {
        System.out.print("TESTING Art Adding a Art...");
        treasure.addArt(new Art());
        assertTrue(treasure.getArt().size() > 0);
        System.out.println("DONE");
    }

    /*
     * Test of getTrinket method, of class Treasure.
     */
    @Test
    public void trinketNotNull_Test() {
        System.out.print("TESTING Trinket Not Null...");
        assertNotNull(treasure.getTrinket());
        System.out.println("DONE");
    }

    @Test
    public void trinketAddTrinket_Test() {
        System.out.print("TESTING Trinket Adding a Trinket...");
        treasure.addTrinket(new Trinket());
        assertTrue(treasure.getTrinket().size() > 0);
        System.out.println("DONE");
    }
    /*
     * Test of getMagicalItems method, of class Treasure.
     */

    @Test
    public void magicalItemsNotNull_Test() {
        System.out.print("TESTING Magical Items Not Null...");
        assertNotNull(treasure.getMagicalItems());
        System.out.println("DONE");
    }

    @Test
    public void magicalItemsAddMagicalItem_Test() {
        System.out.print("TESTING Magical Items Adding a Magical Item...");
        treasure.addMagicalItem(new Item());
        assertTrue(treasure.getMagicalItems().size() > 0);
        System.out.println("DONE");
    }
    /*
     * Test of getMagicalArmor method, of class Treasure.
     */

    @Test
    public void magicalArmorNotNull_Test() {
        System.out.print("TESTING Magical Armor Not Null...");
        assertNotNull(treasure.getMagicalArmor());
        System.out.println("DONE");
    }

    @Test
    public void magicalArmorAddMagicalArmor_Test() {
        System.out.print("TESTING Magical Armor Adding a Magical Armor...");
        treasure.addMagicArmor(new Armor());
        assertTrue(treasure.getMagicalArmor().size() > 0);
        System.out.println("DONE");
    }

    /*
     * Test of getMagicalWeapon method, of class Treasure.
     */
    @Test
    public void magicalWeaponNotNull_Test() {
        System.out.print("TESTING Magical Weapon Not Null...");
        assertNotNull(treasure.getMagicalWeapon());
        System.out.println("DONE");
    }

    @Test
    public void magicalWeaponAddMagicalWeapon_Test() {
        System.out.print("TESTING Magical Weapon Adding Magical Weapon...");
        treasure.addMagicWeapon(new Weapon());
        assertTrue(treasure.getMagicalWeapon().size() > 0);
        System.out.println("DONE");
    }

    /*
     * Test of getPotion method, of class Treasure.
     */
    @Test
    public void potionNotNull_Test() {
        System.out.print("TESTING Potion Not Null...");
        assertNotNull(treasure.getPotion());
        System.out.println("DONE");
    }

    @Test
    public void potionAddPotion_Test() {
        System.out.print("TESTING Potion Add Potion...");
        treasure.addPotion(new Potion());
        assertTrue(treasure.getPotion().size() > 0);
        System.out.println("DONE");
    }

    /*
     * Test of getScroll method, of class Treasure.
     */
    @Test
    public void scrollNotNull_Test() {
        System.out.print("TESTING Scroll Not Null...");
        assertNotNull(treasure.getPotion());
        System.out.println("DONE");
    }

    @Test
    public void scrollAddScroll_Test() {
        System.out.print("TESTING Scroll Add Scroll...");
        treasure.addScroll(new Scroll());
        assertTrue(treasure.getScroll().size() > 0);
        System.out.println("DONE");
    }

    @Test
    public void addCopper_Test() {
        System.out.print("TESTING addCopper...");
        int copper = 4;
        treasure.addCopper(copper);
        assertEquals(copper, treasure.getCopper());
        System.out.println("DONE");
    }

    @Test
    public void addElectrum_Test() {
        System.out.print("TESTING addElectrum...");
        int electrum = 4;
        treasure.addElectrum(electrum);
        assertEquals(electrum, treasure.getElectrum());
        System.out.println("DONE");
    }

    @Test
    public void addSilver_Test() {
        System.out.print("TESTING addSilver...");
        int silver = 4;
        treasure.addSilver(silver);
        assertEquals(silver, treasure.getSilver());
        System.out.println("DONE");
    }

    @Test
    public void addPlatinum_Test() {
        System.out.print("TESTING addPlatinum...");
        int platinum = 4;
        treasure.addPlatinum(platinum);
        assertEquals(platinum, treasure.getPlatinum());
        System.out.println("DONE");
    }

    @Test
    public void addGold_Test() {
        System.out.print("TESTING addGold...");
        int gold = 4;
        treasure.addGold(gold);
        assertEquals(gold, treasure.getGold());
        System.out.println("DONE");
    }

    @Test
    public void addGem_Test() {
        System.out.print("TESTING addGem...");
        Gem gem = new Gem();
        treasure.addGem(gem);
        assertNotNull(treasure.getGem());
        assertTrue(treasure.getGem().size() > 0);
        System.out.println("DONE");
    }

    @Test
    public void addMagicalItem_Test() {
        System.out.print("TESTING addMagicalItem...");
        Item magicItem = new Item();
        treasure.addMagicalItem(magicItem);
        assertNotNull(treasure.getMagicalItems());
        assertTrue(treasure.getMagicalItems().size() > 0);
        System.out.println("DONE");
    }

    @Test
    public void addMagicArmor_Test() {
        System.out.print("TESTINTG addMagicArmor...");
        Armor magicArmor = new Armor();
        treasure.addMagicArmor(magicArmor);
        assertNotNull(treasure.getMagicalArmor());
        assertTrue(treasure.getMagicalArmor().size() > 0);
    }

    @Test
    public void addMagicWeapon_Test() {
        System.out.print("TESTING addMagicWeapon...");
        Weapon magicWeapon = new Weapon();
        treasure.addMagicWeapon(magicWeapon);
        assertNotNull(treasure.getMagicalWeapon());
        assertTrue(treasure.getMagicalWeapon().size() > 0);
        System.out.println("DONE");
    }

    @Test
    public void addPotion_Test() {
        System.out.print("TESTING addPotion...");
        Potion potion = new Potion();
        treasure.addPotion(potion);
        assertNotNull(treasure.getPotion());
        assertTrue(treasure.getPotion().size() > 0);
    }

    @Test
    public void addScroll_Test() {
        System.out.print("TESTING addScroll...");
        Scroll scroll = new Scroll();
        treasure.addScroll(scroll);
        assertNotNull(treasure.getScroll());
        assertTrue(treasure.getScroll().size() > 0);
        System.out.println("DONE");
    }
    
    @Test
    public void addTrinket_Test(){
        System.out.print("TESTING addTrinket...");
        Trinket trinket = new Trinket();
        treasure.addTrinket(trinket);
        assertNotNull(treasure.getTrinket());
        assertTrue(treasure.getTrinket().size() > 0);
        System.out.println("DONE");
    }
    
    @Test
    public void hasCopperTrue_Test(){
        System.out.print("TESTING hasCopper is true...");
        treasure.addCopper(4);
        assertTrue(treasure.hasCopper());
        System.out.println("DONE");
    }
    
    @Test
    public void hasCopperFalse_Test(){
        System.out.print("TESTING hasCopper is false...");
        assertFalse(treasure.hasCopper());
        System.out.println("DONE");
    }
    
     @Test
    public void hasElectrumTrue_Test(){
        System.out.print("TESTING hasElectrum is true...");
        treasure.addElectrum(4);
        assertTrue(treasure.hasElectrum());
        System.out.println("DONE");
    }
    
    @Test
    public void hasElectrumFalse_Test(){
        System.out.print("TESTING hasElectrum is false...");
        assertFalse(treasure.hasElectrum());
        System.out.println("DONE");
    }
    
     @Test
    public void hasGoldTrue_Test(){
        System.out.print("TESTING hasGold is true...");
        treasure.addGold(4);
        assertTrue(treasure.hasGold());
        System.out.println("DONE");
    }
    
    @Test
    public void hasGoldFalse_Test(){
        System.out.print("TESTING hasGold is false...");
        assertFalse(treasure.hasGold());
        System.out.println("DONE");
    }
    
     @Test
    public void hasPlatinumTrue_Test(){
        System.out.print("TESTING hasPlatinum is true...");
        treasure.addPlatinum(4);
        assertTrue(treasure.hasPlatinum());
        System.out.println("DONE");
    }
    
    @Test
    public void hasPlatinumFalse_Test(){
        System.out.print("TESTING hasPlatinum is false...");
        assertFalse(treasure.hasPlatinum());
        System.out.println("DONE");
    }
    
     @Test
    public void hasSilverTrue_Test(){
        System.out.print("TESTING hasSilver is true...");
        treasure.addSilver(4);
        assertTrue(treasure.hasSilver());
        System.out.println("DONE");
    }
    
    @Test
    public void hasSilverFalse_Test(){
        System.out.print("TESTING hasSilver is false...");
        assertFalse(treasure.hasSilver());
        System.out.println("DONE");
    }
}
