/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.treasure;

import net.danbeach.gaming.constants.BaseColorEnum;
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.domain.treasure.Gem;
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
public class GemTest {

    private static Gem twoArgGem;
    private static Gem defaultGem;
    private static Gem gemObject;
    private static String gemName = "Ruby";
    private static String gemColor = "Speckled";
    
    @BeforeClass
    public static void setUpClass() {
        String name = "Ruby";
        GemTypeEnum gemType = GemTypeEnum.PRECIOUS_STONE;
        
        Gem gem = new Gem();
        gem.setBaseColor(BaseColorEnum.NONE);
        gem.setBaseValue(GemTypeEnum.PRECIOUS_STONE.getBaseValue());
        gem.setDeleted(null);
        gem.setDescription("gem");
        gem.setFrequency(FrequencyEnum.COMMON);
        gem.setGemColor(gemColor);
//        gem.setGemType(GemTypeEnum.FANCY_STONE);
        gem.setName("Gem");
        gem.setWeight(1.0);
        
        twoArgGem = new Gem(gemName, gemType);
        defaultGem = new Gem();
        gemObject = new Gem(gem);
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
    public void defaultConstructor_Test(){
        String expected = "gem";
        assertEquals(expected, defaultGem.getDescription() );
    }
    
    @Test
    public void twoArgConstructor_Test(){
        assertEquals(gemName, twoArgGem.getName());
    }
    
    @Test
    public void gemObject_Test(){
        assertEquals(gemColor, gemObject.getGemColor());
    }
   
}
