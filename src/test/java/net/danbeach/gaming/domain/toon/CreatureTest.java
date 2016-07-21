/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.toon;

import net.danbeach.gaming.domain.toon.Creature;
import net.danbeach.gaming.constants.toon.ClimateTerrainEnum;
import net.danbeach.gaming.constants.FrequencyEnum;
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
public class CreatureTest {
    Creature creature;
    public CreatureTest() {
        creature = new Creature();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        creature = new Creature();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getActivity method, of class Creature.
     */
    @Test
    public void testActivity() {
        System.out.print("TESTING Activity...");
        creature.setActivity("activity");
        String expResult = "activity";
        String result = creature.getActivity();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

   

    /**
     * Test of getClimate method, of class Creature.
     */
    @Test
    public void testClimate() {
        System.out.print("TESTING Climate...");
        creature.setClimateId(1);
        
        int expResult = 1;
        int result = creature.getClimateId();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    
    /**
     * Test of getCombat method, of class Creature.
     */
    @Test
    public void testCombatDescription() {
        System.out.print("TESTING Combat...");
        creature.setCombatDescription("combat");
        String expResult = "combat";
        String result = creature.getCombatDescription();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

   
    /**
     * Test of getDamagePerAttack method, of class Creature.
     */
    @Test
    public void testDamagePerAttack() {
        System.out.print("TESTING Damage Per Attack...");
        int[] damage = new int[3];
        damage[0] = 3;
        damage[1] = 3;
        damage[2] = 3;
        creature.setDamagePerAttack(damage);
        int expResult = 3;
        int result = creature.getDamagePerAttack()[0];
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    
    /**
     * Test of getDescription method, of class Creature.
     */
    @Test
    public void testDescription() {
        System.out.print("TESTING Description...");
        creature.setDescription("description");
        String expResult = "description";
        String result = creature.getDescription();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /**
     * Test of getDiet method, of class Creature.
     */
    @Test
    public void testDiet() {
        System.out.print("TESTING Diet...");
        creature.setDiet("diet");
        String expResult = "diet";
        String result = creature.getDiet();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


    /**
     * Test of getEcology method, of class Creature.
     */
    @Test
    public void testEcology() {
        System.out.print("TESTING Ecology...");
        creature.setEcology("ecology");
        String expResult = "ecology";
        String result = creature.getEcology();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


    /**
     * Test of getFrequency method, of class Creature.
     */
    @Test
    public void testFrequency() {
        System.out.print("TESTING Frequency...");
        creature.setFrequency(FrequencyEnum.COMMON);
        FrequencyEnum expResult = FrequencyEnum.COMMON;
        FrequencyEnum result = creature.getFrequency();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


    /**
     * Test of getIndividualTreasureType method, of class Creature.
     */
    @Test
    public void testGetIndividualTreasureType() {
        System.out.print("TESTING Individual Treasure Type...");
        String[] tt = new String[2];
        tt[0] = "A";
        tt[1] = "B";
        creature.setIndividualTreasureType(tt);
        String expResult = "A";
        String result = creature.getIndividualTreasureType()[0];
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

   
    /**
     * Test of getLairTreasureType method, of class Creature.
     */
    @Test
    public void testGetLairTreasureType() {
        System.out.print("TESTING Lair Treasure Type...");
        String[] tt = new String[2];
        tt[0] = "A";
        tt[1] = "B";
        creature.setLairTreasureType(tt);
        String expResult = "A";
        String result = creature.getLairTreasureType()[0];
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

   
    /**
     * Test of getMagicResistance method, of class Creature.
     */
    @Test
    public void testMagicResistance() {
        System.out.print("TESTING Magic Resistance...");
        creature.setMagicResistance(10);
        int expResult = 10;
        int result = creature.getMagicResistance();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testMagicResistanceNegativeValue() {
        System.out.print("TESTING Magic Resistance negative value...");
        creature.setMagicResistance(-10);
        int expResult = 0;
        int result = creature.getMagicResistance();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    

    /**
     * Test of getMorale method, of class Creature.
     */
    @Test
    public void testMorale() {
        System.out.print("TESTING Morale...");
        creature.setMorale(10);
        int expResult = 10;
        int result = creature.getMorale();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testMoraleNegativeValue() {
        System.out.print("TESTING Morale negative value...");
        creature.setMorale(-10);
        int expResult = 0;
        int result = creature.getMorale();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testGetName(){
        System.out.print("TESTING name...");
        creature.setName("Bob");
        String expResult = "Bob";
        String result = creature.getName();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    /**
     * Test of getNumberAppearing method, of class Creature.
     */
    @Test
    public void testNumberAppearing() {
        System.out.print("TESTING Number Appearing...");
        creature.setNumberAppearing(10);
        int expResult = 10;
        int result = creature.getNumberAppearing();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testNumberAppearingNegativeValue() {
        System.out.print("TESTING Number Appearing Negative Value...");
        creature.setNumberAppearing(-10);
        int expResult = 1;
        int result = creature.getNumberAppearing();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    

    /**
     * Test of getNumberInLair method, of class Creature.
     */
    @Test
    public void testNumberInLair() {
        System.out.print("TESTING Number In Lair...");
        creature.setNumberInLair(10);
        int expResult = 10;
        int result = creature.getNumberInLair();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    
    @Test
    public void testNumberInLairNegativeValue() {
        System.out.print("TESTING Number In Lair Negative Value...");
        creature.setNumberInLair(-10);
        int expResult = 1;
        int result = creature.getNumberInLair();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


    /**
     * Test of getNumberOfAttacks method, of class Creature.
     */
    @Test
    public void testNumberOfAttacks() {
        System.out.print("TESTING Number Of Attacks...");
        creature.setNumberOfAttacks(10);
        int expResult = 10;
        int result = creature.getNumberOfAttacks();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testNumberOfAttacksNegativeValue() {
        System.out.print("TESTING Number Of Attacks Negative Value...");
        creature.setNumberOfAttacks(-10);
        int expResult = 1;
        int result = creature.getNumberOfAttacks();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }
    

    /**
     * Test of getOrganization method, of class Creature.
     */
    @Test
    public void testOrganization() {
        System.out.print("TESTING Organization...");
        creature.setOrganization("organization");
        String expResult = "organization";
        String result = creature.getOrganization();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


    /**
     * Test of getSize method, of class Creature.
     */
    @Test
    public void testSize() {
        System.out.print("TESTING Size...");
        creature.setSize("lg");
        String expResult = "lg";
        String result = creature.getSize();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


    /**
     * Test of getSociety method, of class Creature.
     */
    @Test
    public void testSociety() {
        System.out.print("TESTING Society...");
        creature.setSociety("society");
        String expResult = "society";
        String result = creature.getSociety();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


    /**
     * Test of getSpecialAttack method, of class Creature.
     */
    @Test
    public void testSpecialAttack() {
        System.out.print("TESTING Special Attack...");
        String[] attack = new String[2];
        attack[0] = "Immune";
        attack[1] = "Resist";
        creature.setSpecialAttack(attack);
        String expResult = "Resist";
        String result = creature.getSpecialAttack()[1];
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


    /**
     * Test of getSpecialDefense method, of class Creature.
     */
    @Test
    public void testSpecialDefense() {
        System.out.print("TESTING Special Defense...");
        String[] defense = new String[2];
        defense[0] = "Armor";
        defense[1] = "Special";
        creature.setSpecialDefense(defense);
        String expResult = "Special";
        String result = creature.getSpecialDefense()[1];
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


   
}
