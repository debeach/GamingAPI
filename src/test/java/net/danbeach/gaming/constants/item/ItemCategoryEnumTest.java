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
public class ItemCategoryEnumTest {

    ItemCategoryEnum itemCategoryEnum;

    public ItemCategoryEnumTest() {
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
        ItemCategoryEnum[] result = ItemCategoryEnum.values();
        assertNotNull(result);
        System.out.println("DONE");
    }

    @Test
    public void testValueOf() {
        System.out.print("TESTING valueOf...");
        String name = "ARMOR_ITEMS";
        ItemCategoryEnum expResult = ItemCategoryEnum.ARMOR_ITEMS;
        ItemCategoryEnum result = ItemCategoryEnum.valueOf(name);
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testGetItemCategory() {
        System.out.print("TESTING getItemCategory...");
        int expResult = 1;
        int result = ItemCategoryEnum.ARMOR_ITEMS.getItemCategory();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testGetItemName() {
        System.out.print("TESTING getItemName...");
        String expResult = "Armor";
        String result = ItemCategoryEnum.ARMOR_ITEMS.getItemName();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void testFromString() {
        System.out.print("TESTING fromString...");
        String category = "Armor";
        ItemCategoryEnum result = ItemCategoryEnum.fromString(category);
        assertEquals(ItemCategoryEnum.ARMOR_ITEMS, result);
        System.out.println("DONE");
    }

    @Test
    public void testFromNumber() {
        System.out.print("TSTING fromNumber...");
        int number = 1;
        ItemCategoryEnum result = ItemCategoryEnum.fromNumber(number);
        assertEquals(ItemCategoryEnum.ARMOR_ITEMS, result);
        System.out.println("DONE");
    }

}
