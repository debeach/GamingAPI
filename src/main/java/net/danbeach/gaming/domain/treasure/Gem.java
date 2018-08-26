/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.treasure;

import java.util.Date;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import net.danbeach.gaming.constants.BaseColorEnum;
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.treasure.GemTypeEnum;
import net.danbeach.gaming.domain.item.AbstractItem;

/**
 * Domain Entity for a gem object in the GAMER.GEM database.
 *
 * @author deb
 */
public class Gem extends AbstractItem {

    /**
     * 
     */
    public static final double GEM_WEIGHT = 0.001;

    // TODO: NEED UNIT TESTING.
    
    /**
     * Id of the gem. Coordinates to the id used in the database.
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * Base color of the gem. This is used to supply various shades of this 
     * base color.
     */
    @Enumerated(EnumType.ORDINAL)
    private BaseColorEnum baseColor;

    /**
     * Base value of the gem. This is determined by the gem type.
     */
    private Integer baseValue;

    /**
     * Date that the gem is deleted from the database. If it is still an active 
     * gem then the date will be null.
     */
    private Date deleted;

    /**
     * The full description of the gem.
     */
    private String description;

    /**
     * How often this them is found. 
     */
    @Enumerated(EnumType.ORDINAL)
    private FrequencyEnum frequency;

    /**
     * The full description of the gem's color. Includes speckles, streaks, 
     * swirls, ect.
     */
    private String gemColor;

    /**
     * This is the gem category (type). I.E. precious, semi-precious.
     */
    @Enumerated(EnumType.ORDINAL)
    private GemTypeEnum gemType;

    /**
     * Name of the gem.
     */
    private String name;

    /**
     * Weight of the gem. The default is 0.001 however, it will be more for 
     * exceptional size of the gems.
     */
    @Transient
    private Double weight;

    /**
     * Default constructor
     */
    public Gem() {
        super();
        baseColor = BaseColorEnum.NONE;
        baseValue = 1;
        deleted = null;
        description = "gem";
        frequency = FrequencyEnum.COMMON;
        gemColor = "Clear";
        gemType = GemTypeEnum.ORNAMENTAL_STONE;
        name = "Gem";
        weight = 0.001;
    }

    public Gem(String name, GemTypeEnum gemType) {
        this.name = name;
        this.gemType = gemType;
    }

    /**
     * Single Argument Constructor. Accepts a Gem object and copies the values
     * into this object.
     *
     * @param gem The object to be copied.
     */
    public Gem(Gem gem) {
        super(gem);

        this.id = gem.getId();
        this.baseColor = gem.getBaseColor();
        this.baseValue = gem.getBaseValue();
        this.deleted = gem.getDeleted();
        this.description = gem.getDescription();
        this.frequency = gem.getFrequency();
        this.gemColor = gem.getGemColor();
        this.gemType = gem.getGemType();
        this.name = gem.getName();
        this.weight = gem.getWeight();
    }

    /**
     * Returns the gem object id.
     * @return the gem object id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the gem object id.
     * @param id the gem object id.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Returns the gem base color enum.
     * @return the gem base color enum.
     */
    public BaseColorEnum getBaseColor() {
        return baseColor;
    }

    /**
     * Sets the gem base color enum.
     * @param baseColor the gem base color enum.
     */
    public void setBaseColor(BaseColorEnum baseColor) {
        this.baseColor = baseColor;
    }

    /**
     * Returns the gem's base value.
     * @return the gem's base value.
     */
    public Integer getBaseValue() {
        return baseValue;
    }

    /**
     * Sets the gem's base value.
     * @param baseValue the gem's base value.
     */
    public void setBaseValue(Integer baseValue) {
        this.baseValue = baseValue;
    }

    /**
     * Returns the date the gem was deleted from the database.
     * @return the date the gem was deleted otherwise null.
     */
    public Date getDeleted() {
        return deleted;
    }

    /**
     * Sets the date that the gem has been deleted from the database.
     * @param deleted the date the gem has been deleted otherwise null.
     */
    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }

    /**
     * Returns the gem's description.
     * @return the gem's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the gem's description.
     * @param description the gem's description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the frequency of the gem.
     * @return the frequency of the gem.
     */
    public FrequencyEnum getFrequency() {
        return frequency;
    }

    /**
     * Sets the gem's frequency. 
     * @param frequency the gem's frequency.
     */
    public void setFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
    }

    /**
     * Returns the detailed color of the gem.
     * @return the detailed color of the gem.
     */
    public String getGemColor() {
        return gemColor;
    }

    /**
     * Sets the detailed color of the gem.
     * @param gemColor the detailed color of the gem.
     */
    public void setGemColor(String gemColor) {
        this.gemColor = gemColor;
    }

    /**
     * Returns the GemTypeEnum of the gem. This should not be used in areas
     * other than the Gem Constructor.
     *
     * @return The GemTypeEnum of the gem.
     */
    private GemTypeEnum getGemType() {
        return this.gemType;
    }

    /**
     * Sets the GemType of the gem. 
     * @param gemType the gem type of the gem.
     */
    private void setGemType(GemTypeEnum gemType) {
        this.gemType = gemType;
    }

    /**
     * Returns the name of the gem.
     * @return the name of the gem.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the gem.
     * @param name the name of the gem.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the weight of the gem. The default is 0.001 however, larger 
     * versions of a gem may weigh more.
     * @return the weight of the gem.
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of a gem.
     * @param weight the weight of a gem.
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * Returns the base name of the gem type
     * @return the base name of the gem type
     */
    public String getBaseTypeName() {
        return gemType.getBaseTypeName();
    }

    /**
     * Returns the base name of the gem type.
     * @return the base name of the gem type.
     */
    public String getGemName() {
        return gemType.getBaseTypeName();
    }

}
