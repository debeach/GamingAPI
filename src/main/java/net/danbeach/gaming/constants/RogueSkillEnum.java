/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.constants;

import net.danbeach.gaming.constants.item.ItemCategoryEnum;

/**
 *
 * @author deb
 */
public enum RogueSkillEnum {

    NONE(0, "None"),
    PICK_POCKETS(1, "Pick Pockets"),
    OPEN_LOCKS(2, "Open Locks"),
    FIND_TRAPS(3, "Find Traps"),
    REMOVE_TRAPS(4, "Remove Traps"),
    FIND_SECRET_DOORS(5, "Find Secret Doors"),
    MOVE_SILENTLY(6, "Move Silently"),
    HIDE_IN_SHADOWS(7, "Hide in Shadows"),
    HEAR_NOISE(8, "Hear Noise"),
    CLIMB_WALLS(9, "Climb Walls"),
    APPRAISAL(10, "Appraisals"),
    ALL(11, "All")
    ;

    private int value;
    private String name;
    private int initialAppraisal = 0;
    private int initialClimbWalls = 0;
    private int initialFindSecretDoors = 0;
    private int initialFindTraps = 0;
    private int initialHearNoise = 0;
    private int initialHideInShadows = 0;
    private int initialMoveSilently = 0;
    private int initialOpenLock = 0;
    private int initialPickPocket = 0;
    private int initialRemoveTraps = 0;

    private RogueSkillEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public int getInitialPickPocket() {
        return initialPickPocket;
    }

    public int getInitialOpenLock() {
        return initialOpenLock;
    }

    public int getInitialFindTraps() {
        return initialFindTraps;
    }

    public int getInitialRemoveTraps() {
        return initialRemoveTraps;
    }

    public int getInitialFindSecretDoors() {
        return initialFindSecretDoors;
    }

    public int getInitialMoveSilently() {
        return initialMoveSilently;
    }

    public int getInitialHideInShadows() {
        return initialHideInShadows;
    }

    public int getInitialHearNoise() {
        return initialHearNoise;
    }

    public int getInitialClimbWalls() {
        return initialClimbWalls;
    }

    public int getInitialAppraisal() {
        return initialAppraisal;
    }

    public static RogueSkillEnum fromNumber(int number) {
        if (number >= 0) {
            for (RogueSkillEnum num : RogueSkillEnum.values()) {
                if (number == num.ordinal()) {
                    return num;
                }
            }
        }
        return null;
    }
}
