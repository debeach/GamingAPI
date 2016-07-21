/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.item;

import net.danbeach.gaming.domain.item.Armor;
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
public class ArmorTest {

    Armor armor;

    public ArmorTest() {
        armor = new Armor();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        armor = new Armor();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void defenseValue_Test() {
        System.out.print("TESTING Defense Value...");
        armor.setDefenseValue(1);
        int expResult = 1;
        int result = armor.getDefenseValue();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void magicDefense_Test() {
        System.out.print("TESTING Magic Defense...");
        armor.setMagicDefense(1);
        int expResult = 1;
        int result = armor.getMagicDefense();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

}
