/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.repository.item;

import java.util.List;

import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.domain.item.Potion;
import net.danbeach.gaming.repository.ItemHibernateFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author deb
 */
public class PotionRepository {

    Session session = ItemHibernateFactory.getSessionFactory().openSession();

    /**
     * 
     */
    public void closeSession() {
        session.close();
    }

    /**
     * 
     * @param potionFrequency
     * @return 
     */
    public List<Potion> findPotionByFrequency(FrequencyEnum potionFrequency) {

        if (potionFrequency == null) {
            return null;
        }

        List<Potion> potions = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Query query = session.createQuery("Select potion from Potion potion where potion.frequency = :potionFrequency");
            query.setInteger("potionFrequency", potionFrequency.ordinal());
            potions = query.list();
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
        return potions;
    }

   

    /**
     * 
     * @param potionId
     * @return 
     */
    public Potion findPotionById(Integer potionId) {
        if (potionId == null) {
            return null;
        }
        if (potionId.intValue() < 0) {
            return null;
        }

        Potion potion = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Query queryGeneralPotion = session.createQuery("select potion from Potion potion where id = :id ");
            queryGeneralPotion.setInteger("id", potionId);
            potion = (Potion) queryGeneralPotion.uniqueResult();
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
        return potion;
    }

    
    /**
     * 
     * @param name
     * @return 
     */
    public Potion findPotionByName(String name) {
        Potion potion = null;
        Transaction tx = null;

        if (name == null) {
            return potion;
        }

        try {

            tx = session.beginTransaction();

            Query query = session.createQuery("Select potion from Potion potion where potion.name = :potionName");
            query.setString("potionName", name);
            potion = (Potion) query.uniqueResult();
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

        return potion;
    }

    /**
     * 
     * @param potion
     * @return 
     */
    public Potion mergePotion(Potion potion) {
        if (potion == null) {
            return null;
        }
//        Session session = ItemHibernateFactory.getSessionFactory().openSession();
        Potion newPotion = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
//            newPotion = (Potion) session.merge(potion);
             newPotion = (Potion) session.save(potion);
            session.evict(potion);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
//            session.close();
        }
        return newPotion;
    }

    /**
     * 
     * @param potion
     * @return 
     */
    public Integer savePotion(Potion potion) {
        if (potion == null) {
            return null;
        }
//        Session session = ItemHibernateFactory.getSessionFactory().openSession();
        Integer potionId = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            potionId = (Integer) session.save(potion);
            session.evict(potion);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
//            session.close();
        }
        return potionId;
    }

    /**
     * 
     * @param potion 
     */
    public void saveOrUpdatePotion(Potion potion) {
        if (potion == null) {
            return;
        }
//        Session session = ItemHibernateFactory.getSessionFactory().openSession();
        Integer potionId = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(potion);
            session.evict(potion);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
//            session.close();
        }
    }

}
