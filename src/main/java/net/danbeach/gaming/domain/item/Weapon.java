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
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.LibraryEnum;
import net.danbeach.gaming.constants.item.WeaponSizeEnum;
import net.danbeach.gaming.constants.item.WeaponTypeEnum;

/**
 *
 * @author deb
 */
@Entity
@Table(schema = "GAMER", name = "WEAPON")
public class Weapon extends AbstractItem implements Comparable<Weapon>, Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;             // hibernate

    @Column(name = "book")
    @Enumerated(EnumType.ORDINAL)
    private LibraryEnum book;
    
    @Column(name = "book_page")
    private Integer bookPage;
            
    @Column(name = "description")
    private String description;

    @Column(name = "experience_value")
    private Integer experienceValue;

    @Column(name = "frequency")
    @Enumerated(EnumType.ORDINAL)
    private FrequencyEnum frequency;

    @Column(name = "large_damage")
    private Integer largeDamage;        // large opponent damage

    @Column(name = "large_extra_damage")
    private Integer largeExtraDamage;   // weapon extra damage against large opponent

    @Column(name = "magical")
    private Boolean magical;

    @Column(name = "magical_damage")
    private Integer magicalDamage;      // if magic weapon, what is magic damage

    @Column(name = "medium_damage")
    private Integer mediumDamage;       // medium opponent damage

    @Column(name = "medium_extra_damage")
    private Integer mediumExtraDamage;  // weapon extra damage against medium opponent

    @Column(name = "name")
    private String name;

    @Column(name = "small_damage")
    private Integer smallDamage;        //small opponent damage

    @Column(name = "small_extra_damage")
    private Integer smallExtraDamage;   // weapon extra damage against small opponent

    @Column(name = "stackable")
    private Boolean stackable;

    @Column(name = "value_of")
    private Double value;

    @Column(name = "weapon_category")
    private Integer weaponCategory;

    @Column(name = "weapon_size")
    @Enumerated(EnumType.ORDINAL)
    private WeaponSizeEnum weaponSize;      // size of weapon

    @Column(name = "weapon_speed")
    private Integer weaponSpeed;        // speed of weapon per initiative.

    @Column(name = "weapon_type")
    @Enumerated(EnumType.ORDINAL)
    private WeaponTypeEnum weaponType;      // type of weapon: pierce, slash, bludgeon

    @Column(name = "weight")
    private Double weight;

    public Weapon() {
        book = LibraryEnum.NONE;
        bookPage = 0;
        description = "description";
        experienceValue = 0;
        frequency = FrequencyEnum.NONE;
        largeDamage = 0;
        largeExtraDamage = 0;
        magical = false;
        magicalDamage = 0;
        mediumDamage = 0;
        mediumExtraDamage = 0;
        name = "name";
        smallDamage = 0;
        smallExtraDamage = 0;
        stackable = false;
        value = 0.0;
        weaponCategory = 0;
        weaponSize = WeaponSizeEnum.MEDIUM;
        weaponSpeed = 10;
        weaponType = WeaponTypeEnum.SLASHING;
        weight = 0.0;
    }

    public Weapon(Weapon weapon) {
//        super(weapon);
        id = weapon.getId();
        book = weapon.getBook();
        bookPage = weapon.getBookPage();
        description = weapon.getDescription();
        experienceValue = weapon.getExperienceValue();
        frequency = weapon.getFrequency();
        largeDamage = weapon.getLargeDamage();
        largeExtraDamage = weapon.getLargeExtraDamage();
        magical = weapon.isMagical();
        magicalDamage = weapon.getMagicalDamage();
        mediumDamage = weapon.getMediumDamage();
        mediumExtraDamage = weapon.getMediumExtraDamage();
        name = weapon.getName();
        smallDamage = weapon.getSmallDamage();
        smallExtraDamage = weapon.getSmallExtraDamage();
        stackable = weapon.isStackable();
        value = weapon.getValue();
        weaponCategory = weapon.getWeaponCategory();
        weaponSize = weapon.getWeaponSize();
        weaponSpeed = weapon.getWeaponSpeed();
        weaponType = weapon.getWeaponType();
        weight = weapon.getWeight();
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
     * This CANNOT be a negative value.
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
     * This CANNOT be a negative value and must be between 0 and 5
     *
     * @param frequency
     */
    public void setFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
    }

    /**
     * Returns the damage a weapon does against a large opponent.
     *
     * @return the damage a weapon does against a large opponent.
     */
    public Integer getLargeDamage() {
        return largeDamage;
    }

    /**
     * Sets the damage a weapon does against a large opponent. This CANNOT be a
     * negative value.
     *
     * @param largeDamage the damage a weapon does against a large opponent.
     */
    public void setLargeDamage(Integer largeDamage) {
        this.largeDamage = largeDamage;
    }

    /**
     * Returns the extra damage a weapon does against a large opponent.
     *
     * @return the extra damage a weapon does against a large opponent.
     */
    public Integer getLargeExtraDamage() {
        return largeExtraDamage;
    }

    /**
     * Sets the extra damage a weapon does against a large opponent. This CANNOT
     * be a negative value.
     *
     * @param largeExtraDamage the extra damage a weapon does against a large
     * opponent.
     */
    public void setLargeExtraDamage(Integer largeExtraDamage) {
        this.largeExtraDamage = largeExtraDamage;
    }

    public Boolean isMagical() {
        return magical;
    }

    public void setMagical(Boolean magical) {
        this.magical = magical;
    }

    /**
     * Returns the weapon's magical damage.
     *
     * @return the weapon's magical damage.
     */
    public Integer getMagicalDamage() {
        return magicalDamage;
    }

    /**
     * Sets the weapon's magical damage.
     *
     * @param magicalDamage the weapon's magical damage.
     */
    public void setMagicalDamage(Integer magicalDamage) {
        this.magicalDamage = magicalDamage;
    }

    /**
     * Returns the damage a weapon does against medium opponents
     *
     * @return the damage a weapon does against medium opponents
     */
    public Integer getMediumDamage() {
        return mediumDamage;
    }

    /**
     * Sets the damage a weapon does against medium opponents. This CANNOT be a
     * negative value.
     *
     * @param mediumDamage the damage a weapon does against medium opponents
     */
    public void setMediumDamage(Integer mediumDamage) {
        this.mediumDamage = mediumDamage;
    }

    /**
     * Returns the extra damage a weapon does against a medium opponent.
     *
     * @return the extra damage a weapon does against a medium opponent.
     */
    public Integer getMediumExtraDamage() {
        return mediumExtraDamage;
    }

    /**
     * Sets the extra damage a weapon does against a medium opponent. This
     * CANNOT be a negative value.
     *
     * @param mediumExtraDamage the extra damage a weapon does against a medium
     * opponent.
     */
    public void setMediumExtraDamage(Integer mediumExtraDamage) {
        this.mediumExtraDamage = mediumExtraDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the damage a weapon does against small or medium opponents.
     *
     * @return the damage a weapon does against small or medium opponents.
     */
    public Integer getSmallDamage() {
        return smallDamage;
    }

    /**
     * Sets the damage a weapon does against small opponents. This CANNOT be a
     * negative value.
     *
     * @param smallDamage the damage a weapon does against a small
     * opponent.
     */
    public void setSmallDamage(Integer smallDamage) {
        this.smallDamage = smallDamage;
    }

    /**
     * Returns the extra damage a weapon does against a small or medium
     * opponent.
     *
     * @return the extra damage a weapon does against a small or medium
     * opponent.
     */
    public Integer getSmallExtraDamage() {
        return smallExtraDamage;
    }

    /**
     * sets the extra damage a weapon does against a small or medium opponent.
     * This CANNOT be a negative value.
     *
     * @param smallExtraDamage the extra damage a weapon does against a small or
     * medium opponent.
     */
    public void setSmallExtraDamage(Integer smallExtraDamage) {
        this.smallExtraDamage = smallExtraDamage;
    }

    public Boolean isStackable() {
        return stackable;
    }

    public void setStackable(Boolean stackable) {
        this.stackable = stackable;
    }

    public Double getValue() {
        return value;
    }

    /**
     * Cannot be a negative value.
     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getWeaponCategory() {
        return weaponCategory;
    }

    /**
     * Cannot be a negative value.
     *
     * @param weaponCategory
     */
    public void setWeaponCategory(Integer weaponCategory) {
        this.weaponCategory = weaponCategory;
    }

    /**
     * Returns the size of the weapon.
     *
     * @return the size of the weapon.
     */
    public WeaponSizeEnum getWeaponSize() {
        return weaponSize;
    }

    /**
     * Sets the size of the weapon.
     *
     * @param weaponSize the size of the weapon.
     */
    public void setWeaponSize(WeaponSizeEnum weaponSize) {
        this.weaponSize = weaponSize;
    }

    /**
     * Returns the weapon speed factor.
     *
     * @return the weapon speed factor.
     */
    public Integer getWeaponSpeed() {
        return weaponSpeed;
    }

    /**
     * Sets the weapon speed factor. This CANNOT be a negative value.
     *
     * @param weaponSpeed the weapon speed factor.
     */
    public void setWeaponSpeed(Integer weaponSpeed) {
        this.weaponSpeed = weaponSpeed;
    }

    /**
     * Returns the weapon type.
     *
     * @return the weapon type.
     */
    public WeaponTypeEnum getWeaponType() {
        return weaponType;
    }

    /**
     * Sets the weapon type. This CANNOT be a negative value.
     *
     * @param weaponType the weapon type.
     */
    public void setWeaponType(WeaponTypeEnum weaponType) {
        this.weaponType = weaponType;
    }

    public Double getWeight() {
        return weight;
    }

    /**
     * This CANNOT be a negative value.
     *
     * @param weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Weapon weapon) {
        return this.name.compareToIgnoreCase(weapon.getName());
    }

}
