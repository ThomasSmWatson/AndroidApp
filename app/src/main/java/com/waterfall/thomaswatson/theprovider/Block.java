package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.waterfall.thomaswatson.theprovider.interfaces.BlockType;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class Block implements BlockType {

    private static float size = 100;



    private Position<Integer> position;
    boolean isInUse;
    //TODO: use position class isntead of floats

    private Bitmap blockImage;
    public Block(Context context){
        isInUse = true;
        position = new Position<Integer>();
        blockImage = BitmapFactory.decodeResource(context.getResources(), R.drawable.tiling_area_block);
        Bitmap scaledImage =Bitmap.createScaledBitmap(blockImage, (int)Block.getSize(), (int)Block.getSize(), true);
        blockImage = scaledImage;

    }
    @Override
    public void setBlockImage(Bitmap blockImage){
     this.blockImage = blockImage;
    }

    public static void setSize(float size) {
        Block.size = size;
    }
    public static float getSize(){
        return size;
    }

    @Override
    public Bitmap getBlockImage() {
        return blockImage;
    }

    @Override
    public boolean isInUse() {
        return isInUse;
    }

    @Override
    public void setIsInUse(boolean isInUse) {
        this.isInUse = isInUse;
    }

    @Override
    public Position<Integer> getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position<Integer> position) {
        this.position = position;
    }
    @Override
    public void setPosition(int x, int y){
        position.setX(x);
        position.setY(y);
    }

}
