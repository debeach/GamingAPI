/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.item;

import net.danbeach.gaming.constants.BaseColorEnum;
import net.danbeach.gaming.exception.GamingErrorCodeEnum;
import net.danbeach.gaming.exception.GamingException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;


/**
 *
 * @author deb
 */
@Entity
@Table(schema = "GAMING", name = "POTION")
public class Potion extends AbstractMagicItem {

    // used to calculate the actual color of the potion. Game color is handled in Item object
    @Column(name = "base_color")
    @Enumerated(EnumType.ORDINAL)
    private BaseColorEnum baseColor;

    // how many uses the potion has.
    @Column(name = "doses")
    private Integer doses;

    // how long the potion lasts.
    @Column(name = "duration")
    private Integer duration;
/////////////////////////////////////////////////

    public Potion(){
        super();
        this.baseColor = BaseColorEnum.WHITE;
        this.doses = 0;
        this.duration = 0;
    }
    
    public Potion(Potion potion){
        super(potion);
        this.setBaseColor(potion.getBaseColor());
        this.setDoses(potion.getDoses());
        this.setDuration(potion.getDuration());
    }
    /////////////////////////////////////////////

    public BaseColorEnum getBaseColor() {
        return this.baseColor;
    }

    /**
     * Base color is used to determine the actual color of the potion. Example: a blue base color may be dark blue,
     * light blue, turquoise, and so on.
     * @param baseColor The base color stored in the BaseColorEnum.
     */
    public void setBaseColor(BaseColorEnum baseColor) {
        this.baseColor = baseColor;
    }

    public Integer getDoses() {
        return this.doses;
    }

    /**
     * Sets the doses the potion has. The doses should never be less than 0. A Potion of 0 doses is an empty or bad
     * potion.
     * @param doses the number of doses a potion contains. Negative values not allowed.
     */
    public void setDoses(Integer doses) {
        if(doses < 0){
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Number of potion doses cannot be negative value");
        }
        this.doses = doses;
    }

    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the duration for a potion. It should be never less than 0. A potion duration of zero is instantaneous.
     * @param duration the duration a potion lasts. A duration of 0 is instantaneous. Negative values not allowed.
     */
    public void setDuration(Integer duration) {
        if(duration < 0){
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Potion Duration must be more greater than 0");
        }
        this.duration = duration;
    }

}
