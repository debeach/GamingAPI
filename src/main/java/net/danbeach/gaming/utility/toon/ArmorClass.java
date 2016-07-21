package net.danbeach.gaming.utility.toon;

/**
 * Created with IntelliJ IDEA.
 * User: deb
 * Date: 9/20/13
 * Time: 1:15 PM
 * Maintains the armor class for a given object. For a character in a role
 * playing game, this holds the armor class for the character. For an item in
 * a role playing game, it provides an armor class for the item.
 * ArmorClass variables are:<br></br>
 * <ul>
 *     <li>armor: the armor worn by a character</li>
 *     <li>base: the base for an object. For the character, this will be zero
 *     most of the time. This may go up for any enhancement such as wish, or
 *     favor from deity. For an item, base will be the armor class. </li>
 *     <li>helm: the helm worn by the character.</li>
 *     <li>shield: the shield used by the character.</li>
 * </ul>
 *
 * The ArmorClass will calculate the armor class when there is no armor worn,
 * for armor only, and for armor with shield.
 */
public class ArmorClass {

    private int armor;
    private int base;
    private int helm;
    private int shield;
//-----------------------------------------------------------------------------

    /**
     * Returns the armor value.
     * @return the armor value
     */
    public int getArmor() {
        return armor;
    }

    /**
     * Returns the base value
     * @return the base value
     */
    public int getBase() {
        return base;
    }

    /**
     * Returns the helm value.
     * @return the helm value.
     */
    public int getHelm() {
        return helm;
    }

    /**
     * Returns the shield value.
     * @return the shield value.
     */
    public int getShield() {
        return shield;
    }

    /**
     * Sets the armor value. This value cannot be a negative value.
     * @param armor The armor value
     */
    public void setArmor(int armor) {
        if(armor >= 0){
            this.armor = armor;
        }
        else{
            this.armor = 0;
        }
    }

    /**
     * Sets the base value. This value cannot be a negative value.
     * @param base the base value
     */
    private void setBase(int base) {
       if(base >= 0){
        this.base = base;
       }
       else{
           this.base = 0;
       }
    }

    /**
     * Sets the helm value. This value cannot be a negative value.
     * @param helm the helm value.
     */
    public void setHelm(int helm) {
        this.helm = helm;
    }

    /**
     * Sets the shield value. This value cannot be a negative value.
     * @param shield
     */
    public void setShield(int shield) {
        this.shield = shield;
    }
//-----------------------------------------------------------------------------

    public ArmorClass(){
        armor = 0;
        base = 0;
        helm = 0;
        shield = 0;
    }

    public ArmorClass(int base) {
        setBase(base);
    }

    public ArmorClass(int armor, int base, int helm, int shield) {
        setArmor(armor);
        setBase(base);
        setHelm(helm);
        setShield(shield);
    }

    public ArmorClass(ArmorClass armorClass){
        setArmor(armorClass.getArmor());
        setBase(armorClass.getBase());
        setHelm(armorClass.getHelm());
        setShield(armorClass.getShield());
    }
//-----------------------------------------------------------------------------

    /**
     * Calculates the base armor class for the character.
     * @return the base armor class.
     */
    public int calculateNoArmor(){
        return base;
    }


    /**
     * Calculates the armor being worn by the character. This includes
     * armor and helm.
     * @return The character's armor class
     */
    public int calculateArmor(){
        return base + armor + helm;
    }


    /**
     * Calculates the armor and shield being worn. This includes armor, helm,
     * and shield.
     * @return The character's armor class and shield
     */
    public int calculateArmorAndShield(){
        return base + this.calculateArmor() + shield;
    }
}
