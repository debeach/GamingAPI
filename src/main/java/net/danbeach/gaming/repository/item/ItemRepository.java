/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.repository.item;

import java.util.List;
import net.danbeach.gaming.domain.item.Item;
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.ConditionEnum;
import net.danbeach.gaming.constants.GamingColorEnum;
import net.danbeach.gaming.constants.RogueSkillEnum;
import net.danbeach.gaming.constants.Long;
import net.danbeach.gaming.constants.item.ItemCategoryEnum;
import net.danbeach.gaming.repository.ItemHibernateFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author deb
 */
public class ItemRepository {

    Session session = ItemHibernateFactory.getSessionFactory().openSession();

    /**
     *
     */
    public void closeSession() {
        session.close();
    }

    /**
     *
     * @param itemId
     * @return
     */
    public Item findItemById(Integer itemId) {
        if (itemId == null) {
            return null;
        }
        if (itemId.intValue() < 0) {
            return null;
        }

        Item item = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Query queryGeneralItem = session.createQuery("select item from Item item where id = :id ");
            queryGeneralItem.setInteger("id", itemId);
            item = (Item) queryGeneralItem.uniqueResult();
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
        return item;
    }

    /**
     *
     * @param name
     * @return
     */
    public Item findItemByName(String name) {
        Item item = null;
        Transaction tx = null;

        if (name == null) {
            return item;
        }

        try {

            tx = session.beginTransaction();

            Query query = session.createQuery("Select item from Item item where item.name = :itemName");
            query.setString("itemName", name);
            item = (Item) query.uniqueResult();
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

        return item;
    }

    public List<Item> findItems() {

        List<Item> items = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Query query = session.createQuery("from Item");
            items = query.list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }

    /**
     *
     * @param itemFrequency
     * @return
     */
    public List<Item> findItemsByFrequency(FrequencyEnum itemFrequency) {

        if (itemFrequency == null) {
            return null;
        }
//        else if (itemFrequency < 0) {
//            return null;
//        }

        List<Item> items = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Query query = session.createQuery("Select item from Item item where item.frequency = :itemFrequency");
            query.setInteger("itemFrequency", itemFrequency.ordinal());
            items = query.list();
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
        return items;
    }

    /**
     *
     * @param itemFrequency
     * @param itemCategory
     * @return
     */
    public List<Item> findItemsByFrequencyAndCategory(
            FrequencyEnum itemFrequency,
            ItemCategoryEnum itemCategory) {

        if (itemFrequency == null || itemCategory == null) {
            return null;
        }

        List<Item> items = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Query query = session.createQuery("Select item from Item item where item.frequency = :itemFrequency and item.itemCategory = :itemCategory");
            query.setInteger("itemFrequency", itemFrequency.ordinal());
            query.setInteger("itemCategory", itemCategory.ordinal());
            items = query.list();
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
        return items;
    }

    /**
     *
     * @param itemCategory
     * @return
     */
    public List<Item> findItemByItemCategory(ItemCategoryEnum itemCategory) {

        if (itemCategory == null) {
            return null;
        }

        List<Item> items = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Query query = session.createQuery("Select item from Item item where item.itemCategory = :itemCategory");
            query.setInteger("itemCategory", itemCategory.ordinal());
            items = query.list();
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
        return items;
    }

    /**
     *
     * @param item
     * @return
     */
    public Item mergeItem(Item item) {
        if (item == null) {
            return null;
        }
//        Session session = ItemHibernateFactory.getSessionFactory().openSession();
        Item newItem = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            newItem = (Item) session.merge(item);
            session.evict(item);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
//            session.close();
        }
        return newItem;
    }

    /**
     *
     * @param item
     * @return
     */
    public Integer saveItem(Item item) {
        if (item == null) {
            return null;
        }
//        Session session = ItemHibernateFactory.getSessionFactory().openSession();
        Integer itemId = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            itemId = (Integer) session.save(item);
            session.evict(item);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
//            session.close();
        }
        return itemId;
    }

    /**
     *
     * @param item
     */
    public void saveOrUpdateItem(Item item) {
        if (item == null) {
            return;
        }
//        Session session = ItemHibernateFactory.getSessionFactory().openSession();
        Integer itemId = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(item);
            session.evict(item);
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

    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        ItemRepository repo = new ItemRepository();

        // test saveItem()
        Integer itemId = null;

        // test findItemById()
        Integer generalItemId = new Integer(3);

        // findItemByItemCategory
        // findItemByItemFrequency
        ItemCategoryEnum itemCategory = ItemCategoryEnum.BARD_ITEMS;
        FrequencyEnum itemFrequency;
        List<Item> itemFrequencyList = null;
        List<Item> itemCategories = null;
        List<Item> itemFrequencyandCategory = null;
        List<Item> allItems = null;

        // findItemByName
        String name = "Free Range Chicken";

        Item item = null;
        System.out.print("TESTING ItemRepository...");

        // test saveItem()
        Item testItem = new Item();
        testItem.setName("The Main Attraction");
        testItem.setDescription("In Alabama");
        testItem.setColor(GamingColorEnum.GREEN);
        testItem.setConditionOf(ConditionEnum.POOR);
        testItem.setEvaluated(true);
        testItem.setExperienceValue(9955);
        testItem.setFrequency(FrequencyEnum.COMMON);
        testItem.setItemCategory(ItemCategoryEnum.NONE);
        testItem.setMagical(true);
        testItem.setRogueSkill(false);
        testItem.setRogueSkillCategory(RogueSkillEnum.ALL);
        testItem.setSavingThrow(true);
        testItem.setSavingThrowId(Long.ALL);
        testItem.setStackable(true);
        testItem.setBaseValue(3.2);
        testItem.setVolume(2.2);
        testItem.setWeight(13.2);

        try {
//            itemId = repo.saveItem(testItem);
//            item = repo.findItemById(generalItemId);
            itemCategories = repo.findItemByItemCategory(itemCategory);
            itemFrequencyList = repo.findItemsByFrequency(FrequencyEnum.UNCOMMON); // itemFrequency
            itemFrequencyandCategory = repo.findItemsByFrequencyAndCategory(FrequencyEnum.COMMON, itemCategory.ARMOR_ITEMS); // itemFrequency
            allItems = repo.findItems();
            item = repo.findItemByName(name);

            if (itemCategories == null) {
                System.out.println("General Item CATEGORY is null");
            } else {
                for (Item items : itemCategories) {
                    System.out.println("\n\nGeneral Item CATEGORY is: ");
                    System.out.println("Id: " + items.getId());
                    System.out.println("Name: " + items.getName());
                    System.out.println("Description: " + items.getDescription());
                    System.out.println("COLOR: " + items.getColor().getName());
                    System.out.println("Experience Value: " + items.getExperienceValue());
                    System.out.println("Frequency: " + items.getFrequency());
                    System.out.println("Item Category: " + items.getItemCategory());
                    System.out.println("Magical: " + items.isMagical());
                    System.out.println("Rogue Skill: " + items.isRogueSkill());
                    System.out.println("Rogue Skill Category: " + items.getRogueSkillCategory());
                    System.out.println("Saving Throw: " + items.isSavingThrow());
                    System.out.println("Saving Throw Category: " + items.getSavingThrowId());
                    System.out.println("Stackable: " + items.isStackable());
                    System.out.println("Value of: " + items.getBaseValue());
                    System.out.println("Volume: " + items.getVolume());
                    System.out.println("Weight: " + items.getWeight());
                }
            }

            if (itemFrequencyList == null) {
                System.out.println("General Item FREQUENCY is null");
            } else {
                for (Item items : itemFrequencyList) {
                    System.out.println("\n\nGeneral Item FREQUENCY is: ");
                    System.out.println("Id: " + items.getId());
                    System.out.println("Name: " + items.getName());
                    System.out.println("Description: " + items.getDescription());
                    System.out.println("COLOR: " + items.getColor().getName());
                    System.out.println("Experience Value: " + items.getExperienceValue());
                    System.out.println("Frequency: " + items.getFrequency());
                    System.out.println("Item Category: " + items.getItemCategory());
                    System.out.println("Magical: " + items.isMagical());
                    System.out.println("Rogue Skill: " + items.isRogueSkill());
                    System.out.println("Rogue Skill Category: " + items.getRogueSkillCategory());
                    System.out.println("Saving Throw: " + items.isSavingThrow());
                    System.out.println("Saving Throw Category: " + items.getSavingThrowId());
                    System.out.println("Stackable: " + items.isStackable());
                    System.out.println("Value of: " + items.getBaseValue());
                    System.out.println("Volume: " + items.getVolume());
                    System.out.println("Weight: " + items.getWeight());
                }
            }

            if (itemFrequencyandCategory == null) {
                System.out.println("General Item FREQUENCY AND CATEGORY is null");
            } else {
                for (Item items : itemFrequencyandCategory) {
                    System.out.println("\n\nGeneral Item FREQUENCY AND CATEGORY is: ");
                    System.out.println("Id: " + items.getId());
                    System.out.println("Name: " + items.getName());
                    System.out.println("Description: " + items.getDescription());
                    System.out.println("COLOR: " + items.getColor().getName());
                    System.out.println("CONDITION: " + items.getConditionOf().getName());
                    System.out.println("Experience Value: " + items.getExperienceValue());
                    System.out.println("Frequency: " + items.getFrequency());
                    System.out.println("Item Category: " + items.getItemCategory());
                    System.out.println("Magical: " + items.isMagical());
                    System.out.println("Rogue Skill: " + items.isRogueSkill());
                    System.out.println("Rogue Skill Category: " + items.getRogueSkillCategory());
                    System.out.println("Saving Throw: " + items.isSavingThrow());
                    System.out.println("Saving Throw Category: " + items.getSavingThrowId());
                    System.out.println("Stackable: " + items.isStackable());
                    System.out.println("Value of: " + items.getBaseValue());
                    System.out.println("Volume: " + items.getVolume());
                    System.out.println("Weight: " + items.getWeight());
                }
            }

            // test findItemByName
            if (item == null) {
                System.out.println("Find Item by Name is null: ");
            } else {
                System.out.println("\n\nGeneral Item by Name is: ");
                System.out.println("Id: " + item.getId());
                System.out.println("Name: " + item.getName());
                System.out.println("Description: " + item.getDescription());
                System.out.println("COLOR: " + item.getColor().getName());
                System.out.println("CONDITION: " + item.getConditionOf().getName());
                System.out.println("Experience Value: " + item.getExperienceValue());
                System.out.println("Frequency: " + item.getFrequency());
                System.out.println("Item Category: " + item.getItemCategory());
                System.out.println("Magical: " + item.isMagical());
                System.out.println("Rogue Skill: " + item.isRogueSkill());
                System.out.println("Rogue Skill Category: " + item.getRogueSkillCategory());
                System.out.println("Saving Throw: " + item.isSavingThrow());
                System.out.println("Saving Throw Category: " + item.getSavingThrowId());
                System.out.println("Stackable: " + item.isStackable());
                System.out.println("Value of: " + item.getBaseValue());
                System.out.println("Volume: " + item.getVolume());
                System.out.println("Weight: " + item.getWeight());
            }

            if (allItems == null) {
                System.out.println("Find all items is null: ");
            } else {
                System.out.println("number of items is: " + allItems.size());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            repo.closeSession();
            System.out.println("DONE");
        }

    }
}
