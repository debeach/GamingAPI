/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.controller.item;

import java.util.Random;
import net.danbeach.gaming.constants.FrequencyEnum;

/**
 *
 * @author deb
 */
public class MagicBonusController {

    Random random = new Random();

    public int generateMagicItemBonus(boolean cursed) {
        int ran = random.nextInt(100) + 1;
        int bonus = 0;
        FrequencyEnum frequency = FrequencyEnum.fromPercent(ran);

        if (frequency == null) {
            return 0;
        }

        switch (frequency) {
            case COMMON:
                bonus = 1;
                break;
            case UNCOMMON:
                bonus = 2;
                break;
            case RARE:
                bonus = 3;
                break;
            case VERY_RARE:
                bonus = 4;
                break;
            case UNIQUE:
                bonus = 5;
                break;
            default:
                bonus = 0;
        }
        
        if(cursed && bonus != 0){
            bonus = -bonus;
        }
        return bonus;
    }
}
