/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants.item;

/**
 *
 * @author deb
 */
public enum WeaponTypeEnum {

    NONE("None", "N", 0),
    BLUDGEON("Bludgeon", "B", 1),
    PIERCING("Piercing", "P", 2),
    SLASHING("Slashing", "S", 3),
    ALL("All", "A", 4);

    private int index;
    private String name;
    private String shortName;

    private WeaponTypeEnum(String name, String shortName, int number) {
        this.name = name;
        this.shortName = shortName;
        this.index = number;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public static WeaponTypeEnum fromNumber(int number) {
        if (number >= 0) {
            for (WeaponTypeEnum num : WeaponTypeEnum.values()) {
                if (number == num.ordinal()) {
                    return num;
                }
            }
        }
        return null;
    }
    
     public static WeaponTypeEnum fromString(String category) {
        if (category != null) {
            for (WeaponTypeEnum cat : WeaponTypeEnum.values()) {
                if (category.equalsIgnoreCase(cat.name)) {
                    return cat;
                }
            }
        }
        return null;
    }
     
    public static int getIndexfromName(String name) {
        if (name != null) {
            for (WeaponTypeEnum num : WeaponTypeEnum.values()) {
                if (name.equalsIgnoreCase(num.getName())) {
                    return num.getIndex();
                }
            }
        }
        return 0;
    }

    public static int getIndexfromShortName(String name) {
        if (name != null) {
            for (WeaponTypeEnum num : WeaponTypeEnum.values()) {
                if (name.equalsIgnoreCase(num.getShortName())) {
                    return num.getIndex();
                }
            }
        }
        return 0;
    }

    public static String getNameFromShortName(String name) {
        if (name != null) {
            for (WeaponTypeEnum num : WeaponTypeEnum.values()) {
                if (name.equalsIgnoreCase(num.getShortName())) {
                    return num.getName();
                }
            }
        }
        return null;
    }

    public static String getShortNamefromName(String name) {
        if (name != null) {
            for (WeaponTypeEnum num : WeaponTypeEnum.values()) {
                if (name.equalsIgnoreCase(num.getName())) {
                    return num.getShortName();
                }
            }
        }
        return null;
    }

}
