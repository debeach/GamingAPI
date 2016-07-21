/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.danbeach.gaming.domain.toon;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author deb
 */
@RunWith(Categories.class)
@IncludeCategory(ToonCategory.class)
@Suite.SuiteClasses({
    ToonTest.class,
    PlayerCharacterTest.class,
    FighterTest.class
    
})
public class ToonCategorySuite {
    
}
