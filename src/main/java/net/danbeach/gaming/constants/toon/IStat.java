package net.danbeach.gaming.constants.toon;

/**
 * Created with IntelliJ IDEA.
 * User: deb
 * Date: 9/15/13
 * Time: 8:42 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IStat {

    // CLASS VARIABLES
    public final static int STRENGTH 		= 0;
    public final static int INTELLIGENCE     	= 1;
    public final static int WISDOM	    	= 2;
    public final static int DEXTERITY 		= 3;
    public final static int CONSTITUTION    	= 4;
    public final static int CHARISMA    	= 5;
    public final static int COMELINESS		= 6;
    public final static int STRENGTH_PERCENT    = 7;

    /**
     * Determines how many stats the Toon has. The list includes: strength,
     * intelligence, wisdom, dexterity, constitution, charisma, comeliness,
     * and strength percent.
     */
    public final static int NUMBER_OF_STATS = 8;

    /*
     * This is a bonus to how NPCs react to a player. The initial reaction
     * of an NPC to a character is done on a roll of a d20. This bonus is to be
     * added to the die roll. The reaction table will determine the NPC
     * reaction to the player.
     * Element 0 is ignored. Each element represents a charisma score. The
     * maximum charisma is 25.
     */
    public static final int[] CHA_REACTION_ADJUST =
            {0,-7,-6,-5,-4,-3,-2,-1,0,0,0,0,0,1,2,3,5,6,7,8,9,10,11,12,13,14};

    /*
     * This will determine the maximum number of henchmen a player may wish
     * to have once they reach level 9.
     * Element 0 is ignored. Each element represents a charisma score. The
     * maximum charisma is 25.
     */
    public static final int[] CHA_MAX_NUMBER_HENCHMEN =
            {0,0,1,1,1,2,2,3,3,4,4,4,5,5,6,7,8,10,15,20,25,30,35,40,45,50};

    /*
     * This is a bonus to hit points according to the player's constitution.
     * These points are added each time the player levels up. The original game
     * allows for this track to be for fighters only. For this API, all players
     * will follow the same track.
     * Element 0 is ignored. Each element represents a constitution score. The
     * maximum constitution is 25.
     */
    public static final int[] CON_HIT_POINT_ADJUST =
            {0,-3,-2,-2,-1,-1,-1,0,0,0,0,0,0,0,0,1,2,3,4,5,5,6,6,6,7,7};

    /*
     * This is used to help determine if a player is able to resist poisons of
     * all kinds.
     * Element 0 is ignored. Each element represents a constitution score. The
     * maximum constitution is 25.
     */
    public static final int[] CON_POISON_SAVE =
            {0,-2,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,2,2,3,3,4};

    /*
     * The resurrection survival is used to determine if a character can
     * survive a resurrection attempt. If the player does not survive the
     * attempt, he cannot attempt again, he is permanently dead. He cannot
     * even be raised from the dead.
     *  Element 0 is ignored. Each element represents a constitution score. The
     * maximum constitution is 25
     */
    public static final int[] CON_RESURRECT_SURVIVE =
            {0,30,35,40,45,50,55,60,65,70,75,80,85,90,92,94,96,98,100,100,100,100,100,100,100,100};

    /*
     * This is the system shock. It is used when the player is hit and takes at
     * least 50% damage. This is measured by using the total hit points. the
     * player is passed out for one round. The number for each element is a
     * percentage. This number or less is a successful roll and the player
     * does not pass out.
     * Element 0 is ignored. Each element represents a constitution score. The
     * maximum constitution is 25.
     */
    public static final int[] CON_SYSTEM_SHOCK =
            {0,25,30,35,40,45,50,55,60,65,70,75,80,85,88,90,95,97,99,99,99,99,99,99,99,100};

    /*
     * This is an armor class bonus used in combat that is based on dexterity.
     * Element 0 is ignored. Each element represents a dexterity score. The
     * maximum dexterity is 25.
     */
    public static final int[] DEX_ARMOR_CLASS_BONUS =
            {0,-5,-5,-4,-3,-2,-1,0,0,0,0,0,0,0,0,1,2,3,4,4,4,5,5,5,6,6};


    /*
     * This the ability for a character to react to various situations in
     * combat such as rear attack or missile weapons. Each index represents
     * a dexterity score. The value is the bonus.
     */
    public static final int[] DEX_COMBAT_REACT =
            {0,-6,-4,-3,-2,-1,0,0,0,0,0,0,0,0,0,0,1,2,2,3,3,4,4,4,5,5};

    // TODO: WHAT PERCENT IS EACH ELEMENT?
	/*
	 * Bend - lift for exceptional strength. used as a percent to determine if
	 * a player can bend bars or lift a vertical gate.Use exceptional strength
	 * range array to get the correct number.
	 */
    public static final int[] EX_STR_BEND_LIFT = {0,20,25,30,35,40};

    /*
     * Max press for exceptional strength. Use Exceptional strength range
     * array to get the correct number.
     */
    public static final int[] EX_STR_MAX_PRESS = {0,280,305,330,380,480};

    /*
     * Open door for exceptional strength. user exceptional range array to get
     * the correct number.
     */
    public static final int[] EX_STR_OPEN_DOOR = {0,12,13,14,15,16};

    /*
     * Exceptional Strength Range will set an int to represent each exceptional
     * range: 0-50, 51-75, 76-90, 91-99, and 100%. Element 0 is ignored.
     */
    public static final int[] EX_STR_RANGE = {0,50,75,90,99,100};

    /*
     * The to damage bonus for exceptional strength range. Use Exceptional
     * strength range array to get the correct number.
     */
    public static final int[] EX_STR_TO_DAMAGE = {0,3,3,4,5,6};

    /*
     * The to hit bonus for each exceptional strength range. Use Exceptional
     * strength range array to get the correct number.
     */
    public static final int[] EX_STR_TO_HIT = {0,1,2,2,2,3};

    /*
     * The weight allowed for exceptional strength. Use Exceptional strength
     * range array to get the correct number.
     */
    public static final int[] EX_STR_WEIGHT_ALLOWED = {0,135,160,185,235,335};

    /*
     * This will determine the percentage chance the mage has to learn a new
     * spell. This number or lower will be a success.
     * Element 0 is ignored. Each element represents a intelligence score. The
     * maximum intelligence is 25.
     */
    public static final int[] INT_CHANCE_TO_LEARN_SPELL =
            {0,0,0,0,0,0,0,0,0,35,40,45,50,55,60,65,70,75,85,95,96,97,98,99,100,100};

    /*
     * This is the maximum number of spells a player may have in their spell
     * books per each spell level.
     * Element 0 is ignored. Each element represents a intelligence score. The
     * maximum intelligence is 25.
     */
    public static final int[] INT_MAX_NUMBER_SPELLS_PER_LEVEL =
            {0,0,0,0,0,0,0,0,0,6,7,7,7,9,9,11,11,14,18,20,22,24,26,28,30,32};

    /*
     * This is the maximum number of languages a character may have in their
     * lifetime.
     * Element 0 is ignored. Each element represents a intelligence score. The
     * maximum intelligence is 25.
     */
    public static final int[] INT_NUMBER_OF_LANGUAGES =
            {0,1,1,1,1,1,1,1,1,2,2,2,3,3,4,4,5,6,7,8,9,10,11,12,15,20};

    /*
     * This will determine the maximum spell level a mage may have based upon
     * his intelligence. The player cannot have spells if their intelligence
     * is below 9 and the maximum spell level is 9.
     * Element 0 is ignored. Each element represents a intelligence score. The
     * maximum intelligence is 25.
     */
    public static final int[] INT_SPELL_LEVEL =
            {0,0,0,0,0,0,0,0,0,4,5,5,6,6,7,7,8,8,9,9,9,9,9,9,9,9};

    /*
     * Used to calculate if a statistic exceeds the allowed maximum.
     */
    public static final int STAT_MAX = 25;

    /*
     * Bend - lift based upon the strength. used as a percent to determine
     * if a player can bend bars or lift a vertical gate.
     */
    public static final int[] STR_BEND_LIFT =
            {0,0,0,0,0,0,0,0,1,1,2,2,4,4,7,7,10,13,16,50,60,70,80,90,95,99};

    /*
     * The max press based upon the strength
     */
    public static final int[] STR_MAX_PRESS =
            {0,3,5,10,25,25,55,55,90,90,115,115,140,140,170,170,195,220,255,640,700,810,970,1130,1440,1750};

    /*
     * Open doors based upon strength. used to open a door that is stuck or locked.
     */
    public static final int[] STR_OPEN_DOORS =
            {0,1,1,2,3,3,4,4,5,5,6,6,7,7,8,8,9,10,11,16,17,17,18,18,19,19};

    /*
     * This is a damage bonus used in combat that is based upon the strength.
     */
    public static final int[] STR_TO_DAMAGE_BONUS =
            {0,-4,-2,-1,-1,-1,0,0,0,0,0,0,0,0,0,0,1,1,2,7,8,9,10,11,12,14};

    /*
     * This is a to hit bonus used in combat that is based upon the strength.
     */
    public static final int[] STR_TO_HIT_BONUS =
            {0,-5,-3,-3,-2,-2,-1,-1,0,0,0,0,0,0,0,0,0,1,1,3,3,4,4,5,6,7};

    /*
     * The weight allowed is used to determine how much weight a character can
     * carry without any encumberence penalties. This includes all items
     * carried and worn.
     */
    public static final int[] STR_WEIGHT_ALLOWED =
            {0,1,1,5,10,10,20,20,35,35,40,40,45,45,55,55,70,85,110,485,535,635,785,935,1235,1535};

    /*
     * This is the percentage chance a character casting a spell will have the
     * spell fail. This is for all characters that can cast spells. It is based
     * upon a player's wisdom.
     * Element 0 is ignored. Each element represents a wisdom score. The
     * maximum wisdom is 25.
     */
    public static final int[] WIS_CHANCE_SPELL_FAIL =
            {0,80,60,50,45,40,35,30,25,20,15,10,5,0,0,0,0,0,0,0,0,0,0,0,0,0};

    /*
     * This is a bonus to the saving throw against spells. It is based upon
     * the player's wisdom.
     * Element 0 is ignored. Each element represents a wisdom score. The
     * maximum wisdom is 25.
     */
    public static final int[] WIS_MAGICAL_DEFENSE =
            {0,-6,-4,-3,-2,-1,-1,-1,0,0,0,0,0,0,0,1,2,3,4,4,4,4,4,4,4,4};
}
