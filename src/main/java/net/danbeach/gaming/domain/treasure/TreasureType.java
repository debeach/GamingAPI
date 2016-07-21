/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.treasure;

/**
 *
 * @author deb
 */
public class TreasureType {
    
    private int art;
    private int artPercent;
    private int copper;
    private int copperPercent;
    private int electrum;
    private int electrumPercent;
    private int gem;
    private int gemPercent;
    private int gold;
    private int goldPercent;
    private int magical;
    private int magicalPercent;
    private int magicalArmor;
    private int magicalArmorPercent;
    private int magicalWeapon;
    private int magicalWeaponPercent;
    private int platinum;
    private int platinumPercent;
    private int potion;
    private int potionPercent;
    private int scroll;
    private int scrollPercent;
    private int silver;
    private int silverPercent;
    private int trinket;
    private int trinketPercent;
    
    private TreasureType(){ super();}
    
    public TreasureType(int copper, int copperPercent,
            int silver, int silverPercent, 
            int electrum, int electrumPercent,
            int gold, int goldPercent,
            int platinum, int platinumPercent,
            int gem, int gemPercent,
            int art, int artPercent,
            int trinket, int trinketPercent,
            int magical, int magicalPercent,
            int magicalArmor, int magicalArmorPercent,
            int magicalWeapon, int magicalWeaponPercent,
            int potion, int potionPercent,
            int scroll, int scrollPercent){
        this();
        this.copper                 = copper;
        this.copperPercent          = copperPercent;
        this.silver                 = silver;
        this.silverPercent          = silverPercent;
        this.electrum               = electrum;
        this.electrumPercent        = electrumPercent;
        this.gold                   = gold;
        this.goldPercent            = goldPercent;
        this.platinum               = platinum;
        this.platinumPercent        = platinumPercent;
        this.gem                    = gem;
        this.gemPercent             = gemPercent;
        this.art                    = art;
        this.artPercent             = artPercent;
        this.trinket                = trinket;
        this.trinketPercent         = trinketPercent;
        this.magical                = magical;
        this.magicalPercent         = magicalPercent;
        this.magicalArmor           = magicalArmor;
        this.magicalArmorPercent    = magicalArmorPercent;
        this.magicalWeapon          = magicalWeapon;
        this.magicalWeaponPercent   = magicalWeaponPercent;
        this.potion                 = potion;
        this.potionPercent          = potionPercent;
        this.scroll                 = scroll;
        this.scrollPercent          = scrollPercent;
    }

    public int getArt() {
        return art;
    }

    public int getArtPercent() {
        return artPercent;
    }

    public int getCopper() {
        return copper;
    }

    public int getCopperPercent() {
        return copperPercent;
    }

    public int getElectrum() {
        return electrum;
    }

    public int getElectrumPercent() {
        return electrumPercent;
    }

    public int getGem() {
        return gem;
    }

    public int getGemPercent() {
        return gemPercent;
    }

    public int getGold() {
        return gold;
    }

    public int getGoldPercent() {
        return goldPercent;
    }

    public int getMagical() {
        return magical;
    }

    public int getMagicalPercent() {
        return magicalPercent;
    }

    public int getMagicalArmor() {
        return magicalArmor;
    }

    public int getMagicalArmorPercent() {
        return magicalArmorPercent;
    }

    public int getMagicalWeapon() {
        return magicalWeapon;
    }

    public int getMagicalWeaponPercent() {
        return magicalWeaponPercent;
    }

    public int getPlatinum() {
        return platinum;
    }

    public int getPlatinumPercent() {
        return platinumPercent;
    }

    public int getPotion() {
        return potion;
    }

    public int getPotionPercent() {
        return potionPercent;
    }

    public int getScroll() {
        return scroll;
    }

    public int getScrollPercent() {
        return scrollPercent;
    }

    public int getSilver() {
        return silver;
    }

    public int getSilverPercent() {
        return silverPercent;
    }

    public int getTrinket() {
        return trinket;
    }

    public int getTrinketPercent() {
        return trinketPercent;
    }
            
    
}
