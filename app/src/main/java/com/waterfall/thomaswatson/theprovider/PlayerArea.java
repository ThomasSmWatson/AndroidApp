package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Canvas;

import com.waterfall.thomaswatson.theprovider.blocks.GrassBlock;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class PlayerArea {
    private static int blockXAmount = 30;
    private static int blockYAmount = 30;
    private ArrayList<GrassBlock> blocks;
    private BlockDrawer blockDrawer;
    private Canvas canvas;


    public PlayerArea(Context context){
       //initBlocks();
        blocks = new ArrayList<GrassBlock>();
       initBlocks(context);

    }
    private void initBlocks(Context context){
        for(int x = 0; x<=blockXAmount; x++){
            for(int y = 0; y<blockYAmount; y++){
                GrassBlock block = new GrassBlock(context);
                block.setPosition(x, y);

                blocks.add(block);

            }
        }

    }


    public ArrayList<GrassBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<GrassBlock> blocks) {
        this.blocks = blocks;
    }



}
