/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants.item;

/**
 * This represent the quality of an item at production/creation time.
 * @author deb
 */
public enum QualityType {

    /**
     * Very Poor creation quality.
     */
    VERY_POOR(1, "Very Poor", 0.25),
    /**
     * Poor creation quality.
     */
    POOR(2, "Poor", 0.5),
    /**
     * Fair creation quality.
     */
    FAIR(3, "Fair", 0.75),
    /**
     * Good creation quality.
     */
    GOOD(4, "Good", 1.0),
    /**
     * Very Good creation quality.
     */
    VERY_GOOD(5, "Very Good", 2.0),
    /**
     * Excellent creation quality.
     */
    EXCELLENT(6, "Excellent", 3.0),
    /**
     * Superior creation quality.
     */
    SUPERIOR(7, "Superior", 4.0),
    /**
     * Perfect creation quality.
     */
    PERFECT(8, "Perfect", 5.0);

    /**
     * Id of an individual quality type.
     */
    private int id;
    /**
     * Name of the Quality type. 
     */
    private String name;
    /**
     * Value adjustment of a quality type. It is used to adjust the total 
     * value of an item.
     */
    private double valueAdjust;    // multiply item value by this for new value.

    /**
     * Three-argument constructor.
     * @param id the id of the quality type enum.
     * @param name the name of the quality type.
     * @param valueAdjust the value adjustment of an item.
     */
    private QualityType(int id, String name, double valueAdjust) {
        this.id = id;
        this.name = name;
        this.valueAdjust = valueAdjust;
    }

    /**
     * Returns the id of the quality type.
     * @return the id of the quality type.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the quality type.
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the value adjustment of the quality type.
     * @return 
     */
    public double getValueAdjust() {
        return valueAdjust;
    }

    /**
     * Determines if a text string represents any of the QualityType enum
     * categories.
     *
     * @param quality the text string to be compared.
     * @return the QualityType if text is quality type else null.
     */
    public static QualityType fromString(String quality) {
        if (quality != null) {
            for (QualityType qualityType : QualityType.values()) {
                if (quality.equalsIgnoreCase(qualityType.name)) {
                    return qualityType;
                }
            }
        }
        return null;
    }

    /**
     * Determines if a number represents any of the QualityType categories.
     *
     * @param number the number to be compared.
     * @return the QualityType if number is quality type else null.
     */
    public static QualityType fromNumber(int number) {
        if (number >= 0) {
            for (QualityType qualityType : QualityType.values()) {
                if (number == qualityType.getId()) {
                    return qualityType;
                }
            }
        }
        return null;
    }
}
