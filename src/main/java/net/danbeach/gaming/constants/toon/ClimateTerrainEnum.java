/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.danbeach.gaming.constants.toon;

/**
 *
 * @author deb
 */
public enum ClimateTerrainEnum {
    
    ARID_DESERT("Arid Desert", 0),
    ARID_FOREST("Arid Forest", 1),
    ARID_FREAH_WATER("Arid Fresh Water", 2),
    ARID_HILL("Arid Hill", 3),
    ARID_LAKE("Arid Lake", 4),
    ARID_LAKE_SHORE("Arid Lake Shore", 5),
    ARID_MOUNTAIN("Arid Mountain", 6),
    ARID_MOUNTAIN_LAKE("Arid Mountain Lake", 7),
    ARID_OCEAN("Arid Ocean", 8),
    ARID_PLAINS("Arid Plains", 9),
    ARID_SALT_WATER("Arid Salt Water", 10),
    ARID_SEA_COAST("Arid Sea Coast", 11),
    ARID_SUBTERANEAN("Arid Subteranean", 12),
    ARID_VOLCANO("Arid Volcano", 13),
    ARTIC_DESERT("Artic Desert", 14),
    ARTIC_FOREST("Artic Forest", 15),
    ARTIC_FRESH_WATER("Artic Fresh Water", 16),
    ARTIC_HILL("Artic Hill", 17),
    ARTIC_LAKE("Artic Lake", 18),
    ARTIC_LAKE_SHORE("Artic Lake Shore", 19),
    ARTIC_MOUNTAIN("Artic Mountain", 20),
    ARTIC_MOUNTAIN_LAKE("Artic Mountain Lake", 21),
    ARTIC_OCEAN("Artic Ocean", 22),
    ARTIC_PLAIN("Artic Plain", 23),
    ARTIC_SALT_WATER("Artic Salt Water", 24),
    ARTIC_SEA_COAST("Artic Sea Coast", 25),
    ARTIC_SUBTERRANEAN("Artic Subterranean", 26),
    ARTIC_VOLCANO("Artic Volcano", 27),
    SUB_ARTIC_DESERT("Sub-Artic Desert", 28),
    SUB_ARTIC_FOREST("Sub-Artic Forest", 29),
    SUB_ARTIC_FRESH_WATER("Sub-Artic Fresh Water", 30),
    SUB_ARTIC_HILL("Sub-Artic Hills", 31),
    SUB_ARTIC_LAKE("Sub-Artic Lake", 32),
    SUB_ARTIC_LAKE_SHORE("Sub-Artic Lake Shore", 33),
    SUB_ARTIC_MOUNTAIN("Sub-Artic Mountain", 34),
    SUB_ARTIC_MOUNTAIN_LAKE("Sub-Artic Mountain Lake", 35),
    SUB_ARTIC_OCEAN("Sub-Artic Ocean", 36),
    SUB_ARTIC_PLAINS("Sub-Artic Plains", 37),
    SUB_ARTIC_SALT_WATER("Sub-Artic Salt Water", 38),
    SUB_ARTIC_SEA_COAST("Sub-Artic Sea Coast", 39),
    SUB_ARTIC_SUBTERRANEAN("Sub-Artic Subterranean", 40),
    SUB_ARTIC_VOLCANO("Sub-Artic Volcano", 41),
    TEMPERATE_DESERT("Temperate Desert", 42),
    TEMPERATE_FOREST("Temperate Forest", 43),
    TEMPERATE_FRESH_WATER("Temperate Fresh Water", 44),
    TEMPERATE_HILL("Temperate Hills", 45),
    TEMPERATE_LAKE("Temperate Lake", 46),
    TEMPERATE_LAKE_SHORE("Temperate Lake Shore", 47),
    TEMPERATE_MOUNTAIN("Temperate Mountain", 48),
    TEMPERATE_MOUNTAIN_LAKE("Temperate Mountain Lake", 49),
    TEMPERATE_OCEAN("Temperate Ocean", 50),
    TEMPERATE_PLAIN("Temperate Plains", 51),
    TEMPERATE_SALT_WATER("Temperate Salt Water", 52),
    TEMPERATE_SEA_COAST("Temperate Sea Coast", 53),
    TEMPERATE_SUBTERRANEAN("Temperate Subterranean", 54),
    TEMPERATE_SWAMP("Temperate Swamp", 55),
    TEMPERATE_VOLCANO("Temperate Volcano", 56),
    SUB_TROPICAL_DESERT("Sub-Tropical Desert", 57),
    SUB_TROPICAL_FOREST("Sub-Tropical Forest", 58),
    SUB_TROPICAL_FRESH_WATER("Sub-Tropical Fresh Water", 59),
    SUB_TROPICAL_HILL("Sub-Tropical Hills", 60),
    SUB_TROPICAL_JUNGLE("Sub-Tropical Jungle", 61),
    SUB_TROPICAL_LAKE("Sub-Tropical Lake", 62),
    SUB_TROPICAL_LAKE_SHORE("Sub-Tropical Lake Shore", 63),
    SUB_TROPICAL_MOUNTAIN("Sub-Tropical Mountain", 64),
    SUB_TROPICAL_MOUNTAIN_LAKE("Sub-Tropical Mountain Lake", 65),
    SUB_TROPICAL_OCEAN("Sub-Tropical Ocean", 66),
    SUB_TROPICAL_PLAIN("Sub-Tropical Plains", 67),
    SUB_TROPICAL_SALT_WATER("Sub-Tropical Salt Water", 68),
    SUB_TROPICAL_SEA_COAST("Sub-Tropical Sea Coast", 69),
    SUB_TROPICAL_SUBTERRANEAN("Sub-Tropical Subterranean", 70),
    SUB_TROPICAL_SWAMP("Sub-Tropical Swamp", 71),
    SUB_TROPICAL_VOLCANO("Sub-Tropical Volcano", 72),
    TROPICAL_DESERT("Tropical Desert", 73),
    TROPICAL_FOREST("Tropical Forest", 74),
    TROPICAL_FRESH_WATER("Tropical Fresh Water", 75),
    TROPICAL_HILL("Tropical Hill", 76), 
    TROPICAL_JUNGLE("Tropical Jungle", 77),
    TROPICAL_LAKE("Tropical Lake", 78),
    TROPICAL_LAKE_SHORE("Tropical Lake Shore", 79),
    TROPICAL_MOUNTAIN("Tropical Mountain", 80),
    TROPICAL_MOUNTAIN_LAKE("Tropical Mountain Lake", 81),
    TROPICAL_OCEAN("Tropical Ocean", 82),
    TROPICAL_PLAIN("Tropical Plains", 83),
    TROPICAL_SALT_WATER("Tropical Salt Water", 84),
    TROPICAL_SEA_COAST("Tropical Sea Coast", 85),
    TROPICAL_SUBTERRANEAN("Tropical Subterranean", 86),
    TROPICAL_SWAMP("Tropical Swamp", 87),
    TROPICAL_VOLCANO("Tropical Volcano", 88);
    
    private String  name;
    private int     id;
    
    private ClimateTerrainEnum(String name, int id){
        this.name   = name;
        this.id     = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
 
}
