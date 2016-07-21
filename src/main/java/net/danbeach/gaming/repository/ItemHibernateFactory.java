/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.repository;

import net.danbeach.gaming.domain.item.Armor;
import net.danbeach.gaming.domain.item.Item;
import net.danbeach.gaming.domain.item.Potion;
import net.danbeach.gaming.domain.item.Rod;
import net.danbeach.gaming.domain.item.Staff;
import net.danbeach.gaming.domain.item.Wand;
import net.danbeach.gaming.domain.item.Weapon;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author deb
 */
public class ItemHibernateFactory {
    private static SessionFactory factory;
    
      static{
        try{
//            factory = new Configuration().configure().buildSessionFactory();
            factory = new AnnotationConfiguration()
                    .configure()
                    .addAnnotatedClass(Item.class)
                    .addAnnotatedClass(Armor.class)
                    .addAnnotatedClass(Potion.class)
                    .addAnnotatedClass(Rod.class)
                    .addAnnotatedClass(Staff.class)
                    .addAnnotatedClass(Wand.class)
                    .addAnnotatedClass(Weapon.class)
                    .buildSessionFactory();
        }
        catch(Throwable t){
            System.err.println("Failed to create sessionFactory object." + t);
            throw new ExceptionInInitializerError(t);
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }

    public static void setSessionFactory(SessionFactory factory) {
        ItemHibernateFactory.factory = factory;
    }
    
    public static void shutDown(){
        getSessionFactory().close();
    }
}
