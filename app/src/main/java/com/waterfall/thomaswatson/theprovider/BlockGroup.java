package com.waterfall.thomaswatson.theprovider;

import com.waterfall.thomaswatson.theprovider.blocks.Block;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 14/08/2015.
 */


public class BlockGroup {
    private ArrayList<Block> blocks;
    private int length;
    private int width;
    private static BlockGroup instance;
    private BlockGroup(){


    }
    public static BlockGroup getInstance(){
        if(instance == null){
            instance = new BlockGroup();
        }
        return instance;
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
}
