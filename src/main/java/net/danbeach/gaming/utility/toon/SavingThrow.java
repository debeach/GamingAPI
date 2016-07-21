package net.danbeach.gaming.utility.toon;

/**
* The SavingThrow class provides a defense against various non-melee type
        * attacks. It covers a range of attacks from magical spells to breath
        * weapon attacks to attacks with poison.<br>
* The areas covered are:<br>
* <ui>
* 	<li>breath weapon - natural breath weapon used by creatures like dragons.</li>
        * 	<li>death magic - natural attacks that cause instant death like banshee.</li>
        * 	<li>paralyze - natural attacks that cause paralyzation.</li>
        * 	<li>petrify - natural attacks that cause petrification like basilisk. </li>
        * 	<li>poison - attacks using any kind of poison.</li>
        * 	<li>polymorph - natural attacks that cause polymorphism.</li>
        * 	<li>rod - attacks from magical rods.</li>
        * 	<li>spell - attacks from magical spells.</li>
        * 	<li>staff - attacks from magical staffs.</li>
        * 	<li>wand - attacks from magical wands.</li>
        * </ui>
* @author deb
* @version 2.0
* @since July 2013
*/

public class SavingThrow {

    public static final int NUMBER_OF_SAVES         = 10;
    public static final int NUMBER_OF_SAVE_ITEMS    = 5;

    public static final int BREATH      = 0;
    public static final int DEATH_MAGIC = 1;
    public static final int PARALYZE    = 2;
    public static final int PETRIFY     = 3;
    public static final int POISON      = 4;
    public static final int POLYMORPH   = 5;
    public static final int ROD         = 6;
    public static final int SPELL       = 7;
    public static final int STAFF       = 8;
    public static final int WAND        = 9;

    public static final int ALL         = 30;
    public static final int NONE        = 31;

    public static final int SAVE_BASE   = 0;
    public static final int SAVE_WISDOM = 1;
    public static final int SAVE_CLOAK  = 2;
    public static final int SAVE_RING   = 3;
    public static final int SAVE_STAFF  = 4;

    private int breath;
    private int deathMagic;
    private int paralyze;
    private int petrify;
    private int poison;
    private int polymorph;
    private int rod;
    private int spell;
    private int staff;
    private int wand;

    private int saveWisdom;			// hold adjustment number for a PC wisdom
//-----------------------------------------------------------------------------


    /**
     * Returns the save against breath weapons.
     * @return the save against breath weapons.
     */
    public int getBreath() {
        return breath;
    }


    /**
     * Returns the save against death magic attacks.
     * @return the save against death magic attacks.
     */
    public int getDeathMagic() {
        return deathMagic;
    }


    /**
     * Returns the save against paralyzation attacks.
     * @return the save against paralyzation.
     */
    public int getParalyze() {
        return paralyze;
    }


    /**
     * Returns the save against petrification attacks.
     * @return the save against petrification.
     */
    public int getPetrify() {
        return petrify;
    }


    /**
     * Returns the save against poison attacks.
     * @return the save against poison.
     */
    public int getPoison() {
        return poison;
    }


    /**
     * Returns the save against polymorphing attacks.
     * @return the save against polymorphing.
     */
    public int getPolymorph() {
        return polymorph;
    }


    /**
     * Returns the save against magical rod attacks.
     * @return the save against magical rods.
     */
    public int getRod() {
        return rod;
    }


    /**
     * Returns the save adjustment for the character's wisdom.
     * @return the save adjustment for the character's wisdom.
     */
    public int getSaveWisdom() {
        return saveWisdom;
    }


    /**
     * Returns the save against magical spell attacks.
     * @return the save against magical spells.
     */
    public int getSpell() {
        return spell;
    }


    /**
     * Returns the save against magical staff attacks.
     * @return the save against magical staffs.
     */
    public int getStaff() {
        return staff;
    }


    /**
     * Returns the save against magical wand attacks.
     * @return the save against magical wands.
     */
    public int getWand() {
        return wand;
    }


    /**
     * Sets the save against breath weapons. This cannot be less than one.
     * @param breath the save against breath weapons.
     */
    private void setBreath(int breath) {
        try {
            if(breath > 0){
                this.breath = breath;
            }else{
                this.breath = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Sets the save against death magic attack. This cannot be less than one.
     * @param deathMagic the save against death magic attacks.
     */
    private void setDeathMagic(int deathMagic) {
        try {
            if(deathMagic > 0){
                this.deathMagic = deathMagic;
            }else{
                this.deathMagic = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Sets the save against paralyzation attacks. This cannot be less than
     * one.
     * @param paralyze the save against paralyzation.
     */
    private void setParalyze(int paralyze) {
        try {
            if(paralyze > 0){
                this.paralyze = paralyze;
            }else{
                this.paralyze = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Sets the save against petrification attacks. This cannot be less than
     * one.
     * @param petrify the save against petrification.
     */
    private void setPetrify(int petrify) {
        if(petrify > 0){
            this.petrify = petrify;
        }else{
            this.petrify = 1;
        }
    }


    /**
     * Sets the save against poison attacks. This cannot be less than one.
     * @param poison the save against poison.
     */
    private void setPoison(int poison) {
        if(poison > 0){
            this.poison = poison;
        }else{
            this.poison = 1;
        }
    }


    /**
     * Sets the save against polymorphing attacks. This cannot be less than
     * one.
     * @param polymorph the save against polymorph.
     */
    private void setPolymorph(int polymorph) {
        if(polymorph > 0){
            this.polymorph = polymorph;
        }else{
            this.polymorph = 1;
        }
    }


    /**
     * Sets the save against magical rod attacks. This cannot be less than
     * one.
     * @param rod the save against magical rods.
     */
    private void setRod(int rod) {
        if(rod > 0){
            this.rod = rod;
        }else{
            this.rod = 1;
        }
    }


    /**
     * Sets the save against magical spell attacks. This cannot be less than
     * one.
     * @param spell the save against magical spell.
     */
    private void setSpell(int spell) {
        if(spell > 0){
            this.spell = spell;
        }else{
            this.spell = 1;
        }
    }


    /**
     * Sets the save against magical staff attacks. This can be less than one.
     * @param staff the save against magical staff.
     */
    private void setStaff(int staff) {
        if(staff > 0){
            this.staff = staff;
        } else{
            this.staff = 1;
        }
    }


    /**
     * Sets the save against magical wand attacks. This can be less than zero.
     * @param wand the save against magical wand.
     */
    private void setWand(int wand) {
        if(wand > 0){
            this.wand = wand;
        }else{
            this.wand = 1;
        }
    }


    /**
     * Sets the save adjustment for the character's wisdom. This cannot be
     * less than zero.
     * @param saveWisdom the save adjustment for the character's wisdom.
     */
    public void setSaveWisdom(int saveWisdom) {
        if(saveWisdom >= 0){
            this.saveWisdom = saveWisdom;
        }else{
            this.saveWisdom = 0;
        }
    }
//-----------------------------------------------------------------------------
//*****************************************************************************
//		CONSTRUCTORS
//*****************************************************************************


    /**
     * Default constructor
     */
    public SavingThrow(){
        breath = deathMagic = paralyze = petrify = 1;
        poison = polymorph = rod = spell = staff = wand = 1;
        saveWisdom = 0;
    }

    public SavingThrow(SavingThrow save){
        this.breath = save.getBreath();
        this.deathMagic = save.getDeathMagic();
        this.paralyze = save.getParalyze();
        this.petrify = save.getPetrify();
        this.poison = save.getPoison();
        this.polymorph = save.getPolymorph();
        this.rod = save.getRod();
        this.spell = save.getSpell();
        this.staff = save.getStaff();
        this.wand = save.getWand();
        this.saveWisdom = save.getSaveWisdom();
    }


    public SavingThrow(int breath, int deathMagic, int paralyze, int petrify,
                       int poison, int polymorph, int rod, int spell, int staff,
                       int wand) {
        this.breath = breath;
        this.deathMagic = deathMagic;
        this.paralyze = paralyze;
        this.petrify = petrify;
        this.poison = poison;
        this.polymorph = polymorph;
        this.rod = rod;
        this.spell = spell;
        this.staff = staff;
        this.wand = wand;
    }
//-----------------------------------------------------------------------------
//*****************************************************************************
//		METHODS
//*****************************************************************************


    /**
     * Calculates the base save against breath weapon.
     * @return the base save against breath weapon.
     */
    public int calculateBreathWeapon(){
        int total = 0;
        try {
            total = breath + saveWisdom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    /**
     * Calculates the base save against death magic.
     * @return the base save against death magic.
     */
    public int calculateDeathMagic(){
        int total = 0;
        try {
            total = deathMagic + saveWisdom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    /**
     * Calculates the base save against paralyzation.
     * @return the base save against paralyzation.
     */
    public int calculateParalyze(){
        int total = 0;
        try {
            total = paralyze + saveWisdom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    /**
     * Calculates the base save against petrification.
     * @return the base save against petrification.
     */
    public int calculatePetrify(){
        int total = 0;
        try {
            total = petrify + saveWisdom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    /**
     * Calculates the base save against poison.
     * @return the base save against poison.
     */
    public int calculatePoison(){
        int total = 0;
        try {
            total = poison + saveWisdom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    /**
     * Calculates the base save against polymorphism.
     * @return the base save against polymorphism.
     */
    public int calculatePolymorph(){
        int total = 0;
        try {
            total = polymorph + saveWisdom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    /**
     * Calculates the base save against magical rods.
     * @return the base save against magical rods.
     */
    public int calculateRod(){
        int total = 0;
        try {
            total = rod + saveWisdom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    /**
     * Calculates the base save against magical spell attack.
     * @return the base save against magical spell attack.
     */
    public int calculateSpell(){
        int total = 0;
        try {
            total = spell + saveWisdom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    /**
     * Calculates the base save for magical staffs.
     * @return the base save for magical staffs.
     */
    public int calculateStaff(){
        int total = 0;
        try {
            total = staff + saveWisdom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    /**
     * Calculates the base save against magical wands.
     * @return the base save against magical wands.
     */
    public int calculateWand(){
        int total = 0;
        try {
            total = wand + saveWisdom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    /**
     * Initializes all saving throws to provided values.
     * @param saves the array of saving throws to initialize
     */
    public void initializeSavingThrows(int[] saves){
        try {
            this.setBreath(saves[SavingThrow.BREATH]);
            this.setDeathMagic(saves[SavingThrow.DEATH_MAGIC]);
            this.setParalyze(saves[SavingThrow.PARALYZE]);
            this.setPetrify(saves[SavingThrow.PETRIFY]);
            this.setPoison(saves[SavingThrow.POISON]);
            this.setPolymorph(saves[SavingThrow.POLYMORPH]);
            this.setRod(saves[SavingThrow.ROD]);
            this.setSpell(saves[SavingThrow.SPELL]);
            this.setStaff(saves[SavingThrow.STAFF]);
            this.setWand(saves[SavingThrow.WAND]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates each save when a character levels. The values in the arguments
     * provided are the amount to increase each saving throw.
     * @param breath the amount of increase for breath weapon attack.
     * @param deathMagic the amount of increase for death magic attack.
     * @param paralyze the amount of increase for paralyzation attack.
     * @param petrify the amount of increase for pertification attack.
     * @param poison the amount of increase for poison attack.
     * @param polymorph the amount of increase for polymorph attack.
     * @param rod the amount of increase for magical rod attack.
     * @param spell the amount of increase for magical spell attack.
     * @param staff the amount of increase for magical staff attack.
     * @param wand the amount of increase for magical wand attack.
     */
    public void levelUpSavingThrow(int breath, int deathMagic,
                                   int paralyze, int petrify, int poison, int polymorph,
                                   int rod, int spell, int staff, int wand){
        try {
            this.setBreath(this.breath + breath);
            this.setDeathMagic(this.deathMagic + deathMagic);
            this.setParalyze(this.paralyze + paralyze);
            this.setPetrify(this.petrify + petrify);
            this.setPoison(this.poison + poison);
            this.setPolymorph(this.polymorph + polymorph);
            this.setRod(this.rod + rod);
            this.setSpell(this.spell + spell);
            this.setStaff(this.staff + staff);
            this.setWand(this.wand + wand);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates the save against breath weapons.
     * @param breath the amount to adjust the save against breath.
     */
    public void updateBreath(int breath){
        try {
            this.setBreath(this.breath + breath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates the save against death magic.
     * @param deathMagic the amount to adjust death magic.
     */
    public void updateDeathMagic(int deathMagic){
        try {
            this.setDeathMagic(this.deathMagic + deathMagic);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates the save against paralyzation
     * @param paralyze the amount to adjust paralyzation.
     */
    public void updateParalyze(int paralyze){
        try {
            this.setParalyze(this.paralyze + paralyze);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates the save against petrification.
     * @param petrify the value to adjust petrify.
     */
    public void updatePetrify(int petrify){
        try {
            this.setPetrify(this.petrify + petrify);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates the save against posion.
     * @param poison the amount to adjust poison.
     */
    public void updatePoison(int poison){
        try {
            this.setPoison(this.poison + paralyze);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates the save against polymorphism.
     * @param polymorph the value to adjust polymorph.
     */
    public void updatePolymorph(int polymorph){
        try {
            this.setPolymorph(this.polymorph + polymorph);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates the save against magical rod attacks.
     * @param rod the value to update rod.
     */
    public void updateRod(int rod){
        try {
            this.setRod(this.rod + rod);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates the save against magical spells.
     * @param spell the value to update rod.
     */
    public void updateSpell(int spell){
        try {
            this.setSpell(this.spell + spell);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates the save against magical staffs.
     * @param staff the value to update staff.
     */
    public void updateStaff(int staff){
        try {
            this.setStaff(this.staff + staff);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Updates the save against magical wands.
     * @param wand the value to update wand.
     */
    public void updateWand(int wand){
        try {
            this.setWand(this.wand + wand);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//-----------------------------------------------------------------------------


    public static void main(String[] args){
        SavingThrow test = new SavingThrow();

        System.out.println(test.toString());
    }
}
