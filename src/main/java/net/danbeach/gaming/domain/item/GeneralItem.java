/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.item;

import javax.persistence.Transient;
import net.danbeach.gaming.constants.item.QualityType;
import net.danbeach.gaming.constants.ConditionEnum;
import net.danbeach.gaming.constants.GamingColorEnum;

/**
 * Holds some of the general attributes that several items will share.
 * @author deb
 */
public abstract class GeneralItem {

    /**
     * The color of the item.
     */
    @Transient
    private GamingColorEnum color;

    /**
     * The condition of the item. It may be BROKEN, RUSTED, POOR, DAMAGED,
     * GOOD, EXCELLENT, SUPERIOR, PERFECT.
     */
    @Transient
    private ConditionEnum conditionOf;

    /**
     * Used to determine if an item that is part of an inventory or treasure 
     * has been evaluated or not.
     */
    @Transient
    private boolean evaluated;

    /**
     * What the item is made of.
     */
    @Transient
    private String material;

    /**
     * Indicates who or what created the item or empty string if unknown.
     */
    @Transient
    private String origin;

    /**
     * Indicates the quality of craftsmanship and current condition of an item. 
     * It may include: BROKEN, VERY_POOR, POOR, FAIR, GOOD, VERY_GOOD, 
     * EXCELLENT, SUPERIOR, PERFECT.
     */
    @Transient
    private QualityType quality;        // quality of item

    /**
     * Default constructor.
     */
    public GeneralItem() {
        this.color = GamingColorEnum.BLACK;
        this.conditionOf = ConditionEnum.GOOD;
        this.evaluated = false;
        this.material = "material";
        this.origin = "origin";
        this.quality = QualityType.FAIR;
    }

    /**
     * On object constructor.
     * @param generalItem 
     */
    public GeneralItem(GeneralItem generalItem) {
        this.color = generalItem.getColor();
        this.conditionOf = generalItem.getConditionOf();
        this.evaluated = generalItem.isEvaluated();
        this.material = generalItem.getMaterial();
        this.origin = generalItem.getOrigin();
        this.quality = generalItem.getQuality();
    }

    /**
     * Returns the gaming color enum.
     * @return the gaming color enum.
     */
    public GamingColorEnum getColor() {
        return color;
    }

    /**
     * Sets the Gaming color enum.
     * @param color the gaming color enum.
     */
    public void setColor(GamingColorEnum color) {
        this.color = color;
    }

    /**
     * Returns the item condition.
     * @return the item condition.
     */
    public ConditionEnum getConditionOf() {
        return conditionOf;
    }

    /**
     * Sets the condition of the item. 
     * @param conditionOf the condition of the item.
     */
    public void setConditionOf(ConditionEnum conditionOf) {
        this.conditionOf = conditionOf;
    }

    /**
     * Returns whether an item has been evaluated.
     * @return true if the item has been evaluated otherwise false.
     */
    public boolean isEvaluated() {
        return evaluated;
    }

    /**
     * Sets the item evaluated condition.
     * @param evaluated the item evaluation condition.
     */
    public void setEvaluated(boolean evaluated) {
        this.evaluated = evaluated;
    }

    /**
     * Returns the material the item is made of.
     * @return the material the item is made of.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the material the item is made of.
     * @param material the material the item is made of.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Returns the origin of the item.
     * @return the origin of the item.
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the origin of an item.
     * @param origin the origin of an item.
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    /**
     * Returns the quality type of an item.
     * @return the quality type of an item.
     */
    public QualityType getQuality() {
        return quality;
    }

    /**
     * Sets the quality type of an item.
     * @param quality the quality type of an item.
     */
    public void setQuality(QualityType quality) {
        this.quality = quality;
    }

}
