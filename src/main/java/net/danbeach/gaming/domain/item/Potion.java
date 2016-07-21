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
import net.danbeach.gaming.constants.BaseColorEnum;
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.LibraryEnum;
import net.danbeach.gaming.constants.RogueSkillEnum;
import net.danbeach.gaming.constants.SavingThrowEnum;

/**
 *
 * @author deb
 */
@Entity
@Table(schema = "GAMER", name = "POTION")
public class Potion extends GeneralItem implements Comparable<Potion>, Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "base_color")
    @Enumerated(EnumType.ORDINAL)
    private BaseColorEnum baseColor;
    
    @Column(name = "book")
    @Enumerated(EnumType.ORDINAL)
    private LibraryEnum book;
    
    @Column(name = "book_page")
    private Integer bookPage;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "doses")
    private Integer doses;
    
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

    public Potion(){
//        this.id = null;
        this.baseColor = BaseColorEnum.WHITE;
        this.book = LibraryEnum.NONE;
        this.bookPage = 0;
        this.description = "description";
        this.doses = 0;
        this.duration = 0;
        this.experience = 0;
        this.frequency = FrequencyEnum.NONE;
        this.rogueSkill = false;
        this.rogueSkillCategory = RogueSkillEnum.NONE;
        this.savingThrow = false;
        this.savingThrowCategory = SavingThrowEnum.NONE;
        this.volume = 0.0;
        this.weight = 0.0;
    }
    
    public Potion(Potion potion){
        this.id = potion.getId();
        this.baseColor = potion.getBaseColor();
        this.book = potion.getBook();
        this.bookPage = potion.getBookPage();
        this.description = potion.getDescription();
        this.doses = potion.getDoses();
        this.duration = potion.getDuration();
        this.experience = potion.getExperience();
        this.frequency = potion.getFrequency();
        this.rogueSkill = potion.getRogueSkill();
        this.rogueSkillCategory = potion.getRogueSkillCategory();
        this.savingThrow = potion.getSavingThrow();
        this.savingThrowCategory = potion.getSavingThrowCategory();
        this.volume = potion.getVolume();
        this.weight = potion.getWeight();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BaseColorEnum getBaseColor() {
        return baseColor;
    }

    public void setBaseColor(BaseColorEnum baseColor) {
        this.baseColor = baseColor;
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

    public Integer getDoses() {
        return doses;
    }

    public void setDoses(Integer doses) {
        this.doses = doses;
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
    
    
    
    @Override
    public int compareTo(Potion o) {
        return this.name.compareToIgnoreCase(o.getName());
    }
    
}
