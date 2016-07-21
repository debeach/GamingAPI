/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.controller.item;

import java.util.List;
import net.danbeach.gaming.domain.item.Item;
import net.danbeach.gaming.service.ItemService;

/**
 *
 * @author deb
 */
public class ItemController {

    private final ItemService itemService;

    public ItemController() {
        itemService = new ItemService();
    }

    /**
     * Retrieves all items from the item table.
     * @return a list of all items otherwise null.
     */
    public List<Item> findAllItems(){
        return itemService.findAllItems();
    }
    
    /**
     * Retrieves an item from the database according to it's name.
     * @param name the name of the item to be retrieved.
     * @return the item otherwise null.
     */
    public Item findItemByName(final String name) {
        if (name == null) {
            return null;
        }

        Item item = itemService.findItemByName(name);
        return item;
    }

    /**
     * Saves an item to the database. If the item is not null and it is the
     * first time save then it will save the item otherwise it will merge the
     * item with the existing item in the database.
     *
     * @param item the item to be saved
     * @return The saved item's id otherwise null.
     */
    public Integer saveItem(final Item item) {

        Integer itemId = null;

        if (item == null) {
            return null;
        }

        if (item.getId() == null) {
            itemId = itemService.saveItem(item);
        } else {
            Item saveItem = itemService.mergeItem(item);
            if (saveItem != null) {
                itemId = saveItem.getId();
            }
        }
        return itemId;
    }

}
