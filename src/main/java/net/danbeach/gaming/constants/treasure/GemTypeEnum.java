/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.constants.treasure;

/**
 * A set of constant values used to determine what category a gem is part of.
 * It includes the category name and the base value of that category.
 * @author deb
 */
public enum GemTypeEnum {
    /**
     * Ornamental Stones are base value 10.
     */
    ORNAMENTAL_STONE("Ornamental Stone", 10),
    /**
     * Semi Precious Stones are base value 50.
     */
    SEMI_PRECIOUS_STONE("Semi-Precious Stone", 50),
    /**
     * Fancy stones are base value 100.
     */
    FANCY_STONE("Fancy Stone", 100),
    /**
     * Precious Stones are base value 500.
     */
    PRECIOUS_STONE("Precious Stone", 500),
    /**
     * Gems stones are base value 1000.
     */
    GEM("Gem",1000),
    /**
     * Jewels are a base value 5000.
     */
    JEWEL("Jewel",5000),
    /**
     * The Hardstone has a base value of 1+. 
     */
    HARD_STONE("Hardstone",1),
    /**
     * Shells have a base value of 1+.
     */
    SHELL("Shell",1);
    
    /**
     * Contains the base value of the gem.
     */
    private int baseValue;
    /**
     * Contains the name of the gem category, ie Semi-Precious.
     */
    private String baseTypeName;

    /**
     * Constructor for the Gem Type Enum. 
     * @param title the title of the enum type, ie Semi-Precious
     * @param value the base value of the gem type.
     */
    private GemTypeEnum(String title, int value){
        this.baseTypeName = title;
        this.baseValue = value;
    }
    
    /**
     * Returns the base value of the gem.
     * @return the base value of the gem.
     */
    public int getBaseValue() {
        return baseValue;
    }

    /**
     * Returns the name of the gem type.
     * @return the name of the gem type.
     */
    public String getBaseTypeName() {
        return baseTypeName;
    }

    
}
