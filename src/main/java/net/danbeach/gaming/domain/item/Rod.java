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
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.LibraryEnum;
import net.danbeach.gaming.constants.RogueSkillEnum;
import net.danbeach.gaming.constants.SavingThrowEnum;
import net.danbeach.gaming.constants.toon.CharacterClassEnum;

/**
 *
 * @author deb
 */
@Entity
@Table(schema = "GAMER", name = "ROD")
public class Rod {
     @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "book")
    @Enumerated(EnumType.ORDINAL)
    private LibraryEnum book;

    @Column(name = "book_page")
    private Integer bookPage;

    @Column(name = "character_class")
    private CharacterClassEnum characterClass;
    
    @Column(name = "charges")
    private Integer charges;
    
    @Column(name = "description")
    private String description;

    @Column(name = "distance")
    private Integer distance;
    
    @Column(name = "duration")
    private Integer duration;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "frequency")
    @Enumerated(EnumType.ORDINAL)
    private FrequencyEnum frequency;

    @Column(name = "name")
    private String name;

    @Column(name = "rogue_skill")
    private Boolean rogueSkill;

    @Column(name = "rogue_skill_category")
    @Enumerated(EnumType.ORDINAL)
    private RogueSkillEnum rogueSkillCategory;

    @Column(name = "saving_throw")
    private Boolean savingThrow;

    @Column(name = "saving_throw_category")
    private SavingThrowEnum savingThrowCategory;

    @Column(name = "volume")
    private Double volume;

    @Column(name = "weight")
    private Double weight;

    public Rod(){
        book = LibraryEnum.DUNGEON_MASTER_GUIDE;
        bookPage = 0;
        characterClass = CharacterClassEnum.NONE;
        charges = 100;
        description = "description";
        distance = 1;
        duration = 0;
        experience = 0;
        frequency = FrequencyEnum.NONE;
        name = "name";
        rogueSkill = false;
        rogueSkillCategory = RogueSkillEnum.NONE;
        savingThrow = false;
        savingThrowCategory = SavingThrowEnum.NONE;
        volume = 0.0;
        weight = 1.0;
    }
    
    public Rod(Rod rod){
        this.id = rod.getId();
        this.book = rod.getBook();
        this.bookPage = rod.getBookPage();
        this.characterClass = rod.getCharacterClass();
        this.charges = rod.getCharges();
        this.description = rod.getDescription();
        this.distance = rod.getDistance();
        this.duration = rod.getDuration();
        this.experience = rod.getExperience();
        this.frequency = rod.getFrequency();
        this.name = rod.getName();
        this.rogueSkill = rod.getRogueSkill();
        this.rogueSkillCategory = rod.getRogueSkillCategory();
        this.savingThrow = rod.getSavingThrow();
        this.savingThrowCategory = rod.getSavingThrowCategory();
        this.volume = rod.getVolume();
        this.weight = rod.getWeight();
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

    public CharacterClassEnum getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClassEnum characterClass) {
        this.characterClass = characterClass;
    }

    public Integer getCharges() {
        return charges;
    }

    public void setCharges(Integer charges) {
        this.charges = charges;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public FrequencyEnum getFrequency() {
        return frequency;
    }

    public void setFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRogueSkill() {
        return rogueSkill;
    }

    public void setRogueSkill(Boolean rogueSkill) {
        this.rogueSkill = rogueSkill;
    }

    public RogueSkillEnum getRogueSkillCategory() {
        return rogueSkillCategory;
    }

    public void setRogueSkillCategory(RogueSkillEnum rogueSkillCategory) {
        this.rogueSkillCategory = rogueSkillCategory;
    }

    public Boolean getSavingThrow() {
        return savingThrow;
    }

    public void setSavingThrow(Boolean savingThrow) {
        this.savingThrow = savingThrow;
    }

    public SavingThrowEnum getSavingThrowCategory() {
        return savingThrowCategory;
    }

    public void setSavingThrowCategory(SavingThrowEnum savingThrowCategory) {
        this.savingThrowCategory = savingThrowCategory;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
}
