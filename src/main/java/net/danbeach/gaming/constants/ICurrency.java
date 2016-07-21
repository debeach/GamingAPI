package net.danbeach.gaming.constants;

/**
 * Created with IntelliJ IDEA.
 * User: deb
 * Date: 9/15/13
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ICurrency {
    public static final int PLATINUM 	= 0;
    public static final int GOLD	= 1;
    public static final int SILVER	= 2;
    public static final int COPPER	= 3;
    public static final int ELECTRUM    = 4;

    public static final int NUMBER_OR_COIN_TYPES    = 5;
    // how many coins for each copper
    public static final double COPPER_TO_SILVER     = 0.1;
    public static final double COPPER_TO_ELECTRUM   = 0.5;
    public static final double COPPER_TO_GOLD       = 0.01;
    public static final double COPPER_TO_PLATINUM   = 0.001;

    // how many coins for each electrum piece
    public static final int ELECTRUM_TO_COPPER      = 50;
    public static final int ELECTRUM_TO_SILVER      = 5;
    public static final double ELECTRUM_TO_GOLD     = 0.5;
    public static final double ELECTRUM_TO_PLATINUM = 0.05;

    // how many coins for each silver
    public static final int SILVER_TO_COPPER        = 10;
    public static final int SILVER_TO_ELECTRUM      = 5;
    public static final double SILVER_TO_GOLD       = 0.1;
    public static final double SILVER_TO_PLATINUM   = 0.01;

    // how many coins for each gold
    public static final int GOLD_TO_COPPER          = 100;
    public static final int GOLD_TO_SILVER          = 10;
    public static final int GOLD_TO_ELECTRUM        = 5;
    public static final double GOLD_TO_PLATINUM     = 0.1;

    // how many coins for each platinum
    public static final int PLATINUM_T0_COPPER      = 1000;
    public static final int PLATINUM_T0_SILVER      = 100;
    public static final int PLATINUM_TO_ELECTRUM    = 50;
    public static final int PLATINUM_TO_GOLD        = 10;
}
