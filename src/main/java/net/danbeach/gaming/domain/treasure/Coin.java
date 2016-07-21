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
public class Coin {
    public static final int PLATINUM 	= 0;
    public static final int GOLD	= 1;
    public static final int SILVER	= 2;
    public static final int COPPER	= 3;
    public static final int ELECTRUM    = 4;

    public static final int NUMBER_OF_COIN_TYPES    = 5;
    
    // how many coins for each copper
    public static final double COPPER_TO_SILVER     = 0.1;
    public static final double COPPER_TO_ELECTRUM   = 0.02;
    public static final double COPPER_TO_GOLD       = 0.01;
    public static final double COPPER_TO_PLATINUM   = 0.001;

    // how many coins for each electrum piece
    public static final int ELECTRUM_TO_COPPER      = 50;
    public static final int ELECTRUM_TO_SILVER      = 2;
    public static final double ELECTRUM_TO_GOLD     = 0.2;
    public static final double ELECTRUM_TO_PLATINUM = 0.02;

    // how many coins for each silver
    public static final int SILVER_TO_COPPER        = 10;
    public static final double SILVER_TO_ELECTRUM   = 0.5;
    public static final double SILVER_TO_GOLD       = 0.1;
    public static final double SILVER_TO_PLATINUM   = 0.01;

    // how many coins for each gold
    public static final int GOLD_TO_COPPER          = 100;
    public static final int GOLD_TO_SILVER          = 10;
    public static final int GOLD_TO_ELECTRUM        = 5;
    public static final double GOLD_TO_PLATINUM     = 0.1;

    // how many coins for each platinum
    public static final int PLATINUM_T0_COPPER      = 1000;
    public static final int PLATINUM_T0_SILVER      = 100;
    public static final int PLATINUM_TO_ELECTRUM    = 50;
    public static final int PLATINUM_TO_GOLD        = 10;
    
    
    private int copper;     // copper pieces of a given cache
    private int silver;     // silver pieces of a given cache
    private int electrum;   // electrum pieces of a given cache
    private int gold;       // gold pieces of a given cache
    private int platinum;   // platinum pieces of a given cache
    
    public Coin(){
        copper      = 0;
        silver      = 0;
        electrum    = 0;
        gold        = 0;
        platinum    = 0;
    }

    public Coin(int copper, int silver, int gold, int platinum){
        this.copper     = copper;
        this.silver     = silver;
        this.gold       = gold;
        this.platinum   = platinum;
    }
    
    public Coin(int copper, int silver, int electrum, int gold, int platinum) {
        this.copper     = copper;
        this.silver     = silver;
        this.electrum   = electrum;
        this.gold       = gold;
        this.platinum   = platinum;
    }

    public Coin(Coin coin){
        this.copper     = coin.getCopper();
        this.silver     = coin.getSilver();
        this.electrum   = coin.getElectrum();
        this.gold       = coin.getGold();
        this.platinum   = coin.getPlatinum();
    }
    
    /**
     * Returns the number of copper pieces.
     * @return the number of copper pieces.
     */
    public int getCopper() {
        return copper;
    }

    /**
     * Sets the number of copper pieces. This cannot be a negative value.
     * @param copper the number of copper pieces.
     */
    public void setCopper(int copper) {
        if(copper >= 0){
            this.copper = copper;
        }
        else{
            this.copper = 0;
        }
    }

    /**
     * Returns the number of silver pieces.
     * @return the number of silver pieces.
     */
    public int getSilver() {
        return silver;
    }

    /**
     * Sets the number of silver pieces. This cannot be a negative value.
     * @param silver the number of silver pieces.
     */
    public void setSilver(int silver) {
        if(silver >= 0){
            this.silver = silver;
        }
        else{
            this.silver = 0;
        }
    }

    /**
     * Returns the number of electrum pieces.
     * @return the number of electrum pieces.
     */
    public int getElectrum() {
        return electrum;
    }

    /**
     * Sets the number of electrum pieces. This cannot be a negative value.
     * @param electrum the number of electrum pieces.
     */
    public void setElectrum(int electrum) {
        if(electrum >= 0){
            this.electrum = electrum;
        }
        else{
            this.electrum = 0;
        }
    }

    /**
     * Returns the number of gold pieces.
     * @return the number of gold pieces.
     */
    public int getGold() {
        return gold;
    }

    /**
     * Returns the number of gold pieces. This cannot be a negative value.
     * @param gold the number of gold pieces.
     */
    public void setGold(int gold) {
        if(gold >= 0){
            this.gold = gold;
        }
        else{
            this.gold = 0;
        }
    }

    /**
     * Returns the number of platinum pieces.
     * @return the number of platinum pieces.
     */
    public int getPlatinum() {
        return platinum;
    }

    /**
     * Sets the number of platinum pieces. This cannot be a negative value.
     * @param platinum the number of platinum pieces.
     */
    public void setPlatinum(int platinum) {
        if(platinum >= 0){
            this.platinum = platinum;
        }
        else{
            this.platinum = 0;
        }
    }
    
    public void addCopper(int copper){
        this.copper += copper;
    }
    
    public void addElectrum(int electrum){
        this.electrum += electrum;
    }
    
    public void addGold(int gold){
        this.gold += gold;
    }
    
    public void addPlatinum(int platinum){
        this.platinum += platinum;
    }
    
    public void addSilver(int silver){
        this.silver += silver;
    }
            
    public boolean hasCopper(){
        return copper > 0;
    }
    
    public boolean hasElectrum(){
        return electrum > 0;
    }
    
    public boolean hasGold(){
        return gold > 0;
    }
    
    public boolean hasPlatinum(){
        return platinum > 0;
    }
    
    public boolean hasSilver(){
        return silver > 0;
    }
    
}
