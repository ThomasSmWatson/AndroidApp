package com.waterfall.thomaswatson.theprovider.interfaces;

/**
 * Created by thomaswatson on 10/07/2015.
 */
public interface Shop {
    public int getCost();
    public void reviewItem(ShopComponant item);
    public Item giveSoldItem();
    public Item takeBoughtItem();
    public void placeItemIntoShop(Item item);
    public void takeShopComponantOutOfShop(ShopComponant componant);
    public ShopComponant convertItemToShopComponant(Item item);
    public Item convertShopComponantIntoItem(ShopComponant componant);
}
