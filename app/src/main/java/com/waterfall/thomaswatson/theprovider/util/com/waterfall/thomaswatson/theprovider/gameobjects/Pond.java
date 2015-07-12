package com.waterfall.thomaswatson.theprovider.util.com.waterfall.thomaswatson.theprovider.gameobjects;

import com.waterfall.thomaswatson.theprovider.util.com.waterfall.thomaswatson.theprovider.interfaces.GameObject;
import java.awt.Dimension;
/**
 * Created by thomaswatson on 12/07/2015.
 */
public class Pond implements GameObject {
    @Override
    public void draw() {

    }

    @Override
    public int getBlockTax() {
        return 9;
    }


    @Override
    public void setPlacement(Dimension[] placement) {

    }
}
