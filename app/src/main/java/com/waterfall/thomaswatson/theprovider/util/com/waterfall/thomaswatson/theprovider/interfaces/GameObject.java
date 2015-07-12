package com.waterfall.thomaswatson.theprovider.util.com.waterfall.thomaswatson.theprovider.interfaces;

import android.graphics.Canvas;
import java.awt.Dimension;
//CHECK HWY DIMENSION ISNT IMPORTING!
/**
 * Created by thomaswatson on 09/07/2015.
 */
public interface GameObject {
    public void draw();
    public int getBlockTax();
    public void setPlacement(Dimension placement[]);
}
