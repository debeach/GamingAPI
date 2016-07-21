package net.danbeach.gaming.utility.toon;

import net.danbeach.gaming.constants.toon.RaceEnum;

import java.lang.Exception;
import java.lang.NullPointerException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: deb
 * Date: 9/20/13
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class RogueSkill {
    public static final int APPRAISAL       = 0;
    public static final int CLIMBWALL       = 1;
    public static final int FINDTRAP        = 2;
    public static final int HEARNOISE       = 3;
    public static final int HIDEINSHADOW    = 4;
    public static final int MOVESILENT      = 5;
    public static final int OPENLOCK        = 6;
    public static final int PICKPOCKET      = 7;
    public static final int REMOVETRAP      = 8;

    public static final int ALL             = 20;
    public static final int NONE            = 21;

    public static final int ROGUE_BASE      = 0;
    public static final int ROGUE_RACE      = 1;
    public static final int ROGUE_DEX       = 2;
    public static final int ROGUE_ARMOR     = 3;
    public static final int ROGUE_OTHER     = 4;

    public static final int NUMBER_OF_ROGUE_SKILLS = 9;
    public static final int NUMBER_OF_ROGUE_ITEMS  = 5;

    private final static int[] DWARF_ROGUE_SKILL_ADJUSTMENT =
            {-10, 15, 0, 0, 0, 10, 0, 15};
    private final static int[] ELF_ROGUE_SKILL_ADJUSMENT =
            {0, 0, 5, 10, 5, -5, 5, 0};
    private final static int[] GNOME_ROGUE_SKILL_ADJUSTMENT =
            {-15, 10, 10, 5, 5, 5, 0, 10};
    private final static int[] HALFELF_ROGUE_SKILL_ADJUSTMENT =
            {0, 0, 0, 0, 5, 0, 10, 0};
    private final static int[] HALFLING_ROGUE_SKILL_ADJUSTMENT =
            {-15, 5, 5, 15, 10, 5, 5, 5};

    private final static int CHAIN_MAIL_ARMOR = -25;
    private final static int LEATHER_ARMOR = -5;
    private final static int NO_ARMOR = 0;
    private final static int PLATE_MAIL_ARMOR = -60;
    private final static int SCALE_MAIL_ARMOR = -35;
    private final static int SPLINT_MAIL_ARMOR = -40;
    private final static int STUDDED_LEATHER_ARMOR = -10;

    private int climbWall;
    private int findTrap;
    private int hearNoise;
    private int hideInShadow;
    private int moveSilent;
    private int openLock;
    private int pickPocket;
    private int removeTrap;
    private int armorWorn;
    private int dexterityAdjust;

    private int[] raceAdjust;
//-----------------------------------------------------------------------------

    /**
     * Returns the penalty for any armor worn.
     * @return the penalty for any armor worn.
     */
    public int getArmorWorn() {
        return armorWorn;
    }

    /**
     * Returns the Climb Wall rogue skill.
     * @return the climb wall value.
     */
    public int getClimbWall() {
        return climbWall;
    }

    /**
     * Returns the dexterity adjustments for the rogue skill.
     * @return the dexterity adjustment.
     */
    public int getDexterityAdjust() {
        return dexterityAdjust;
    }

    /**
     * Returns the Find Trap rogue skill.
     * @return the find trap value.
     */
    public int getFindTrap() {
        return findTrap;
    }

    /**
     * Returns the Hear Noise rogue skill.
     * @return the hear noise value
     */
    public int getHearNoise() {
        return hearNoise;
    }

    /**
     * Returns the Hide in Shadows rogue skill.
     * @return the hide in shadows value.
     */
    public int getHideInShadow() {
        return hideInShadow;
    }

    /**
     * Returns the Move Silently rogue skill.
     * @return the move silently value.
     */
    public int getMoveSilent() {
        return moveSilent;
    }

    /**
     * Returns the Open Lock rogue skill.
     * @return the open lock value.
     */
    public int getOpenLock() {
        return openLock;
    }

    /**
     * Returns the Pick Pocket rogue skill.
     * @return the pick pocket value.
     */
    public int getPickPocket() {
        return pickPocket;
    }

    /**
     * Returns the race adjustment array.
     * @return the race adjustment array.
     */
    public int[] getRaceAdjust() {
        return raceAdjust;
    }

    /**
     * Returns the Remove Trap rogue skill.
     * @return the remove trap value.
     */
    public int getRemoveTrap() {
        return removeTrap;
    }

    /**
     * Sets the Climb Wall rogue skill. It cannot be a negative value.
     * @param climbWall the value to store in climbWall.
     */
    public void setClimbWall(int climbWall) {
        if(climbWall >= 0){
            this.climbWall = climbWall;
        }
        else{
            this.climbWall = 0;
        }
    }

    /**
     * Sets the dexterity adjustments for the rogue skills. The argument
     * passed is the dexterity for the character. This will be used to
     * calculate the dexterity adjustment.
     * @param dexterity the integer representing the character's dexterity.
     */
    public void setDexterityAdjust(int dexterity) {
        try {
            switch(dexterity){
                case 1:
                case 2:
                case 3:
                    dexterityAdjust = -99;
                    break;
                case 4:
                    dexterityAdjust = -90;
                    break;
                case 5:
                    dexterityAdjust = -80;
                    break;
                case 6:
                    dexterityAdjust = -70;
                    break;
                case 7:
                    dexterityAdjust = -50;
                    break;
                case 8:
                    dexterityAdjust = -20;
                    break;
                case 9:
                    dexterityAdjust = -15;
                    break;
                case 10:
                    dexterityAdjust = -10;
                    break;
                case 11:
                    dexterityAdjust = -5;
                    break;
                case 16:
                    dexterityAdjust = 5;
                    break;
                case 17:
                    dexterityAdjust = 10;
                    break;
                case 18:
                    dexterityAdjust = 15;
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    dexterityAdjust = 20;
                    break;
                default:
                    dexterityAdjust = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the Find Trap rogue skill. This cannot be a negative value.
     * @param findTrap the value to store in findTrap.
     */
    public void setFindTrap(int findTrap) {
        if(findTrap >= 0){
            this.findTrap = findTrap;
        }
        else{
            this.findTrap = 0;
        }
    }

    /**
     * Sets the Hear Noise rogue skill. This cannot be a negative value.
     * @param hearNoise the value to store in hearNoise.
     */
    public void setHearNoise(int hearNoise) {
        if(hearNoise >= 0){
            this.hearNoise = hearNoise;
        }
        else{
            this.hearNoise = 0;
        }
    }

    /**
     * Sets the Hide in Shadows rogue skill. This cannot be a negative value.
     * @param hideInShadow the value stored in hideShadow.
     */
    public void setHideInShadow(int hideInShadow) {
        if(hideInShadow >= 0){
            this.hideInShadow = hideInShadow;
        }
        else{
            this.hideInShadow = 0;
        }
    }

    /**
     * Sets the Move Silently rogue skill. This cannot be a negative value.
     * @param moveSilent the value stored in moveSilent.
     */
    public void setMoveSilent(int moveSilent) {
        if(moveSilent >= 0){
            this.moveSilent = moveSilent;
        }
        else{
            this.moveSilent = 0;
        }
    }

    /**
     * Sets the Open Lock rogue skill. This cannot be a negative value.
     * @param openLock the value stored in openLock.
     */
    public void setOpenLock(int openLock) {
        if(openLock >= 0){
            this.openLock = openLock;
        }
        else{
            this.openLock = 0;
        }
    }

    /**
     * Sets the Pick Pocket rogue skill. This cannot be a negative value.
     * @param pickPocket the value stored in pickPocket.
     */
    public void setPickPocket(int pickPocket) {
        if(pickPocket >= 0){
            this.pickPocket = pickPocket;
        }
        else{
            this.pickPocket = 0;
        }
    }

    /**
     * Sets the race adjustment for rogue skills. values in the array can be
     * negative. The argument is the race of the toon.
     * @param myRace the race object of the toon.
     */
    public void setRaceAdjust(RaceEnum myRace) {
        try {
            if(myRace == RaceEnum.DWARF){
                raceAdjust = RogueSkill.DWARF_ROGUE_SKILL_ADJUSTMENT;
            }
            else if(myRace == RaceEnum.ELF){
                raceAdjust = RogueSkill.ELF_ROGUE_SKILL_ADJUSMENT;
            }
            else if(myRace == RaceEnum.GNOME){
                raceAdjust = RogueSkill.GNOME_ROGUE_SKILL_ADJUSTMENT;
            }
            else if(myRace == RaceEnum.HALFELF){
                raceAdjust = RogueSkill.HALFELF_ROGUE_SKILL_ADJUSTMENT;
            }
            else if(myRace == RaceEnum.HALFLING){
                raceAdjust = RogueSkill.HALFLING_ROGUE_SKILL_ADJUSTMENT;
            }
            else{
                Arrays.fill(raceAdjust, 0);
            }
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the Remove Trap rogue skill. This cannot be a negative value.
     * @param removeTrap the value stored in removeTrap.
     */
    public void setRemoveTrap(int removeTrap) {
        this.removeTrap = removeTrap;
    }
//-----------------------------------------------------------------------------


    public RogueSkill() {
        climbWall = 0;
        findTrap = 0;
        hearNoise = 0;
        hideInShadow = 0;
        moveSilent = 0;
        openLock = 0;
        pickPocket = 0;
        removeTrap = 0;
        armorWorn = 0;
        raceAdjust = new int[NUMBER_OF_ROGUE_SKILLS];
        dexterityAdjust = 0;

        Arrays.fill(raceAdjust, 0);
    }

    public RogueSkill(int climbWall, int findTrap, int hearNoise,
                      int hideInShadow, int moveSilent, int openLock,
                      int pickPocket, int removeTrap) {
        setClimbWall(climbWall);
        setFindTrap(findTrap);
        setHearNoise(hearNoise);
        setHideInShadow(hideInShadow);
        setMoveSilent(moveSilent);
        setOpenLock(openLock);
        setPickPocket(pickPocket);
        setRemoveTrap(removeTrap);
        armorWorn = 0;
        dexterityAdjust = 0;
        raceAdjust = new int[NUMBER_OF_ROGUE_SKILLS];

        Arrays.fill(raceAdjust, 0);
    }

    public RogueSkill(RogueSkill rogueSkill){
        this.setClimbWall(rogueSkill.getClimbWall());
        this.setFindTrap(rogueSkill.getFindTrap());
        this.setHearNoise(rogueSkill.getHearNoise());
        this.setHideInShadow(rogueSkill.getHideInShadow());
        this.setMoveSilent(rogueSkill.getMoveSilent());
        this.setOpenLock(rogueSkill.getOpenLock());
        this.setPickPocket(rogueSkill.getPickPocket());
        this.setRemoveTrap(rogueSkill.getRemoveTrap());
        armorWorn = rogueSkill.getArmorWorn();
        dexterityAdjust = rogueSkill.getDexterityAdjust();
        raceAdjust = rogueSkill.getRaceAdjust();
    }
//-----------------------------------------------------------------------------

    /**
     * Adds the penalty for wearing chain mail armor while trying to perform
     * rogue skills.
     */
    public void addChainMailArmor(){
        armorWorn = RogueSkill.CHAIN_MAIL_ARMOR;
    }

    /**
     * Adds the penalty for wearing leather armor while trying to perform
     * rogue skills.
     */
    public void addLeatherArmor(){
        armorWorn = RogueSkill.LEATHER_ARMOR;
    }

    /**
     * Adds the penalty for wearing no armor while trying to perform rogue
     * skills.
     */
    public void addNoArmor(){
        armorWorn = RogueSkill.NO_ARMOR;
    }

    /**
     * Adds the penalty for wearing plate mail armor while trying to perform
     * rogue skills.
      */
    public void addPlateMailArmor(){
        armorWorn = RogueSkill.PLATE_MAIL_ARMOR;
    }

    /**
     * Adds the penalty for wearing scale mail armor while trying to perform
     * rogue skills.
     */
    public  void addScaleMailArmor(){
        armorWorn = RogueSkill.SCALE_MAIL_ARMOR;
    }

    /**
     * Adds the penalty for wearing splint mail armor while trying to perform
     * rogue skills.
     */
    public void addSplintMailArmor(){
        armorWorn = RogueSkill.SPLINT_MAIL_ARMOR;
    }

    /**
     * Adds the penalty for wearing studded leather armor while trying to
     * perform rogue skills.
     */
    public void addStuddedLeatherArmor(){
        armorWorn = RogueSkill.STUDDED_LEATHER_ARMOR;
    }

    /**
     * Calculates the climb wall rogue skill. It uses the rogue skill climb
     * wall, race adjustment, dexterity adjustment, and armor worn.
     * @return the climb wall rogue skill.
     */
    public int calculateClimbWall(){
        return climbWall + raceAdjust[RogueSkill.CLIMBWALL]
                + dexterityAdjust + armorWorn;
    }

    /**
     * Calculates the find trap rogue skill. It uses the rogue skill find
     * trap and race adjustment.
     * @return the find trap rogue skill.
     */
    public int calculateFindTrap(){
        return findTrap + raceAdjust[RogueSkill.FINDTRAP];
    }

    /**
     * Calculates the hear noise rogue skill. It uses the rogue skill hear
     * noise and the race adjustment.
     * @return the hear noise rogue skill.
     */
    public int calculateHearNoise(){
        return hearNoise + raceAdjust[RogueSkill.HEARNOISE];
    }

    /**
     * Calculates the hide in shadows rogue skill. It uses the hide in
     * shadows rogue skill, race adjustment, dexterity adjustment, and
     * armor worn.
     * @return the hide in shadows rogue skill.
     */
    public int calculateHideInShadow(){
        return hideInShadow + raceAdjust[RogueSkill.HIDEINSHADOW]
                + dexterityAdjust + armorWorn;
    }

    /**
     * Calculates the move silently rogue skill. It uses the move silently
     * rogue skill, race adjustment, dexterity adjustment, and armor worn.
     * @return the move silently rogue skill.
     */
    public int calculateMoveSilent(){
        return moveSilent + raceAdjust[RogueSkill.MOVESILENT]
                + dexterityAdjust + armorWorn;
    }

    /**
     * Calculates the open lock rogue skill. It uses the open lock rogue
     * skill, race adjustment, dexterity adjustment, and armor worn.
     * @return the open lock rogue skill.
     */
    public int calculateOpenLock(){
        return openLock + raceAdjust[RogueSkill.OPENLOCK]
                + dexterityAdjust + armorWorn;
    }

    /**
     * Calculates the pick pocket rogue skill. It uses the pick pocket rogue
     * skill, race adjustment, dexterity adjustment, and armor worn.
     * @return the pick pocket rogue skill.
     */
    public int calculatePickPocket(){
        return pickPocket + raceAdjust[RogueSkill.PICKPOCKET]
                + dexterityAdjust + armorWorn;
    }

    /**
     * Calculates the remove trap rogue skill. It uses the remove trap rogue
     * skill, race adjustment, dexterity adjustment, and armor worn.
     * @return the remove trap rogue skill.
     */
    public int calculateRemoveTrap(){
        return removeTrap + raceAdjust[RogueSkill.REMOVETRAP]
                + dexterityAdjust + armorWorn;
    }
}
