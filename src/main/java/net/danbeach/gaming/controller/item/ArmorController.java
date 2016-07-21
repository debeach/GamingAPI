/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.controller.item;

import java.util.ArrayList;
import java.util.Random;
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.domain.item.Armor;
import net.danbeach.gaming.constants.item.ArmorTypeEnum;
import net.danbeach.gaming.constants.treasure.TreasureTypeEnum;
import net.danbeach.gaming.repository.item.ArmorRepository;

/**
 *
 * @author deb
 */
public class ArmorController {
    private Random random = new Random();
    private MagicBonusController magicBonus;
    private ArmorRepository armorRepo;
    
    public ArmorController(){
        random = new Random();
        magicBonus = new MagicBonusController();
        armorRepo = new ArmorRepository();
    }
    
    public Armor findArmorById(Integer id){
        return armorRepo.findArmorById(id);
    }
    
    public Armor findArmorByName(String name){
        return armorRepo.findArmorByName(name);
    }
    
    public Armor generateMagicArmor(){
        Armor armor = generateArmor();
        armor.setMagical(true);
        armor.setMagicDefense(magicBonus.generateMagicItemBonus(false));
        return armor;
    }
    
    public ArrayList<Armor> generateMagicArmor(TreasureTypeEnum tt){
        ArrayList<Armor> armor = null;
        int randomPercent = random.nextInt(100) + 1;
        
        if(tt.getMagicalArmorPercent() <= randomPercent){
            armor = new ArrayList<Armor>();
            int numberOfArmor = tt.getMagicalArmor();
            for(int index = 0; index < numberOfArmor; index++){
                armor.add(generateMagicArmor());
            }
        }
        return armor;
    } // end of generateMagicArmor()
    
    public Armor generateArmor(){
        int randomArmor = random.nextInt(100) + 1;
        FrequencyEnum frequency = FrequencyEnum.fromPercent(randomArmor);
        
        if(frequency == null){
            return null;
        }
        switch(frequency){
            case COMMON:
                return generateCommonArmor();
            case UNCOMMON:
                return generateUncommonArmor();
            case RARE:
                return generateRareArmor();
            case VERY_RARE:
                return generateVeryRareArmor();
            case UNIQUE:
                return generateUniqueArmor();
            default:
                return null;
        }
        
    } // end of generateArmor()
 
    private Armor setArmorType(ArmorTypeEnum armorType){
        Armor armor = new Armor();
        
        armor.setName(armorType.getName());
        armor.setDefenseValue(armorType.getArmorClass());
        armor.setValue(armorType.getValue());
        armor.setWeight(armorType.getWeight());
        return armor;
    }    
    
    private Armor generateCommonArmor(){
        Armor armor = new Armor();
        int randomArmor = random.nextInt(6);
        switch(randomArmor){
            case 0:
                armor = setArmorType(ArmorTypeEnum.LEATHER);
                break;
            case 1:
                armor = setArmorType(ArmorTypeEnum.STUDDED_LEATHER);
                break;
            case 2:
                armor = setArmorType(ArmorTypeEnum.PADDED);
                break;
            case 3:
                armor = setArmorType(ArmorTypeEnum.BASINET);
                break;
            case 4:
                armor = setArmorType(ArmorTypeEnum.BUCKLER);
                break;
            case 5:
                armor = setArmorType(ArmorTypeEnum.SMALL_SHIELD);
                break;
            default:
                armor = null;
        }
        return armor;    
    } // end of generateCommonArmor()
    
    private Armor generateUncommonArmor(){
        Armor armor = new Armor();
        int randomArmor = random.nextInt(3);
        switch(randomArmor){
            case 0:
                armor = setArmorType(ArmorTypeEnum.CHAIN_MAIL);
                break;
            case 1:
                armor = setArmorType(ArmorTypeEnum.RING_MAIL);
                break;
            case 2:
                armor = setArmorType(ArmorTypeEnum.MEDIUM_SHIELD);
                break;
            default:
                armor = null;
        }
        return armor;
    } // end of generateUncommonArmor()
    
    private Armor generateRareArmor(){
        Armor armor = new Armor();
        int randomArmor = random.nextInt(6);
        switch(randomArmor){
            case 0:
                armor = setArmorType(ArmorTypeEnum.BANDED);
                break;
            case 1:
                armor = setArmorType(ArmorTypeEnum.SCALE_MAIL);
                break;
            case 2:
                armor = setArmorType(ArmorTypeEnum.SPLINT_MAIL);
                break;
            case 3:
                armor = setArmorType(ArmorTypeEnum.HIDE);
                break;
            case 4:
                armor = setArmorType(ArmorTypeEnum.FULL_HELM);
                break;
            case 5:
                armor = setArmorType(ArmorTypeEnum.LARGE_SHIELD);
                break;
            default:
                armor = null;
        }
        return armor;
    }
    
    private Armor generateVeryRareArmor(){
        Armor armor = new Armor();
        int randomArmor = random.nextInt(3);
        switch(randomArmor){
            case 0:
                armor = setArmorType(ArmorTypeEnum.BRIGANDINE);
                break;
            case 1:
                armor = setArmorType(ArmorTypeEnum.PLATE_MAIL);
                break;
            case 2:
                armor = setArmorType(ArmorTypeEnum.BODY_SHIELD);
                break;
            default:
                armor = null;
        }
        return armor;
    } // generateVeryRareArmor()
    
    private Armor generateUniqueArmor(){
        Armor armor = new Armor();
        int randomArmor = random.nextInt(2);
        switch(randomArmor){
            case 0:
                armor = setArmorType(ArmorTypeEnum.FIELD_PLATE);
                break;
            case 1:
                armor = setArmorType(ArmorTypeEnum.FULL_PLATE);
                break;
            default:
                armor = null;
        }
        return armor;
    }
    
    public Armor mergeArmor(Armor armor){
        return armorRepo.mergeArmor(armor);
    }
    
    public Integer saveArmor(Armor armor){
        return armorRepo.saveArmor(armor);
    }
    
}
