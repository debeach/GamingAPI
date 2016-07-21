/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.toon;

import net.danbeach.gaming.constants.toon.IStat;
import net.danbeach.gaming.domain.toon.Toon;
import net.danbeach.gaming.constants.toon.AlignmentEnum;
import net.danbeach.gaming.constants.toon.GenderEnum;
import net.danbeach.gaming.constants.ICurrency;
import net.danbeach.gaming.constants.toon.RaceEnum;
import net.danbeach.gaming.domain.item.Armor;
import net.danbeach.gaming.domain.item.Item;
import net.danbeach.gaming.utility.toon.RogueSkill;
import net.danbeach.gaming.utility.toon.SavingThrow;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * The @Category can be at class level or method level.
 * @author deb
 */
@Category(ToonCategory.class)
public class ToonTest {
    Toon toon;
    public ToonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        toon = new Toon();
    }
    
    @After
    public void tearDown() {
    }

   

    @Test
    public void testAdjustArmorClassNegativeValue() {
        System.out.print("TESTINT Adjust Armor Class negative value...");
        toon.setDexterity(1);
        int expResult = -5;
        int result = toon.getAdjustArmorClass();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getAdjustHitPoints method, of class Toon.
     */
    @Test
    public void testAdjustHitPoints() {
        System.out.print("TESTING Adjust Hit Points...");
        toon.setConstitution(15);
        int expResult = 1;
        int result = toon.getAdjustHitPoints();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testAdjustHitPointsNegativeValue() {
        System.out.print("TESTING Adjust Hit Points Negative Value...");
        toon.setConstitution(1);
        int expResult = -3;
        int result = toon.getAdjustHitPoints();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getAdjustInitialReaction method, of class Toon.
     */
    @Test
    public void testAdjustInitialReaction() {
        System.out.print("TESTING Adjust Initial Reaction...");
        toon.setCharisma(15);
        int expResult = 3;
        int result = toon.getAdjustInitialReaction();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getAge method, of class Toon.
     */
    @Test
    public void testAge() {
        System.out.print("TESTING Age...");
        toon.setAge(10);
        int expResult = 10;
        int result = toon.getAge();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testAgeNegativeValue(){
        System.out.print("TESTING Age negative value...");
        toon.setAge(-5);
        int expResult = 1;
        int result = toon.getAge();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    /**
     * Test of getAlignment method, of class Toon.
     */
    @Test
    public void testAlignment() {
        System.out.print("TESTING Alignment...");
        toon.setAlignment(AlignmentEnum.LAWFUL_GOOD);
        AlignmentEnum expResult = AlignmentEnum.LAWFUL_GOOD;
        AlignmentEnum result = toon.getAlignment();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getArmorClass method, of class Toon.
     */
    @Test
    public void testArmor() {
        System.out.print("TESTING Armor...");
        Armor armor = new Armor();
        armor.setDefenseValue(5);
        
        toon.getArmor()[Armor.ARMOR_ARMOR] = armor;
        int expResult = 5;
        int result = toon.getArmor()[Armor.ARMOR_ARMOR].getDefenseValue();
        assertEquals(expResult, result);
        System.out.println("DONES");
    }

    /**
     * Test of getBendLift method, of class Toon.
     */
    @Test
    public void testBendLift() {
        System.out.print("TESTING Bend Lift...");
        toon.setStrength(15, 0);
        int expResult = 7;
        int result = toon.getBendLift();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testBendLiftStrengthEighteen() {
        System.out.print("TESTING Bend Lift Str 18(0)...");
        toon.setStrength(18, 0);
        int expResult = 16;
        int result = toon.getBendLift();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testBendLiftStrenghtPercentfifty() {
        System.out.print("TESTING Bend Lift str 18(50)...");
        toon.setStrength(18, 50);
        int expResult = 20;
        int result = toon.getBendLift();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    /**
     * Test of getBoots method, of class Toon.
     */
    @Test
    public void testBoots() {
        System.out.print("TESTING Boots...");
        String name = "Boots";
        Item boots = new Item(name, false, 0.0, 0.0, 0.0);
        toon.setBoots(boots);
        Item boots2 = toon.getBoots();
        String expResult = name; 
        String result = boots2.getName();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    public void testBootsNullValue() {
        System.out.print("TESTING Boots Null Value...");
        Item boots = null;
        toon.setBoots(boots);
        Item result = toon.getBoots();
        Item expResult = null; 
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getBracer method, of class Toon.
     */
    @Test
    public void testBracer() {
        System.out.print("TESTING Bracer...");
        String name = "Bracer";
        Item bracer = new Item(name, false, 0.0, 0.0, 0.0);
        String expResult = bracer.getName();
        String result = name;
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testBracerNullValue() {
        System.out.print("TESTING Bracer Null Value...");
        Item bracer = null;
        toon.setBracer(bracer);
        Item expResult = null;
        Item result = toon.getBracer();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getCharisma method, of class Toon.
     */
    @Test
    public void testCharisma() {
        System.out.print("TESTING Charisma...");
//        Toon t = new Toon();
        toon.setCharisma(15);
        int expResult = 15;
        int result = toon.getCharisma();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testCharismaGreaterThanMaxAllowableValue(){
        System.out.print("TESTING Charisma > max value...");
//        Toon t = new Toon();
        toon.setCharisma(IStat.STAT_MAX + 1);
        int expResult = IStat.STAT_MAX;
        int result = toon.getCharisma();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testCharismaNegativeValue(){
        System.out.print("TESTING Charisma negative value...");
        Toon t = new Toon();
        t.setCharisma(-1);
        int expResult = 1;
        int result = t.getCharisma();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testCoins(){
        System.out.print("TESTING coins...");
        
        int[] coin = new int[ICurrency.NUMBER_OR_COIN_TYPES];
        coin[ICurrency.COPPER] = 1;
        coin[ICurrency.SILVER] = 2;
        coin[ICurrency.ELECTRUM] = 3;
        coin[ICurrency.GOLD] = 4;
        coin[ICurrency.PLATINUM] = 5;
        
        toon.setCoins(coin);
        
        System.out.print("TESTING Copper...");
        int expResult = 1;
        int result = toon.getCoins()[ICurrency.COPPER];
        assertEquals(expResult, result);
        System.out.println("DONE");
        
        System.out.print("TESTING Silver...");
        expResult = 2;
        result = toon.getCoins()[ICurrency.SILVER];
        assertEquals(expResult, result);
        System.out.println("DONE");
        
        System.out.print("TESTING Electrum...");
        expResult = 3;
        result = toon.getCoins()[ICurrency.ELECTRUM];
        assertEquals(expResult, result);
        System.out.println("DONE");
        
        System.out.print("TESTING Gold...");
        expResult = 4;
        result = toon.getCoins()[ICurrency.GOLD];
        assertEquals(expResult, result);
        System.out.println("DONE");
        
        System.out.print("TESTING Platinum...");
        expResult = 5;
        result = toon.getCoins()[ICurrency.PLATINUM];    //coin2[ICurrency.SILVER];
        assertEquals(expResult, result);
        System.out.println("DONE");
        
    }
    
    /**
     * Test of getCombatReact method, of class Toon.
     */
    @Test
    public void testCombatReact() {
        System.out.print("TESTING Combat React...");
        toon.setDexterity(16);
        int expResult = 1;
        int result = toon.getCombatReact();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testCombatReactNegativeValue() {
        System.out.print("TESTING Combat React negative valeue.");
        toon.setDexterity(1);
        int expResult = -6;
        int result = toon.getCombatReact();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getComeliness method, of class Toon.
     */
    @Test
    public void testComeliness() {
        System.out.print("TESTITNG Comeliness...");
        toon.setComeliness(15);
        int expResult = 15;
        int result = toon.getComeliness();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testComelinessGreaterThanMaxValue() {
        System.out.print("TESTITNG Comeliness > max value...");
        toon.setComeliness(IStat.STAT_MAX + 1);
        int expResult = IStat.STAT_MAX;
        int result = toon.getComeliness();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testComelinessNegativeValue() {
        System.out.print("TESTITNG Comeliness negative value...");
        toon.setComeliness(-1);
        int expResult = 1;
        int result = toon.getComeliness();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    
    /**
     * Test of getConstitution method, of class Toon.
     */
    @Test
    public void testConstitution() {
        System.out.print("TESTING constitution...");
        toon.setConstitution(15);
        int expResult = 15;
        int result = toon.getConstitution();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testConstitutionValueGreaterThanMax() {
        System.out.print("TESTING constitution > max value...");
        toon.setConstitution(IStat.STAT_MAX + 1);
        int expResult = IStat.STAT_MAX;
        int result = toon.getConstitution();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testConstitutionNegativeValue() {
        System.out.print("TESTING constitution negative value...");
        toon.setConstitution(-1);
        int expResult = 1;
        int result = toon.getConstitution();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getCurrentHitPoints method, of class Toon.
     */
    @Test
    public void testCurrentHitPoints() {
        System.out.print("TESTING Current Hit Points...");
        toon.setHitPoints(20);
        toon.setCurrentHitPoints(15);
        int expResult = 15;
        int result = toon.getCurrentHitPoints();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testCurrentHitPointsNegative() {
        System.out.print("TESTING Current Hit Points negative value...");
        toon.setCurrentHitPoints(-5);
        int expResult = -5;
        int result = toon.getCurrentHitPoints();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getDeity method, of class Toon.
     */
    @Test
    public void testDeity() {
        System.out.print("TESTING Deity...");
        toon.setDeity(1);
        int expResult = 1;
        int result = toon.getDeity();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getDexterity method, of class Toon.
     */
    @Test
    public void testDexterity() {
        System.out.print("TESTING Dexterity...");
        toon.setDexterity(15);
        int expResult = 15;
        int result = toon.getDexterity();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testDexterityValueGreaterThanMax() {
        System.out.print("TESTING Dexterity value > max...");
        toon.setDexterity(IStat.STAT_MAX + 1);
        int expResult = IStat.STAT_MAX;
        int result = toon.getDexterity();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testDexterityNegativeValue() {
        System.out.print("TESTING Dexterity negative value...");
        toon.setDexterity(-1);
        int expResult = 1;
        int result = toon.getDexterity();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getFirstName method, of class Toon.
     */
    @Test
    public void testFirstName() {
        System.out.print("TESTING First Name...");
        toon.setFirstName("Bob");
        String expResult = "Bob";
        String result = toon.getFirstName();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getGender method, of class Toon.
     */
    @Test
    public void testGender() {
        System.out.print("TESTING Gender...");
        toon.setGender(GenderEnum.MALE);
        GenderEnum expResult = GenderEnum.MALE;
        GenderEnum result = toon.getGender();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getHeight method, of class Toon.
     */
    @Test
    public void testHeight() {
        System.out.print("TESTING Height...");
        toon.setHeight(65.5);
        double expResult = 65.5;
        double result = toon.getHeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void testHeightNegativeValue() {
        System.out.print("TESTING Height negative value...");
        toon.setHeight(-65.5);
        double expResult = 1.0;
        double result = toon.getHeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    /**
     * Test of getHitPoints method, of class Toon.
     */
    @Test
    public void testHitPoints() {
        System.out.print("TESTING Hit Points...");
        toon.setHitPoints(5);
        int expResult = 5;
        int result = toon.getHitPoints();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testHitPointsNegativeValue() {
        System.out.print("TESTING Hit Points...");
        toon.setHitPoints(-5);
        int expResult = 1;
        int result = toon.getHitPoints();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getIntelligence method, of class Toon.
     */
    @Test
    public void testIntelligence() {
        System.out.print("TESTING Intelligence...");
        toon.setIntelligence(15);
        int expResult = 15;
        int result = toon.getIntelligence();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testIntelligenceValueGreaterThanMax() {
        System.out.print("TESTING Intelligence value > max...");
        toon.setIntelligence(IStat.STAT_MAX + 1);
        int expResult = IStat.STAT_MAX;
        int result = toon.getIntelligence();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testIntelligenceNegativeValue() {
        System.out.print("TESTING Intelligence negative value...");
        toon.setIntelligence(-1);
        int expResult = 1;
        int result = toon.getIntelligence();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
//    /**
//     * Test of getInventory method, of class Toon.
//     */
//    @Test
//    public void testGetInventory() {
//        System.out.println("getInventory");
//        Toon instance = new Toon();
//        HashMap<String, ArrayList<Item>> expResult = null;
//        HashMap<String, ArrayList<Item>> result = instance.getInventory();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    
    /**
     * Test of getLastName method, of class Toon.
     */
    @Test
    public void testLastName() {
        System.out.print("TESTING Last Name...");
        toon.setLastName("Davon");
        String expResult = "Davon";
        String result = toon.getLastName();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getLevel method, of class Toon.
     */
    @Test
    public void testLevel() {
        System.out.print("TESTING Level...");
        toon.setLevel(5);
        int expResult = 5;
        int result = toon.getLevel();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testLevelZero() {
        System.out.print("TESTING Level Zero...");
        toon.setLevel(0);
        int expResult = 0;
        int result = toon.getLevel();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testLevelNegativeValue() {
        System.out.print("TESTING Level Negative Value...");
        toon.setLevel(-5);
        int expResult = 0;
        int result = toon.getLevel();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getMagicalSaveBonus method, of class Toon.
     */
    @Test
    public void testMagicalSaveBonus() {
        System.out.print("TESTING Magical Save Bonus...");
        toon.setWisdom(15);
        int expResult = 1;
        int result = toon.getMagicalSaveBonus();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testMagicalSaveBonusNegativeValue() {
        System.out.print("TESTING Magical Save Bonus negative value...");
        toon.setWisdom(1);
        int expResult = -6;
        int result = toon.getMagicalSaveBonus();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getMaxPress method, of class Toon.
     */
    @Test
    public void testMaxPress() {
        System.out.print("TESTING Max Press...");
        toon.setStrength(15, 0);
        double expResult = 170.0;
        double result = toon.getMaxPress();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("DONE");
    }

    @Test
    public void testMaxPressStrengthEighteen() {
        System.out.print("TESTING Max Press str 18(0)...");
        toon.setStrength(18, 0);
        double expResult = 255.0;
        double result = toon.getMaxPress();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("DONE");
    }
    
    @Test
    public void testMaxPressStrengthPercentFifty() {
        System.out.print("TESTING Max Press str 18(50)...");
        toon.setStrength(18, 50);
        double expResult = 280.0;
        double result = toon.getMaxPress();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("DONE");
    }
    
    /**
     * Test of getMaxWeight method, of class Toon.
     */
    @Test
    public void testMaxWeight() {
        System.out.print("TESTING Max Weight...");
        toon.setStrength(15, 0);
        double expResult = 55.0;
        double result = toon.getMaxWeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void testMaxWeightStrengthEighteen() {
        System.out.print("TESTING Max Weight str 18(0)...");
        toon.setStrength(18, 0);
        double expResult = 110.0;
        double result = toon.getMaxWeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    @Test
    public void testMaxWeightStrengthPercentFifty() {
        System.out.print("TESTING Max Weight str 18(50)...");
        toon.setStrength(18, 50);
        double expResult = 135.0;
        double result = toon.getMaxWeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    /**
     * Test of getMoveRate method, of class Toon.
     */
    @Test
    public void testMoveRate() {
        System.out.print("TESTING MoveRate...");
        toon.setMoveRate(12.0);
        double expResult = 12.0;
        double result = toon.getMoveRate();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void testMoveRateZeroValue() {
        System.out.print("TESTING MoveRate Zero value...");
        toon.setMoveRate(0.0);
        double expResult = 0.0;
        double result = toon.getMoveRate();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    @Test
    public void testMoveRateNegativeValue() {
        System.out.print("TESTING MoveRate negative value...");
        toon.setMoveRate(-12.0);
        double expResult = 0.0;
        double result = toon.getMoveRate();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    /**
     * Test of getNumberOfLanguages method, of class Toon.
     */
    @Test
    public void testNumberOfLanguages() {
        System.out.print("TESTING Number Of Languages...");
        toon.setIntelligence(15);
        int expResult = 4;
        int result = toon.getNumberOfLanguages();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getOpenDoor method, of class Toon.
     */
    @Test
    public void testOpenDoor() {
        System.out.print("TESTING Open Door...");
        toon.setStrength(15,0);
        int expResult = 8;
        int result = toon.getOpenDoor();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testOpenDoorStrengthEighteen() {
        System.out.print("TESTING Open Door...");
        toon.setStrength(18,0);
        int expResult = 11;
        int result = toon.getOpenDoor();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testOpenDoorStrengthPercentFifty() {
        System.out.print("TESTING Open Door...");
        toon.setStrength(18,50);
        int expResult = 12;
        int result = toon.getOpenDoor();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getRace method, of class Toon.
     */
    @Test
    public void testRace() {
        System.out.print("TESTING Race...");
        toon.setRace(RaceEnum.ELF);
        RaceEnum expResult = RaceEnum.ELF;
        RaceEnum result = toon.getRace();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getResurrectSurvive method, of class Toon.
     */
    @Test
    public void testResurrectSurvive() {
        System.out.print("TESTING Resurrect Survive...");
        toon.setConstitution(15);
        int expResult = 94;
        int result = toon.getResurrectSurvive();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


//    /**
//     * Test of getPhysicalSavingBonus method, of class Toon.
//     */
//    @Test
//    public void testGetPhysicalSavingBonus() {
//        System.out.println("getPhysicalSavingBonus");
//        Toon instance = new Toon();
//        int expResult = 0;
//        int result = instance.getPhysicalSavingBonus();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getRogueSkills method, of class Toon.
     */
    @Test
    public void testRogueSkills() {
        System.out.print("TESTING Rogue Skills...");
        int[][] skills = toon.getRogueSkills();
        skills[RogueSkill.APPRAISAL][RogueSkill.ROGUE_BASE] = 10;
        int expResult = 10;
        int result = toon.getRogueSkills()[RogueSkill.APPRAISAL][RogueSkill.ROGUE_BASE];
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getSavingThrows method, of class Toon.
     */
    @Test
    public void testSavingThrows() {
        System.out.print("TESTING Saving Throws...");
        int[][] saves = toon.getSavingThrows();
        saves[SavingThrow.BREATH][SavingThrow.SAVE_BASE] = 10;
        int expResult = 10;
        int result = toon.getSavingThrows()[SavingThrow.BREATH][SavingThrow.SAVE_BASE];
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getSpellFailure method, of class Toon.
     */
    @Test
    public void testSpellFailure() {
        System.out.print("TESTING Spell Failure...");
        toon.setWisdom(12);
        int expResult = 5;
        int result = toon.getSpellFailure();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getStrength method, of class Toon.
     */
    @Test
    public void testStrength() {
        System.out.print("TESTING Strength...");
        toon.setStrength(15,0);
        int expResult = 15;
        int result = toon.getStrength();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testStrengthValueGreaterThanMax() {
        System.out.print("TESTING Strength value > max...");
        toon.setStrength(IStat.STAT_MAX + 1,0);
        int expResult = 25;
        int result = toon.getStrength();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testStrengthNegativeValue() {
        System.out.print("TESTING Strength negative value...");
        toon.setStrength(-3,0);
        int expResult = 1;
        int result = toon.getStrength();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    

    /**
     * Test of getStrengthPercent method, of class Toon.
     */
    @Test
    public void testStrengthPercent() {
        System.out.print("TESTING Strength Percent...");
        toon.setStrength(18,50);
        int expResult = 50;
        int result = toon.getStrengthPercent();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testStrengthPercentGreaterThanMax() {
        System.out.print("TESTING Strength Percent...");
        toon.setStrength(18,101);
        int expResult = 100;
        int result = toon.getStrengthPercent();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testStrengthPercentNegativeValue() {
        System.out.print("TESTING Strength Percent negative value...");
        toon.setStrength(18,-5);
        int expResult = 0;
        int result = toon.getStrengthPercent();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getSystemShock method, of class Toon.
     */
    @Test
    public void testSystemShock() {
        System.out.print("TESTING System Shock...");
        toon.setConstitution(15);
        int expResult = 90;
        int result = toon.getSystemShock();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getThacio method, of class Toon.
     */
    @Test
    public void testThacio() {
        System.out.print("TESTING Thacio...");
        int thac = 5;
        toon.setThacio(thac);
        int expResult = 5;
        int result = toon.getThacio();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getTitle method, of class Toon.
     */
    @Test
    public void testTitle() {
        System.out.print("TESTING Title...");
        toon.setTitle("Sir");
        String expResult = "Sir";
        String result = toon.getTitle();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getToDamage method, of class Toon.
     */
    @Test
    public void testToDamage() {
        System.out.print("TESTING To Damage...");
        toon.setStrength(15,0);
        int expResult = 0;
        int result = toon.getToDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testToDamageNegatvieValue() {
        System.out.print("TESTING To Damage Negative value...");
        toon.setStrength(1,0);
        int expResult = -4;
        int result = toon.getToDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testToDamageStrengthEighteen() {
        System.out.print("TESTING To Damage str 18(0)...");
        toon.setStrength(18,0);
        int expResult = 2;
        int result = toon.getToDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testToDamageStrengthPercentFifty() {
        System.out.print("TESTING To Damage str 18(50)...");
        toon.setStrength(18,50);
        int expResult = 3;
        int result = toon.getToDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getToHit method, of class Toon.
     */
    @Test
    public void testToHit() {
        System.out.print("TESTING To Hit...");
        toon.setStrength(15,0);
        int expResult = 0;
        int result = toon.getToHit();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testToHitNegativeValue() {
        System.out.print("TESTING To Hit negative value...");
        toon.setStrength(1,0);
        int expResult = -5;
        int result = toon.getToHit();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testToHitStrenghtEighteen() {
        System.out.print("TESTING To Hit str 18(0)...");
        toon.setStrength(18,0);
        int expResult = 1;
        int result = toon.getToHit();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testToHitStrenghtPercentFifty() {
        System.out.print("TESTING To Hit str 18(50)...");
        toon.setStrength(18,50);
        int expResult = 1;
        int result = toon.getToHit();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getWeight method, of class Toon.
     */
    @Test
    public void testWeight() {
        System.out.print("TESTING Weight...");
        toon.setWeight(100.0);
        double expResult = 100.0;
        double result = toon.getWeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void testWeightZeroValue() {
        System.out.print("TESTING Weight zero value...");
        toon.setWeight(0.0);
        double expResult = 1.0;
        double result = toon.getWeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    @Test
    public void testWeightNegativeValue() {
        System.out.print("TESTING Weight Negative Value...");
        toon.setWeight(-100.0);
        double expResult = 1.0;
        double result = toon.getWeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    /**
     * Test of getWisdom method, of class Toon.
     */
    @Test
    public void testWisdom() {
        System.out.print("TESTING Wisdom...");
        toon.setWisdom(15);
        int expResult = 15;
        int result = toon.getWisdom();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testWisdomValueGreaterThanMax() {
        System.out.print("TESTING Wisdom value > max...");
        toon.setWisdom(IStat.STAT_MAX + 1);
        int expResult = IStat.STAT_MAX;
        int result = toon.getWisdom();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testWisdomNegativeValue() {
        System.out.print("TESTING Wisdom negative value...");
        toon.setWisdom(-1);
        int expResult = 1;
        int result = toon.getWisdom();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    





//    /**
//     * Test of addContainer method, of class Toon.
//     */
//    @Test
//    public void testAddContainer() {
//        System.out.println("addContainer");
//        String containerName = "";
//        Toon instance = new Toon();
//        boolean expResult = false;
//        boolean result = instance.addContainer(containerName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hasContainer method, of class Toon.
//     */
//    @Test
//    public void testHasContainer() {
//        System.out.println("hasContainer");
//        String containerName = "";
//        Toon instance = new Toon();
//        boolean expResult = false;
//        boolean result = instance.hasContainer(containerName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of isConscious method, of class Toon.
     */
    @Test
    public void testIsConscious() {
        System.out.print("TESTING isConscious...");
        toon.setCurrentHitPoints(-2);
        boolean expResult = false;
        boolean result = toon.isConscious();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of isDead method, of class Toon.
     */
    @Test
    public void testIsDead() {
        System.out.print("TESTING isDead...");
        toon.setConstitution(10);
        toon.setHitPoints(12);
        toon.setCurrentHitPoints(-12);
        boolean expResult = true;
        boolean result = toon.isDead();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getAdjustArmorClass method, of class Toon.
     */
    @Test
    public void testAdjustArmorClass() {
        System.out.print("TESTING getAdjustArmorClass...");
        toon.setDexterity(15);
        int expResult = 1;
        int result = toon.getAdjustArmorClass();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

  
    @Test 
    public void testToonConstructorToon(){
        System.out.print("TESTING toon construtor with toon argument...");
        toon.setWisdom(15);
        Toon toon2 = new Toon(toon);
        int expResult = 15;
        int result = toon2.getWisdom();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
//    /**
//     * Test of addContainer method, of class Toon.
//     */
//    @Test
//    public void testAddContainer() {
//        System.out.println("addContainer");
//        String containerName = "";
//        Toon instance = new Toon();
//        boolean expResult = false;
//        boolean result = instance.addContainer(containerName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of hasContainer method, of class Toon.
//     */
//    @Test
//    public void testHasContainer() {
//        System.out.println("hasContainer");
//        String containerName = "";
//        Toon instance = new Toon();
//        boolean expResult = false;
//        boolean result = instance.hasContainer(containerName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   


    
}
