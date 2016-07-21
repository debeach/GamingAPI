package net.danbeach.gaming.constants.toon;

/**
 * Created with IntelliJ IDEA. User: deb Date: 9/28/13 Time: 12:44 PM To change
 * this template use File | Settings | File Templates.
 */
public enum AlignmentEnum {

    LAWFUL_GOOD(0, "Lawful Good"),
    LAWFUL_NEUTRAL(1, "Lawful Neutral"),
    LAWFUL_EVIL(2, "Lawful Evil"),
    NEUTRAL_GOOD(3, "Neutral Good"),
    TRUE_NEUTRAL(4, "True Neutral"),
    NEUTRAL_EVIL(5, "Neutral Evil"),
    CHAOTIC_GOOD(6, "Chaotic Good"),
    CHAOTIC_NEUTRAL(7, "Chaotic Neutral"),
    CHAOTIC_EVIL(8, "Chaotic Evil");

    private String name;
    private int value;

    private AlignmentEnum(int value, String name) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public static AlignmentEnum fromName(String alignmentName) {
        if (alignmentName != null) {
            for (AlignmentEnum alignment : AlignmentEnum.values()) {
                if (alignment.name.equalsIgnoreCase(alignmentName)) {
                    return alignment;
                }
            }
        }
        return null;
    }

    public static AlignmentEnum fromValue(int alignmentValue) {
        if (alignmentValue >= 0) {
            for (AlignmentEnum alignment : AlignmentEnum.values()) {
                if (alignment.value == alignmentValue) {
                    return alignment;
                }
            }
        }
        return null;
    }

}
