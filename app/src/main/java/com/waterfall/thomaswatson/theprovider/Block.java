package com.waterfall.thomaswatson.theprovider;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class Block {

    private static float size;
    private float xPosition;
    private float yPosition;


    private Bitmap blockImage;
    public Block( ){
        blockImage = BitmapFactory.decodeFile("tiling_grass_block.png");

    }

    public static void setSize(float size) {
        Block.size = size;
    }
    public static float getSize(){
        return size;
    }

    public Bitmap getBlockImage() {
        return blockImage;
    }

    public float getxPosition() {
        return xPosition;
    }

    public void setxPosition(float xPosition) {
        this.xPosition = xPosition;
    }

    public float getyPosition() {
        return yPosition;
    }

    public void setyPosition(float yPosition) {
        this.yPosition = yPosition;
    }


}
