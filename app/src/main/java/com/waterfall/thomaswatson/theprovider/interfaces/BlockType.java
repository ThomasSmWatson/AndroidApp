package com.waterfall.thomaswatson.theprovider.interfaces;

import android.graphics.Bitmap;

import com.waterfall.thomaswatson.theprovider.Position;

/**
 * Created by thomaswatson on 14/07/2015.
 */
public interface BlockType {
    void setBlockImage(Bitmap blockImage);

    Bitmap getBlockImage();

    boolean isInUse();

    void setIsInUse(boolean isInUse);

    Position<Integer> getPosition();

    void setPosition(Position<Integer> position);

    void setPosition(int x, int y);
}
