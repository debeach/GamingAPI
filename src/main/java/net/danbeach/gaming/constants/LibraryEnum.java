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
public enum LibraryEnum {

    NONE("None"),
    DUNGEON_MASTER_GUIDE("Dungeon Master Guide"),
    FORGOTTEN_REALMS_HANDBOOK("Forgotten Realms Handbook"),
    PLAYER_HANDBOOK("Player Handbook"),
    AURORA_CATALOG("Aurora's Catalog");

    private String bookName;

    private LibraryEnum(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public static LibraryEnum fromNumber(int number) {
        if (number >= 0) {
            for (LibraryEnum num : LibraryEnum.values()) {
                if (number == num.ordinal()) {
                    return num;
                }
            }
        }
        return null;
    }
     
    public static int getNumberFromName(String name){
        if(name != null){
            for(LibraryEnum book : LibraryEnum.values()){
                if(name.equalsIgnoreCase(book.getBookName())){
                    return book.ordinal();
                }
            }
        }
        return 0;
    }
}
