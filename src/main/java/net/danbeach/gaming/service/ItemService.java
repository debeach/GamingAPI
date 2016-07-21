/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.service;

import java.util.List;
import net.danbeach.gaming.domain.item.Item;
import net.danbeach.gaming.repository.item.ItemRepository;

/**
 *
 * @author deb
 */
public class ItemService {

    // TODO: need to write up an exception handling for each method.
    private ItemRepository itemRepo;

    public ItemService() {
        itemRepo = new ItemRepository();
    }

    /**
     * Retrieves all items from the items table.
     * @return a list of all items otherwise null.
     */
    public List<Item> findAllItems(){
        return itemRepo.findItems();
    }
    
    /**
     * Retrieves an item according to the provided name.
     * @param name the name of the item to be retrieved.
     * @return the item otherwise null.
     */
    public Item findItemByName(final String name) {
        return itemRepo.findItemByName(name);
    }

    /**
     * Updates an item in the database. 
     * @param item the item to be updated. 
     * @return the item that has been updated otherwise null.
     */
    public Item mergeItem(final Item item) {
        return itemRepo.mergeItem(item);
    }

    /**
     * Saves or updates an item to the database.
     * @param item the item to be saved/updated.
     */
    public void saveOrUpdateItem(final Item item) {
        itemRepo.saveOrUpdateItem(item);
    }

    /**
     * Saves an item to the database.
     * @param item the item to be saved.
     * @return the item's id otherwise null.
     */
    public Integer saveItem(final Item item) {
        return itemRepo.saveItem(item);
    }

}
