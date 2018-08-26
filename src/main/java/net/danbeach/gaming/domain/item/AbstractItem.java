/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.item;

import javax.persistence.Column;
import javax.persistence.Transient;
import net.danbeach.gaming.constants.item.QualityType;
import net.danbeach.gaming.constants.ConditionEnum;
import net.danbeach.gaming.constants.GamingColorEnum;

/**
 * Holds some of the general attributes that several items will share.
 * @author deb
 */
public abstract class AbstractItem { // TODO: NEED TO EXTEND ITEM AFTER ALL DOMAIN ITEMS EXTEND ITEM.

    @Column(name = "gaming_color_id")
    private Long gamingColor;

    /**
     * Default constructor.
     */
    public AbstractItem() {
        this.gamingColor = 1L;
    }

    /**
     * On object constructor.
     * @param generalItem 
     */
//    public AbstractItem(AbstractItem generalItem) {
//        this.color = generalItem.getColor();
//    }










    


}
