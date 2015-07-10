package com.waterfall.thomaswatson.theprovider.util.com.waterfall.thomaswatson.theprovider.interfaces;

/**
 * Created by thomaswatson on 10/07/2015.
 */
public interface Item {
    public boolean isStackable();
    public int amountAvailable();
    public boolean availableLimitReached();
}
