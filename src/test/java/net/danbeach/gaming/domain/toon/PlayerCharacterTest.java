/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.toon;

import net.danbeach.gaming.domain.toon.PlayerCharacter;
import java.util.ArrayList;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;

/**
 * The @Category can be at class level or method level.
 * @author deb
 */
@Category(ToonCategory.class)
public class PlayerCharacterTest {
    PlayerCharacter pc;
    public PlayerCharacterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pc = new PlayerCharacter();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testPlayerCharacterConstructorPlayerCharacter(){
        System.out.print("TESTING player character constructor player character...");
        pc.setWisdom(15);
        PlayerCharacter player = new PlayerCharacter(pc);
        int expResult = 15;
        int result = player.getWisdom();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getActualWeight method, of class PlayerCharacter.
     */
    @Test
    public void testActualWeight() {
        System.out.print("TESTING Actual Weight...");
        pc.setActualWeight(10.0);
        double expResult = 10.0;
        double result = pc.getActualWeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    @Test
    public void testActualWeightNegativeValue(){
        System.out.print("TESTING Actual Weight Negative Value...");
        pc.setActualWeight(-10.0);
        double expResult = 0.0;
        double result = pc.getActualWeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    /**
     * Test of getAreasVisited method, of class PlayerCharacter.
     */
    @Test
    public void testGetAreasVisited() {
        System.out.print("TESTING Areas Visited...");
        TreeSet<String> temp = pc.getAreasVisited();
        temp.add("Berwick");
        String expResult = "Berwick";
        String result = pc.getAreasVisited().first();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getCurrentHitPoints method, of class PlayerCharacter.
     */
//    @Test
//    public void testCurrentHitPoints() {
//        System.out.print("TESTING Current Hit Points...");
//        pc.setCurrentHitPoints(10);
//        int expResult = 10;
//        int result = pc.getCurrentHitPoints();
//        assertEquals(expResult, result);
//        System.out.println("DONE");
//    }
//    
//    @Test
//    public void testCurrentHitPointsNegativeValue(){
//        System.out.print("TESTING Current Hit Points Negative Value...");
//        pc.setCurrentHitPoints(-10);
//        int expResult = -10;
//        int result = pc.getCurrentHitPoints();
//        assertEquals(expResult, result);
//        System.out.println("DONE");
//    }

    /**
     * Test of getEncumber method, of class PlayerCharacter.
     */
    @Test
    public void testEncumber() {
        System.out.print("TESTING Encumber...");
        pc.setEncumber(1.0);
        double expResult = 1.0;
        double result = pc.getEncumber();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    @Test
    public void testEncumberNegativeValue() {
        System.out.print("TESTING Encumber Negative Value...");
        pc.setEncumber(-1.0);
        double expResult = 0.0;
        double result = pc.getEncumber();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    /**
     * Test of getExperiencePoints method, of class PlayerCharacter.
     */
    @Test
    public void testExperiencePoints() {
        System.out.print("TESTING Experience Points...");
        pc.setExperiencePoints(10);
        int expResult = 10;
        int result = pc.getExperiencePoints();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testExperiencePointsNegativeValue() {
        System.out.print("TESTING Experience Points Negative Value...");
        pc.setExperiencePoints(-10);
        int expResult = 0;
        int result = pc.getExperiencePoints();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getInfamy method, of class PlayerCharacter.
     */
    @Test
    public void testInfamy() {
        System.out.print("TESTING Infamy...");
        pc.setInfamy(10.0);
        double expResult = 10.0;
        double result = pc.getInfamy();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void testInfamyNegativeValue() {
        System.out.print("TESTING Infamy Negative Value...");
        pc.setInfamy(-10.0);
        double expResult = 0.0;
        double result = pc.getInfamy();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    /**
     * Test of getNotes method, of class PlayerCharacter.
     */
    @Test
    public void testNotes() {
        System.out.print("TESTING Notes...");
        ArrayList<String> temp = pc.getNotes();
        temp.add("NOTE");
        String expResult = "NOTE";
        String result = pc.getNotes().get(0);
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getPartyAdventure method, of class PlayerCharacter.
     */
    @Test
    public void testPartyAdventure() {
        System.out.print("TESTING Party Adventure...");
        TreeSet<String> temp = pc.getPartyAdventure();
        temp.add("Night Crawlers from Hell");
        String expResult = "Night Crawlers from Hell";
        String result = pc.getPartyAdventure().first();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getPcsMet method, of class PlayerCharacter.
     */
    @Test
    public void testPcsMet() {
        System.out.print("TESTING Pcs Met...");
        TreeSet<String> temp = pc.getPcsMet();
        temp.add("bob");
        String expResult = "bob";
        String result = pc.getPcsMet().first();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getReputation method, of class PlayerCharacter.
     */
    @Test
    public void testReputation() {
        System.out.print("TESTING Reputation...");
        pc.setReputation(10.0);
        double expResult = 10.0;
        double result = pc.getReputation();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }
    
    @Test
    public void testReputationNegativeValue() {
        System.out.print("TESTING Reputation Negative Value...");
        pc.setReputation(-10.0);
        double expResult = 0.0;
        double result = pc.getReputation();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

   


 
   
    
}
