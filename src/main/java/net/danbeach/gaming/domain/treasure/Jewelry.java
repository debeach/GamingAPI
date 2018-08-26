/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.treasure;

import net.danbeach.gaming.domain.item.Item;
import net.danbeach.gaming.constants.treasure.JewelryTypeEnum;

/**
 *
 * @author deb
 */
public class Jewelry extends Item{
    private JewelryTypeEnum jewelryType;
    
    private Jewelry(){}
    
    public Jewelry(String name, double value, JewelryTypeEnum jewelryType){
        this.setName(name);
        this.setBaseValue(value);
        this.jewelryType = jewelryType;
    }
    
    public Jewelry(Jewelry jewelry){
        super(jewelry);
        this.jewelryType = jewelry.getJewelryType();
    }

    private void setJewelryType(JewelryTypeEnum jewelryType) {
        this.jewelryType = jewelryType;
    }

    private JewelryTypeEnum getJewelryType() {
        return jewelryType;
    }
    
    /**
     * Returns the name of the jewelry type.
     * @return the name of the jewelry type.
     */
    public String getJewelryName(){
        return this.jewelryType.getBaseName();
    }
    
}
