/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.repository.item;

import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.item.ItemCategoryEnum;
import net.danbeach.gaming.domain.item.Armor;
import net.danbeach.gaming.domain.item.Item;
import net.danbeach.gaming.repository.ItemHibernateFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author deb
 */
public class ArmorRepository {

    Session session = ItemHibernateFactory.getSessionFactory().openSession();

    /**
     * 
     */
    public void closeSession() {
        session.close();
    }

    /**
     *
     * @param armorId
     * @return
     */
    public Armor findArmorById(Integer armorId) {
        if (armorId == null) {
            return null;
        }
        if (armorId.intValue() < 0) {
            return null;
        }

        Armor armor = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Query queryGeneralItem = session.createQuery("select armor from Armor armor where armor.id = :id ")
                    .setInteger("id", armorId);
            armor = (Armor) queryGeneralItem.uniqueResult();
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
        return armor;
    }

    /**
     * 
     * @param name
     * @return 
     */
     public Armor findArmorByName(String name) {
        Armor armor = null;
        Transaction tx = null;

        if (name == null) {
            return armor;
        }

        try {

            tx = session.beginTransaction();

            Query query = session.createQuery("Select armor from Armor armor where armor.name = :armorName");
            query.setString("armorName", name);
            armor = (Armor) query.uniqueResult();
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

        return armor;
    }
    
    /**
     *
     * @param armor
     * @return
     */
    public Armor mergeArmor(Armor armor) {
        if (armor == null) {
            return null;
        }

        Armor newArmor = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            newArmor = (Armor) session.merge(armor);
            session.evict(armor);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
//             session.close();
        }
        return newArmor;
    }

    /**
     *
     * @param armor
     * @return
     */
    public Integer saveArmor(Armor armor) {
        if (armor == null) {
            return null;
        }

        Integer armorId = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            armorId = (Integer) session.save(armor);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
//             session.close();
        }
        return armorId;
    }

///////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        ArmorRepository armorRepo = new ArmorRepository();

        Integer armorId = null;

        System.out.println("Testing ArmorRepository...");

        Armor armor = new Armor();

        armor.setName("Test Leather");
        armor.setDescription("This is leather armor");
        armor.setExperienceValue(5);
        armor.setFrequency(FrequencyEnum.COMMON);
//         armor.setItemCategory(ItemCategoryEnum.ARMOR_ITEMS.getItemCategory());
//         armor.setMagical(false);
//         armor.setRogueSkill(false);
//         armor.setRogueSkillCategory(0);
//         armor.setSavingThrow(false);
//         armor.setSavingThrowId(0);
//         armor.setStackable(false);
//         armor.setBaseValue(15.0);
//         armor.setVolume(0.0);
        armor.setWeight(5.0);
        armor.setDefenseValue(2);
        armor.setMagicDefense(0);

        try {
//             armorId = armorRepo.saveArmor(armor);
            armor = armorRepo.findArmorById(1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("DONE");
        }

        if (armor == null) {
            System.out.println("armor is null");
        } else {
            System.out.println("Id: " + armor.getId());
            System.out.println("Name: " + armor.getName());

        }

        System.out.println("Done");
    }
}
