package com.waterfall.thomaswatson.theprovider.util.com.waterfall.thomaswatson.theprovider.interfaces;

import android.graphics.Canvas;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public interface GameObject {
    public void draw();
    public int getBlockTax();
    public void setBlockTax(int blockTax);
    public boolean isTradable();
}
