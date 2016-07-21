/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.item;

import net.danbeach.gaming.domain.item.Weapon;
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
public class WeaponTest {

    Weapon weapon;

    public WeaponTest() {
        weapon = new Weapon();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        weapon = new Weapon();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void largeDamage_Test() {
        System.out.print("TESTING Large Damage...");
        weapon.setLargeDamage(10);
        int expResult = 10;
        int result = weapon.getLargeDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void mediumDamage_Test() {
        System.out.print("TESTING Medium Damage...");
        weapon.setMediumDamage(10);
        int expResult = 10;
        int result = weapon.getMediumDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void smallDamage_Test() {
        System.out.print("TESTING Small Damage...");
        weapon.setSmallDamage(10);
        int expResult = 10;
        int result = weapon.getSmallDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void largeExtraDamage_Test() {
        System.out.print("TESTING Large Extra Damage...");
        weapon.setLargeExtraDamage(1);
        int expResult = 1;
        int result = weapon.getLargeExtraDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void mediumExtraDamage_Test() {
        System.out.print("TESTING Medium Extra Damage...");
        weapon.setMediumExtraDamage(1);
        int expResult = 1;
        int result = weapon.getMediumExtraDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void smallExtraDamage_Test() {
        System.out.print("TESTING Small Extra Damage...");
        weapon.setSmallExtraDamage(1);
        int expResult = 1;
        int result = weapon.getSmallExtraDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

    @Test
    public void magicalDamage_Test() {
        System.out.print("TESTING Magical Damage...");
        weapon.setMagicalDamage(1);
        int expResult = 1;
        int result = weapon.getMagicalDamage();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

//    @Test
//    public void weaponSize_Test() {
//        System.out.print("TESTING Weapon size...");
//        String expResult = "M";
//        weapon.setWeaponSize(expResult);
//        String result = weapon.getWeaponSize();
//        assertEquals(expResult, result);
//        System.out.println("DONE");
//    }

    @Test
    public void weaponSpeed_Test() {
        System.out.print("TESTING Weapon Speed...");
        int expResult = 5;
        weapon.setWeaponSpeed(expResult);
        int result = weapon.getWeaponSpeed();
        assertEquals(expResult, result);
        System.out.println("DONE");
    }

//    @Test
//    public void weaponType_Test() {
//        System.out.print("TESTING Weapon Type...");
//        String expResult = "S";
//        weapon.setWeaponType(expResult);
//        String result = weapon.getWeaponType();
//        assertEquals(expResult, result);
//        System.out.println("DONE");
//    }

}
