/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.toon;

import net.danbeach.gaming.domain.item.Armor;
import net.danbeach.gaming.domain.item.Item;

/**
 *
 * @author deb
 */
public class AnimalCompanion extends Creature{
    private double  carryCapacity;
    private double  loyalty;
    private Armor   barding;
    private Item    saddle;

    public AnimalCompanion() {
        super();
        carryCapacity   = 0.0;
        loyalty         = 50.0;
        barding         = new Armor();
        saddle          = new Item();
    }
    
    public AnimalCompanion(AnimalCompanion animal){
        super(animal);
//        this.setAge(animal.getAge());
//        this.setAlignment(animal.getAlignment());
//        this.setCharisma(animal.getCharisma());
//        this.setComeliness(animal.getComeliness());
//        this.setConstitution(animal.getConstitution());
//        this.setCurrentHitPoints(animal.getCurrentHitPoints());
//        this.setDexterity(animal.getDexterity());
//        this.setGender(animal.getGender());
//        this.setHeight(animal.getHeight());
//        this.setHitPoints(animal.getHitPoints());
//        this.setIntelligence(animal.getIntelligence());
//        this.setLevel(animal.getLevel());
//        this.setMoveRate(animal.getMoveRate());
//        this.setRace(animal.getRace());
//        this.setStrength(animal.getStrength(), animal.getStrengthPercent());
//        this.setWeight(animal.getWeight());
//        this.setWisdom(animal.getWisdom());
//        this.setActivity(animal.getActivity());
//        this.setClimate(animal.getClimate()); 
//        this.setCombat(animal.getCombat());
//        this.setDamagePerAttack(animal.getDamagePerAttack());
//        this.setDescription(animal.getDescription());
//        this.setDiet(animal.getDiet());
//        this.setEcology(animal.getEcology());
//        this.setFrequency(animal.getFrequency());
//        this.setIndividualTreasureType(animal.getIndividualTreasureType());
//        this.setLairTreasureType(animal.getLairTreasureType());
//        this.setMagicResistance(animal.getMagicResistance());
//        this.setName(animal.getName());
//        this.setNumberAppearing(animal.getNumberAppearing());
//        this.setNumberInLair(animal.getNumberInLair());
//        this.setNumberOfAttacks(animal.getNumberOfAttacks());
//        this.setOrganization(animal.getOrganization());
//        this.setSize(animal.getSize());
//        this.setSociety(animal.getSociety());
//        this.setSpecialAttack(animal.getSpecialAttack());
//        this.setSpecialDefense(animal.getSpecialDefense());
        carryCapacity   = animal.getCarryCapacity();
        loyalty         = animal.getLoyalty();
        barding         = animal.getBarding();
//        saddle          = animal.getBarding();
    }

    /**
     * Returns the carry capacity of the animal.
     * @return the carry capacity of the animal.
     */
    public double getCarryCapacity() {
        return carryCapacity;
    }

    /**
     * Sets the carry capacity of the animal.
     * @param carryCapacity the carry capacity of the animal.
     */
    public void setCarryCapacity(double carryCapacity) {
        if(carryCapacity >= 0.0){
            this.carryCapacity = carryCapacity;
        }
        else{
            this.carryCapacity = 0.0;
        }
    }

    public double getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(double loyalty) {
        if(loyalty >= 0.0){
            this.loyalty = loyalty;
        }
        else{
            this.loyalty = 0.0;
        }
    }

    
    /**
     * Returns the barding worn by the animal.
     * @return the barding worn by the animal.
     */
    public Armor getBarding() {
        return barding;
    }

    /**
     * Sets the barding worn by the animal.
     * @param barding the barding worn by the animal.
     */
    public void setBarding(Armor barding) {
        this.barding = barding;
    }

    /**
     * Returns the saddle worn by animal.
     * @return the barding worn by the animal.
     */
    public Item getSaddle() {
        return saddle;
    }
    
    /**
     * Sets the barding worn by the animal.
     * @param saddle the barding worn by the animal.
     */
    public void setSaddle(Item saddle) {
        this.saddle = saddle;
    }
    
    
}
