/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants;

/**
 *
 * @author deb
 */
public enum Long {

    NONE(0, "None"),
    PARALYZATION(1, "Paralyzation"),
    POISON(2, "Poison"),
    DEATH_SPELL(3, "Death Spell"),
    ROD(4, "Rod"),
    STAFF(5, "Staff"),
    WAND(6, "Wand"),
    PETRIFICATION(7, "Petrification"),
    POLYMORPH(8, "Polymorph"),
    BREATH_WEAPON(9, "Weapon Breath"),
    SPELL(10, "Spell"), 
    ALL(11, "All");
    

    private int value;
    private String name;

    private Long(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
    
    public static Long fromNumber(int number) {
        if (number >= 0) {
            for (Long num : Long.values()) {
                if (number == num.ordinal()) {
                    return num;
                }
            }
        }
        return null;
    }
    
}
