/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.constants.treasure;

/**
 *
 * @author deb
 */
public enum JewelryTypeEnum {
    AMULET(1, "Amulet"),
    ANKLET(2, "Anklet"),
    ARM_BAND(3, "Arm Band"),
    BRACER(4, "Bracer"),
    BRACLET(5, "Braclet"),
    BROOCH(6, "Brooch"),
    CIRCLET(7, "Circlet"),
    EARRING(8, "Earrings"),
    FILLET(9, "Fillet"),
    GORGET(10, "Gorget"),
    HEADBAND(11, "Headband"),
    LOCKET(12, "Locket"),
    NECKLACE(13, "Necklace"),
    PENDANT(14, "Pendant"),
    RING(15, "Ring"),
    RINGLET(16, "Ringlet"),
    TORC(17, "Torc");
    
    private String name;
    private int id;
    
    private JewelryTypeEnum(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getBaseName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    
}
