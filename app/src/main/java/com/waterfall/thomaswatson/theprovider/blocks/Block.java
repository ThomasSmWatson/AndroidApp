package com.waterfall.thomaswatson.theprovider.blocks;

import android.content.Context;
import android.graphics.Bitmap;

import com.waterfall.thomaswatson.theprovider.Position;
import com.waterfall.thomaswatson.theprovider.interfaces.BlockType;

/**
 * Created by thomaswatson on 14/07/2015.
 */
public abstract class Block implements BlockType{
    private Bitmap blockImage;
    private Position<Integer> blockPosition;
    private boolean inUse;
    public static int scale;
    public static int BLOCK_TYPE = 0;
    public Block(Context context){
        scale = 100;
        blockImage = makeImageScaleable(setupBlockImage(context));
        inUse = true;
        blockPosition = new Position<Integer>();

    }
    protected abstract Bitmap setupBlockImage(Context context);


    public Bitmap getBlockImage(){
        return blockImage;
    }
    private Bitmap makeImageScaleable(Bitmap bitmap ){

        return Bitmap.createScaledBitmap(bitmap,scale,scale,true);
    }
    public boolean isInUse(){
        return inUse;
    }

    public void setIsInUse(boolean isInUse){
        this.inUse = isInUse;
    }

    public Position<Integer> getPosition(){
        return blockPosition;
    }

    public void setPosition(Position<Integer> position){
        this.blockPosition = position;
    }

    public void setPosition(int x, int y){

        blockPosition.setX(x);
        blockPosition.setY(y);
    }

    public static int getScale() {
        return scale;
    }

    public static void setScale(int scale) {
        Block.scale = scale;
    }
}
