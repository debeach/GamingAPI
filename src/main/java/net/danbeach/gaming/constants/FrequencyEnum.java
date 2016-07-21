/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants;

/**
 *
 * @author deb
 */
public enum FrequencyEnum {

    NONE("None", 0, 0),
    COMMON("Common", 1, 39),
    UNCOMMON("Uncommon", 2, 30),
    RARE("Rare", 3, 20),
    VERY_RARE("Very Rare", 4, 10),
    UNIQUE("Unique", 5, 1);

    private int value;
    private String name;
    private int percent;

    private FrequencyEnum(String name, int value, int percent) {
        this.value = value;
        this.name = name;
        this.percent = percent;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public int getPercent() {
        return percent;
    }

  

    /**
     * Determines if a text string represents any of the FrequencyEnum
     * categories.
     *
     * @param freq the text string to be compared.
     * @return the FrequenyEnum if text is a frequency else null.
     */
    public static FrequencyEnum fromString(String freq) {
        if (freq != null) {
            for (FrequencyEnum frequency : FrequencyEnum.values()) {
                if (freq.equalsIgnoreCase(frequency.name)) {
                    return frequency;
                }
            }
        }
        return null;
    }

    /**
     * Determines if a number represents any of the FrequencyEnum categories.
     *
     * @param number the number to be compared.
     * @return the FrequencyEnum if number is a frequency else null.
     */
    public static FrequencyEnum fromNumber(int number) {
        if (number >= 0) {
            for (FrequencyEnum frequencies : FrequencyEnum.values()) {
                if (number == frequencies.value) {
                    return frequencies;
                }
            }
        }
        return null;
    }

    /**
     * Determines the FrequencyEnum by the percentage roll provided. percentage
     * cannot be less than 1 and not greater than 100.
     *
     * @param percentage a inclusive number between 1 and 100
     * @return The type of Frequency otherwise null.
     */
    public static FrequencyEnum fromPercent(int percentage) {

        if (percentage >= 1 && percentage <= 100) {
            int currentPercentage = 0;
            for (FrequencyEnum frequency : FrequencyEnum.values()) {
                currentPercentage += frequency.percent;
                if (percentage <= currentPercentage) {
                    return frequency;
                }
            }
        }
        return null;
    }
}
