/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.controller;

import net.danbeach.gaming.domain.Dice;
import net.danbeach.gaming.constants.FrequencyEnum;

/**
 *
 * @author deb
 */
public class FrequencyController {
 
    /**
     * Generates a frequency using a d100.
     * @return the appropriate frequency.
     */
    public FrequencyEnum generateRandomFrequency(){
        
        int roll = Dice.dieOneHundred();
        
        if(roll > 100 || roll <= 0){
            return null;
        }
        
        return FrequencyEnum.fromPercent(roll);
    }
}
