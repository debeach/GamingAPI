package net.danbeach.gaming.domain.toon;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: deb
 * Date: 9/23/13
 * Time: 9:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerCharacter extends Toon {
    private double  actualWeight;       // weight worn/carried by PC
//    private int     currentHitPoints;   // the player's current hit points
    private double  encumber;           // encumbrance of PC.
    private int     experiencePoints;   // PC's experience points
    private double  infamy;             // based upon good/evil acts
    private double  reputation;         // based upon accomplishments

    ArrayList<String>   notes;
    TreeSet<String>     areasVisited;
    TreeSet<String>     partyAdventure;
    TreeSet<String>     pcsMet;
   
//-----------------------------------------------------------------------------

    public PlayerCharacter() {
        super();
        this.actualWeight       = 0.0;
        this.encumber           = 1.0;
        this.experiencePoints   = 0;
        this.infamy             = 0.0;
        this.reputation         = 0.0;
        areasVisited            = new TreeSet<String>();
        notes                   = new ArrayList<String>();
        partyAdventure          = new TreeSet<String>();
        pcsMet                  = new TreeSet<String>();
    }

    public PlayerCharacter(  int strength, int intelligence, int wisdom, int dexterity,
                             int constitution, int charisma, int comeliness,
                             int strengthPercent){
        super(strength, intelligence, wisdom, dexterity, constitution,
                charisma, comeliness, strengthPercent);
        this.actualWeight       = 0.0;
//        this.currentHitPoints   = 0;
        this.encumber           = 1.0;
        this.experiencePoints   = 0;
        this.infamy             = 0.0;
        this.reputation         = 0.0;
        areasVisited            = new TreeSet<String>();
        notes                   = new ArrayList<String>();
        partyAdventure          = new TreeSet<String>();
        pcsMet                  = new TreeSet<String>();
    }

    public PlayerCharacter(PlayerCharacter playerCharacter){

        super(playerCharacter);
        this.setActualWeight(playerCharacter.getActualWeight());
        this.setEncumber(playerCharacter.getEncumber());
        this.setExperiencePoints(playerCharacter.getExperiencePoints());
        this.setInfamy(playerCharacter.getInfamy());
        this.setReputation(playerCharacter.getReputation());
        areasVisited = playerCharacter.getAreasVisited();
        notes = playerCharacter.getNotes();
        partyAdventure = playerCharacter.getPartyAdventure();
        pcsMet = playerCharacter.getPcsMet();
    }

    

    /**
     * Returns the actual weight that is carried by the PC. This includes all
     * that is worn by the PC.
     * @return the actual weight carried/worn by the PC
     */
    public double getActualWeight() {
        return actualWeight;
    }

    public TreeSet<String> getAreasVisited() {
        return areasVisited;
    }

    /**
     * Returns the player's current hit points.
     * @return the player's current hit points
     */
//    public int getCurrentHitPoints() {
//        return currentHitPoints;
//    }

    /**
     * Returns the PC's encumbrance.
     * @return the PC's encumbrance
     */
    public double getEncumber() {
        return encumber;
    }

    /**
     * Returns the PC's experience points.
     * @return the PC's experience points
     */
    public int getExperiencePoints() {
        return experiencePoints;
    }

    /**
     * Returns the PC's infamy.
     * @return the PC's infamy
     */
    public double getInfamy() {
        return infamy;
    }

    /**
     * returns the PC's notes.
     * @return the PC's notes.
     */
    public ArrayList<String> getNotes() {
        return notes;
    }

    /**
     * Returns the list of party and/or adventure the player has been in.
     * @return the list of party and/or adventure the player has been in.
     */
    public TreeSet<String> getPartyAdventure() {
        return partyAdventure;
    }

    /**
     * Returns the list of pcs met or known.
     * @return the list of pcs met of known.
     */
    public TreeSet<String> getPcsMet() {
        return pcsMet;
    }

    /**
     * Returns the PC's reputation.
     * @return the PC's reputation
     */
    public double getReputation() {
        return reputation;
    }

    /**
     * Sets the PC's weight of all items carried and/or worn. This cannot be
     * a negative value.
     * @param actualWeight the PC's actual weight
     */
    public void setActualWeight(double actualWeight) {
        if(actualWeight >= 0.0){
            this.actualWeight = actualWeight;
        }
        else{
            this.actualWeight = 0.0;
        }
    }

    /**
     * Sets the player's current hit points. This is the number of hit points
     * that the character may have at any given moment. The Toon hit points
     * will not change for a player character until it levels up. The
     * current hit points will be used during combat, healing, and so on.
     * This value can be a negative value and it can be greater than the toon
     * hit points (if magically buffed).
     * @param currentHitPoints the PC's current hit points
     */
//    public void setCurrentHitPoints(int currentHitPoints) {
//        this.currentHitPoints = currentHitPoints;
//    }

    /**
     * Sets the PC's encumbrance. This will be a value between 0.0 (completely
     * encumbered) and 1.0 (not encumbered). This value will be used to
     * determine attributes such as movement rate, combat initiative, and so
     * on.
     * @param encumber the PC's encumbrance
     */
    public void setEncumber(double encumber) {
        if(encumber >= 0.0){
            this.encumber = encumber;
        }
        else{
            this.encumber = 0.0;
        }
    }

    /**
     * Sets the PC's experience points. This cannot be a negative value.
     * @param experiencePoints the PC's experience points
     */
    public void setExperiencePoints(int experiencePoints) {
        if(experiencePoints >= 0){
            this.experiencePoints = experiencePoints;
        }
        else{
            this.experiencePoints = 0;
        }
    }

    /**
     * Sets the PC's infamy. This is determined by the PC's acts of good and
     * evil. This will be a number between 0.0 and 100.0. 0.0 is Loved. 100.0
     * is Infamous.
     * @param infamy the PC's infamy
     */
    public void setInfamy(double infamy) {
        if(infamy >= 0.0 && infamy <= 100.0){
            this.infamy = infamy;
        }
        else if(infamy > 100.0){
            this.infamy = 100.0;
        }
        else{
            this.infamy = 0.0;
        }
        //TODO: I need an example for Robby here.
    }

    /**
     * Sets the PC's reputation. This is determined by the PC's victories and
     * accomplishments. This will be a number from 0.0 to 100.0. 0.0 is
     * unknown, 100.0 is legendary.
     * @param reputation the PC's reputation
     */
    public void setReputation(double reputation) {
        if(reputation >= 0.0 && reputation <= 100.0){
            this.reputation = reputation;
        }
        else if(reputation > 100.0){
            this.reputation = 100.0;
        }
    else{
        this.reputation = 0.0;
    }
}
//-----------------------------------------------------------------------------



    /**
     * Will determine is a character is unconscious. If the player's current
     * hit points are less than zero then the character is considered
     * unconscious. This overrides the Toon method of the same name.
     * @return true is character's current hit points is less than zero.
     */
//    @Override
//    public boolean isConscious(){
//        if(currentHitPoints < 0){
//            return true;
//        }
//        return false;
//    }

    /**
     * Will determine is a character is dead. If the character's hit points
     * are less than zero minus the character's constitution. For example,
     * if the character's constitution is 15 and the character's current hit
     * points is -16, the character is considered dead. This will override
     * the Toon's method of the same name.
     * @return true if the pc negative current hit points less than constitution. 
     */
//    @Override
//    public boolean isDead(){
//        if(currentHitPoints < -(getConstitution())){
//            return true;
//        }
//        return false;
//    }
   
    /**
     * Updates the player character's current hit points. This value can be a
     * positive or negative value.
     * @param hitPoints the current hit points
     */
//    public void updateCurrentHitPoints(int hitPoints){
//        this.currentHitPoints += hitPoints;
//    }

}
