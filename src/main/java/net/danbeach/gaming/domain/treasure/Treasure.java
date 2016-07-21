/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.treasure;

import java.util.ArrayList;
import net.danbeach.gaming.domain.item.Armor;
import net.danbeach.gaming.domain.item.Item;
import net.danbeach.gaming.domain.item.Potion;
import net.danbeach.gaming.domain.item.Scroll;
import net.danbeach.gaming.domain.item.Weapon;

/**
 *
 * @author deb
 */
public class Treasure {

    private Coin coin;
    private ArrayList<Gem> gem;
    private ArrayList<Jewelry> jewelry;
    private ArrayList<Art> art;
    private ArrayList<Trinket> trinket;
    private ArrayList<Item> magicalItems;
    private ArrayList<Armor> magicalArmor;
    private ArrayList<Weapon> magicalWeapon;
    private ArrayList<Potion> potion;
    private ArrayList<Scroll> scroll;

    public Treasure() {

        coin = new Coin(0, 0, 0, 0, 0);
        gem = new ArrayList<Gem>();
        jewelry = new ArrayList<Jewelry>();
        art = new ArrayList<Art>();
        trinket = new ArrayList<Trinket>();
        magicalItems = new ArrayList<Item>();
        magicalArmor = new ArrayList<Armor>();
        magicalWeapon = new ArrayList<Weapon>();
        potion = new ArrayList<Potion>();
        scroll = new ArrayList<Scroll>();
    }

    /**
     * Returns the art in the treasure.
     *
     * @return the art in the treasure.
     */
    public ArrayList<Art> getArt() {
        return art;
    }

    /**
     * Returns the trinkets in the treasure.
     *
     * @return the trinkets in the treasure.
     */
    public ArrayList<Trinket> getTrinket() {
        return trinket;
    }

    /**
     * Sets the coin object to a new coin object.
     *
     * @param coin the coin object.
     */
    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    /**
     * Returns the amount of copper in the treasure
     *
     * @return the amount of copper in the treasure
     */
    public int getCopper() {
        return coin.getCopper();
    }

    /**
     * Sets the number of copper in the treasure. This cannot be a negative
     * value.
     *
     * @param copper the number of copper in the treasure.
     */
    public void setCopper(int copper) {
        if (copper >= 0) {
            this.coin.setCopper(copper);
        } else {
            this.coin.setCopper(0);
        }
    }

    /**
     * Returns the number of electrum in the treasure.
     *
     * @return the number of electrum in the treasure.
     */
    public int getElectrum() {
        return coin.getElectrum();
    }

    /**
     * Sets the number of electrum in the treasure. This cannot be a negative
     * value.
     *
     * @param electrum the number of electrum in the treasure.
     */
    public void setElectrum(int electrum) {
        if (electrum >= 0) {
            coin.setElectrum(electrum);
        } else {
            coin.setElectrum(0);
        }
    }

    /**
     * Returns the gems in the treasure.
     *
     * @return the gems in the treasure.
     */
    public ArrayList<Gem> getGem() {
        return gem;
    }

    /**
     * Sets the gem array list for the Treasure. This is to be used with the
     * treasure controller.
     *
     * @param gem the gem ArrayList.
     */
    public void setGem(ArrayList<Gem> gem) {
        this.gem = gem;
    }

    /**
     * Returns the number of gold in the treasure.
     *
     * @return the number of gold in the treasure.
     */
    public int getGold() {
        return coin.getGold();
    }

    /**
     * Sets the number of gold in the treasure. This cannot be a negative value.
     *
     * @param gold the number of gold in the treasure.
     */
    public void setGold(int gold) {
        if (gold >= 0) {
            this.coin.setGold(gold);
        } else {
            this.coin.setGold(0);
        }
    }

    /**
     * Returns the jewelry in the treasure.
     *
     * @return the jewelry in the treasure
     */
    public ArrayList<Jewelry> getJewelry() {
        return jewelry;
    }

    /**
     * Sets the jewelry in the treasure.
     *
     * @param jewelry the jewelry in the treasure.
     */
    public void setJewelry(ArrayList<Jewelry> jewelry) {
        this.jewelry = jewelry;
    }

    /**
     * Returns the magical armor in the treasure.
     *
     * @return the magical armor in the treasure.
     */
    public ArrayList<Armor> getMagicalArmor() {
        return magicalArmor;
    }

    /**
     * Sets the magical armor in the treasure.
     * @param magicalArmor the magical armor to add to treasure.
     */
    public void setMagicalArmor(ArrayList<Armor> magicalArmor) {
        this.magicalArmor = magicalArmor;
    }

    /**
     * Returns the magical items in the treasure.
     *
     * @return the magical items in the treasure.
     */
    public ArrayList<Item> getMagicalItems() {
        return magicalItems;
    }

    /**
     * Returns the magical weapons in the treasure.
     *
     * @return the magical weapons in the treasure.
     */
    public ArrayList<Weapon> getMagicalWeapon() {
        return magicalWeapon;
    }

    /**
     * Returns the number of platinum in the treasure.
     *
     * @return the number of platinum in the treasure.
     */
    public int getPlatinum() {
        return this.coin.getPlatinum();
    }

    /**
     * Sets the number of platinum in the treasure. Cannot be negative value.
     *
     * @param platinum the number of platinum in the treasure.
     */
    public void setPlatinum(int platinum) {
        if (platinum >= 0) {
            this.coin.setPlatinum(platinum);
        } else {
            this.coin.setPlatinum(0);
        }
    }

    /**
     * Returns the potions in the treasure.
     *
     * @return the potions in the treasure.
     */
    public ArrayList<Potion> getPotion() {
        return potion;
    }

    /**
     * Returns the scrolls in the treasure.
     *
     * @return the scrolls in the treasure.
     */
    public ArrayList<Scroll> getScroll() {
        return scroll;
    }

    /**
     * Returns the number of silver pieces in the treasure.
     *
     * @return the number of silver pieces in the treasure.
     */
    public int getSilver() {
        return coin.getSilver();
    }

    /**
     * Sets the number of silver in the treasure. This cannot be a negative
     * value.
     *
     * @param silver the number of silver in the treasure.
     */
    public void setSilver(int silver) {
        if (silver >= 0) {
            this.coin.setSilver(silver);
        } else {
            this.coin.setSilver(0);
        }
    }

    /**
     * Add an art item to the treasure.
     *
     * @param art the art item to add to the treasure.
     */
    public void addArt(Art art) {
        if (art != null && this.art != null) {
            this.art.add(art);
        }
    }

    /**
     * Add copper pieces to the treasure.
     * @param copper the copper pieces to add to the treasure.
     */
    public void addCopper(int copper) {
        this.coin.addCopper(copper);
    }

    /**
     * Add electrum pieces to the treasure.
     * @param electrum the electrum pieces to add to the treasure.
     */
    public void addElectrum(int electrum) {
        this.coin.addElectrum(electrum);
    }

    /**
     * Add a gem to the treasure.
     *
     * @param gem the gem to be added to the treasure.
     */
    public void addGem(Gem gem) {
        if (this.gem == null) {
            this.gem = new ArrayList<Gem>();
        }
        if (gem == null) {
            return;
        }

        this.gem.add(gem);
    }

    /**
     * Add gold pieces to the treasure.
     * @param gold the gold pieces to add to the treasure.
     */
    public void addGold(int gold) {
        this.coin.addGold(gold);
    }

    /**
     * Add a magical item to the treasure.
     *
     * @param magicalItem the magical item to be added to the treasure.
     */
    public void addMagicalItem(Item magicalItem) {
        if (magicalItem != null & this.magicalItems != null) {
            this.magicalItems.add(magicalItem);
        }
    }

    /**
     * Add a magical armor to the treasure.
     *
     * @param magicArmor the magical armor to be added to the treasure.
     */
    public void addMagicArmor(Armor magicArmor) {
        if (magicArmor != null & this.magicalArmor != null) {
            this.magicalArmor.add(magicArmor);
        }
    }

    /**
     * Add a magical weapon to the treasure.
     *
     * @param magicWeapon the magical weapon to be added to the treasure.
     */
    public void addMagicWeapon(Weapon magicWeapon) {
        if (magicWeapon != null & this.magicalWeapon != null) {
            this.magicalWeapon.add(magicWeapon);
        }
    }

    /**
     * Add platinum pieces to the treasure.
     * @param platinum the platinum pieces to add to the treasure.
     */
    public void addPlatinum(int platinum) {
        this.coin.addPlatinum(platinum);
    }

    /**
     * Add a potion to the treasure.
     *
     * @param potion the potion to add to the treasure.
     */
    public void addPotion(Potion potion) {
        if (potion != null && this.potion != null) {
            this.potion.add(potion);
        }
    }

    /**
     * Add a scroll to the treasure.
     *
     * @param scroll the scroll to be added to the treasure.
     */
    public void addScroll(Scroll scroll) {
        if (scroll != null && this.scroll != null) {
            this.scroll.add(scroll);
        }
    }

    /**
     * Add silver pieces to the treasure.
     * @param silver the silver pieces to add to the treasure.
     */
    public void addSilver(int silver) {
        this.coin.addSilver(silver);
    }

    /**
     * Replace all treasure with new treasure.
     * @param treasure the new treasure.
     */
    public void addTreasure(Treasure treasure) {
        // COINS
        addCopper(treasure.getCopper());
        addSilver(treasure.getSilver());
        addElectrum(treasure.getElectrum());
        addGold(treasure.getGold());
        addPlatinum(treasure.getPlatinum());

        // GEMS
        if (this.gem == null) {
            this.gem = new ArrayList<Gem>();
        }
        if (treasure.getGem() != null) {
            ArrayList<Gem> newGem = treasure.getGem();
            for (int index = 0; index < newGem.size(); index++) {
                gem.add(newGem.get(index));
            }
        }

        // JEWELRY
        if (this.jewelry == null) {
            this.jewelry = new ArrayList<Jewelry>();
        }
        if (treasure.getJewelry() != null) {
            ArrayList<Jewelry> jewel = treasure.getJewelry();
            for (int index = 0; index < jewel.size(); index++) {
                jewelry.add(jewel.get(index));
            }
        }

        // ART
        if (this.art == null) {
            this.art = new ArrayList<Art>();
        }
        if (treasure.getArt() != null) {
            ArrayList<Art> arts = treasure.getArt();
            for (int index = 0; index < arts.size(); index++) {
                art.add(arts.get(index));
            }
        }

        // TRINKET
        if (this.trinket == null) {
            this.trinket = new ArrayList<Trinket>();
        }
        if (treasure.getTrinket() != null) {
            for (int index = 0; index < treasure.getTrinket().size(); index++) {
                this.trinket.add(treasure.getTrinket().get(index));
            }
        }

        // MAGCIAL ITEMS
        if (magicalItems == null) {
            magicalItems = new ArrayList<Item>();
        }
        if (treasure.getMagicalItems() != null) {
            for (int index = 0; index < treasure.getMagicalItems().size(); index++) {
                magicalItems.add(treasure.getMagicalItems().get(index));
            }
        }

        // MAGICAL ARMOR
        if (magicalArmor == null) {
            magicalArmor = new ArrayList<Armor>();
        }
        if (treasure.getMagicalArmor() != null) {
            for (int index = 0; index < treasure.getMagicalArmor().size(); index++) {
                magicalArmor.add(treasure.getMagicalArmor().get(index));
            }
        }

        // MAGICAL WEAPONS
        if (magicalWeapon == null) {
            magicalWeapon = new ArrayList<Weapon>();
        }
        if (treasure.getMagicalWeapon() != null) {
            for (int index = 0; index < treasure.getMagicalWeapon().size(); index++) {
                magicalWeapon.add(treasure.getMagicalWeapon().get(index));
            }
        }

        // POTION
        if (potion == null) {
            potion = new ArrayList<Potion>();
        }
        if (treasure.getPotion() != null) {
            for (int index = 0; index < treasure.getPotion().size(); index++) {
                potion.add(treasure.getPotion().get(index));
            }
        }

        // SCROLL
        if (scroll == null) {
            scroll = new ArrayList<Scroll>();
        }
        if (treasure.getScroll() != null) {
            for (int index = 0; index < treasure.getScroll().size(); index++) {
                scroll.add(treasure.getScroll().get(index));
            }
        }
    }// end of addTreasure()

    /**
     * Add a trinket to the treasure.
     *
     * @param trinket the trinket to be added to the treasure.
     */
    public void addTrinket(Trinket trinket) {
        if (trinket != null && this.trinket != null) {
            this.trinket.add(trinket);
        }
    }

    /**
     * Returns true if there are copper pieces in the treasure.
     * @return true if there are copper pieces in the treasure.
     */
    public boolean hasCopper() {
        if (coin == null) {
            return false;
        }
        return coin.hasCopper();
    }

    /**
     * Returns true if there are electrum pieces in the treasure.
     * @return true if there are electrum pieces in the treasure.
     */
    public boolean hasElectrum() {
        if (coin == null) {
            return false;
        }
        return coin.hasElectrum();
    }

    /**
     * Returns true if there are gold pieces in the treasure.
     * @return true if there are gold pieces in the treasure.
     */
    public boolean hasGold() {
        if (coin == null) {

        }
        return coin.hasGold();
    }

    /**
     * Returns true if there are platinum pieces in the treasure.
     * @return true if there are platinum pieces in the treasure.
     */
    public boolean hasPlatinum() {
        if (coin == null) {
            return false;
        }
        return coin.hasPlatinum();
    }

    /**
     * Returns true if there are silver pieces in the treasure.
     * @return true if there are silver pieces in the treasure.
     */
    public boolean hasSilver() {
        if (coin == null) {
            return false;
        }
        return coin.hasSilver();
    }
}
