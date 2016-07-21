/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.controller.treasure;

import java.util.ArrayList;
import java.util.Random;
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.treasure.JewelryTypeEnum;
import net.danbeach.gaming.constants.treasure.TreasureTypeEnum;
import net.danbeach.gaming.domain.treasure.Jewelry;

/**
 *
 * @author deb
 */
public class JewelryController {

    /**
     * Generate all possible pieces of jewelry for a given treasure type.
     *
     * @param tt the treasure type.
     * @return the generated list of jewelry.
     */
    public ArrayList<Jewelry> generateJewelry(TreasureTypeEnum tt) {
        ArrayList<Jewelry> jewelry = new ArrayList<Jewelry>();
        Random random = new Random();
        int jewelryRandom = random.nextInt(100) + 1;

        if (jewelryRandom <= tt.getJewelryPercent()) {
            jewelryRandom = random.nextInt(tt.getJewelry()) + 1;
            for (int index = 0; index < jewelryRandom; index++) {
                int frequency = random.nextInt(100) + 1;
                FrequencyEnum frequencyEnum = FrequencyEnum.fromPercent(frequency);

                switch (frequencyEnum) {
                    case COMMON:
                        jewelry.add(generateCommonJewelry());
                        break;
                    case UNCOMMON:
                        jewelry.add(generateUncommonJewelry());
                        break;
                    case RARE:
                        jewelry.add(generateRareJewelry());
                        break;
                    case VERY_RARE:
                        jewelry.add(generateVeryRareJewelry());
                        break;
                    default:
                }
            }// end of for loop
        }// end of if
        return jewelry;
    }// end generateJewelry()

    /*
     Randomly generate one type of common jewelry.
     */
    private Jewelry generateCommonJewelry() {
        Jewelry jewelry = null;
        Random random = new Random();
        int frequency = random.nextInt(2) + 1;
        switch (frequency) {
            case 1:
                jewelry = new Jewelry("C Earrings of Death", 10.0, JewelryTypeEnum.EARRING);
                break;
            case 2:
                jewelry = new Jewelry("C Ring of Life", 11.0, JewelryTypeEnum.RING);
                break;
            default:
                jewelry = null;
        }
        return jewelry;
    }// end of generateCommonJewelry()

    /*
     Randomly generate one type of rare jewelry.
     */
    private Jewelry generateRareJewelry() {
        Jewelry jewelry = null;
        Random random = new Random();
        int frequency = random.nextInt(4) + 1;
        switch (frequency) {
            case 1:
                jewelry = new Jewelry("R Amulet of Tears", 20.2, JewelryTypeEnum.AMULET);
                break;
            case 2:
                jewelry = new Jewelry("R Bracer of Claws", 11.1, JewelryTypeEnum.BRACER);
                break;
            case 3:
                jewelry = new Jewelry("R Brooch of Sight", 12.22, JewelryTypeEnum.BROOCH);
            case 4:
                jewelry = new Jewelry("R Fillet of Soul", 122.2, JewelryTypeEnum.FILLET);
                break;
            case 5:
                jewelry = new Jewelry("R Locket of Love", 2.2, JewelryTypeEnum.LOCKET);
                break;
            default:
                jewelry = null;
        }
        return jewelry;
    }// end generateRareJewelry()

    /*
     Randomly generate one type of uncommon jewelry.
     */
    private Jewelry generateUncommonJewelry() {
        Jewelry jewelry = null;
        Random random = new Random();
        int frequency = random.nextInt(4) + 1;
        switch (frequency) {
            case 1:
                jewelry = new Jewelry("U Arm Band of Song", 1.0, JewelryTypeEnum.ARM_BAND);
                break;
            case 2:
                jewelry = new Jewelry("U Bracelet of Blue", 2.5, JewelryTypeEnum.BRACLET);
                break;
            case 3:
                jewelry = new Jewelry("U Headband of Thought", 3.0, JewelryTypeEnum.HEADBAND);
                break;
            case 4:
                jewelry = new Jewelry("U Necklace of Resist", 4.0, JewelryTypeEnum.NECKLACE);
                break;
            default:
                jewelry = null;
        }
        return jewelry;
    }// end of generateUncommonJewelry()

    /*
     Randomly generate one type of very rare jewelry.
     */
    private Jewelry generateVeryRareJewelry() {
        Jewelry jewelry = null;
        Random random = new Random();
        int frequency = random.nextInt(6) + 1;
        switch (frequency) {
            case 1:
                jewelry = new Jewelry("V Anklet of Speed", 1.0, JewelryTypeEnum.ANKLET);
                break;
            case 2:
                jewelry = new Jewelry("V Circlet of Armor", 4.4, JewelryTypeEnum.CIRCLET);
                break;
            case 3:
                jewelry = new Jewelry("V Gorget of Colors", 6.5, JewelryTypeEnum.GORGET);
                break;
            case 4:
                jewelry = new Jewelry("V Pendant of Pippin", 6.8, JewelryTypeEnum.PENDANT);
                break;
            case 5:
                jewelry = new Jewelry("V Ringlet of the Archer", 9.8, JewelryTypeEnum.RINGLET);
                break;
            case 6:
                jewelry = new Jewelry("V Torc of Strength", 9.9, JewelryTypeEnum.TORC);
                break;
            default:
                jewelry = null;
        }
        return jewelry;
    }// end of generateVeryRareJewelry()
}
