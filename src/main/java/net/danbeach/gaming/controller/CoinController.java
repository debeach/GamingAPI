/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.controller;

import java.util.Random;
import net.danbeach.gaming.domain.treasure.Coin;

/**
 *
 * @author deb
 */
public class CoinController {

    /** 
     * Generates a number of coins from 1 to maxNumber.
     * @param maxNumber the maximum number of coins to be generated.
     * @return the random number of coins from 1 to maxNumber.
     */
    public int generateCoins(int maxNumber){
        Random random = new Random();
        return random.nextInt(maxNumber) + 1;
    }
    
    /**
     * Add coins to a Coin object.
     * @param coin the Coin object
     * @param numberOfCoins the number of coins to add
     * @param coinType the type of coin
     */
    public void addCoins(Coin coin, int numberOfCoins, int coinType){
        try{
            if(coin == null){
                return;
            }
            if(numberOfCoins >= 0){
                switch(coinType){
                    case Coin.COPPER:
                        coin.setCopper(coin.getCopper() + numberOfCoins);
                        break;
                    case Coin.SILVER:
                        coin.setSilver(coin.getSilver() + numberOfCoins);
                        break;
                    case Coin.ELECTRUM:
                        coin.setElectrum(coin.getElectrum() + numberOfCoins);
                        break;
                    case Coin.GOLD:
                        coin.setGold(coin.getGold() + numberOfCoins);
                        break;
                    case Coin.PLATINUM:
                        coin.setPlatinum(coin.getPlatinum() + numberOfCoins);
                        break;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    /**
     * Convert copper pieces to electrum pieces
     * @param copper the number of copper pieces to be converted
     * @return the number of electrum pieces.
     */
    public double convertCopperToElectrum(int copper){
        if(copper <= 0){
            return 0.0;
        }
        return copper * Coin.COPPER_TO_ELECTRUM;
    }
    
    
    /**
     * Convert copper pieces to gold
     * @param copper the number of copper pieces to be converted
     * @return the amount of gold.
     */
    public double convertCopperToGold(int copper){
        if(copper <= 0){
            return 0.0;
        }
        return copper * Coin.COPPER_TO_GOLD;
    }
    
    
    /**
     * Convert copper pieces to platinum pieces.
     * @param copper the number of copper pieces to convert
     * @return the amount of platinum.
     */
    public double convertCopperToPlatinum(int copper){
        if(copper <= 0){
            return 0.0;
        }
        return copper * Coin.COPPER_TO_PLATINUM;
    }
    
    
    /**
     * Converts copper pieces to silver pieces
     * @param copper the amount of copper pieces to be converted.
     * @return the amount of silver pieces
     */
    public double convertCopperToSilver(int copper){
        if(copper <= 0 ){
            return 0.0;
        }
        return copper * Coin.COPPER_TO_SILVER;
    }
    
    
    /**
     * Converts electrum pieces to copper pieces.
     * @param electrum the number of electrum pieces to be converted.
     * @return the amount of copper pieces
     */
    public int convertElectrumToCopper(int electrum){
        if(electrum <= 0){
            return 0;
        }
        return electrum * Coin.ELECTRUM_TO_COPPER;
    }
    
    /**
     * Converts electrum pieces to gold pieces.
     * @param electrum the number of electrum pieces to be converted.
     * @return the amount of gold pieces.
     */
    public double convertElectrumToGold(int electrum){
        if(electrum <= 0){
            return 0.0;
        }
        return electrum * Coin.ELECTRUM_TO_GOLD;
    }
    
    
    /**
     * Converts the number of electrum pieces to platinum pieces.
     * @param electrum the number of electrum pieces.
     * @return the amount of platinum pieces.
     */
    public double convertElectrumToPlatinum(int electrum){
        if(electrum <= 0){
            return 0.0;
        }
        return electrum * Coin.ELECTRUM_TO_PLATINUM;
    } 
    
    
    /**
     * Converts the number of electrum pieces to silver pieces
     * @param electrum the number of electrum pieces
     * @return the amount of silver pieces.
     */
    public int convertElectrumToSilver(int electrum){
        if(electrum <= 0){
            return 0;
        }
        return electrum * Coin.ELECTRUM_TO_SILVER;
    }
    
    
    /**
     * Converts the number of gold pieces to copper pieces
     * @param gold the number of gold pieces to be converted.
     * @return the amount of copper.
     */
    public int convertGoldToCopper(int gold){
        if(gold <= 0){
            return 0;
        }
        return gold * Coin.GOLD_TO_COPPER;
    }
    
    
    /**
     * Converts gold pieces to electrum pieces.
     * @param gold the number of gold pieces to be converted.
     * @return the amount of electrum pieces.
     */
    public int convertGoldToElectrum(int gold){
        if(gold <= 0){
            return 0;
        }
        return gold * Coin.GOLD_TO_ELECTRUM;
    }
    
    
    /**
     * Converts gold pieces to platinum pieces.
     * @param gold the number of gold pieces to be converted.
     * @return the amount of platinum pieces.
     */
    public double convertGoldToPlatinum(int gold){
        if(gold <= 0){
            return 0.0;
        }
        return gold * Coin.GOLD_TO_PLATINUM;
    }
    
    
    /**
     * Converts gold pieces to silver pieces
     * @param gold the number of gold pieces to be converted.
     * @return the amount of silver pieces.
     */
    public int convertGoldToSilver(int gold){
        if(gold <= 0){
            return 0;
        }
        return gold * Coin.GOLD_TO_SILVER;
    }
    
    
    /**
     * Converts platinum pieces to copper pieces.
     * @param platinum the number of platinum pieces to be converted.
     * @return the amount of copper pieces
     */
    public int convertPlatinumToCopper(int platinum){
        if(platinum <= 0){
            return 0;
        }
        return platinum * Coin.PLATINUM_T0_COPPER;
    }
    
    
    /**
     * Convert platinum pieces to electrum pieces.
     * @param platinum the number of platinum pieces to be converted.
     * @return the amount of electrum pieces.
     */
    public int convertPlatinumToElectrum(int platinum){
        if(platinum <= 0){
            return 0;
        }
        return platinum * Coin.PLATINUM_TO_ELECTRUM;
    }
    
    
    /**
     * Converts platinum pieces to gold pieces.
     * @param platinum the number of platinum pieces to be converted.
     * @return the amount of gold pieces.
     */
    public int convertPlatinumToGold(int platinum){
        if(platinum <= 0){
            return 0;
        }
        return platinum * Coin.PLATINUM_TO_GOLD;
    }
    
    
    /**
     * Convert platinum pieces into silver pieces.
     * @param platinum the number of platinum pieces to be converted.
     * @return the amount of silver pieces
     */
    public int convertPlatinumToSilver(int platinum){
        if(platinum <= 0){
            return 0;
        }
        return platinum * Coin.PLATINUM_T0_SILVER;
    }
    
    
    /**
     * Convert Silver pieces to copper pieces.
     * @param silver the number of silver pieces to be converted.
     * @return the amount of copper pieces.
     */
    public int convertSilverToCopper(int silver){
        if(silver <= 0){
            return 0;
        }
        return silver * Coin.SILVER_TO_COPPER;
    }
    
    
    /**
     * Converts Silver pieces to Electrum pieces.
     * @param silver the number of silver pieces to be converted.
     * @return the amount of electrum pieces
     */
    public double convertSilverToElectrum(int silver){
        if(silver <= 0){
            return 0.0;
        }
        return silver * Coin.SILVER_TO_ELECTRUM;
    }
    
    
    /**
     * Converts silver pieces to gold pieces.
     * @param silver the number of silver pieces to be converted.
     * @return the amount of gold pieces.
     */
    public double convertSilverToGold(int silver){
        if(silver <= 0){
            return 0.0;
        }
        return silver * Coin.SILVER_TO_GOLD;
    }
    
    
    /**
     * Convert silver pieces to platinum pieces
     * @param silver the amount of silver pieces to be converted.
     * @return the amount of platinum pieces.
     */
    public double convertSilverToPlatinum(int silver){
        if(silver <= 0){
            return 0.0;
        }
        return silver * Coin.SILVER_TO_PLATINUM;
    }
    
    
    /**
     * Remove a number of coins of a particular type from a Coin object.
     * @param coin the Coin object
     * @param numberOfCoins the number of coins to be removed.
     * @param coinType the type of coin that is to be removed.
     */
    public void removeCoins(Coin coin, int numberOfCoins, int coinType){
        try{
            switch(coinType){
                case Coin.COPPER:
                    if(isPositiveCoins(coin.getCopper(), numberOfCoins)){
                       coin.setCopper(coin.getCopper() - numberOfCoins); 
                    }
                    break;
                case Coin.SILVER:
                    if(isPositiveCoins(coin.getSilver(), numberOfCoins)){
                       coin.setSilver(coin.getSilver() - numberOfCoins); 
                    }
                    break;
                case Coin.ELECTRUM:
                    if(isPositiveCoins(coin.getElectrum(), numberOfCoins)){
                       coin.setElectrum(coin.getElectrum() - numberOfCoins); 
                    }
                    break;
                case Coin.GOLD:
                    if(isPositiveCoins(coin.getGold(), numberOfCoins)){
                       coin.setGold(coin.getGold() - numberOfCoins); 
                    }
                    break;
                case Coin.PLATINUM:
                    if(isPositiveCoins(coin.getPlatinum(), numberOfCoins)){
                       coin.setPlatinum(coin.getPlatinum() - numberOfCoins); 
                    }
                    break;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    /**
     * Determines if a number of coins are more than another set of coins.
     * @param coins the coins to be compared.
     * @param numberOfCoins the number of coins to compare to the first coins.
     * @return true if coins are greater than numberOfCoins.
     */
    private boolean isPositiveCoins(int coins, int numberOfCoins){
        return ((coins - numberOfCoins) >= 0);
    } 
}
