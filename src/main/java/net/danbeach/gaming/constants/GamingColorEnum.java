package net.danbeach.gaming.constants;

/**
 * Created with IntelliJ IDEA.
 * User: deb
 * Date: 9/15/13
 * Time: 8:41 PM
 * To change this template use File | Settings | File Templates.
 */
public enum GamingColorEnum {
    BLACK("Black", 0x000000),
    BLUE("Blue", 0x003399),
    BROWN("Brown", 0x663333),
    GREEN("Green", 0x00FF00),
    WHITE("White", 0xFFFFFF),
    NONE("None", 0x000000);

    private String name;
    private long hex;

    private GamingColorEnum(String name, long hex){
        this.name = name;
        this.hex = hex;
    }


    public long getColorHex(){
        return hex;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return name;
    }
}
