package com.waterfall.thomaswatson.theprovider.entities;

import com.waterfall.thomaswatson.theprovider.interfaces.Item;
import com.waterfall.thomaswatson.theprovider.interfaces.ShopComponant;

/**
 * Created by thomaswatson on 12/07/2015.
 */
public class Wood implements Item, ShopComponant{
// TODO: generate a abstract class for wood
    private int amount;
    private static final int LIMIT = 99;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void buy() {

    }

    @Override
    public int sellPrice() {
        return 5;
    }

    @Override
    public int buyPrice() {
        return 20;
    }

    @Override
    public void sell() {

    }
}
