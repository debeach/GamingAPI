/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.controller.treasure;

import java.util.HashMap;
import net.danbeach.gaming.domain.treasure.Treasure;
import net.danbeach.gaming.domain.treasure.TreasureType;

/**
 *
 * @author deb
 */
public class TreasureTypeController {
    HashMap<String, TreasureType> treasureTypeTable;
    Treasure treasure;
    
    public TreasureTypeController(){
        treasure = new Treasure();
        
        // create and build treasure type table.
        treasureTypeTable = new HashMap<String, TreasureType>();
        treasureTypeTable.put("A", new TreasureType(3000,25,2000,30,1000,35,6000,40,1800,35,40,60,12,50,10,50,3,30,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("B", new TreasureType(6000,50,3000,25,1500,25,2000,25,1000,25,8,30,4,20,3,15,0,0,1,10,1,10,0,0,0,0));
        treasureTypeTable.put("C", new TreasureType(10000,20,6000,30,3000,20,0,0,600,10,6,25,3,30,2,15,2,10,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("D", new TreasureType(6000,10,10000,15,5000,15,3000,50,600,15,10,30,6,25,4,20,2,15,0,0,0,0,1,15,0,0));
        treasureTypeTable.put("E", new TreasureType(6000,5,10000,25,5000,20,4000,25,1800,25,12,15,6,10,4,10,3,25,0,0,0,0,0,0,1,25));
        treasureTypeTable.put("F", new TreasureType(0,0,18000,10,8000,10,6000,40,4000,15,20,20,8,10,4,10,5,30,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("G", new TreasureType(0,0,0,0,0,0,20000,50,10000,50,18,30,6,25,4,20,5,35,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("H", new TreasureType(18000,25,20000,40,20000,40,20000,55,8000,40,30,50,20,50,20,40,6,15,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("I", new TreasureType(0,0,0,0,0,0,0,0,600,30,12,55,8,50,6,40,1,15,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("J", new TreasureType(24,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("K", new TreasureType(0,0,18,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("L", new TreasureType(0,0,0,0,0,0,0,0,12,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("M", new TreasureType(0,0,0,0,0,0,8,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("N", new TreasureType(0,0,0,0,0,0,0,0,6,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("O", new TreasureType(40,100,30,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("P", new TreasureType(0,0,60,100,0,0,0,0,20,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("Q", new TreasureType(0,0,0,0,0,0,0,0,0,0,4,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("R", new TreasureType(0,0,0,0,10,100,20,100,60,100,8,100,3,100,3,100,0,0,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("S", new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,100,0,0));
        treasureTypeTable.put("T", new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,100));
        treasureTypeTable.put("U", new TreasureType(0,0,0,0,0,0,0,0,0,0,16,90,6,80,5,80,1,70,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("V", new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,100,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("W", new TreasureType(0,0,0,0,0,0,30,100,8,100,16,60,8,50,8,50,2,60,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("X", new TreasureType(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,100,0,0));
        treasureTypeTable.put("Y", new TreasureType(0,0,0,0,0,0,1200,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
        treasureTypeTable.put("Z", new TreasureType(300,100,400,100,300,100,600,100,400,100,6,55,12,50,10,40,3,50,0,0,0,0,0,0,0,0));
    }
    
    public Treasure generateTreasureType(String tt){
        if(isCopper(tt)){
            
        }
        return treasure;
    }
    
    private boolean isArt(String tt){
        return (treasureTypeTable.get(tt).getArt() > 0);
    }
    
    private boolean isCopper(String tt){
        return (treasureTypeTable.get(tt).getCopper() > 0);
    }
    
    private boolean isElectrum(String tt){
        return (treasureTypeTable.get(tt).getElectrum() > 0);
    }
    
    private boolean isGem(String tt){
        return (treasureTypeTable.get(tt).getGem() > 0);
    }
    
    private boolean isGold(String tt){
        return (treasureTypeTable.get(tt).getGold() > 0);
    }
    
    private boolean isMagical(String tt){
        return (treasureTypeTable.get(tt).getMagical() > 0);
    }
    
    private boolean isMagicalArmor(String tt){
        return (treasureTypeTable.get(tt).getMagicalArmor() > 0);
    }
    
    private boolean isMagicalWeapon(String tt){
        return (treasureTypeTable.get(tt).getMagicalWeapon() > 0);
    }
    
    private boolean isPlatinum(String tt){
        return (treasureTypeTable.get(tt).getPlatinum() > 0);
    }
    
    private boolean isPotion(String tt){
        return (treasureTypeTable.get(tt).getPotion() > 0);
    }
    
    private boolean isScroll(String tt){
        return (treasureTypeTable.get(tt).getScroll() > 0);
    }
    
    private boolean isSilver(String tt){
        return (treasureTypeTable.get(tt).getSilver() > 0);
    }
    
    private boolean isTrinket(String tt){
        return (treasureTypeTable.get(tt).getTrinket() > 0);
    }
}
