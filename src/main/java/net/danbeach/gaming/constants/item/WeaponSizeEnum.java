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
public enum WeaponSizeEnum {

    NONE("None", "N", 0),
    LARGE("Large", "L", 1),
    MEDIUM("Medium", "M", 2),
    SMALL("Small", "S", 3);
    
    private int index;
    private String name;
    private String shortName;

    private WeaponSizeEnum(String name, String shortName, int index) {
        this.index = index;
        this.name = name;
        this.shortName = shortName;
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
    
    public static WeaponSizeEnum fromNumber(int number) {
        if (number >= 0) {
            for (WeaponSizeEnum num : WeaponSizeEnum.values()) {
                if (number == num.ordinal()) {
                    return num;
                }
            }
        }
        return null;
    }
    
    public static int getIndexfromName(String name) {
        if (name != null) {
            for (WeaponSizeEnum num : WeaponSizeEnum.values()) {
                if (name.equalsIgnoreCase(num.getName())) {
                    return num.getIndex();
                }
            }
        }
        return 0;
    }

    public static int getIndexfromShortName(String name) {
        if (name != null) {
            for (WeaponSizeEnum num : WeaponSizeEnum.values()) {
                if (name.equalsIgnoreCase(num.getShortName())) {
                    return num.getIndex();
                }
            }
        }
        return 0;
    }

    public static String getNameFromShortName(String name) {
        if (name != null) {
            for (WeaponSizeEnum num : WeaponSizeEnum.values()) {
                if (name.equalsIgnoreCase(num.getShortName())) {
                    return num.getName();
                }
            }
        }
        return WeaponSizeEnum.NONE.getName();
    }

     public static String getShortNamefromIndex(int index) {
        if (index >= 0) {
            for (WeaponSizeEnum num : WeaponSizeEnum.values()) {
                if (index == num.getIndex()) {
                    return num.getShortName();
                }
            }
        }
        return WeaponSizeEnum.NONE.getShortName();
    }
     
    public static String getShortNamefromName(String name) {
        if (name != null) {
            for (WeaponSizeEnum num : WeaponSizeEnum.values()) {
                if (name.equalsIgnoreCase(num.getName())) {
                    return num.getShortName();
                }
            }
        }
        return WeaponSizeEnum.NONE.getShortName();
    }
}
