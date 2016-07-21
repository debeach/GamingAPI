/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants;

/**
 * An enum of the base colors used in gaming.
 * @author deb
 */
public enum BaseColorEnum {

    /**
     * Used when no color is indicated or when something is clear.
     */
    NONE("None"),
    /**
     * Used to indicate the color black.
     */
    BLACK("Black"),
    /**
     * Used to indicate the color blue.
     */
    BLUE("Blue"),
    /**
     * Used to indicate the color brown.
     */
    BROWN("Brown"),
    /**
     * Used to indicate the color gray.
     */
    GRAY("Gray"),
    /**
     * Used to indicate the color green.
     */
    GREEN("Green"),
    /**
     * Used to indicate the color orange.
     */
    ORANGE("Orange"),
    /**
     * Used to indicate the color purple.
     */
    PURPLE("Purple"),
    /**
     * Used to indicate the color red.
     */
    RED("Red"),
    /**
     * Used to indicate the color white.
     */
    WHITE("White"),
    /**
     * Used to indicate the color yellow.
     */
    YELLOW("Yellow");
    
    /**
     * Holds the name of the color.
     */
    private String name;

    /**
     * one-argument constructor used for the enum.
     * @param name the name of the color.
     */
    BaseColorEnum(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the color.
     * @return the name of the color.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Figures out which color is selected according to the number that is 
     * passed in.
     * @param number the enum ordinal for a specific base color enum.
     * @return The base color enum that is indicated by the number.
     */
    public static BaseColorEnum fromNumber(int number) {
        if (number >= 0) {
            for (BaseColorEnum color : BaseColorEnum.values()) {
                if (number == color.ordinal()) {
                    return color;
                }
            }
        }
        return null;
    }
}
