/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.controller.treasure;

import java.util.Random;
import net.danbeach.gaming.constants.treasure.TreasureTypeEnum;
import net.danbeach.gaming.domain.treasure.Coin;
import net.danbeach.gaming.domain.treasure.Treasure;

/**
 *
 * @author deb
 */
public class CoinTreasureController {

    Random random = new Random();
    
    public CoinTreasureController(){}
    
    /**
     * Generates each type of coin for a given treasure type.
     * @param treasure the object that will hold the resulting coins
     * @param tt the treasure type used in the coin generation.
     */
    public Coin generateCoins(TreasureTypeEnum tt){
        int randomNum;
        Coin coin = new Coin(0,0,0,0,0);
        
        if(hasCopper(tt)){
            randomNum = (random.nextInt(100) + 1);
            if( randomNum <= tt.getCopperPercent()){
                coin.setCopper(random.nextInt(tt.getCopper()) + 1);
            }  
        }
        if(hasSilver(tt)){
            randomNum = (random.nextInt(100) + 1);
            if(randomNum <= tt.getSilverPercent()){
                coin.setSilver(random.nextInt(tt.getSilver()) + 1);
            }
        }
        if(hasElectrum(tt)){
            randomNum = (random.nextInt(100) + 1);
            if(randomNum <= tt.getElectrumPercent()){
                coin.setElectrum(random.nextInt(tt.getElectrum()) + 1);
            }
        }
        if(hasGold(tt)){
            randomNum = (random.nextInt(100) + 1);
            if(randomNum <= tt.getGoldPercent()){
                coin.setGold(random.nextInt(tt.getGold()) + 1);
            }
        }
        if(hasPlatinum(tt)){
            randomNum = (random.nextInt(100) + 1);
            if(randomNum <= tt.getPlatinumPercent()){
                coin.setPlatinum(random.nextInt(tt.getPlatinum()) + 1);
            }
        }
        return coin;
    }// end of generateCoins
    
    private boolean hasCopper(TreasureTypeEnum tt){
        return (tt.getCopperPercent() > 0);
    }
    
    private boolean hasElectrum(TreasureTypeEnum tt){
        return (tt.getElectrumPercent() > 0);
    }
    
    private boolean hasGold(TreasureTypeEnum tt){
        return (tt.getGoldPercent() > 0);
    }
    
    private boolean hasPlatinum(TreasureTypeEnum tt){
        return (tt.getPlatinumPercent() > 0);
    }
    
    private boolean hasSilver(TreasureTypeEnum tt){
        return (tt.getSilverPercent() > 0);
    }
}
