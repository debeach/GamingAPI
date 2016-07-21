/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.controller.item;

import net.danbeach.gaming.domain.item.Potion;
import net.danbeach.gaming.repository.item.PotionRepository;

/**
 *
 * @author deb
 */
public class PotionController {
    private PotionRepository potionRepo;
    
    public PotionController(){
        potionRepo = new PotionRepository();
    }
    
    public Potion findPotionById(Integer id){
        return potionRepo.findPotionById(id);
    }
    
    public Potion findPotionByName(String name){
        return potionRepo.findPotionByName(name);
    }
    
    public Potion mergePotion(Potion potion){
        return potionRepo.mergePotion(potion);
    }
    
    public Integer savePotion(Potion potion){
        return potionRepo.savePotion(potion);
    }
}
