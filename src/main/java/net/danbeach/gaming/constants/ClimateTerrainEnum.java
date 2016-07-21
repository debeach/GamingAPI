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
public class ClimateTerrainEnum {
    private static final int ANY                            = 0;
    private static final int ANY_ARID_DESERT                = 0;
    private static final int ANY_COLD                       = 0;
    private static final int ANY_DESERT                     = 0;
    private static final int ANY_FOREST                     = 0;
    private static final int ANY_JUNGLE                     = 0;
    private static final int ANY_JUNGLE_SUBTERRANEAN_SWAMP  = 0;
    private static final int ANY_LAND                       = 0;
    private static final int ANY_OCEAN                      = 0;
    private static final int ANY_REMOTE                     = 0; // Same as ANY
    private static final int ANY_SALT_WATER                 = 0;
    private static final int ANY_SEA_SHORE                  = 0;
    private static final int ANY_SUBTERRANEAN               = 0;
    private static final int ANY_SWAMP                      = 0;
    private static final int ANY_TEMPERATE                  = 0;
    private static final int ANY_WARM_OR_TEMPERATE          = 0;
    private static final int ANY_WATER                      = 0;
    private static final int ARTIC_HILLS_MOUNTAINS_PLAINS_SUBTERRANEAN = 0;
    private static final int ARID_DESERT                    = 0;
    private static final int ARID_DESERT_PLAIN              = 0;
    private static final int ARID_TEMPERATE_HILLS_MOUNTAINS = 0;
    private static final int FRESH_WATER                    = 0;
    private static final int SUB_TROPICAL_DESERT            = 0;
    private static final int SUB_ARTIC_FOREST               = 0;
    private static final int SUB_ARTIC_SUB_TROPICAL_HILLS   = 0;
    private static final int SUB_ARTIC_SUB_TROPICAL_MOUNTAINS = 0;
    private static final int SUB_ARTIC_TO_TROPICAL          = 0;
    private static final int SUB_ARTIC_TO_TROPICAL_FOREST   = 0;
    private static final int SUB_TROPICAL_TEMPERATE_FOREST_SUBTERRANEAN = 0;
    private static final int SUB_TROPICAL_TEMPERATE_FRESH_WATER_SALT_WATER = 0;
    private static final int SUB_TROPICAL_TEMPERATE_MOUNTAINS = 0;
    private static final int SUB_TROPICAL_TROPICAL_FOREST_LAKE_SHORE_SEA_SHORE = 0;
    private static final int SUB_TROPICAL_TROPICAL_JUNGLE   = 0;
    private static final int SUB_TROPICAL_TROPICAL_VOLCANO  = 0;
    private static final int TEMPERATE_COLD_MOUNTAIN        = 0;
    private static final int TEMPERATE_COLD_MOUNTAIN_LAKE   = 0;
    private static final int TEMPERATE_COLD_SEA_COAST       = 0;
    private static final int TEMPERATE_FOREST               = 0;
    private static final int TEMPERATE_FRESH_WATER          = 0;
    private static final int TEMPERATE_HILLS                = 0;
    private static final int TEMPERATE_HILLS_MOUNTAINS      = 0;
    private static final int TEMPERATE_LAND                 = 0;
    private static final int TEMPERATE_MOUNTAINS            = 0;
    private static final int TEMPERATE_PLAINS               = 0;
    private static final int TEMPERATE_TO_TROPICAL          = 0;
    private static final int TEMPERATE_TROPICAL_DESERT_HILLS = 0;
    private static final int TEMPERATE_TROPICAL_FOREST      = 0;
    private static final int TEMPERATE_TROPICAL_FOREST_PLAINS = 0;
    
    private static final int TEMPERATE_TROPICAL_HILLS_MOUNTAINS = 0;
    private static final int TEMPERATE_TROPICAL_LAKE_SHORE_SEA_SHORE_SUBTERRANEAN = 0;
    private static final int TEMPERATE_TROPICAL_MOUNTAINS   = 0;
    private static final int TEMPERATE_TROPICAL_SEA_COAST   = 0;
    private static final int TEMPERATE_TROPICAL_SUBTERRANEAN = 0;
    private static final int TEMPERATE_TROPICAL_WATER       = 0;
    private static final int TROPICAL_FOREST_JUNGLE         = 0;
    private static final int TROPICAL_JUNGLE                = 0;
    private static final int WARM_DESERTS_PLAINS            = 0;
    private static final int WARM_DESERTS_SUBTERRANEAN      = 0;
    private static final int WARM_PLAINS                    = 0;
    
    
    public final int climateTerrainLookupTable[][] = new int[][]{
        {0},    // ANY
        {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,28,42,57,73}, // ANY_ARID_DESERT
        {14,15,16,17,18,19,20,21,22,23,24,25,26,27},    // ANY_COLD
        {0,14,28,42,57,73}, // ANY_DESERT
        {1,15,29,43,58,74}, // ANY_FOREST
        {61,77},    // ANY_JUNGLE
        {12,26,40,54,55,61,70,71,77,86,87}, // ANY_JUNGLE_SUBTERRANEAN_SWAMP
        {0,1,3,6,9,12,13,14,15,17,20,23,26,27,28,29,31,34,37,40,41,42,43,45,48,51,54,56,57,58,60,61,64,67,70,72,73,74,76,77,80,83,86,88}, // ANY_LAND
        {8, 22,36,50,66,82}, // ANY OCEAN
        {8,10,22,24,36,38,50,52,66,68,82,84}, // ANY_SALT_WATER
        {11,25,39,53,69,85}, // ANY_SEA_SHORE
        {12,26,40,54,70,86}, // ANY_SUBTERRANEAN
        {55,71,87}, // ANY_SWAMP
        {42,43,44,45,46,47,48,49,50,51,52,53,54,55,56},     // ANY_TEMPERATE
        {42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88}, // ANY_WARM_OR_TEMPERATE
        {2,4,7,8,10,16,18,21,22,24,30,32,35,36,38,44,46,49,50,52,55,59,62,65,66,68,71,75,78,81,82,84,87}, // ANY_WATER
        {17,20,23,26}, // ARTIC_HILLS_MOUNTAINS_PLAINS_SUBTERRANEAN
        {0}, // ARID_DESERT
        {0,9}, // ARID_DESERT_PLAIN
        {3,6,45,48},     // ARID_TEMPERATE_HILLS_MOUNTAIN
        {29}, // SUB_ARTIC_FOREST
        {31,45,60}, // SUB_ARTIC_SUB_TROPICAL_HILLS
        {34,48,64}, // SUB_ARTIC_SUB_TROPICAL_MOUNTAINS
        {28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88}, // SUB_ARTIC_TO_TROPICAL
        {29,43,58,74}, // SUB_ARTIC_TO_TROPICAL_FOREST
        {57}, // SUB_TROPICAL_DESERT
        {43,54,58,70}, // SUB_TROPICAL_TEMPERATE_FOREST_SUBTERRANEAN
        {59,68,44,52},     // SUB_TROPICAL_TEMPERATE_FRESH_WATER_SALT_WATER
        {48,64}, // SUB_TROPICAL_TEMPERATE_MOUNTAINS
        {58,63,69,74,79,85}, // SUB_TROPICAL_TROPICAL_FOREST_LAKE_SHORE_SEA_SHORE
        {61,77}, // SUB_TROPICAL_TROPICAL_JUNGLE
        {72,88}, // SUB_TROPICAL_TROPICAL_VOLCANO
        {20,34,48}, // TEMPERATE_COLD_MOUNTAIN
        {21,35,49}, // TEMPERATE_COLD_MOUNTAIN_LAKE
        {25,39,53}, // TEMPERATE_COLD_SEA_COAST
        {43},   // TEMPERATE_FOREST
        {44}, // TEMPERATE_FRESH_WATER
        {45},   // TEMPERATE_HILLS
        {45,48},     // TEMPERATE_HILLS_MOUNTAINS
        {42,43,45,48,51,54,56},     //TEMPERATE_LAND
        {48}, // TEMPERATE_MOUNTAINS
        {51}, // TEMPERATE_PLAINS
        {42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88}, // TEMPERATE_TO_TROPICAL
        {42,45,5760,73,76}, // TEMPERATE_TROPICAL_DESERT_HILLS
        {43,58,74}, // TEMPERATE_TROPICAL_FOREST
        {43,51,58,67,74,83},   // TEMPERATE_TROPICAL_FOREST_PLAINS
        {45,48,60,64,76,80}, // TEMPERATE_TROPICAL_HILLS_MOUNTAINS
        {47,53,54,63,69,70,79,85,86}, //  TEMPERATE_TROPICAL_LAKE_SHORE_SEA_SHORE_SUBTERRANEAN
        {48,64,80},   //TEMPERATE_TROPICAL_MOUNTAINS
        {53,69,85}, // TEMPERATE_TROPICAL_SEA_COAST
        {54,70,86},   // TEMPERATE_TROPICAL_SUBTERRANEAN
        {44,46,49,52,55,59,62,65,66,68,71,75,78,81,82,84,87}, // TEMPERATE_TROPICAL_WATER
        {74,77},     // TROPICAL_FOREST_JUNGLE
        {77},   // TROPICAL_JUNGLE
        {42,51,57,67,73,83}, // WARM_DESERTS_PLAINS
        {0,12,42,54,57,70,73,86}, // WARM_DESERTS_SUBTERRANEAN
        {51,67,83}, // WARM_PLAINS
};

    public ClimateTerrainEnum() {
        
    }
    
   
}
