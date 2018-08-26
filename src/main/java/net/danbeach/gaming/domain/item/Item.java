package net.danbeach.gaming.domain.item;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import net.danbeach.gaming.constants.*;
import net.danbeach.gaming.constants.item.ItemCategoryEnum;
import net.danbeach.gaming.constants.item.QualityType;
import net.danbeach.gaming.exception.GamingErrorCodeEnum;
import net.danbeach.gaming.exception.GamingException;

/**
 * Created by deb on 2/15/14.
 */
@Entity
@Table(schema = "GAMING", name = "ITEM")
public class Item extends AbstractItem implements Comparable<Item>, Serializable {

    // Database table id for item. It cannot be less than 1.
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;             // hibernate

    // The base value for an item. It cannot be a negative value.
    @Column(name = "base_value")
    private Double baseValue;          // what the item is worth

    /**
     * The color of the item.
     */
    @Transient
    private GamingColorEnum color;

    /**
     * The condition of the item. It may be BROKEN, RUSTED, POOR, DAMAGED,
     * GOOD, EXCELLENT, SUPERIOR, PERFECT.
     */
    @Transient
    private ConditionEnum conditionOf;
    
    @Column(name = "description")
    private String description;    // what the item is/does

    /**
     * Used to determine if an item that is part of an inventory or treasure
     * has been evaluated or not.
     */
    @Transient
    private boolean evaluated;

    // How many experience points an item is worth. It cannot be a negative value.
    @Column(name = "experience_value")
    private Integer experienceValue;// how much experience points this item is worth

    @Column(name = "frequency")
    @Enumerated(EnumType.ORDINAL)
    private FrequencyEnum frequency;

    @Column(name = "item_category")
    @Enumerated(EnumType.ORDINAL)
    private ItemCategoryEnum itemCategory;   // what type of item is it.

    // TODO: NEED TO MAKE THIS A SEPARATE LOOKUP TABLE.
    @Column(name = "library_resource")
    @Enumerated(EnumType.ORDINAL)
    private LibraryEnum resourceLibrary;

    // What page the item appears on in the resource library book it is found in. It cannot be a negative value.
    @Column(name = "library_resource_page")
    private Integer resourceLibraryPage;

    @Column(name = "magical")
    private Boolean magical;        // is the item magical or not.

    /**
     * What the item is made of.
     */
    @Transient
    private String material;

    @Column(name = "name")
    private String name;           // name of the item

    // If an item is stackable, how many are in the stack. It cannot be a negative value.
    @Transient
    private int numberInStack;  // if stackable, how many is in stack.

    /**
     * Indicates who or what created the item or empty string if unknown.
     */
    @Transient
    private String origin;

    /**
     * Indicates the quality of craftsmanship and current condition of an item.
     * It may include: BROKEN, VERY_POOR, POOR, FAIR, GOOD, VERY_GOOD,
     * EXCELLENT, SUPERIOR, PERFECT.
     */
    @Transient
    private QualityType quality;        // quality of item

    @Column(name = "rogue_skill")
    private Boolean rogueSkill;     // does this item affect a rogue skill

    // TODO: NEED TO MAKE THIS A CONNECTION TO THE ROGUE_SKILL TABLE
    @Column(name = "rogue_skill_category")
    private RogueSkillEnum rogueSkillCategory; // what rogue skill does it affect

    @Column(name = "rogue_skill_value")
    private Integer rogueSkillValue;

    @Column(name = "stackable")
    private Boolean stackable;      // is the item small enough to be stackable

    // How much space it takes up. It cannot be a negative.
    @Column(name = "volume")
    private Double volume;         // the amount of space the item takes up.

    // How much an item weighs. It cannot not be a negative value.
    @Column(name = "weight")
    private Double weight;         // how much the items weighs.
    /////////////////////////////////////////////////////////////////////////////////////


    public Item() {
        this.baseValue = 0.0;
        this.color = GamingColorEnum.NONE;
        this.conditionOf = ConditionEnum.FAIR;
        this.description = "description";
        this.evaluated = false;
        this.experienceValue = 0;
        this.frequency = FrequencyEnum.COMMON;
        this.itemCategory = ItemCategoryEnum.NONE;
        this.resourceLibrary = LibraryEnum.NONE;
        this.resourceLibraryPage = 0;
        this.magical = false;
        this.material = "Unknown Material";
        this.name = "name";
        this.numberInStack = 1;
        this.origin = "Unknown Origin";
        this.quality = QualityType.FAIR;
        this.rogueSkill = false;
        this.rogueSkillCategory = RogueSkillEnum.ALL;
        this.stackable = false;
        this.volume = 0.0;
        this.weight = 0.0;
    }

    public Item(String name, boolean stackable, double value, double volume, double weight) {
        this();
        this.name = name;
        this.stackable = stackable;
        setBaseValue(value);
        setVolume(volume);
        setWeight(weight);
    }

    public Item(Item item) {
        this.setId(item.getId());
        this.setColor(item.getColor());
        this.setConditionOf(item.getConditionOf());
        this.setDescription(item.getDescription());
        this.setEvaluated(item.isEvaluated());
        this.setExperienceValue(item.getExperienceValue());
        this.setFrequency(item.getFrequency());
        this.setItemCategory(item.getItemCategory());
        this.setResourceLibrary(item.getResourceLibrary());
        this.setResourceLibraryPage(item.getResourceLibraryPage());
        this.setMagical(item.isMagical());
        this.setMaterial(item.getMaterial());
        this.setName(item.getName());
        this.setNumberInStack(item.getNumberInStack());
        this.setOrigin(item.getOrigin());
        this.setQuality(item.getQuality());
        this.setRogueSkill(item.isRogueSkill());
        this.setRogueSkillCategory(item.getRogueSkillCategory());
        this.setStackable(item.isStackable());
        this.setBaseValue(item.getBaseValue());
        this.setVolume(item.getVolume());
        this.setWeight(item.getWeight());
    }
    /////////////////////////////////////////////////////////////////////////////////////


    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        if(id == null){
            throw new GamingException(GamingErrorCodeEnum.NULL_PARAMETER, "Item id cannot be a null value.");
        }else if(id < 1){
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Item id cannot be less than 1.");
        }
        this.id = id;
    }

    public Double getBaseValue() {
        return this.baseValue;
    }

    /**
     * Sets the baseValue for the item. The baseValue cannot be less then zero.
     *
     * @param value the baseValue of the item.
     */
    public void setBaseValue(final Double value) {
        if (value == null || value < 0.0) {
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Item value cannot be null or a negative number.");
        }
        this.baseValue = value;
    }

    /**
     * Returns the gaming color enum.
     * @return the gaming color enum.
     */
    public GamingColorEnum getColor() {
        return this.color;
    }

    /**
     * Sets the Gaming color enum.
     * @param color the gaming color enum.
     */
    public void setColor(final GamingColorEnum color) {
        this.color = color;
    }

    /**
     * Returns the item condition.
     * @return the item condition.
     */
    public ConditionEnum getConditionOf() {
        return this.conditionOf;
    }

    /**
     * Sets the condition of the item.
     * @param conditionOf the condition of the item.
     */
    public void setConditionOf(final ConditionEnum conditionOf) {
        this.conditionOf = conditionOf;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Integer getExperienceValue() {
        return this.experienceValue;
    }

    /**
     * Sets the experience of the item. This baseValue cannot be less then zero.
     *
     * @param experienceValue the experience baseValue of the item.
     */
    public void setExperienceValue(final Integer experienceValue) {
        if(experienceValue == null || experienceValue < 0){
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Item experience value cannot be null or a negative value.");
        }
        this.experienceValue = experienceValue;
    }

    /**
     * Returns whether an item has been evaluated.
     * @return true if the item has been evaluated otherwise false.
     */
    public boolean isEvaluated() {
        return this.evaluated;
    }

    /**
     * Sets the item evaluated condition.
     * @param evaluated the item evaluation condition.
     */
    public void setEvaluated(final boolean evaluated) {
        this.evaluated = evaluated;
    }

    public FrequencyEnum getFrequency() {
        return this.frequency;
    }

    /**
     * This cannot be a negative value. It must be a value between 0 and 5.
     *
     * @param frequency
     */
    public void setFrequency(final FrequencyEnum frequency) {
        this.frequency = frequency;
    }

    public ItemCategoryEnum getItemCategory() {
        return this.itemCategory;
    }

    /**
     * Sets the item category. The category can be found in this class. It
     * cannot be a negative baseValue.
     *
     * @param itemCategory
     */
    public void setItemCategory(final ItemCategoryEnum itemCategory) {
        this.itemCategory = itemCategory;
    }

    public Boolean isMagical() {
        return this.magical;
    }

    public void setMagical(final Boolean magical) {
        this.magical = magical;
    }

    /**
     * Returns the material the item is made of.
     * @return the material the item is made of.
     */
    public String getMaterial() {
        return this.material;
    }

    /**
     * Sets the material the item is made of.
     * @param material the material the item is made of.
     */
    public void setMaterial(final String material) {
        this.material = material;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getNumberInStack() {
        return this.numberInStack;
    }

    /**
     * Sets the number stacked for this item. The baseValue cannot be less than
     * zero.
     *
     * @param numberInStack the number stacked for this item.
     */
    public void setNumberInStack(final int numberInStack) {
        if(numberInStack < 0){
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Item number in stack can not be a negative value.");
        }
        this.numberInStack = numberInStack;
    }

    /**
     * Returns the origin of the item.
     * @return the origin of the item.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Sets the origin of an item.
     * @param origin the origin of an item.
     */
    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    /**
     * Returns the quality type of an item.
     * @return the quality type of an item.
     */
    public QualityType getQuality() {
        return this.quality;
    }

    /**
     * Sets the quality type of an item.
     * @param quality the quality type of an item.
     */
    public void setQuality(final QualityType quality) {
        this.quality = quality;
    }

    public LibraryEnum getResourceLibrary() {
        return this.resourceLibrary;
    }

    public void setResourceLibrary(final LibraryEnum resourceLibrary) {
        this.resourceLibrary = resourceLibrary;
    }

    public Integer getResourceLibraryPage() {
        return this.resourceLibraryPage;
    }

    public void setResourceLibraryPage(final Integer resourceLibraryPage) {
        if(resourceLibraryPage == null || resourceLibraryPage < 0){
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Item resource library page can not be null or a negative value.");
        }
        this.resourceLibraryPage = resourceLibraryPage;
    } // TODO: CANNOT ALLOW A PAGE LESS THAN 1.

    public Boolean isRogueSkill() {
        return this.rogueSkill;
    }

    public void setRogueSkill(final Boolean rogueSkill) {
        this.rogueSkill = rogueSkill;
    }

    public RogueSkillEnum getRogueSkillCategory() {
        return this.rogueSkillCategory;
    }

    /**
     * Sets the rogue skill category if the item can affect one or all rogue
     * skill. This cannot be a negative baseValue.
     *
     * @param rogueSkillCategory the rogue skill category the item can affect.
     */
    public void setRogueSkillCategory(final RogueSkillEnum rogueSkillCategory) {
        this.rogueSkillCategory = rogueSkillCategory;
    }

    public Boolean isStackable() {
        return this.stackable;
    }

    public void setStackable(final Boolean stackable) {
        this.stackable = stackable;
    }

    public Double getVolume() {
        return this.volume;
    }

    /**
     * Sets the volume of the item. This baseValue cannot be less than zero.
     *
     * @param volume the volume of the item.
     */
    public void setVolume(final Double volume) {
        if(volume == null || volume < 0.0){
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Item volume can not be null or a negative value");
        }
        this.volume = volume;
    }

    public Double getWeight() {
        return this.weight;
    }

    /**
     * Sets the weight of the item. This baseValue cannot be less than zero.
     *
     * @param weight the weight of the item.
     */
    public void setWeight(final Double weight) {
        if(weight == null || weight < 0.0){
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Item weight can not be null or a negative value.");
        }
        this.weight = weight;
    }

    /**
     * Adds one more item to a stackable item.
     *
     * @return true if an item is added to the stack.
     */
    public boolean addStackable() {
        this.numberInStack++;
        return true;
    }

    /**
     * Adds zero or more items to a stackable item. The baseValue added cannot be
     * less than zero.
     *
     * @param numberToStack the number of items added to the stackable item.
     * @return true if the items are added to the stack.
     */
    public boolean addStackable(final int numberToStack) {
        if (numberToStack > 0) {
            this.numberInStack += numberToStack;
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
        if (this.numberInStack > 0) {
            this.numberInStack--;
            return true;
        }
        return false;
    }
    /////////////////////////////////////////////////////////////////////////////////////

    /**
     * Compares one item to another. This overrides the Object method.
     *
     * @param item the item to be compared.
     * @return true if they are the same type of item.
     */
    @Override
    public int compareTo(final Item item) {
        if(item != null) {
            return this.name.compareToIgnoreCase(item.getName());
        }
        return 0;
    }

    @Override
    public boolean equals(final Object o) {
        if(o == null){ return false; }
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
//        return Objects.equals(getName(), item.getName());
        return this.getName().equalsIgnoreCase(item.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    /**
     * Removes more than zero items from a stackable item.
     *
     * @param numberFromStack the number of items to be removed from the stack
     * @return true if the items where removed from the stackable item.
     */
    public boolean removeStackable(final int numberFromStack) {
        if (numberFromStack > 0 && numberFromStack <= this.numberInStack) {
            this.numberInStack -= numberFromStack;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        return sb.toString();
    }

}
