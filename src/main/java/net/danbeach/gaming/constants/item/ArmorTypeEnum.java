/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.constants.item;

/**
 * Contains static data of a set of armor. This includes the name of the armor, 
 * the armor class, the value in gold pieces, and the weight of the armor.
 * @author deb
 */
public enum ArmorTypeEnum {
    
    BANDED("Banded Mail Armor", 6, 200.0, 35.0),
    BASINET("Basinet Helm", 1, 8.0, 5.0),
    BODY_SHIELD("Body Shield", 4, 10.0, 10.0),  // book says 15 pounds
    BRIGANDINE("Brigandine", 4, 120.0, 35.0),
    BUCKLER("Buckler Shield", 1, 1.0, 3.0),
    CHAIN_MAIL("Chain Mail", 5, 75.0, 40.0),
    FIELD_PLATE("Field Plate Mail", 8, 2000.00, 60.0),
    FULL_HELM("Full Helm", 2, 30.0, 10.0),
    FULL_PLATE("Full Plate Mail", 9, 4000.00, 70.0),
    HIDE("Hide", 4, 15.0, 30.0),
    LARGE_SHIELD("Large Shield", 3, 5.0, 7.0),  // could be 10 pounds
    LEATHER("Leather", 2, 5.0, 15.0),
    MEDIUM_SHIELD("Medium Shield", 2, 3.0, 5.0), // book says 10 pounds
    PADDED("Padded", 2, 4.0, 10.0),
    PLATE_MAIL("Plate Mail", 7, 600.00, 50.0),
    RING_MAIL("Ring Mail", 3, 40.0, 30.0),
    SCALE_MAIL("Scale Mail", 4, 120.0, 40.0),
    SMALL_SHIELD("Small Shield", 1, 1.0, 3.0), // book says 5 pounds
    SPLINT_MAIL("Splint Mail", 6, 80.0, 40.0),
    STUDDED_LEATHER("Studded Leather", 3, 20.0, 25.0),
    ;
    
    private String name;
    private int armorClass;
    private double value;
    private double weight;

    private ArmorTypeEnum(String name, int armorClass, double value, double weight){
        this.name = name;
        this.armorClass = armorClass;
        this.value = value;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    
    public int getArmorClass(){
        return armorClass;
    }
    
    public double getValue(){
        return value;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public static ArmorTypeEnum fromNumber(int number) {
        if (number >= 0) {
            for (ArmorTypeEnum num : ArmorTypeEnum.values()) {
                if (number == num.ordinal()) {
                    return num;
                }
            }
        }
        return null;
    }
}
