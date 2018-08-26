/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.LibraryEnum;
import net.danbeach.gaming.constants.toon.GenderEnum;


/**
 *
 * @author deb
 */
@Entity
@Table(name = "ARMOR")
public class Armor extends Item{

    // TODO: DO I STILL NEED THIS?
    public static final int ARMOR_ARMOR = 0;
    public static final int ARMOR_HELM = 1;
    public static final int ARMOR_SHIELD = 2;
    public static final int ARMOR_BOOTS = 3;
    public static final int ARMOR_CLOAK = 4;
    public static final int ARMOR_BRACER = 5;
    public static final int ARMOR_OTHER = 6;

    // TODO: DO I STILL NEED THIS.
    public static final int NUMBER_OF_ARMOR_SLOTS = 7;
    /////////////////////////////////////////////

    @Column(name = "defense_value")
    private Integer defenseValue;

    @Transient
    private GenderEnum gender;

    @Transient
    private Integer magicDefense;   // if armor, what is the magic defense.
    /////////////////////////////////////////////////////////////////////////////////////

    public Armor(){
        super();
        this.defenseValue = 0;
        this.gender = GenderEnum.NONE;
        this.magicDefense = 0;
    }

    public Armor(Integer defenseValue, GenderEnum gender, Integer magicDefense) {
        super();
        this.setDefenseValue(defenseValue);
        this.setGender(gender);
        this.setMagicDefense(magicDefense);
    }

    public Armor(Armor armor) {
        super(armor);
        this.setDefenseValue(armor.getDefenseValue());
        this.setGender(armor.getGender());
        this.setMagicDefense(armor.getMagicDefense());
    }
    /////////////////////////////////////////////////////////////////////////////////////

    public Integer getDefenseValue() {
        return defenseValue;
    }

    /**
     * Defense Value cannot be a negative number.
     * @param defenseValue 
     */
    public void setDefenseValue(Integer defenseValue) {
        if (defenseValue >= 0) {
            this.defenseValue = defenseValue;
        } else {
            this.defenseValue = 0;
        }
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public Integer getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(Integer magicDefense) {
        this.magicDefense = magicDefense;
    }
    /////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(this.getMagicDefense() >= 0 ? (" " + "+") : (" " + "-"));
        sb.append(this.getMagicDefense());
        return sb.toString();
    }

}
