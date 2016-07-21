/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.item;

import net.danbeach.gaming.constants.ConditionEnum;
import net.danbeach.gaming.constants.GamingColorEnum;
import net.danbeach.gaming.constants.RogueSkillEnum;
import net.danbeach.gaming.constants.item.ItemCategoryEnum;
import net.danbeach.gaming.utility.toon.RogueSkill;
import net.danbeach.gaming.utility.toon.SavingThrow;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author deb
 */
public class ItemTest {

    Item item;

    public ItemTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        item = new Item();
    }

    @After
    public void tearDown() {
    }

    /*
     * Test of getColor method, of class Item.
     */
    @Test
    public void color_Test() {
        System.out.print("TESTING color... ");
        item.setColor(GamingColorEnum.BLACK);
        GamingColorEnum expResult = GamingColorEnum.BLACK;
        GamingColorEnum result = item.getColor();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /*
     * Test of getCondition method, of class Item.
     */
    @Test
    public void condition_Test() {
        System.out.print("TESTING condition... ");
        item.setConditionOf(ConditionEnum.GOOD);
        ConditionEnum expResult = ConditionEnum.GOOD;
        ConditionEnum result = item.getConditionOf();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /*
     * Test of getDescription method, of class Item.
     */
    @Test
    public void description_Test() {
        System.out.print("TESTING description... ");
        item.setDescription("Hello");
        String expResult = "Hello";
        String result = item.getDescription();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /*
     * Test of isEvaluated method, of class Item.
     */
    @Test
    public void evaluated_Test() {
        System.out.print("TESTING evaluated... ");
        item.setEvaluated(true);
        boolean expResult = true;
        boolean result = item.isEvaluated();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    /*
     * Test of getExperienceValue method, of class Item.
     */
    @Test
    public void positiveExperienceValue_Test() {
        System.out.print("TESTING Positive Experience Value... ");
        item.setExperienceValue(1);
        int expResult = 1;
        int result = item.getExperienceValue();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void zeroExperienceValue_Test() {
        System.out.print("TESTING Zero Experience Value... ");
        item.setExperienceValue(0);
        int expResult = 0;
        int result = item.getExperienceValue();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void positiveItemCategory_Test() {
        System.out.print("TESTING Positive Item Category... ");
        item.setItemCategory(ItemCategoryEnum.ARMOR_ITEMS);
        int expResult = ItemCategoryEnum.ARMOR_ITEMS.ordinal();
        int result = item.getItemCategory().ordinal();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }


    @Test
    public void magical_Test() {
        System.out.print("TESTING Magical... ");
        item.setMagical(true);
        boolean expResult = true;
        boolean result = item.isMagical();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void material_Test() {
        System.out.print("TESTING Material... ");
        item.setMaterial("Cotton");
        String expResult = "Cotton";
        String result = item.getMaterial();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void name_Test() {
        System.out.print("TESTING Name... ");
        item.setName("Bob");
        String expResult = "Bob";
        String result = item.getName();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void positiveNumberInStack_Test() {
        System.out.print("TESTING Positive Number In Stack... ");
        item.setNumberInStack(1);
        int expResult = 1;
        int result = item.getNumberInStack();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void zeroNumberInStack_Test() {
        System.out.print("TESTING Zero Number In Stack... ");
        item.setNumberInStack(0);
        int expResult = 0;
        int result = item.getNumberInStack();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void origin_Test() {
        System.out.print("TESTING Origin... ");
        item.setOrigin("Home");
        String expResult = "Home";
        String result = item.getOrigin();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void rogueSkill_Test() {
        System.out.print("TESTING Rogue Skill... ");
        item.setRogueSkill(true);
        boolean expResult = true;
        boolean result = item.isRogueSkill();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void positiveRogueSkillCategory_Test() {
        System.out.print("TESTING Positive Rogue Skill Category... ");
        item.setRogueSkillCategory(RogueSkillEnum.CLIMB_WALLS);
        int expResult = RogueSkill.CLIMBWALL;
        int result = item.getRogueSkillCategory().ordinal();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void zeroRogueSkillCategory_Test() {
        System.out.print("TESTING Zero Rogue Skill Category... ");
        item.setRogueSkillCategory(RogueSkillEnum.APPRAISAL);
        int expResult = RogueSkill.APPRAISAL;
        int result = item.getRogueSkillCategory().ordinal();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void savingThrow_Test() {
        System.out.print("TESTING Saving Throw... ");
        item.setSavingThrow(true);
        boolean expResult = true;
        boolean result = item.isSavingThrow();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void stackable_Test() {
        System.out.print("TESTING Stackable... ");
        item.setStackable(true);
        boolean expResult = true;
        boolean result = item.isStackable();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void positiveValue_Test() {
        System.out.print("TESTING Positive Value... ");
        item.setValueOf(1.0);
        double expResult = 1.0;
        double result = item.getValueOf();
        assertEquals(expResult, result, 0.0);
        System.out.println("Done");
    }

    @Test
    public void zeroValue_Test() {
        System.out.print("TESTING Zero Value... ");
        item.setValueOf(0.0);
        double expResult = 0.0;
        double result = item.getValueOf();
        assertEquals(expResult, result, 0.0);
        System.out.println("Done");
    }

    @Test
    public void positiveVolume_Test() {
        System.out.print("TESTING Positive Volume... ");
        item.setVolume(1.0);
        double expResult = 1.0;
        double result = item.getVolume();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void zeroVolume_Test() {
        System.out.print("TESTING Zero Volume... ");
        item.setVolume(0.0);
        double expResult = 0.0;
        double result = item.getVolume();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void positiveWeight_Test() {
        System.out.print("TESTING Positive Weight... ");
        item.setWeight(1.0);
        double expResult = 1.0;
        double result = item.getWeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void zeroWeight_Test() {
        System.out.print("TESTING Zero Weight... ");
        item.setWeight(0.0);
        double expResult = 0.0;
        double result = item.getWeight();
        assertEquals(expResult, result, 0.0);
        System.out.println("DONE");
    }

    @Test
    public void addStackable_Zero_Args_Test() {
        System.out.print("TESTING add Stackable no args... ");
        item.setStackable(true);
        item.setNumberInStack(1);
        boolean addResult = item.addStackable();
        int expResult = 2;
        int result = item.getNumberInStack();
        assertEquals(expResult, result);
        assertEquals(true, addResult);
        System.out.println("DONE");
    }

    @Test
    public void addStackable_int_Test() {
        System.out.print("TESTING add Stackable int arg... ");
        item.setStackable(true);
        item.setNumberInStack(1);
        boolean addResult = item.addStackable(1);
        int expResult = 2;
        int result = item.getNumberInStack();
        assertEquals(expResult, result);
        assertEquals(true, addResult);
        System.out.println("DONE");
    }

    @Test
    public void removeStackable_0args_Test() {
        System.out.print("TESTING remove Stackable... ");
        item.setStackable(true);
        item.addStackable();
        boolean removeResult = item.removeStackable();
        int result = item.getNumberInStack();
        assertEquals(1, result);
        assertEquals(true, removeResult);
        System.out.println("DONE");
    }

    @Test
    public void removeStackable_int_Test() {
        System.out.print("TESTING remove Stackable int arg");
        int numberFromStack = 2;
        item.setStackable(true);
        item.addStackable(2);
        boolean expResult = true;
        boolean result = item.removeStackable(numberFromStack);
        int intResult = item.getNumberInStack();
        assertEquals(expResult, result);
        assertEquals(1, intResult);
        System.out.println("DONE");
    }

}
