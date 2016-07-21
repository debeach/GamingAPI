package net.danbeach.gaming.domain.item;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import net.danbeach.gaming.constants.FrequencyEnum;
import net.danbeach.gaming.constants.LibraryEnum;
import net.danbeach.gaming.constants.RogueSkillEnum;
import net.danbeach.gaming.constants.SavingThrowEnum;
import net.danbeach.gaming.constants.item.ItemCategoryEnum;

/**
 * Created by deb on 2/15/14.
 */
@Entity
@Table(schema = "GAMER", name = "ITEM")
public class Item extends GeneralItem implements Comparable<Item>, Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;             // hibernate

    @Column(name = "book")
    @Enumerated(EnumType.ORDINAL)
    private LibraryEnum book;
    
    @Column(name = "book_page")
    private Integer bookPage;
    
    @Column(name = "description")
    private String description;    // what the item is/does

    @Column(name = "experience_value")
    private Integer experienceValue;// how much experience points this item is worth

    @Column(name = "frequency")
    @Enumerated(EnumType.ORDINAL)
    private FrequencyEnum frequency;

    @Column(name = "item_category")
    @Enumerated(EnumType.ORDINAL)
    private ItemCategoryEnum itemCategory;   // what type of item is it.

    @Column(name = "magical")
    private Boolean magical;        // is the item magical or not.

    @Column(name = "name")
    private String name;           // name of the item

    @Transient
    private int numberInStack;  // if stackable, how many is in stack.

    @Column(name = "rogue_skill")
    private Boolean rogueSkill;     // does this item affect a rogue skill

    @Column(name = "rogue_skill_category")
    private RogueSkillEnum rogueSkillCategory; // what rogue skill does it affect

    @Column(name = "saving_throw")
    private Boolean savingThrow;    // does this item affect a saving throw

    @Column(name = "saving_throw_category")
    private SavingThrowEnum savingThrowCategory; // what saving throw does it affect

    @Column(name = "stackable")
    private Boolean stackable;      // is the item small enough to be stackable

    @Column(name = "value_of")
    private Double valueOf;          // what the item is worth

    @Column(name = "volume")
    private Double volume;         // the amount of space the item takes up.

    @Column(name = "weight")
    private Double weight;         // how much the items weighs.

    public Item() {

        this.book = LibraryEnum.NONE;
        this.bookPage = 0;
        this.description = "description";

        this.experienceValue = 0;
        this.frequency = FrequencyEnum.COMMON;
        this.itemCategory = ItemCategoryEnum.NONE;
        this.magical = false;
        this.name = "name";
        this.numberInStack = 1;
        this.rogueSkill = false;
        this.rogueSkillCategory = RogueSkillEnum.ALL;
        this.savingThrow = false;
        this.savingThrowCategory = SavingThrowEnum.ALL;
        this.stackable = false;
        this.valueOf = 0.0;
        this.volume = 0.0;
        this.weight = 0.0;
    }

    public Item(String name, boolean stackable, double value, double volume, double weight) {
        this();
        this.name = name;
        this.stackable = stackable;
        setValueOf(value);
        setVolume(volume);
        setWeight(weight);
    }

    public Item(Item item) {
        super(item);
        
        this.setBook(item.getBook());
        this.setBookPage(item.getBookPage());
        this.setDescription(item.getDescription());
        this.setEvaluated(item.isEvaluated());
        this.setExperienceValue(item.getExperienceValue());
        this.setFrequency(item.getFrequency());
        this.setItemCategory(item.getItemCategory());
        this.setMagical(item.isMagical());
        this.setName(item.getName());
        this.setNumberInStack(item.getNumberInStack());
        this.setRogueSkill(item.isRogueSkill());
        this.setRogueSkillCategory(item.getRogueSkillCategory());
        this.setSavingThrow(item.isSavingThrow());
        this.setSavingThrowCategory(item.getSavingThrowCategory());
        this.setStackable(item.isStackable());
        this.setValueOf(item.getValueOf());
        this.setVolume(item.getVolume());
        this.setWeight(item.getWeight());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LibraryEnum getBook() {
        return book;
    }

    public void setBook(LibraryEnum book) {
        this.book = book;
    }

    public Integer getBookPage() {
        return bookPage;
    }

    public void setBookPage(Integer bookPage) {
        this.bookPage = bookPage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getExperienceValue() {
        return experienceValue;
    }

    /**
     * Sets the experience of the item. This valueOf cannot be less then zero.
     *
     * @param experienceValue the experience valueOf of the item.
     */
    public void setExperienceValue(Integer experienceValue) {
        this.experienceValue = experienceValue;
    }

    public FrequencyEnum getFrequency() {
        return frequency;
    }

    /**
     * This cannot be a negative value. It must be a value between 0 and 5.
     *
     * @param frequency
     */
    public void setFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
    }

    public ItemCategoryEnum getItemCategory() {
        return itemCategory;
    }

    /**
     * Sets the item category. The category can be found in this class. It
     * cannot be a negative valueOf.
     *
     * @param itemCategory
     */
    public void setItemCategory(ItemCategoryEnum itemCategory) {
        this.itemCategory = itemCategory;
    }

    public Boolean isMagical() {
        return magical;
    }

    public void setMagical(Boolean magical) {
        this.magical = magical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberInStack() {
        return numberInStack;
    }

    /**
     * Sets the number stacked for this item. The valueOf cannot be less than
     * zero.
     *
     * @param numberInStack the number stacked for this item.
     */
    public void setNumberInStack(int numberInStack) {
        this.numberInStack = numberInStack;
    }

    public Boolean isRogueSkill() {
        return rogueSkill;
    }

    public void setRogueSkill(Boolean rogueSkill) {
        this.rogueSkill = rogueSkill;
    }

    public RogueSkillEnum getRogueSkillCategory() {
        return rogueSkillCategory;
    }

    /**
     * Sets the rogue skill category if the item can affect one or all rogue
     * skill. This cannot be a negative valueOf.
     *
     * @param rogueSkillCategory the rogue skill category the item can affect.
     */
    public void setRogueSkillCategory(RogueSkillEnum rogueSkillCategory) {
        this.rogueSkillCategory = rogueSkillCategory;
    }

    public Boolean isSavingThrow() {
        return savingThrow;
    }

    public void setSavingThrow(Boolean savingThrow) {
        this.savingThrow = savingThrow;
    }

    public SavingThrowEnum getSavingThrowCategory() {
        return savingThrowCategory;
    }

    /**
     * Sets the saving throw category if the item can affect one or all saving
     * throws. This cannot be a negative valueOf.
     *
     * @param savingThrowCategory
     */
    public void setSavingThrowCategory(SavingThrowEnum savingThrowCategory) {
        this.savingThrowCategory = savingThrowCategory;
    }

    public Boolean isStackable() {
        return stackable;
    }

    public void setStackable(Boolean stackable) {
        this.stackable = stackable;
    }

    public Double getValueOf() {
        return valueOf;
    }

    /**
     * Sets the valueOf for the item. The valueOf cannot be less then zero.
     *
     * @param value the valueOf of the item.
     */
    public void setValueOf(Double value) {
        this.valueOf = value;
    }

    public Double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the item. This valueOf cannot be less than zero.
     *
     * @param volume the volume of the item.
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the item. This valueOf cannot be less than zero.
     *
     * @param weight the weight of the item.
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * Adds one more item to a stackable item.
     *
     * @return true if an item is added to the stack.
     */
    public boolean addStackable() {
        numberInStack++;
        return true;
    }

    /**
     * Adds zero or more items to a stackable item. The valueOf added cannot be
     * less than zero.
     *
     * @param numberToStack the number of items added to the stackable item.
     * @return true if the items are added to the stack.
     */
    public boolean addStackable(int numberToStack) {
        if (numberToStack > 0) {
            numberInStack += numberToStack;
            return true;
        }
        return false;
    }

    /**
     * Removes one item from a stackable item. It will remove an item only if
     * there any items to remove.
     *
     * @return true if an item is removed from a stackable item.
     */
    public boolean removeStackable() {
        if (numberInStack > 0) {
            numberInStack--;
            return true;
        }
        return false;
    }

    /**
     * Removes more than zero items from a stackable item.
     *
     * @param numberFromStack the number of items to be removed from the stack
     * @return true if the items where removed from the stackable item.
     */
    public boolean removeStackable(int numberFromStack) {
        if (numberFromStack > 0 && numberFromStack <= numberInStack) {
            numberInStack -= numberFromStack;
            return true;
        }
        return false;
    }

    /**
     * Compares one item to another. This overrides the Object method.
     *
     * @param item the item to be compared.
     * @return true if they are the same type of item.
     */
    @Override
    public int compareTo(Item item) {
        return this.name.compareToIgnoreCase(item.getName());
    }
}
