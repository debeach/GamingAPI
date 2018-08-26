/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author deb
 */
@Entity
@Table(schema = "GAMING", name = "ROD")
public class Rod extends AbstractMagicItem {

    public static final Integer MAX_NUMBER_OF_CHARGES = 25;
    /////////////////////////////////////////////////////////////////////////////////////

    @Transient
    private Integer charges;

    // If a constant damage instead of number of dice.
    @Column(name = "damage")
    private Integer damage;

    // The number of dice when generating damage.
    @Column(name = "dice_number")
    private Integer diceNumber;

    // The dice type when generating damage. ie d4, d6, d8...
    @Column(name = "dice_type")
    private Integer diceType;

    // How long the effects of the rod last.
    @Column(name = "duration")
    private Integer duration;

    // How far the rod can reach.
    @Column(name = "range")
    private Integer range;
    /////////////////////////////////////////////////////////////////////////////////////

    public Rod(){
        this.charges = MAX_NUMBER_OF_CHARGES;
        this.range = 1;
        this.duration = 0;
    }
    
    public Rod(Rod rod){
        super(rod);
        this.setCharges(rod.getCharges());
        this.setRange(rod.getRange());
        this.setDuration(rod.getDuration());
    }
    
    public Integer getCharges() {
        return charges;
    }

    public void setCharges(Integer charges) {
        this.charges = charges;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}
