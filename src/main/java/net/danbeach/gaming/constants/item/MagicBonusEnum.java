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
public enum MagicBonusEnum {
    
    MINUS_ONE(-1),
    MINUS_TWO(-2),
    PLUS_ONE(1),
    PLUS_TWO(2),
    PLUS_THREE(3),
    PLUS_FOUR(4),
    PLUS_FIVE(5);
    
    private int bonus;

    private MagicBonusEnum(int bonus){
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
    
    
