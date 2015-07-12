package com.waterfall.thomaswatson.theprovider.util.com.waterfall.thomaswatson.theprovider.interfaces;

import com.waterfall.thomaswatson.theprovider.util.Position;
//CHECK HWY DIMENSION ISNT IMPORTING!
/**
 * Created by thomaswatson on 09/07/2015.
 */
public interface GameObject <T extends  Number>{
    public void draw();
    public int getBlockTax();
    public void setPlacement(Position<T> placement[]);
}
