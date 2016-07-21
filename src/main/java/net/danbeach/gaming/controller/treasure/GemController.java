/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.controller.treasure;

import java.util.ArrayList;
import java.util.Random;
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.treasure.GemTypeEnum;
import net.danbeach.gaming.constants.treasure.TreasureTypeEnum;
import net.danbeach.gaming.domain.treasure.Gem;
import net.danbeach.gaming.domain.treasure.Treasure;

/**
 *
 * @author deb
 */
public class GemController {
    private Random random = new Random();
    
    public ArrayList<Gem> generateGems(Treasure treasure, TreasureTypeEnum tt){
        // does treasureType have gems
        ArrayList<Gem> gems = new ArrayList<Gem>();
        
        if(hasGem(tt)){
            int gemPercent = random.nextInt(100) + 1;
            if(gemPercent <= tt.getGemPercent()){
                int numberOfGems = random.nextInt(tt.getGem()) + 1;
                for(int index = 0; index < numberOfGems; index++){
                    int gemFreq = random.nextInt(100) + 1;
                    FrequencyEnum frequency = FrequencyEnum.fromPercent(gemFreq);
                    
                    switch(frequency){
                        case COMMON:
                             gems.add(getCommonGem());
                            break;
                        case UNCOMMON:
                            gems.add(getUncommonGem());
                            break;
                        case RARE:
                            gems.add(getRareGem());
                            break;
                        case VERY_RARE:
                            gems.add(getVeryRareGem());
                            break;
                        default:
                    }
                }// end for loop
            }// inner if
        }// outer if
     
        return gems;
    }// end generateGems()
    
    private Gem getCommonGem(){
        String name = "Common Stone Ornamental";
        Gem gem = new Gem(name, GemTypeEnum.ORNAMENTAL_STONE);
        return gem;
    }
    
    private Gem getRareGem(){
        String name = null;
        Gem gem = null;
        int gemFreq = random.nextInt(100);
        if(gemFreq < 70){
            name = "Rare Stone Precious";
            gem = new Gem(name, GemTypeEnum.PRECIOUS_STONE);
        }
        else{
            name = "Rare Stone Gem";
            gem = new Gem(name,GemTypeEnum.GEM);
        }
        return gem;
    }
    
    private Gem getUncommonGem(){
        String name = null;
        Gem gem = null;
        int gemFreq = random.nextInt(100);
        if(gemFreq < 70){
            name = "Uncommon Stone Semi Precious";
            gem = new Gem(name, GemTypeEnum.SEMI_PRECIOUS_STONE);
        }
        else{
            name = "Uncommon Stone Fancy";
            gem = new Gem(name, GemTypeEnum.FANCY_STONE);
        }
        return gem;
    }
    
    private Gem getVeryRareGem(){
        String name = "Very Rare Jewel";
        Gem gem = new Gem(name, GemTypeEnum.JEWEL);
        return gem;
    }
    
    private boolean hasGem(TreasureTypeEnum tt){
        return (tt.getGemPercent() > 0);
    }
}
