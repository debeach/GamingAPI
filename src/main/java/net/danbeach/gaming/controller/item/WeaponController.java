/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.controller.item;

import net.danbeach.gaming.domain.item.Weapon;
import net.danbeach.gaming.repository.item.WeaponRepository;

/**
 *
 * @author deb
 */
public class WeaponController {
    
    private WeaponRepository weaponRepo;
    
    public WeaponController(){
        weaponRepo = new WeaponRepository();
    }
    
    public Weapon findWeaponByName(String name){
        return weaponRepo.findWeaponByName(name);
    }
    
    public Weapon mergeWeapon(Weapon weapon){
        return weaponRepo.mergeWeapon(weapon);
    }
    
    public Integer saveWeapon(Weapon weapon){
        return weaponRepo.saveWeapon(weapon);
    }
    
}
