/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.toon;

import net.danbeach.gaming.constants.FrequencyEnum;

/**
 *
 * @author deb
 */
public class Creature extends Toon{
    private String      activity;               // description of the creature's activities
    private int         bonusHitPoints;         // for example: hit dice 3+1. bonusHitPoints woudl be 1
    private int         climateId;              // the various climates the creature is found
    private String      combatDescription;      // description of how the creature fights.
    private int[]       damagePerAttack;        // the damage per attack.
    private String      description;            // description of the creature.
    private String      diet;                   // diet of the creature
    private String      ecology;                // description of the ecology of the creature
    private int         experienceValue;        // experience value for facing creature.
    private FrequencyEnum   frequency;              // how often the creature is found.
    private String      habitatDescription;     // the description of the creature's habitat
    private String[]    individualTreasureType; // the type of treasure the creature carries
    private String[]    lairTreasureType;       // the type of treasure in the creature's lair
    private int         magicResistance;        // magic resistance of creature
    private int         morale;                 // morale of creature
    private String      name;                   // name of creature
    private int         numberAppearing;        // number of creatures appearing
    private int         numberInLair;           // number of creatures in lair.           
    private int         numberOfAttacks;        // number of attacks per round
    private String      organization;           // description of creature's organization
    private String      size;                   // size of creature.
    private String      society;                // description of creature's society
    private String[]    specialAttack;          // special attacks of creature
    private String[]    specialDefense;         // special defense of creature.
    private int         terrainId;              // Terrain the creature is found.

    public Creature() {
        super();
        activity                = "Day";
        bonusHitPoints          = 0;
        climateId               = 0; 
        combatDescription       = "Combat";
        damagePerAttack         = new int[1];
        description             = "Description";
        diet                    = "Diet";
        ecology                 = "Ecology";
        experienceValue         = 0;
        frequency               = FrequencyEnum.COMMON;
        habitatDescription      = "Habitat";
        individualTreasureType  = new String[1];
        lairTreasureType        = new String[1];
        magicResistance         = 0;
        name                    = "name";
        numberAppearing         = 1;
        numberInLair            = 1;
        numberOfAttacks         = 1;
        organization            = "Organization";
        size                    = "Size";
        society                 = "Society";
        specialAttack           = new String[1];
        specialDefense          = new String[1];
        terrainId               = 0;
    }

    public Creature(String name){
        this();
        this.name = name;
    }
    
    public Creature(Creature creature) {
        super(creature);

        activity                = creature.getActivity();
        bonusHitPoints          = creature.getBonusHitPoints();
        climateId               = creature.getClimateId(); 
        combatDescription       = creature.getCombatDescription();
        damagePerAttack         = creature.getDamagePerAttack();
        description             = creature.getDescription();
        diet                    = creature.getDiet();
        ecology                 = creature.getEcology();
        frequency               = creature.getFrequency();
        individualTreasureType  = creature.getIndividualTreasureType();
        habitatDescription      = creature.getHabitatDescription();
        lairTreasureType        = creature.getLairTreasureType();
        magicResistance         = creature.getMagicResistance();
        name                    = creature.getName();
        numberAppearing         = creature.getNumberAppearing();
        numberInLair            = creature.getNumberInLair();
        numberOfAttacks         = creature.getNumberOfAttacks();
        organization            = creature.getOrganization();
        size                    = creature.getSize();
        society                 = creature.getSociety();
        specialAttack           = creature.getSpecialAttack();
        specialDefense          = creature.getSpecialDefense();
        terrainId               = creature.getTerrainId();
    }

    
    /**
     * Returns the activity for the creature.
     * @return the activity for the creature.
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the activity of the creature
     * @param activity the activity of the creature.
     */
    public void setActivity(String activity) {
        this.activity = activity;
    }

    /**
     * Returns the bonus hit points for a creature
     * @return the bonus hit points for a creature
     */
    public int getBonusHitPoints() {
        return bonusHitPoints;
    }

    /**
     * Sets the bonus hit points for a creature.
     * @param bonusHitPoints the bonus hit points for a creature.
     */
    public void setBonusHitPoints(int bonusHitPoints) {
        this.bonusHitPoints = bonusHitPoints;
    }

    
    /**
     * Returns the climate the creature is in.
     * @return the climate the creature is in.
     * */
    public int getClimateId() {
        return climateId;
    }

    /**
     * Sets the climates the creature is in. 
     * @param climate the climates the creature is in.
     */
    public void setClimateId(int climate) {
        if(climate >= 0){
            this.climateId = climate;
        }
        else{
            this.climateId = 0;
        }
    }

    /**
     * Returns the description of combatDescription for the creature
     * @return the description of combatDescription for the creature
     */
    public String getCombatDescription() {
        return combatDescription;
    }

    /**
     * Sets the description of the combatDescription for the creature.
     * @param combat the description of the combatDescription for the creature.
     */
    public void setCombatDescription(String combat) {
        this.combatDescription = combat;
    }

    /**
     * Returns the damage per attack.
     * @return the damage per attack.
     */
    public int[] getDamagePerAttack() {
        return damagePerAttack;
    }

    /**
     * Sets the damage per attack.
     * @param damagePerAttack the damage per attack.
     */
    public void setDamagePerAttack(int[] damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    /**
     * Returns the description of the creature.
     * @return the description of the creature.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the creature
     * @param description the description of the creature.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the diet of the creature.
     * @return the diet of the creature
     */
    public String getDiet() {
        return diet;
    }
    
    /**
     * Sets the diet of the creature.
     * @param diet the diet of the creature.
     */
    public void setDiet(String diet) {
        this.diet = diet;
    }

    /**
     * Returns the description of the ecology of the creature.
     * @return the description of the ecology of the creature.
     */
    public String getEcology() {
        return ecology;
    }

    /**
     * Sets the description of the ecology of the creature.
     * @param ecology the description of the ecology of the creature.
     */
    public void setEcology(String ecology) {
        this.ecology = ecology;
    }

    /**
     * Returns the experience value of a creature.
     * @return the experience value of a creature.
     */
    public int getExperienceValue() {
        return experienceValue;
    }

    /**
     * Sets the experience value of a creature.
     * @param experienceValue the experience value of a creature.
     */
    public void setExperienceValue(int experienceValue) {
        this.experienceValue = experienceValue;
    }

    
    /**
     * Returns the frequency of the creature.
     * @return the frequency of the creature.
     */
    public FrequencyEnum getFrequency() {
        return frequency;
    }

    /**
     * Sets the frequency of the creature.
     * @param frequency the frequency of the creature.
     */
    public void setFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
    }

    /**
     * Returns the description of the creature's habitat
     * @return the description of the creature's habitat
     */
    public String getHabitatDescription() {
        return habitatDescription;
    }

    /**
     * Sets the description of the creature's habitat
     * @param habitatDescription the description of the creature's habitat
     */
    public void setHabitatDescription(String habitatDescription) {
        this.habitatDescription = habitatDescription;
    }

    
    /**
     * Returns the treasure type carried by the creature.
     * @return the treasure type carried by the creature.
     */
    public String[] getIndividualTreasureType() {
        return individualTreasureType;
    }

    /**
     * Sets the treasure type carried by the creature.
     * @param individualTreasureType the treasure type carried by the creature.
     */
    public void setIndividualTreasureType(String[] individualTreasureType) {
        this.individualTreasureType = individualTreasureType;
    }

    /**
     * Returns the treasure type in the creature's lair.
     * @return the treasure type in the creature's lair.
     */
    public String[] getLairTreasureType() {
        return lairTreasureType;
    }

    /**
     * Sets the treasure type in the creature's lair.
     * @param lairTreasureType the treasure type in the creature's lair.
     */
    public void setLairTreasureType(String[] lairTreasureType) {
        this.lairTreasureType = lairTreasureType;
    }

    /**
     * Returns the creature's magic resistance.
     * @return the creature's magic resistance.
     */
    public int getMagicResistance() {
        return magicResistance;
    }

    /**
     * Sets the creature's magic resistance.
     * @param magicResistence the creature's magic resistance.
     */
    public void setMagicResistance(int magicResistance) {
        if(magicResistance >= 0){
            this.magicResistance = magicResistance;
        }
        else{
            this.magicResistance = 0;
        }
    }

    /**
     * Returns the creature's morale.
     * @return the creature's morale.
     */
    public int getMorale() {
        return morale;
    }

    /**
     * Sets the creature's morale.
     * @param morale the creature's morale.
     */
    public void setMorale(int morale) {
        if(morale >= 0){
            this.morale = morale;
        }
        else{
            this.morale = 0;
        }
    }

    /**
     * Returns the name of the creature.
     * @return the name of the creature.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the creature.
     * @param name the name of the creature.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /**
     * Returns the number of creatures encountered.
     * @return the number of creatures encountered.
     */
    public int getNumberAppearing() {
        return numberAppearing;
    }

    /**
     * Sets the number of creatures encountered.
     * @param numberAppearing the number of creatures encountered.
     */
    public void setNumberAppearing(int numberAppearing) {
        if(numberAppearing > 0){
            this.numberAppearing = numberAppearing;
        }
        else{
            this.numberAppearing = 1;
        }
    }

    /**
     * Returns the number of creatures found in a lair.
     * @return the number of creatures found in a lair.
     */
    public int getNumberInLair() {
        return numberInLair;
    }

    /**
     * Sets the number of creatures found in a lair.
     * @param numberInLair the number of creatures found in a lair.
     */
    public void setNumberInLair(int numberInLair) {
        if(numberInLair > 0){
            this.numberInLair = numberInLair;
        }
        else{
            this.numberInLair = 1;
        }
    }

    
    /**
     * Returns the number of attacks per round a creature gets.
     * @return the number of attacks per round a creature gets.
     */
    public int getNumberOfAttacks() {
        return numberOfAttacks;
    }

    /**
     * Sets the number of attacks per round a creature gets.
     * @param numberOfAttacks the number of attacks per round a creature gets.
     */
    public void setNumberOfAttacks(int numberOfAttacks) {
        if(numberOfAttacks > 0){
            this.numberOfAttacks = numberOfAttacks;
        }
        else{
            this.numberOfAttacks = 1;
        }
    }

    /**
     * Returns the description of the organization of the creature.
     * @return the description of the organization of the creature.
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the description of the organization of the creature.
     * @param organization the description of the organization of the creature.
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * Returns the creature's size.
     * @return the creature's size.
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the creature's size.
     * @param size the creature's size.
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Returns the description of the creature's society.
     * @return the description of the creature's society.
     */
    public String getSociety() {
        return society;
    }

    /**
     * Sets the description of the creature's society.
     * @param society the description of the creature's society.
     */
    public void setSociety(String society) {
        this.society = society;
    }

    /**
     * Returns the special attacks of the creature.
     * @return the special attacks of the creature.
     */
    public String[] getSpecialAttack() {
        return specialAttack;
    }

    /**
     * Sets the special attacks of the creature.
     * @param specialAttack the special attacks of the creature.
     */
    public void setSpecialAttack(String[] specialAttack) {
        this.specialAttack = specialAttack;
    }

    /**
     * Returns the special defenses of the creature.
     * @return the special defenses of the creature.
     */
    public String[] getSpecialDefense() {
        return specialDefense;
    }

    /**
     * Sets the special defenses of the creature.
     * @param specialDefense the special defenses of the creature.
     */
    public void setSpecialDefense(String[] specialDefense) {
        this.specialDefense = specialDefense;
    }

    /**
     * Returns the id of the terrain where the creature is found.
     * @return the id of the terrain where the creature is found.
     */
    public int getTerrainId() {
        return terrainId;
    }

    /**
     * Sets the terrain id where the creature is found.
     * @param terrainId the terrain id where the creature is found.
     */
    public void setTerrainId(int terrainId) {
        this.terrainId = terrainId;
    }
    
    
}
