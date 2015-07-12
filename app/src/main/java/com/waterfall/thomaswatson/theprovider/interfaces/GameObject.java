package com.waterfall.thomaswatson.theprovider.interfaces;

import com.waterfall.thomaswatson.theprovider.Position;
//CHECK HWY DIMENSION ISNT IMPORTING!
/**
 * Created by thomaswatson on 09/07/2015.
 */
public interface GameObject {
    public void draw();
    public int getBlockTax();
    public<T extends  Number> void setPlacement(Position<T> placement[]);
}
