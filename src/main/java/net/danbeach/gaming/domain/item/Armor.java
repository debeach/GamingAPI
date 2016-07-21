/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.item;

import java.io.Serializable;
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
public class Armor extends GeneralItem implements Comparable<Armor>, Serializable {

    public static final int ARMOR_ARMOR = 0;
    public static final int ARMOR_HELM = 1;
    public static final int ARMOR_SHIELD = 2;
    public static final int ARMOR_BOOTS = 3;
    public static final int ARMOR_CLOAK = 4;
    public static final int ARMOR_BRACER = 5;
    public static final int ARMOR_OTHER = 6;

    public static final int NUMBER_OF_ARMOR_SLOTS = 7;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;             // hibernate

    @Column(name = "book")
    @Enumerated(EnumType.ORDINAL)
    private LibraryEnum book;
    
    @Column(name = "book_page")
    private Integer bookPage;
    
    @Column(name = "defense_value")
    private Integer defenseValue;

    @Column(name = "description")
    private String description;

    @Column(name = "experience_value")
    private Integer experienceValue;

    @Column(name = "frequency")
    @Enumerated(EnumType.ORDINAL)
    private FrequencyEnum frequency;

    @Transient
    private GenderEnum gender;

    @Column(name = "magical")
    private Boolean magical;

    @Column(name = "magic_defense")
    private Integer magicDefense;   // if armor, what is the magic defense.

    @Column(name = "name")
    private String name;

    @Column(name = "value_of")
    private Double value;

    @Column(name = "weight")
    private Double weight;

    public Armor() {
        book = LibraryEnum.NONE;
        bookPage = 0;
        defenseValue = 0;
        description = "description";
        experienceValue = 0;
        frequency = FrequencyEnum.NONE;
        gender = GenderEnum.MALE;
        magical = false;
        magicDefense = 0;
        name = "name";
        value = 0.0;
        weight = 0.0;
    }

    public Armor(Armor armor) {
        id = armor.getId();
        book = armor.getBook();
        bookPage = armor.getBookPage();
        defenseValue = armor.getDefenseValue();
        description = armor.getDescription();
        experienceValue = armor.getExperienceValue();
        frequency = armor.getFrequency();
        gender = armor.getGender();
        magical = armor.isMagical();
        magicDefense = armor.getMagicDefense();
        name = armor.getName();
        value = armor.getValue();
        weight = armor.getWeight();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LibraryEnum getBook() {
        return book;
    }

    public void setBook(LibraryEnum book) {
        this.book = book;
    }

    public Integer getBookPage() {
        return bookPage;
    }

    public void setBookPage(Integer bookPage) {
        this.bookPage = bookPage;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getExperienceValue() {
        return experienceValue;
    }

    /**
     * This cannot be a negative value.
     *
     * @param experienceValue
     */
    public void setExperienceValue(Integer experienceValue) {
        this.experienceValue = experienceValue;
    }

    public FrequencyEnum getFrequency() {
        return frequency;
    }

    /**
     * This cannot be a negative value. It must be a value between 0 and 5.
     *
     * @param frequency
     */
    public void setFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public Boolean isMagical() {
        return magical;
    }

    public void setMagical(Boolean magical) {
        this.magical = magical;
    }

    public Integer getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(Integer magicDefense) {
        this.magicDefense = magicDefense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    /**
     * This cannot be a negative value.
     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }

    public Double getWeight() {
        return weight;
    }

    /**
     * This cannot be a negative value.
     *
     * @param weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Armor armor) {
        return this.name.compareToIgnoreCase(armor.getName());
    }
    

}
