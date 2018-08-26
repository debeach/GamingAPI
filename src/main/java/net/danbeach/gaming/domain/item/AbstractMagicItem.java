package net.danbeach.gaming.domain.item;

import net.danbeach.gaming.constants.toon.CharacterClassEnum;
import net.danbeach.gaming.exception.GamingErrorCodeEnum;
import net.danbeach.gaming.exception.GamingException;

import javax.persistence.Column;

public abstract class AbstractMagicItem extends Item {

    // used in calculating the overall value of a magical item. This cannot be a negative value.
    @Column(name = "adjust_value")
    private Double adjustValue;

    // does this magic item affect armor class rating
    @Column(name = "armor_class")
    private Boolean armorClass;

    // if this magic item affects armor class, what is the value.
    @Column(name = "armor_class_bonus")
    private Integer armorClassBonus;

    // is this magic item cursed.
    @Column(name = "cursed")
    private Boolean cursed;

    // does this magic item affect saving throws.
    @Column(name = "saving_throw")
    private Boolean savingThrow;

    // the id of the saving throw that this magic item affects. This cannot be less than 1.
    @Column(name = "saving_throw_id")
    private Long savingThrowId;

    // if this magic item affects saving throws, what is the value
    @Column(name = "saving_throw_value")
    private Integer savingThrowValue;

    @Column(name = "character_class")
    private CharacterClassEnum usableCharacterClass;
    /////////////////////////////////////////////////////////////////////////////////////

    public AbstractMagicItem(){
        this.adjustValue = 0.0;
        this.armorClass = Boolean.FALSE;
        this.armorClassBonus = 0;
        this.cursed = Boolean.FALSE;
        this.savingThrow = Boolean.FALSE;
        this.savingThrowValue = 0;
        this.usableCharacterClass = CharacterClassEnum.NONE;

    }

    public AbstractMagicItem(AbstractMagicItem abstractMagicItem){
        super(abstractMagicItem);
        this.setAdjustValue(abstractMagicItem.getAdjustValue());
        this.setArmorClass(abstractMagicItem.isArmorClass());
        this.setArmorClassBonus(abstractMagicItem.getArmorClassBonus());
        this.setCursed(abstractMagicItem.isCursed());
        this.setSavingThrow(abstractMagicItem.isSavingThrow());
        this.setSavingThrowId(abstractMagicItem.getSavingThrowId());
        this.setSavingThrowValue(abstractMagicItem.getSavingThrowValue());
    }

    /////////////////////////////////////////////////////////////////////////////////////

    public Double getAdjustValue() {
        return this.adjustValue;
    }

    public void setAdjustValue(Double adjustValue) {
        if(adjustValue < 0.0){
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Item adjust value cannot be a negative value.");
        }
        this.adjustValue = adjustValue;
    }

    public Boolean isArmorClass() {
        return this.armorClass;
    }

    public void setArmorClass(Boolean armorClass) {
        this.armorClass = armorClass;
    }

    public Integer getArmorClassBonus() {
        return this.armorClassBonus;
    }

    public void setArmorClassBonus(Integer armorClassBonus) {
        this.armorClassBonus = armorClassBonus;
    }

    public Boolean isCursed() {
        return this.cursed;
    }

    public void setCursed(Boolean cursed) {
        this.cursed = cursed;
    }

    public Boolean isSavingThrow() {
        return this.savingThrow;
    }

    public void setSavingThrow(Boolean savingThrow) {
        this.savingThrow = savingThrow;
    }

    public Long getSavingThrowId() {
        return this.savingThrowId;
    }

    public void setSavingThrowId(Long savingThrowId) {
        if(this.savingThrowValue < 1L){
            throw new GamingException(GamingErrorCodeEnum.INVALID_ARGUMENT, "Saving Throw database id cannot be less than 1.");
        }
        this.savingThrowId = savingThrowId;
    }

    public Integer getSavingThrowValue() {
        return this.savingThrowValue;
    }

    public void setSavingThrowValue(Integer savingThrowValue) {
        this.savingThrowValue = savingThrowValue;
    }

    public CharacterClassEnum getUsableCharacterClass() {
        return this.usableCharacterClass;
    }

    public void setUsableCharacterClass(CharacterClassEnum usableCharacterClass) {
        this.usableCharacterClass = usableCharacterClass;
    }
}
