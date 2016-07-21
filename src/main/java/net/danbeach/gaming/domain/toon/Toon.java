package net.danbeach.gaming.domain.toon;


import net.danbeach.gaming.domain.item.Ring;
import net.danbeach.gaming.domain.item.Item;
import net.danbeach.gaming.domain.item.Cloak;
import net.danbeach.gaming.domain.item.Bracer;
import net.danbeach.gaming.domain.item.Boot;
import net.danbeach.gaming.domain.item.Armor;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import net.danbeach.gaming.constants.toon.AlignmentEnum;
import net.danbeach.gaming.constants.toon.GenderEnum;
import net.danbeach.gaming.constants.toon.RaceEnum;
import net.danbeach.gaming.constants.toon.IStat;
import net.danbeach.gaming.utility.toon.RogueSkill;
import net.danbeach.gaming.utility.toon.SavingThrow;

/**
 * Created with IntelliJ IDEA.
 * User: deb
 * Date: 9/22/13
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Toon implements Serializable {
    public static final int STRENGTH            = 0;
    public static final int INTELLIGENCE        = 1;
    public static final int WISDOM              = 2;
    public static final int DEXTERITY           = 3;
    public static final int CONSTITUTION        = 4;
    public static final int CHARISMA            = 5;
    public static final int COMELINESS          = 6;
    public static final int STRENGTH_PERCENT    = 7;

    // CHARISMA
    private int charisma;               // character's animal magnatism
    private int adjustInitialReaction;  // a NPC's initial reaction to PC.

    //COMELINESS
    private int comeliness;             // PC's physical attraction

    // CONSTITUTION
    private int constitution;           // PC's health
    private int adjustHitPoints;        // additional hit points per level
    private int physicalSavingBonus;    // physical saving throw bonus
    private int systemShock;            // ability to survive massive attacks
    private int resurrectSurvive;       // ability to survive resurrect attempt

    // DEXTERITY
    private int dexterity;              // PC's agility
    private int adjustArmorClass;       // additional armor class points
    private int combatReact;            // CURRENTLY OPTIONAL

    // INTELLIGENCE
    private int intelligence;           // PC's IQ
    private int numberOfLanguages;      // max number of languages other than native

    // STRENGTH
    private int strength;               // PC's physical strength
    private int strengthPercent;        // percentage if PC strength 18
    private int bendLift;               // ability to bend bars and lift portcullis
    private double maxPress;            // maximum weight a PC can press over their head
    private double maxWeight;           // maximum weight a PC can carry without encumbrance penalty
    private int openDoor;               // ability to open a stuck/jammed door
    private int toDamage;               // bonus points to damage
    private int toHit;                  // bonus points to hit

    // WISDOM
    private int wisdom;                 // PC's logic
    private int magicalSaveBonus;       // Magical saving throw bonus
    private int spellFailure;           // % chance a spell may fail casting.

    private int age;                    // PC's age
    private AlignmentEnum alignment;        // PC's personal perspective  ON HOLD - COULD THIS BE AN ENUM
    private int currentHitPoints;       // PC's current hit points
    private int deity;                  // PC's deity
    private String firstName;           // PC's first name
    private GenderEnum gender;              // PC's gender
    private double height;              // PC's height, in inches
    private int hitPoints;              // PC's maximum hit points
    private String lastName;            // PC's last name
    private int level;                  // PC's level / Hit Dice
    private double moveRate;            // PC's rate of movement, 12.0 max
    private RaceEnum race;                  // integer representing PC's race
    private int thacio;                 // thacio of the toon
    private String title;               // PC's title (lord, lady, ect)
    private double weight;              // PC's weight in pounds

    private Item boots;
    private Item bracer;


    private Armor[] armor;             // armor classes for pc.
    private Ring[] ringsWorn;          // rings worn by PC.
    private int[] coins;               // coins carried by PC (not vault).
    
    private int[][] rogueSkills;
    private int[][] savingThrows;      // saving throws of the toon.

    private HashMap<String, ArrayList<Item>> inventory;
//-----------------------------------------------------------------------------


    public Toon() {

        this.setCharisma(10);
        this.setComeliness(10);
        this.setConstitution(10);
        this.setDexterity(10);
        this.setIntelligence(10);
        this.setStrength(10,0);
        this.setWisdom(10);

        // TODO: add deity when they are completed.
        age = 1;
        alignment = AlignmentEnum.TRUE_NEUTRAL;
        currentHitPoints = 1;
        deity = 0;
        firstName = "first name";
        gender = GenderEnum.MALE;
        height = 1.0;
        hitPoints = 1;
        lastName = "last name";
        level = 0;
        moveRate = 12.0;
        race = RaceEnum.HUMAN;
        title = "title";
        weight = 1.0;

        boots = new Item();
        bracer = new Item();

        armor = new Armor[Armor.NUMBER_OF_ARMOR_SLOTS];
        ringsWorn = new Ring[2];
        coins = new int[4];
        thacio = 20;
        savingThrows = new int[SavingThrow.NUMBER_OF_SAVES][SavingThrow.NUMBER_OF_SAVE_ITEMS];
        rogueSkills = new int[RogueSkill.NUMBER_OF_ROGUE_SKILLS][RogueSkill.NUMBER_OF_ROGUE_ITEMS];
        Arrays.fill(coins, 0);

        inventory = new HashMap<String, ArrayList<Item>>();

        armor[Armor.ARMOR_ARMOR]    = new Armor();
        armor[Armor.ARMOR_SHIELD]   = new Armor();
        armor[Armor.ARMOR_HELM]     = new Armor();
        armor[Armor.ARMOR_OTHER]    = new Armor();
        armor[Armor.ARMOR_BOOTS]    = new Boot();
        armor[Armor.ARMOR_BRACER]   = new Bracer();
        armor[Armor.ARMOR_CLOAK]    = new Cloak();
    }

    public Toon(int strength, int intelligence, int wisdom, int dexterity,
                int constitution, int charisma, int comeliness,
                int strengthPercent) {
        this();
        this.setCharisma(charisma);
        this.setComeliness(comeliness);
        this.setConstitution(constitution);
        this.setDexterity(dexterity);
        this.setIntelligence(intelligence);
        this.setStrength(strength, strengthPercent);
        this.setWisdom(wisdom);
    }
    
    public Toon(Toon toon){
        this.age                = toon.getAge();
        this.alignment          = toon.getAlignment();
        this.setCharisma(toon.getCharisma());
        this.coins              = toon.getCoins();
        this.setComeliness(toon.getComeliness());
        this.setConstitution(toon.getConstitution());
        this.currentHitPoints   = toon.getCurrentHitPoints();
        this.deity              = toon.getDeity();
        this.setDexterity(toon.getDexterity());
        this.firstName          = toon.getFirstName();
        this.gender             = toon.getGender();
        this.height             = toon.getHeight();
        this.hitPoints          = toon.getHitPoints();
        this.setIntelligence(toon.getIntelligence());
        this.lastName           = toon.getLastName();
        this.level              = toon.getLevel();
        this.moveRate           = toon.getMoveRate();
        this.race               = toon.getRace();
        this.setStrength(toon.getStrength(),toon.getStrengthPercent());
        this.title              = toon.getTitle();
        this.weight             = toon.getWeight();
        this.setWisdom(toon.getWisdom());
        this.armor              = toon.getArmor();
        this.boots              = toon.getBoots();
        this.bracer             = toon.getBracer();
        this.coins              = toon.getCoins();
        this.inventory          = toon.getInventory();
        this.ringsWorn          = toon.getRingsWorn();
        this.rogueSkills        = toon.getRogueSkills();
        this.savingThrows       = toon.getSavingThrows();
        this.thacio             = toon.getThacio();
    }
//-----------------------------------------------------------------------------


    /**
     * Returns the armor class adjustment.
     * @return the armor class adjustment
     */
    public int getAdjustArmorClass() {
        return adjustArmorClass;
    }

    /**
     * Returns the hit point adjustment.
     * @return the hit point adjustment
     */
    public int getAdjustHitPoints() {
        return adjustHitPoints;
    }

    /**
     * Returns the initial reaction adjustment.
     * @return the initial reaction adjustment
     */
    public int getAdjustInitialReaction() {
        return adjustInitialReaction;
    }

    /**
     * Returns the PC's age.
     * @return the PC's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the PC's alignment.
     * @return the PC's alignment
     */
    public AlignmentEnum getAlignment() {
        return alignment;
    }

    /**
     * Returns the array that holds the armor Class.
     * @return the array that holds the armor class.
     */
    public Armor[] getArmor() {
        return armor;
    }

    /**
     * Returns the PC's bend-lift ability.
     * @return the PC's bend-lift ability
     */
    public int getBendLift() {
        return bendLift;
    }

    /**
     * Returns the boots worn by the PC.
     * @return the boots worn by the PC.
     */
    public Item getBoots() {
        return boots;
    }

    /**
     * Returns the bracer the PC is wearing.
     * @return the bracer the PC is wearing.
     */
    public Item getBracer() {
        return bracer;
    }

    /**
     * Returns the PC's charisma.
     * @return the PC's charisma
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * Returns all of the coins the pc is carrying.
     * @return all of the coins the pc is carrying.
     */
    public int[] getCoins() {
        return coins;
    }

    
    /**
     * Returns the PC's Combat Reaction. THIS IS CURRENTLY OPTIONAL.
     * @return the PC's Combat Reaction
     */
    public int getCombatReact() {
        return combatReact;
    }

    /**
     * Returns the PC's comeliness.
     * @return the PC's comeliness
     */
    public int getComeliness() {
        return comeliness;
    }

    /**
     * Returns the PC's constitution.
     * @return the PC's constitution
     */
    public int getConstitution() {
        return constitution;
    }

    /**
     * Returns the PC's current hit points.
     * @return the PC's current hit points
     */
    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    /**
     * Returns the PC's deity.
     * @return the PC's deity
     */
    public int getDeity() {
        return deity;
    }

    /**
     * Returns the PC's dexterity.
     * @return the PC's dexterity
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Returns the PC's first name.
     * @return the PC's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the PC's gender.
     * @return the PC's gender
     */
    public GenderEnum getGender() {
        return gender;
    }

    /**
     * Returns gender (name) as a string.
     * @return gender name as a string. 
     */
    public String getGenderToString(){
        return gender.getName();
    }
    
    /**
     * Returns the PC's height in inches.
     * @return the PC's height in inches
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns the PC's maximum hit points.
     * @return the PC's maximum hit points
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * Returns the PC's intelligence.
     * @return the PC's intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Returns the PC's inventory
     * @return the PC's inventory
     */
    public HashMap<String, ArrayList<Item>> getInventory() {
        return inventory;
    }

    /**
     * Returns the PC's last name.
     * @return the PC's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the PC's level.
     * @return the PC's level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Returns the Saving Throw adjustment against magical attacks.
     * @return the Saving Throw adjustment
     */
    public int getMagicalSaveBonus() {
        return magicalSaveBonus;
    }

    /**
     * Returns the PC's maximum press.
     * @return the PC's maximum press.
     */
    public double getMaxPress() {
        return maxPress;
    }

    /**
     * Returns the PC's maximum weight they can carry without suffering an
     * encumbrance penalty.
     * @return the PC's maximum weight allowed without penalty
     */
    public double getMaxWeight() {
        return maxWeight;
    }

    /**
     * Returns the PC's movement rate.
     * @return the PC's movement rate
     */
    public double getMoveRate() {
        return moveRate;
    }

    /**
     * Returns the PC's maximum number of languages they can learn besides
     * their native language.
     * @return teh PC's maximum number of languages allowed
     */
    public int getNumberOfLanguages() {
        return numberOfLanguages;
    }

    /**
     * Returns the PC's ability to open a stuck or jammed door.
     * @return the PC's ability to open a stuck or jammed door
     */
    public int getOpenDoor() {
        return openDoor;
    }

    /**
     * Returns the PC's race represented as an integer value.
     * @return the PC's race
     */
    public RaceEnum getRace() {
        return race;
    }
    
    /**
     * Returns the PC's race as a string.
     * @return the PC's race as a string.
     */
    public String getRaceToString(){
        return race.name();
    }

    /**
     * Returns the PC's chance for resurrection survival.
     * @return the PC's chance for resurrection survival
     */
    public int getResurrectSurvive() {
        return resurrectSurvive;
    }

    /**
     * Returns the rings worn by the PC.
     * @return the rings worn by the PC.
     */
    public Ring[] getRingsWorn() {
        return ringsWorn;
    }

    /**
     * Returns the PC's adjustment to the Saving Throws.
     * @return the PC's adjustment to the Saving Throws
     */
    public int getPhysicalSavingBonus() {
        return physicalSavingBonus;
    }

    /**
     * Returns the PC's rogue skills as a 2D array
     * @return the PC's rogue skills as a 2D array
     */
    public int[][] getRogueSkills() {
        return rogueSkills;
    }

    /**
     * Returns the Toon's saving throws
     * @return the Toon's saving throws
     */
    public int[][] getSavingThrows() {
        return savingThrows;
    }

    /**
     * Returns the Toon's chance for spell failure
     * @return the Toon's chance for spell failure
     */
    public int getSpellFailure(){
        return spellFailure;
    }
    
    /**
     * Returns the PC's physical strength.
     * @return the PC's physical strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Returns the PC's exceptional strength. This is represented by a
     * percentage.
     * @return the PC's exceptional strength
     */
    public int getStrengthPercent() {
        return strengthPercent;
    }

    /**
     * Returns the PC's system shock. This is checked when the PC takes
     * massive damage or attack that is hard on their system.
     * @return the PC's system shock
     */
    public int getSystemShock() {
        return systemShock;
    }

    /**
     * Returns the PC's thacio. The zero element is ignored in this array.
     * Each element index coordinates to the toon's thacio.
     * @return the Toon's thacio
     */
    public int getThacio() {
        return thacio;
    }

    /**
     * Returns the PC's title. This could be anything such as Lord, Lady,
     * Squire, Knight, Master, and so on.
     * @return the PC's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the PC's ability to do extra damage each attack.
     * @return the PC's ability to do extra damage
     */
    public int getToDamage() {
        return toDamage;
    }

    /**
     * Returns the PC's bonus to hit a target.
     * @return the PC's bonus to hit a target
     */
    public int getToHit() {
        return toHit;
    }

    /**
     * Returns the PC's weight. This is the body weight, not including what
     * they carry.
     * @return the PC's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns the PC's wisdom.
     * @return the PC's wisdom
     */
    public int getWisdom() {
        return wisdom;
    }

    /**
     * Sets the adjustment to the PC's armor class. This is based upon the
     * PC's dexterity. This can be a negative number.
     * @param dexterity the PC's dexterity
     */
    private void setAdjustArmorClass(int dexterity) {
        try {
            this.adjustArmorClass = IStat.DEX_ARMOR_CLASS_BONUS[dexterity];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's hit point adjustment. It is based upon the PC's
     * constitution. This can be a negative number.
     * @param constitution the PC's constitution
     */
    private void setAdjustHitPoints(int constitution) {
        try {
            this.adjustHitPoints = IStat.CON_HIT_POINT_ADJUST[constitution];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the adjustment to the NPC's initial reaction to the PC. This is
     * based upon the PC's charisma. This can be a negative value.
     * @param charisma the PC's charisma
     */
    private void setAdjustInitialReaction(int charisma) {
        try {
            this.adjustInitialReaction = IStat.CHA_REACTION_ADJUST[charisma];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }



    /**
     * Sets the PC's age. This cannot be less than 1.
     * @param age the PC's age
     */
    public void setAge(int age) {
        if(age >= 1){
            this.age = age;
        }
        else{
            this.age = 1;
        }
    }

    /**
     * TODO: PUT THIS ON HOLD. COULD THIS BE AN ENUM?
     * Sets the PC's alignment.
     * @param alignment the PC's alignment
     */
    public void setAlignment(AlignmentEnum alignment) {
        try {
            this.alignment = alignment;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    
    /**
     * Sets the PC's ability to bend bars and lift portcullis. It is based
     * upon the PC's strength. It cannot be a negative value.
     * @param strength The PC's strength
     */
    private void setBendLift(int strength) {
        if(strength >= 0){
            try {
                if(strength == 18 && strengthPercent > 0){
                    this.bendLift =
                        IStat.EX_STR_BEND_LIFT[getExceptionalStrengthRangeIndex()];
                }
                else{
                    this.bendLift = IStat.STR_BEND_LIFT[strength];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        else{
            this.bendLift = 0;
        }
    }

    /**
     * Sets the boots the pc is wearing. 
     * @param boots the boots the pc is wearing.
     */
    public void setBoots(Item boots) {
        this.boots = boots;
    }
    
    /**
     * Sets the bracer that the pc is wearing.
     * @param bracer the bracer the pc is wearing.
     */
    public void setBracer(Item bracer){
        this.bracer = bracer;
    }
    
    /**
     * Sets the PC's charisma. This value cannot be less than 1.
     * @param charisma the PC's charisma
     */
    public void setCharisma(int charisma) {
        if(charisma > 0 && charisma <= IStat.STAT_MAX){
            this.charisma = charisma;
        }
        else if(charisma > IStat.STAT_MAX){
            this.charisma = IStat.STAT_MAX;
        }
        else{
            this.charisma = 1;
        }
        this.setAdjustInitialReaction(this.charisma);
    }

    /**
     * Sets all of the coins the pc carries.
     * @param coins the coins the pc carries.
     */
    public void setCoins(int[] coins) {
        this.coins = coins; // TODO: add a null pointer exception.
    }

    
    /**
     * Sets the PC's combat reaction. This is based upon the PC's dexterity.
     * This can be negative value.
     * @param dexterity the PC's combat reaction.
     */
    private void setCombatReact(int dexterity) {
        try {
            this.combatReact = IStat.DEX_COMBAT_REACT[dexterity];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's comeliness. This value cannot be less than 1.
     * @param comeliness the PC's comeliness
     */
    public void setComeliness(int comeliness) {
        if(comeliness > 0 && comeliness <= IStat.STAT_MAX){
            this.comeliness = comeliness;
        }
        else if(comeliness > IStat.STAT_MAX){
            this.comeliness = IStat.STAT_MAX;
        }
        else{
            this.comeliness = 1;
        }
    }

    /**
     * Sets the PC's constitution. This value cannot be less than 1.
     * @param constitution the PC's constitution
     */
    public void setConstitution(int constitution) {
        if(constitution > 0 && constitution <= IStat.STAT_MAX){
            this.constitution = constitution;
        }
        else if(constitution > IStat.STAT_MAX){
            this.constitution = IStat.STAT_MAX;
        }
        else{
            this.constitution = 1;
        }
        this.setAdjustHitPoints(this.constitution);
        this.setResurrectSurvive(this.constitution);
        this.setSystemShock(this.constitution);
        this.setPhysicalSavingBonus(this.constitution);
    }

    /**
     * Sets the PC's current hit points. This value cannot be higher than the
     * hit points.
     * @param currentHitPoints the PC's current hit points
     */
    public void setCurrentHitPoints(int currentHitPoints) {
        if(currentHitPoints <= hitPoints){
            this.currentHitPoints = currentHitPoints;
        }
        else{
            this.currentHitPoints = hitPoints;
        }
    }

    // TODO: put on hold for now.... Can this be an enum?
    public void setDeity(int deity) {
        try {
            this.deity = deity;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's dexterity. This value cannot be less than 1.
     * @param dexterity the PC's dexterity
     */
    public void setDexterity(int dexterity) {
        if(dexterity > 0 && dexterity <= IStat.STAT_MAX){
            this.dexterity = dexterity;
        }
        else if(dexterity > IStat.STAT_MAX){
            this.dexterity = IStat.STAT_MAX;
        }
        else{
            this.dexterity = 1;
        }
        this.setAdjustArmorClass(this.dexterity);
        this.setCombatReact(this.dexterity);
    }

    /**
     * Sets the PC's first name.
     * @param firstName the PC's first name
     */
    public void setFirstName(String firstName) {
        try {
            this.firstName = firstName;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's gender.
     * @param gender the PC's gender
     */
    public void setGender(GenderEnum gender) {
        try {
            this.gender = gender;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's height in inches. This cannot be a negative value.
     * @param height the PC's height in inches.
     */
    public void setHeight(double height) {
        if(height > 0.0){
            this.height = height;
        }
        else{
            this.height = 1.0;
        }
    }

    /**
     * Sets the PC's hit points. This cannot be a negative value.
     * @param hitPoints the PC's hit points
     */
    public void setHitPoints(int hitPoints) {
        if(hitPoints > 0){
            this.hitPoints = hitPoints;
        }
        else{
            this.hitPoints = 1;
        }
    }

    /**
     * Sets the PC's intelligence. This cannot be a negative value.
     * @param intelligence the PC's intelligence
     */
    public void setIntelligence(int intelligence) {
        if(intelligence > 0 && intelligence <= IStat.STAT_MAX){
            this.intelligence = intelligence;
        }
        else if(intelligence > IStat.STAT_MAX){
            this.intelligence = IStat.STAT_MAX;
        }
        else{
            this.intelligence = 1;
        }
        this.setNumberOfLanguages(this.intelligence);
    }

    
    /**
     * Sets the PC's last name.
     * @param lastName the PC's last name
     */
    public void setLastName(String lastName) {
        try {
            this.lastName = lastName;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's level. This cannot be a negative value.
     * @param level the PC's level.
     */
    public void setLevel(int level) {
        if(level >= 0){
            this.level = level;
        }
        else{
            this.level = 0;
        }
    }

    /**
     * Sets the PC's adjustment to their saving throws. This is based upon the
     * PC's wisdom. This can be a negative value.
     * @param wisdom the PC's wisdom
     */
    private void setMagicalSaveBonus(int wisdom) {
        try {
            this.magicalSaveBonus = IStat.WIS_MAGICAL_DEFENSE[wisdom];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's maximum press (the amount of weight that the PC can
     * press over their head). This is based upon the PC's strength. This
     * cannot be a negative value.
     * @param strength the PC's strength
     */
    private void setMaxPress(int strength){
        try {
            if(strength == 18 && strengthPercent > 0){
                this.maxPress =
                    IStat.EX_STR_MAX_PRESS[getExceptionalStrengthRangeIndex()];
            }
            else{
                this.maxPress = IStat.STR_MAX_PRESS[strength];
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the maximum weight that a PC can carry without suffering an
     * encumbrance penalty. It is based upon the PC's strength. It cannot be
     * a negative value.
     * @param strength the PC's strength
     */
    private void setMaxWeight(int strength) {
        try {
            if(strength == 18 && strengthPercent > 0){
                this.maxWeight =
                    IStat.EX_STR_WEIGHT_ALLOWED[getExceptionalStrengthRangeIndex()];
            }
            else{
                this.maxWeight = IStat.STR_WEIGHT_ALLOWED[strength];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's rate of movement. This will be from 0.0 to 12.0. Cannot
     * be a negative number.
     * @param moveRate the PC's movement rate
     */
    public void setMoveRate(double moveRate) {
        if(moveRate >= 0.0){
            this.moveRate = moveRate;
        }
        else{
            this.moveRate = 0.0;
        }
    }

    /**
     * Sets the maximum number of languages a PC can learn beyond their native
     * language. This value cannot be a negative number. It is based upon
     * the PC's strength.
     * @param intelligence the PC's intelligence
     */
    private void setNumberOfLanguages(int intelligence) {
        try {
            this.numberOfLanguages = IStat.INT_NUMBER_OF_LANGUAGES[intelligence];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's ability to open stuck or jammed doors. This is based upon
     * the PC's strength. This cannot be a negative value.
     * @param strength the PC's strength
     */
    private void setOpenDoor(int strength) {
        try {
            if(strength == 18 && strengthPercent > 0){
                this.openDoor =
                    IStat.EX_STR_OPEN_DOOR[getExceptionalStrengthRangeIndex()];
            }
            else{
                this.openDoor = IStat.STR_OPEN_DOORS[strength];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's race represented as an integer. This cannot be a negative
     * number.
     * @param race the PC's race
     */
    public void setRace(RaceEnum race) {
        try {
            this.race = race;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Sets the PC's resurrection survival chances. This cannot be a negative
     * value. It is based upon the PC's constitution.
     * @param constitution the PC's constitution
     */
    private void setResurrectSurvive(int constitution) {
        try {
            this.resurrectSurvive = IStat.CON_RESURRECT_SURVIVE[constitution];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's saving throw adjustment. It is based upon the PC's
     * wisdom. This can be a negative number.
     * @param wisdom the PC's wisdom
     */
    private void setPhysicalSavingBonus(int wisdom) {
        try {
            this.physicalSavingBonus = IStat.CON_POISON_SAVE[wisdom];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the Toon's saving throws.
     * @param savingThrows the Toon's saving throws.
     */
    public void setSavingThrows(int[][] savingThrows) {
        this.savingThrows = savingThrows;
    }

    /**
     * Sets the PC's chance for a spell to fail. It is based upon the PC's
     * wisdom. This cannot be a negative value.
     * @param wisdom the PC's wisdom
     */
    private void setSpellFailure(int wisdom) {
        try {
            this.spellFailure = IStat.WIS_CHANCE_SPELL_FAIL[wisdom];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's strength and strength percent. The two values cannot be a
     * negative value. The Strength value will range from 1 to STAT_MAX. The
     * strength percent is a number from 0 to 100. The strength percent will
     * be ignored unless the strength is 18.
     * @param strength the PC's strength
     * @param strengthPercent the PC's strength percent.
     */
    public void setStrength(int strength, int strengthPercent) {
        if(strength > 0 && strength <= IStat.STAT_MAX){
            this.strength = strength;
        }
        else if(strength > IStat.STAT_MAX){
            this.strength = IStat.STAT_MAX;
        }
        else{
            this.strength = 1;
        }
        this.setStrengthPercent(strengthPercent);

        this.setBendLift(this.strength);
        this.setMaxPress(this.strength);
        this.setMaxWeight(this.strength);
        this.setOpenDoor(this.strength);
        this.setToDamage(this.strength);
        this.setToHit(this.strength);
    }

    /**
     * Sets the strength percent of the PC. This will be a value between
     * 0 and 100. This cannot be a negative value nor can it be greater than
     * 100.
     * @param strengthPercent the PC's strengthPercent
     */
    private void setStrengthPercent(int strengthPercent) {
        if(strengthPercent >= 0 && strengthPercent <= 100){
            this.strengthPercent = strengthPercent;
        }
        else if(strengthPercent > 100){
            this.strengthPercent = 100;
        }
        else{
            this.strengthPercent = 0;
        }
    }

    /**
     * Sets the system shock for the PC. This is based upon the PC's
     * constitution. This may not be a negative number.
     * @param constitution the PC's constitution
     */
    private void setSystemShock(int constitution) {
        try {
            this.systemShock = IStat.CON_SYSTEM_SHOCK[constitution];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the toon's thacio. The zero element is not used.
     * @param thacio the toon's thacio.
     */
    public void setThacio(int thacio) {
        this.thacio = thacio;
    }

    /**
     * Sets the  PC's title. This could be Lord, Lady, Squire, Master and so
     * on.
     * @param title the PC's title
     */
    public void setTitle(String title) {
        try {
            this.title = title;
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's chance to do extra damage based upon the PC's strength.
     * This can be a negative value.
     * @param strength the PC's strength
     */
    private void setToDamage(int strength) {
        try {
            if(strength == 18 && strengthPercent > 0){
                this.toDamage =
                    IStat.EX_STR_TO_DAMAGE[getExceptionalStrengthRangeIndex()];
            }
            else{
                this.toDamage = IStat.STR_TO_DAMAGE_BONUS[strength];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's bonus chance to hit a target based upon the PC's
     * strength. This value can be a negative value.
     * @param strength the PC's strength
     */
    private void setToHit(int strength) {
        try {
            if(strength == 18 && strengthPercent > 0){
                this.toHit =
                    IStat.EX_STR_TO_HIT[getExceptionalStrengthRangeIndex()];
            }
            else{
                this.toHit = IStat.STR_TO_HIT_BONUS[strength];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sets the PC's weight. This is not the weight that they carry but the
     * PC's actual weight. This value cannot be a negative number.
     * @param weight the PC's weight
     */
    public void setWeight(double weight) {
        if(weight > 0.0){
            this.weight = weight;
        }
        else{
            this.weight = 1.0;
        }
    }

    /**
     * Sets the PC's wisdom. This value cannot be less than 1 and cannot be1
     * greater than IStat.STAT_MAX. It will adjust all private stats that are
     * based upon the wisdom.
     * @param wisdom the PC's wisdom.
     */
    public void setWisdom(int wisdom) {
        if(wisdom > 0 && wisdom <= IStat.STAT_MAX){
            this.wisdom = wisdom;
        }
        else if(wisdom > IStat.STAT_MAX){
            this.wisdom = IStat.STAT_MAX;
        }
        else{
            this.wisdom = 1;
        }
        this.setMagicalSaveBonus(this.wisdom);
        this.setSpellFailure(this.wisdom);
    }
//-----------------------------------------------------------------------------



    /**
     * Will add a new container to the toon's inventory.
     * @param containerName the name of the container to be added
     * @return true if the new container is added to the inventory
     */
    public boolean addContainer(String containerName){

        if(!hasContainer(containerName)){
            inventory.put(containerName, new ArrayList<Item>());
            return true;
        }
        return false;
    }


    /**
     * Determines the PC's exceptional strength percent index based upon the
     * PC's exceptional strength. The PC's strength and exceptional strength
     * must be set before this method should be called.
     * @return the Exceptional Strength range index
     */
    private int getExceptionalStrengthRangeIndex(){
        if(strengthPercent == IStat.EX_STR_RANGE[0]){
            return 0;
        }
        else if(strengthPercent <= IStat.EX_STR_RANGE[1]){
            return 1;
        }
        else if(strengthPercent <= IStat.EX_STR_RANGE[2]){
            return 2;
        }
        else if(strengthPercent <= IStat.EX_STR_RANGE[3]){
            return 3;
        }
        else if(strengthPercent <= IStat.EX_STR_RANGE[4]){
            return 4;
        }
        return 5;
    }


    /**
     * Determines if the inventory has a particular container. IE. does the
     * character already have a Backpack.
     * @param containerName the key for the container
     * @return true if the container is there
     */
    public boolean hasContainer(String containerName){
        return inventory.containsKey(containerName);
    }


    /**
     * Determines if the PC is conscious. This is true if the PC's
     * currentHitPoints is less than or equal to zero.
     * @return true is currentHitPoints is <= 0
     */
    public boolean isConscious(){
        if(currentHitPoints <= 0){
            return false;
        }
        return true;
    }


    /**
     * Determines if the PC is dead. This is true when the PC's
     * currentHitPoints is less than or equal to it's constitution.
     * @return true if the PC's currentHitPoints is <= constitution
     */
    public boolean isDead(){
        if(currentHitPoints <= (-(constitution))){
            return true;
        }
        return false;
    }


    /**
     * Sets the 8 basic stats of a toon.
     * @param toon the 8 basic stats of a toon
     */
    public void setStats(Toon toon){
        try {
            this.setStrength(toon.getStrength(), toon.getStrengthPercent());
            this.setIntelligence(toon.getIntelligence());
            this.setWisdom(toon.getWisdom());
            this.setDexterity(toon.getDexterity());
            this.setConstitution(toon.getConstitution());
            this.setCharisma(toon.getCharisma());
            this.setComeliness(toon.getComeliness());
        } catch (NullPointerException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }







    public static void main(String[] args){
        Toon toon = new Toon(18,10,12,16,17,11,1,28);
        Toon toonIn = null;

        FileInputStream fin = null;
        FileOutputStream fout = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try{
            fout = new FileOutputStream("TestToon.tdf");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(toon);
        }
        catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        finally{
            try{
                if(oos != null){
                    oos.close();
                }
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
        }


        try{
            fin = new FileInputStream("TestToon.tdf");
            ois = new ObjectInputStream(fin);

            toonIn = (Toon)ois.readObject();

            System.out.println("This is from toonIn\n");
            System.out.println("STR: " + toonIn.getStrength() + " (" + toonIn.getStrengthPercent() + ")");
            System.out.println("INT: " + toonIn.getIntelligence());
            System.out.println("WIS: " + toonIn.getWisdom());
            System.out.println("DEX: " + toonIn.getDexterity());
            System.out.println("CON: " + toonIn.getConstitution());
            System.out.println("CHA: " + toonIn.getCharisma());
            System.out.println("COM: " + toonIn.getComeliness());
            System.out.println("Weight Allowed: " + toonIn.getMaxWeight());

            System.out.println("Press Enter to continue... ");
            System.in.read();
        }
        catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
        finally{
            try{
                ois.close();
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
}
