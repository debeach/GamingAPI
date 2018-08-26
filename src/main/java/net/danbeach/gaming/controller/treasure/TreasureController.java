/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.controller.treasure;

import java.util.ArrayList;
import net.danbeach.gaming.controller.item.ArmorController;
import net.danbeach.gaming.domain.item.Armor;
import net.danbeach.gaming.constants.treasure.TreasureTypeEnum;
import net.danbeach.gaming.domain.treasure.Gem;
import net.danbeach.gaming.domain.treasure.Jewelry;
import net.danbeach.gaming.domain.treasure.Treasure;

/**
 *
 * @author deb
 */
public class TreasureController {
    
    private CoinTreasureController      coinController;
    private GemController       gemController;
    private JewelryController   jewelryController;
    private ArmorController     armorController;
    
    public TreasureController(){
        coinController      = new CoinTreasureController();
        gemController       = new GemController();
        jewelryController   = new JewelryController();
        armorController     = new ArmorController();
    }
    
    /**
     * Generates a treasure according to the treasure type provided.
     * @param treasureType the treasure type used in treasure generation.
     * @return the resulting treasure.
     */
    public Treasure generateTreasure(TreasureTypeEnum treasureType){
        Treasure treasure = new Treasure();
        treasure.setCoin(coinController.generateCoins(treasureType));
        treasure.setGem(gemController.generateGems(treasure, treasureType));
        treasure.setJewelry(jewelryController.generateJewelry(treasureType));
        treasure.setMagicalArmor(armorController.generateMagicArmor(treasureType));
        return treasure;
    }
    
    private boolean hasArt(TreasureTypeEnum tt){
        return (tt.getArtPercent() > 0);
    }
    
    private boolean hasCopper(TreasureTypeEnum tt){
        return (tt.getCopperPercent() > 0);
    }
    
    private boolean hasElectrum(TreasureTypeEnum tt){
        return (tt.getElectrumPercent() > 0);
    }
    
    private boolean hasGem(TreasureTypeEnum tt){
        return (tt.getGemPercent() > 0);
    }
    
    private boolean hasGold(TreasureTypeEnum tt){
        return (tt.getGoldPercent() > 0);
    }
    
    private boolean hasMagical(TreasureTypeEnum tt){
        return (tt.getMagicalPercent() > 0);
    }
    
    private boolean hasMagicalArmor(TreasureTypeEnum tt){
        return (tt.getMagicalArmorPercent() > 0);
    }
    
    private boolean hasMagicalWeapon(TreasureTypeEnum tt){
        return (tt.getMagicalWeaponPercent() > 0);
    }
    
    private boolean hasPlatinum(TreasureTypeEnum tt){
        return (tt.getPlatinumPercent() > 0);
    }
    
    private boolean hasPotion(TreasureTypeEnum tt){
        return (tt.getPotionPercent() > 0);
    }
    
    private boolean hasScroll(TreasureTypeEnum tt){
        return (tt.getScrollPercent() > 0);
    }
    
    private boolean hasSilver(TreasureTypeEnum tt){
        return (tt.getSilverPercent() > 0);
    }
    
    private boolean hasTrinket(TreasureTypeEnum tt){
        return (tt.getTrinketPercent() > 0);
    }
    
    public static void main(String[] args){
        TreasureController controller = new TreasureController();
        TreasureTypeEnum tt = TreasureTypeEnum.B;
        Treasure treasure = new Treasure();
        
        treasure = controller.generateTreasure(tt);
        
        // COINS
        System.out.println("Copper: " + treasure.getCopper());
        System.out.println("Silver: " + treasure.getSilver());
        System.out.println("Electrum: " + treasure.getElectrum());
        System.out.println("Gold: " + treasure.getGold());
        System.out.println("Platinum: " + treasure.getPlatinum());
        
        // GEMS
        ArrayList<Gem> gems = treasure.getGem();
        if(gems == null){
            System.out.println("No Gems in Treasure -- null");
        }
        else if(gems.size() == 0){
            System.out.println("No Gems in Treasure -- gems is size 0");
        }
        else{
            System.out.println("GEMS:");
            for(int index = 0; index < gems.size(); index++){
                System.out.print("\t" + (index + 1) + ": ");
//                System.out.print(gems.get(index).getName() + " ");
//                System.out.print(gems.get(index).getBaseValue() + " ");
                System.out.println(gems.get(index).getBaseTypeName());
            }// end for
        }// end if/else
        
        // JEWELRY
        ArrayList<Jewelry> jewelry = treasure.getJewelry();
        if(jewelry == null){
            System.out.println("No Jewelry in Treasure -- null");
        }
        else if(jewelry.size() == 0){
            System.out.println("No Jewelry in Treasure -- Jewelry is size 0");
        }
        else{
            System.out.println("JEWELRY:");
            for(int index = 0; index < jewelry.size(); index++){
                System.out.print("\t" + (index + 1) + ": ");
                System.out.print(jewelry.get(index).getName() + " ");
                System.out.print(jewelry.get(index).getBaseValue() + " ");
                System.out.println(jewelry.get(index).getJewelryName());
            }
        }
        
        // MAGICAL ARMOR
        ArrayList<Armor> armor = treasure.getMagicalArmor();
        if(armor == null){
            System.out.println("No Magical Armor in Treasure -- null");
        }
        else if(armor.size() == 0){
            System.out.println("No Magical Armor in Treasure -- null");
        }else{
            System.out.println("MAGICAL ARMOR");
            for(int index = 0; index < armor.size(); index++){
                System.out.print("\t" + (index + 1) + ": ");
                System.out.print(armor.get(index).getName() + " ");
                int bonus = armor.get(index).getMagicDefense();
                if(bonus >= 0){  
                    System.out.print("+");
                }
                System.out.print(armor.get(index).getMagicDefense() );
                System.out.print(" Armor Class: " + armor.get(index).getDefenseValue());
                System.out.println(" Total Armor Class: " + (armor.get(index).getDefenseValue() + armor.get(index).getMagicDefense()));
            }
        }
        
    }// end main
}
