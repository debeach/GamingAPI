package net.danbeach.gaming.constants.toon;

/**
 * Created by deb on 1/26/14.
 */
public enum NonWeaponProficiencyEnum {
    AGRICULTURE("Agriculture", 1, "Intelligence", 0),
    AIRBORNE_RIDING("Airborne Riding", 2, "Wisdom", -2),
    ANCIENT_HISTORY("Ancient History", 1, "Intelligence", -1),
    ANCIENT_LANGUAGE("Ancient Language", 1, "Intelligence", 0),
    ANIMAL_HANDLING("Animal Handling", 1, "Wisdom", -1),
    ANIMAL_LORE("Animal Lore", 1, "Intelligence", 0),
    ANIMAL_TRAINING("Animal Training", 1, "Wisdom", 0),
    ARMORER("Armorer", 2, "Intelligence", -2),
    ARTISTIC_ABILITY("Artistic Ability", 1, "Wisdom", 0),
    ASTROLOGY("Astrology", 2, "Intelligence", 0),
    BLACKSMITHING("Blacksmithing", 1, "Strength", 0),
    BLIND_FIGHTING("Blind Fighting", 2, "NA", 0),
    BOWER_FLETCHER("Bower-Fletcher", 1, "Dexterity", -1),
    BREWING("Brewing", 1, "Intelligence", 0),
    CARPENTRY("Carpentry", 1, "Strength", 0),
    CHARIOTEERING("Charioteering", 1, "Dexterity", 2),
    COBBLING("Cobbling", 1, "Dexterity", 0),
    COOKING("Cooking", 1, "Intelligence", 0),
    DANCING("Dancing", 1, "Dexterity", 0),
    DIRECTION_SENSE("Direction Sense", 1, "Wisdom", 1),
    DISGUISE("Disguise", 1, "Charisma", -1),
    ENDURANCE("Endurance", 2, "Constitution", 0),
    ENGINEERING("Engineering", 2, "Intelligence", -3),
    ETIQUETTE("Ettiquette", 1, "Charisma", 0),
    FIRE_BUILDING("Fire-Building", 1, "Wisdom", -1),
    FISHING("Fishing", 1, "Wisdom", -1),
    FORGERY("Forgery", 1, "Dexterity", -1),
    GAMING("Gaming", 1, "Charisma", 0),
    GEM_CUTTING("Gem Cutting", 2, "Dexterity", -2),
    HEALING("Healing", 2, "Wisdom", -2),
    HERBALISM("Herbalism", 2, "Intelligence", -2),
    HERALDRY("Heraldry", 1, "Intelligence", 0),
    HUNTING("Hunting", 1, "Wisdom", -1),
    JUGGLING("Juggling", 1, "Dexterity", -1),
    LANDBASED_RIDING("Land-based Riding", 1, "Wisdom", 3),
    LEATHERWORKING("Leatherworking", 1, "Intelligence", 0),
    LOCAL_HISTORY("Local History", 1, "Charisma", 0),
    MINING("Mining", 2, "Wisdom", -3),
    MODERN_LANGUAGE("Modern Language", 1, "Intelligence", 0),
    MOUNTAINEERING("Mountaineering", 1, "NA", 0),
    MUSICAL_INSTRUMENT("Musical Instrument", 1, "Dexterity", -1),
    NAVIGATION("Navigation", 1, "Intelligence", -2),
    POTTERY("Pottery", 1, "Dexterity", -2),
    READ_WRITE("Read/Write", 1, "Intelligence", 1),
    READING_LIPS("Reading Lips", 2, "Intelligence", -2),
    RELIGION("Religion", 1, "Wisdom", 0),
    ROPE_USE("Rope Use", 1, "Dexterity", 0),
    RUNNING("Running", 1, "Constitution", -6),
    SEAMANSHIP("Seamanship", 1, "Dexterity", 1),
    SEAMSTRESS("Seamstress", 1, "Dexterity", -1),
    SET_SNARE("Set Snare", 1, "Dexterity", -1),
    SINGING("Singing", 1, "Charisma", 0),
    SPELLCRAFT("Spellcraft", 1, "Intelligence", -2),
    STONEMASONRY("Stonemasonry", 1, "Strength", -2),
    SURVIVAL("Survival", 2, "Intelligence", 0),
    SWIMMING("Swimming", 1, "Strength", 0),
    TIGHTROPE_WALK("Tightrope Walk", 1, "Dexterity", 0),
    TRACKING("Tracking", 2, "Wisdom", 0),
    TUMBLING("Tumbling", 1, "Dexterity", 0),
    VENTRILOQUISM("Ventriloquism", 1, "Intelligence", -2),
    WEAPONSMITHING("Weaponsmithing", 3, "Intelligence", -3),
    WEATHER_SENSE("Weather Sense", 1, "Wisdom", -1),
    WEAVING("Weaving", 1, "Intelligence", -1);


    private String proficiency; // name of proficiency
    private String statCheck;   // what stat to check at
    private int slots;          // number of slot points to learn
    private int statAdjustment; // what adjustment to check at


    private NonWeaponProficiencyEnum(String proficiency, int slots,
                                 String statCheck, int statAdjustment){
        this.proficiency = proficiency;
        this.slots = slots;
        this.statCheck = statCheck;
        this.statAdjustment = statAdjustment;
    }

    public String getProficiency() {
        return proficiency;
    }

    public int getSlots() { return slots; }

    public String getStatCheck() {
        return statCheck;
    }

    public int getStatAdjustment() {
        return statAdjustment;
    }

    @Override
    public String toString(){
        return proficiency + " " + statCheck + " " + statAdjustment;
    }
}
