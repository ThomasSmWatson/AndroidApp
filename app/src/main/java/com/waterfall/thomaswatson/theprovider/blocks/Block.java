package com.waterfall.thomaswatson.theprovider.blocks;

import android.content.Context;
import android.graphics.Bitmap;

import com.waterfall.thomaswatson.theprovider.Position;
import com.waterfall.thomaswatson.theprovider.interfaces.BlockType;

/**
 * Created by thomaswatson on 14/07/2015.
 */
public abstract class Block implements BlockType{
    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;
    private Bitmap blockImage;
    private Position<Integer> blockPosition;
    private boolean inUse;
    public static int scale;
   // private Block[] blocks;
    public static int BLOCK_TYPE = 0;
    public Block(Context context){
        scale = 100;
      //  blocks = new Block[4];
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
    public Position<Integer>getBlockPosition(int id){
        Position<Integer> pos = new Position<Integer>();

        switch(id) {
            case NORTH:
                pos.setX(blockPosition.getX());
                pos.setY(blockPosition.getY() - 1);
                break;
            case EAST:
                pos.setX(blockPosition.getX() + 1);
                pos.setY(blockPosition.getY());
                break;
            case SOUTH:
                pos.setX(blockPosition.getX());
                pos.setY(blockPosition.getY() + 1);
                break;
            case WEST:
                pos.setX(blockPosition.getX() - 1);
                pos.setY(blockPosition.getY());
                break;
        }

                return pos;
    }
    public void setPosition(int x, int y){

        blockPosition.setX(x);
        blockPosition.setY(y);
    }
//    public void setBlock(int id, Block block){
//        blocks[id] = block;
//
//
//
//    }
//    public Block getBlock(int id){
//        return blocks[id];
//    }
    public static int getScale() {
        return scale;
    }

    public static void setScale(int scale) {
        Block.scale = scale;
    }
}
