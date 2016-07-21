package net.danbeach.gaming.domain;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: deb
 * Date: 9/15/13
 * Time: 8:39 PM
 * The Dice class is used to simulate different types of dice that could be
 * used in a game. The dice represented are:<br></br>
 * <ul>
 *     <li>Four</li>
 *     <li>Six</li>
 *     <li>Eight</li>
 *     <li>Ten</li>
 *     <li>Twelve</li>
 *     <li>Twenty</li>
 *     <li>One Hundred</li>
 * </ul>
 * <p>The Dice class provides rollStatNTimes() to help roll stats for any
 * program based upon role playing games.</p>
 */
public class Dice {
    private static Random random = new Random();
//-----------------------------------------------------------------------------

    /**
     * Rolls an eight-sided dice.
     * @return Random number, 1 to 8
     */
    public static int dieEight(){
        return random.nextInt(8) + 1;
    }


    /**
     * Rolls a four-sided dice.
     * @return Random number, 1 to 4
     */
    public static int dieFour(){
        return random.nextInt(4) + 1;
    }


    /**
     * Rolls an One Hundred-sided dice. This is used to simulate a percentage.
     * @return Random number, 1 to 100
     */
    public static int dieOneHundred(){
        return random.nextInt(100) + 1;
    }


    /**
     * Rolls a six-sided dice.
     * @return Random number, 1 to 6
     */
    public static int dieSix(){
        return random.nextInt(6) + 1;
    }

    /**
     * Rolls a ten-sided dice.
     * @return Random number, 1 to 10
     */
    public static int dieTen(){
        return random.nextInt(10) + 1;
    }


    /**
     * Rolls a twelve-sided dice.
     * @return Random number from 1 to 12
     */
    public static int dieTwelve(){
        return random.nextInt(12) + 1;
    }


    /**
     * Rolls a twenty-sided dice.
     * @return Random number from 1 to 20
     */
    public static int dieTwenty(){
        return random.nextInt(20) + 1;
    }


    /**
     * Rolls the hit points for a creature (enemy) in a roll playing game
     * based upon their number hit dice. Each hit dice is a random number from
     * 1 to 8. If the argument is less than 0, -1 will be returned.
     * @param hitDice number of hit dice
     * @return hit points for creature
     */
    public static int rollHitDice(int hitDice){
        int hitPoints = 0;

        if(hitDice < 0){
            // TODO: need to create an exception for this
            return -1;
        }

        for(int index = 0; index < hitDice; index++){
            hitPoints += Dice.dieEight();
        }

        return hitPoints;
    }


    public static int rollNumber(int maxNumber){
        if(maxNumber <= 0){
            return -1;
        }
            
        return random.nextInt(maxNumber) + 1;
    }
    /**
     * Rolls a single stat for a character in a roll playing game. The number
     * generated will be from 1 to n number of six-sided dice. The three dice
     * that have the highest value will be added and returned. If the
     * argument is less than 3, then -1 will be returned.
     * @param rolls number of six-sided dice to roll.
     * @return character stat
     */
    public static int rollStatNTimes(int rolls){
        int[] stats = new int[rolls];

        if(rolls < 3){
            // TODO: need to create an exception for this.
            return -1;
        }
        for(int index = 0; index < rolls; index++){
            stats[index] = Dice.dieSix();
        }

        Arrays.sort(stats);

        return stats[stats.length -1] + stats[stats.length - 2]
                + stats[stats.length - 3];
    }


//-----------------------------------------------------------------------------
    public static void main(String[] args){
        for(int index = 0; index < 20; index++){
            System.out.println(Dice.dieFour());
        }

        System.out.println();
        System.out.println();
        int test1 = rollStatNTimes(1);
        int test2 = rollStatNTimes(9);

        System.out.println("Test 1 is: " + test1);
        System.out.println("Test 2 is: " + test2);

        System.out.println();
        System.out.println();
        for(int i = 0; i < 100; i++){
            System.out.println("Hit dice " + i + " equals " + Dice.rollHitDice(1) + " hit points");
        }
    }
}
