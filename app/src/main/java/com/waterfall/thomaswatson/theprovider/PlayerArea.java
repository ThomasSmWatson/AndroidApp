package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Canvas;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class PlayerArea {
    private static int blockXAmount = 3;
    private static int blockYAmount = 3;
    private ArrayList<Block> blocks;
    private BlockDrawer blockDrawer;
    private Canvas canvas;


    public PlayerArea(Context context){
       //initBlocks();
        blocks = new ArrayList<Block>();
       initBlocks(context);

    }
    private void initBlocks(Context context){
        for(int x = 0; x<=blockXAmount; x++){
            for(int y = 0; y<blockYAmount; y++){
                Block block = new Block(context);
                block.setXPosition(x);
                block.setYPosition(y);
                blocks.add(block);

            }
        }

    }


    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }



}
