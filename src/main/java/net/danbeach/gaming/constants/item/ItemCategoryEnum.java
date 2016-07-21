/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants.item;

/**
 * Contains the item category as found in Aurora's Catelog or added by players.
 * The object will include the name of the category and a number that represents
 * it.
 *
 * @author deb
 */
public enum ItemCategoryEnum {
    NONE(0, "None"),
    ARMOR_ITEMS(1, "Armor Items"), // Boom's Garden
    ART_ITEMS(2, "Art Items"),
    BARD_ITEMS(3, "Bard Gear"),
    BEVERAGE_ITEMS(4, "Beverages"),
    CLOTHES_ITEMS(5, "Clothing"),
    DIVERSION_ITEMS(6, "Diversion Items"),
    FOOD_ITEMS(7, "Food"),
    FOOD_LARDER_ITEMS(8, "Food Larder Items"), // cooking ingredients - Aurora's Larder
    GENERAL_HARDWARE_ITEMS(9, "General Hardware"),
    HOUSEHOLD_ITEMS(10, "Household Items"),
    ILLUMINATION_ITEMS(11, "Illuminations"),
    INN_ITEMS(12, "Inn Items"),
    JEWELRY_ITEMS(13, "Jewelry"),
    LABORER_ITEMS(14, "Laborer Equipment"),
    MEDICAL_ITEMS(15, "Medical Items"),
    PERSONAL_ITEMS(16, "Personal Supplies"),
    PRIEST_ITEMS(17, "Priest Gear"),
    RANGER_ITEMS(18, "Ranger Gear"),
    ROGUE_ITEMS(19, "Rogue Gear"),
    SCRIBE_ITEMS(20, "Scribe Items"),
    STORAGE_ITEMS(21, "Storage Items"),
    TAILOR_ITEMS(22, "Tailor Equipment"),
    TRINKET_ITEMS(23, "Trinket Items"),
    WILDERNESS_GEAR_ITEMS(24, "Wilderness Gear"),
    WIZARD_ITEMS(25, "Wizard Gear");

    private int itemCategory;
    private String itemName;

    private ItemCategoryEnum(){}
    private ItemCategoryEnum(int itemCategory, String itemName) {
        this.itemCategory = itemCategory;
        this.itemName = itemName;
    }

    public int getItemCategory() {
        return itemCategory;
    }

    public String getItemName() {
        return itemName;
    }


    /**
     * Determines if a text string represents any of the ItemCategoryEnum
     * categories.
     *
     * @param category the text string to be compared.
     * @return the ItemCategoryEnum if text is item category else null.
     */
    public static ItemCategoryEnum fromString(String category) {
        if (category != null) {
            for (ItemCategoryEnum cat : ItemCategoryEnum.values()) {
                if (category.equalsIgnoreCase(cat.itemName)) {
                    return cat;
                }
            }
        }
        return null;
    }

    /**
     * Determines if a number represents any of the ItemCategoryEnum categories.
     *
     * @param number the number to be compared.
     * @return the ItemCategoryEnum if number is item category else null
     */
    public static ItemCategoryEnum fromNumber(int number) {
        if (number >= 0) {
            for (ItemCategoryEnum num : ItemCategoryEnum.values()) {
                if (number == num.itemCategory) {
                    return num;
                }
            }
        }
        return null;
    }

}
