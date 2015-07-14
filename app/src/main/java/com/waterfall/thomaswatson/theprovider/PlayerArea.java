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
        for(int i = 0; i<(blockXAmount*blockYAmount); i++){
            Block block = new Block(context);
            int yPos = 0;
            if(i%blockXAmount == 0) {
                block.setYPosition(yPos++);
            }
            block.setXPosition(i%blockXAmount);
            blocks.add(block);
        }

    }


    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }



}
