package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class Block {

    private static float size = 100;
    private float xPosition;
    private float yPosition;


    private Bitmap blockImage;
    public Block(Context context){
        size = 100;
        blockImage = BitmapFactory.decodeResource(context.getResources(),R.drawable.tiling_grass_block);

    }
    public void setBlockImage(Bitmap blockImage){
     this.blockImage = blockImage;
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

    public float getXPosition() {
        return xPosition;
    }

    public void setXPosition(float xPosition) {
        this.xPosition = xPosition;
    }

    public float getYPosition() {
        return yPosition;
    }

    public void setYPosition(float yPosition) {
        this.yPosition = yPosition;
    }


}
