/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.domain.item;

import net.danbeach.gaming.domain.item.Armor;

/**
 *
 * @author deb
 */
public class Ring extends Armor {
    
    public static final int RIGHT_HAND  = 0;
    public static final int LEFT_HAND   = 1;
    
    public Ring(){
        super();
    }
    
    public Ring(Ring ring){
        super(ring);
    }
}
