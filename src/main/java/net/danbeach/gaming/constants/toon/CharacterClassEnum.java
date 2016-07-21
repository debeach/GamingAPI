/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants.toon;

/**
 *
 * @author deb
 */
public enum CharacterClassEnum {
    NONE("None", "none"),
    BARBARIAN("Barbarian", "Bb"),
    BARD("Bard", "Bd"),
    CLERIC("Cleric", "Cl"),
    DRUID("Driud", "Dr"),
    FIGHTER("Fighter", "Fi"),
    MAGE("Mage", "Ma"),
    MONK("Monk", "Mo"),
    PALADIN("Paladin", "Pa"),
    RANGER("Ranger", "Ra"),
    ROGUE("Rogue", "Ro"), 
    CLERIC_MAGE("Cleric Mage", "C,M")
    ;
    
    private String name;
    private String shortName;
    
    private CharacterClassEnum(String name, String shortName){
        this.name = name;
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }
    
    public static CharacterClassEnum fromNumber(int number){
        if(number >= 0){
            for(CharacterClassEnum character : CharacterClassEnum.values()){
                if(number == character.ordinal()){
                    return character;
                }
            }
        }
        return null;
    }
}
