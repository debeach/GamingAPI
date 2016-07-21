/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.controller.treasure;

import net.danbeach.gaming.controller.treasure.CoinTreasureController;
import net.danbeach.gaming.constants.treasure.TreasureTypeEnum;
import net.danbeach.gaming.domain.treasure.Coin;
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
public class CoinTreasureControllerTest {
    CoinTreasureController coinController;
    
    public CoinTreasureControllerTest() {
        coinController = new CoinTreasureController();
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

    /*
     * Test of generateCoins method, of class CoinTreasureController.
     */
    @Test
    public void generateCoins_Test() {
        System.out.print("TESTING generateCoins...");
        TreasureTypeEnum tt = TreasureTypeEnum.A;
        Coin result = coinController.generateCoins(tt);
        assertNotNull(result);
        System.out.println("DONE");
    }
    
}
