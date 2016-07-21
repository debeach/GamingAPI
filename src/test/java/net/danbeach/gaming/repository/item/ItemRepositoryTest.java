/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.repository.item;

import java.util.List;
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.item.ItemCategoryEnum;
import net.danbeach.gaming.domain.item.Item;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deb
 */
public class ItemRepositoryTest {
    
    ItemRepository itemRepo;
    public ItemRepositoryTest() {
        itemRepo = new ItemRepository();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
       
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
    public void findItemByFrequency_Test(){
        System.out.println("TESTING findItemByFrequency...");
        List<Item> items;
        items = itemRepo.findItemsByFrequency(FrequencyEnum.COMMON);
        assertNotNull(items);
        assertTrue(!items.isEmpty());
        for(Item item : items){
            System.out.println("Item Name: " + item.getName());
        }
        System.out.println("DONE");
    }
    
    @Test
    public void findItemByFrequencyAndCategory_Test(){
        System.out.println("TESTING findItemByFrequencyAndCategory...");
        List<Item> items;
        items = itemRepo.findItemsByFrequencyAndCategory(
                FrequencyEnum.COMMON,
                ItemCategoryEnum.ARMOR_ITEMS);
        assertNotNull(items);
        assertTrue(!items.isEmpty());
        for(Item item : items){
            System.out.println("Item Name: " + item.getName());
        }
        System.out.println("DONE");
    }
    
    @Test
    public void findItemById_Test(){
        System.out.println("TESTING findItemById...");
        Item item = null;
        item = itemRepo.findItemById(3);
        assertNotNull(item);
        System.out.println("Item name is: " + item.getName());
        System.out.println("DONE");
    }
    
    @Test
    public void findItemByItemCategory_Test(){
        System.out.println("TESTING findItemByItemCategory...");
        List<Item> items;
        items = itemRepo.findItemByItemCategory(ItemCategoryEnum.ARMOR_ITEMS);
        assertNotNull(items);
        assertTrue(!items.isEmpty());
        for(Item item : items){
            System.out.println("Item Name: " + item.getName());
        }
        System.out.println("DONE");
    }
    
    @Test
    public void findItemByName_Test(){
        System.out.println("TESTING findItemByName...");
        Item item;
        String name = "Free Range Chicken";
        item = itemRepo.findItemByName(name);
        assertNotNull(item);
        System.out.println("Item Name: " + item.getName());
        System.out.println("DONE");
    }
    
    @Test
    public void saveItem_Test() {
        System.out.println("TESTING saveItem...");
        Item item = null;
        Integer id = new Integer(2);
        item = itemRepo.findItemById(id);
        item.setExperienceValue(item.getExperienceValue() + 1);
        Integer result = itemRepo.saveItem(item);
        assertNotNull(result);
        assertTrue(id.intValue() == result.intValue());
        System.out.println("DONE");
    }

   
    
}
