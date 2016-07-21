/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.toon;

import net.danbeach.gaming.domain.toon.Fighter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;

/**
 *
 * @author deb
 */
@Category(ToonCategory.class)
public class FighterTest {
    
    Fighter fighter;
    public FighterTest() {
        fighter = new Fighter();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fighter = new Fighter();
    }
    
    @After
    public void tearDown() {
    }

   @Test
   public void testFighterConstructorFighter(){
       System.out.print("TESTING fighter constructor with fighter argument...");
       fighter.setWisdom(15);
       Fighter fighter2 = new Fighter(fighter);
       int expResult = 15;
       int result = fighter2.getWisdom();
       assertEquals(expResult, result);
       System.out.println("DONE");
   }
}
