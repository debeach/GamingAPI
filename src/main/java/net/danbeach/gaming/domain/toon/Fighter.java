package net.danbeach.gaming.domain.toon;

/**
 * Created with IntelliJ IDEA.
 * User: deb
 * Date: 9/28/13
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Fighter extends PlayerCharacter {
    public Fighter() {
    }

    public Fighter(int strength, int intelligence, int wisdom, int dexterity,
                   int constitution, int charisma, int comeliness,
                   int strengthPercent) {
        super(strength, intelligence, wisdom, dexterity, constitution,
                charisma, comeliness, strengthPercent);
    }

    public Fighter(Fighter fighter){
        super(fighter);
    }
    

}
