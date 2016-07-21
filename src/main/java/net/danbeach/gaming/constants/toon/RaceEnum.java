package net.danbeach.gaming.constants.toon;


import net.danbeach.gaming.constants.toon.IStat;

/**
 * The RaceEnum static class will initially have 8 integers representing the
 eight races available to a player.<br>
 * The list includes:<br>
 * <ui>
 * 	<li>Dwarf = 0</li>
 * 	<li>Elf = 1</li>
 * 	<li>Half-Elf = 2</li>
 * 	<li>Half-Ogre = 3</li>
 * 	<li>Half-Orc = 4</li>
 * 	<li>Halfling = 5</li>
 * 	<li>Human = 6</li>
 * 	<li>Gnome = 7</li>
 * </ui>
 *  If any races are added to this list they will be added to the end of
 *  the list and not added alphabetically. The methods used in this class
 *  will be those that manipulate a character due to race attributes.
 * @version 1.1
 * @author deb
 * @since July 2013
 */
public enum RaceEnum {

    DWARF("Dwarf", 48.0, 120.0),
    ELF("Elf", 66.0, 110.0),
    HALFELF("Half-Elf", 66.0, 140.0),
    HALFOGRE("Half-Ogre", 72.0, 180.0),
    HALFORC("Half-Orc", 70.0, 160.0),
    HALFLING("Halfling", 36.0, 45.0),
    HUMAN("Human", 72.0, 150.0),
    GNOME("Gnome", 48.0, 80.0);

    public static final int DWARF_NUM       = 0;
    public static final int ELF_NUM         = 1;
    public static final int HALF_ELF_NUM    = 2;
    public static final int HALF_OGRE_NUM   = 3;
    public static final int HALF_ORC_NUM    = 4;
    public static final int HALFLING_NUM   = 5;
    public static final int HUMAN_NUM       = 6;
    public static final int GNOME_NUM       = 7;
    
    private String name;
    private double baseHeight;
    private double baseWeight;
//-----------------------------------------------------------------------------


    //*************************************************************************
    // 	CONSTRUCTORS
    //*************************************************************************
    private RaceEnum(String name, double baseHeight, double baseWeight){
      this.name = name;
      this.baseHeight = baseHeight;
      this.baseWeight = baseWeight;
    }
//-----------------------------------------------------------------------------

    public double getBaseHeight() {
        return baseHeight;
    }

    public double getBaseWeight() {
        return baseWeight;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * The adjustStatsForRace method will adjust the statistics for non-human
     * races in a sci-fi fantasy game. The following races are adjusted:
     * <ul>
     * 		<li>Elf Intelligence +1, Strength -1</li>
     * 		<li>Dwarf Strength +1, Charisma -1</li>
     * 		<li>Halfling Dexterity +1, Strength -2</li>
     * 		<li>Half-Orc Strength +1, Intelligence -1</li>
     * 		<li>Half-Ogre Strength +2, Intelligence -2</li>
     * 		<li>Gnome Wisdom +1, Strength -1</li>
     * </ul>
     * This method should be called after the statistics for a character
     * has already been set.
     * @param race The race to be adjusted
     * @param stats The array of stats to adjust.
     * @return Array An array of integers. The array is the adjusted stats.
     */
//    public static int[] adjustStatsForRace(int race, int[] stats){
//        try {
//            switch(race){
//                case RaceEnum.DWARF:
//                    stats[IStat.CONSTITUTION] += 1;
//                    stats[IStat.CHARISMA] -= 1;
//                    break;
//                case RaceEnum.ELF:
//                    stats[IStat.DEXTERITY] += 1;
//                    stats[IStat.CONSTITUTION] -= 1;
//                    break;
//                case RaceEnum.HALFLING:
//                    stats[IStat.DEXTERITY] += 1;
//                    stats[IStat.STRENGTH] -=2;
//                    break;
//                case RaceEnum.HALFORC:
//                    stats[IStat.CONSTITUTION] += 1;
//                    stats[IStat.WISDOM] -= 1;
//                    break;
//                case RaceEnum.HALFOGRE:
//                    stats[IStat.STRENGTH] += 2;
//                    stats[IStat.INTELLIGENCE] -= 2;
//                    break;
//                case RaceEnum.GNOME:
//                    stats[IStat.INTELLIGENCE] += 1;
//                    stats[IStat.WISDOM] -=1;
//                    break;
//            } // end of switch
//
//            // Initially, all values should be between 3 and 19
//            for(int index = 0; index < stats.length; index++){
//                if(stats[index] > 19){
//                    stats[index] = 19;
//                }
//                else if(stats[index] < 3){
//                    stats[index] = 3;
//                }
//            }
//        }catch(ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return stats;
//    }


}
