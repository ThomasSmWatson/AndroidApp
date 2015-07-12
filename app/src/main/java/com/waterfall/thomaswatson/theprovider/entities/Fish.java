package com.waterfall.thomaswatson.theprovider.entities;

import com.waterfall.thomaswatson.theprovider.interfaces.Eddible;
import com.waterfall.thomaswatson.theprovider.interfaces.Item;
import com.waterfall.thomaswatson.theprovider.interfaces.ShopComponant;

/**
 * Created by thomaswatson on 12/07/2015.
 */
public class Fish implements Item, ShopComponant, Eddible {
    private int amount;
    private final int LIMIT = 99;
    @Override
    public void eat() {

    }

    @Override
    public int getHungerIncrementAmount() {
        return 20;
    }

    @Override
    public void buy() {

    }

    @Override
    public int sellPrice() {
        return 12;
    }

    @Override
    public int buyPrice() {
        return 25;
    }

    @Override
    public void sell() {

    }

    @Override
    public boolean isStackable() {
        return true;
    }

    @Override
    public int amountAvailable() {
        return amount;
    }

    @Override
    public boolean availableLimitReached() {
        return amount>=LIMIT;
    }
}
