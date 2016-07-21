/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.toon;

import net.danbeach.gaming.constants.toon.IStat;
import net.danbeach.gaming.domain.toon.PlayerCharacter;

/**
 * This class will have all things that have to do with any character that 
 * uses magic. This includes the mage and bard.
 * @author deb
 */
public class PCMagic extends PlayerCharacter {
    private int maxSpellLevel;          // Max level of spells a PC can obtain
    private int maxSpellPerLevel;       // CURRENTLY OPTIONAL
    
    /**
     * Returns the maximum spell level a character may achieve.
     * @return the maximum spell level a character may achieve.
     */
    public int getMaxSpellLevel() {
        return maxSpellLevel;
    }

    /**
     * Returns the maximum spells a character may have in books for each 
     * spell level. THIS IS AN OPTIONAL FEATURE.
     * @return the maximum spells a character may have per level.
     */
    public int getMaxSpellPerLevel() {
        return maxSpellPerLevel;
    }

    /**
     * Sets the maximum spell level a character may achieve.
     * @param maxSpellLevel the maximum spell level a character may achieve.
     */
    public void setMaxSpellLevel(int maxSpellLevel) {
        try {
            this.maxSpellLevel = IStat.INT_SPELL_LEVEL[this.getIntelligence()];
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the maximum spells a character may have in their books per spell 
     * level.
     * @param maxSpellPerLevel the maximum spells per level.
     */
    public void setMaxSpellPerLevel(int maxSpellPerLevel) {
       try {
            this.maxSpellPerLevel =
                IStat.INT_MAX_NUMBER_SPELLS_PER_LEVEL[
                    this.getIntelligence()];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
