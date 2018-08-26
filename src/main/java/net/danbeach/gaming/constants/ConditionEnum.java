/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.constants;

/**
 * The ConditionEnum enumeration is used to apply what condition an item is in 
 * when it is found/used.
 * The valueAdjust is used to determine the value of the item. it will be 
 * used as a factor when the value of the item is calculated. The lower 
 * the condition, the lower the factor.
 * @author deb
 */
public enum ConditionEnum {
    
    BROKEN("Broken", 0.05),
    RUSTED("Rusted", 0.10),
    POOR("Poor", 0.30),
    DAMAGED("Damaged", 0.60),
    FAIR("Fair", 0.80),
    GOOD("Good", 1.00),
    EXCELLENT("Excellent", 1.30),
    SUPERIOR("Superior", 1.60),
    PERFECT("Perfect", 2.00);
    
    private final String name;        // the condition
    private final double valueAdjust; // how much the item value is adjusted

    private ConditionEnum(String name, double value){
        this.name = name;
        this.valueAdjust = value;
    }
    
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public double getValueAdjust() {
        return valueAdjust;
    }
}
