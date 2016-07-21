/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.repository.item;

import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.item.WeaponSizeEnum;
import net.danbeach.gaming.domain.item.Armor;
import net.danbeach.gaming.domain.item.Weapon;
import net.danbeach.gaming.repository.ItemHibernateFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author deb
 */
public class WeaponRepository {

    Session session = ItemHibernateFactory.getSessionFactory().openSession();

    public Integer addWeapon(Weapon weapon) {
        if (weapon == null) {
            return null;
        }

        Integer weaponId = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            weaponId = (Integer) session.save(weapon);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
//            session.close();
        }
        return weaponId;
    }

    public void closeSession() {
        session.close();
    }

    public Weapon findWeaponById(Integer weaponId) {
        if (weaponId == null) {
            return null;
        }

        if (weaponId.intValue() <= 0) {
            return null;
        }

        Weapon weapon = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Query queryWeapon = session.createQuery("select weapon from Weapon weapon where id = :id ");
            queryWeapon.setInteger("id", weaponId);
            weapon = (Weapon) queryWeapon.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return weapon;
    }

    public Weapon findWeaponByName(String name) {
        Weapon weapon = null;
        Transaction tx = null;

        if (name == null) {
            return weapon;
        }

        try {

            tx = session.beginTransaction();

            Query query = session.createQuery("Select weapon from Weapon weapon where weapon.name = :weaponName");
            query.setString("weaponName", name);
            weapon = (Weapon) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            session.close();
        }

        return weapon;
    }

    /**
     *
     * @param weapon
     * @return
     */
    public Weapon mergeWeapon(Weapon weapon) {
        if (weapon == null) {
            return null;
        }

        Weapon newWeapon = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            newWeapon = (Weapon) session.merge(weapon);
            session.evict(weapon);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {

        }
        return newWeapon;
    }
    
    public Integer saveWeapon(Weapon weapon){
        if(weapon == null){
            return null;
        }
        
        Integer weaponId = null;
        Transaction tx = null;
        
        try {
            tx = session.beginTransaction();
            weaponId = (Integer) session.save(weapon);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
        }
        return weaponId;
    }

 ////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        WeaponRepository weaponRepo = new WeaponRepository();
        Weapon weapon = new Weapon();
        Weapon findWeaponById = null;
        Integer testWeaponId = null;

        weapon.setName("Baubble Axe");
        weapon.setDescription("An Axe that baubbles");
        weapon.setFrequency(FrequencyEnum.COMMON);
        weapon.setSmallDamage(6);
        weapon.setMediumDamage(7);
        weapon.setLargeDamage(8);
        weapon.setMagical(false);
        weapon.setWeaponCategory(1);
        weapon.setWeaponSize(WeaponSizeEnum.SMALL);
        weapon.setWeight(5.0);
        weapon.setWeaponSpeed(8);

        try {
//            testWeaponId = weaponRepo.addWeapon(weapon);
            findWeaponById = weaponRepo.findWeaponById(1);

            System.out.println("Find Weapon by id: \n");
            System.out.println("Name: " + findWeaponById.getName());
            System.out.println("Description: " + findWeaponById.getDescription());
            System.out.println("Frequency: " + FrequencyEnum.fromNumber(findWeaponById.getFrequency().ordinal()));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            System.out.println("DONE");
        }

        System.out.print("Closing session...");
        weaponRepo.closeSession();
        System.out.println("DONE");
    }
}
