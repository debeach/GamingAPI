package net.danbeach.gaming.controller.toon;

import net.danbeach.gaming.constants.toon.IStat;

/**
 * Created by deb on 1/4/14.
 */
public class ToonController {

    public static int getStrengthPercentRange(int strengthPercent){

        if(strengthPercent < 0 || strengthPercent > 100){
            return -1;
        }

        if(strengthPercent == 0){
            return 0;
        }
        else if(strengthPercent < IStat.EX_STR_RANGE[1]){
            return 1;
        }
        else if(strengthPercent < IStat.EX_STR_RANGE[2]){
            return 2;
        }
        else if(strengthPercent < IStat.EX_STR_RANGE[3]){
            return 3;
        }
        else if(strengthPercent < IStat.EX_STR_RANGE[4]){
            return 4;
        }

        return 5;
    }
}
