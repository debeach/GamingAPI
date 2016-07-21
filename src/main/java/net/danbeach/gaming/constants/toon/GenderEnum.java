/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants.toon;

/**
 *
 * @author deb
 */
public enum GenderEnum {
    
    NONE(0, "None"),
    MALE(1, "Male"),
    FEMALE(2, "Female");
    
    String name;
    int valueOf;
    
    private GenderEnum(int category, String name){
        this.name = name;
        this.valueOf = category;
    }

    public String getName() {
        return name;
    }

    public int getValueOf() {
        return valueOf;
    }
    
    public static GenderEnum fromString(String theName){
        if(theName != null){
            for(GenderEnum gender : GenderEnum.values()){
                if(theName.equalsIgnoreCase(gender.getName())){
                    return gender;
                }
            }
        }
        return null;
    }
    
    public static GenderEnum fromNumber(int number){
        if(number >= 0){
            for(GenderEnum gender : GenderEnum.values()){
                if(number == gender.getValueOf()){
                    return gender;
                }
            }
        }
        return null;
    }
    
}
