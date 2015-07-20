package com.waterfall.thomaswatson.theprovider.blocks;

import android.content.Context;

import com.waterfall.thomaswatson.theprovider.BlockType;

/**
 * Created by thomaswatson on 20/07/2015.
 */
public class BlockFactory {

    public Block makeBlock(int id, Context context){
        Block block = null;

        switch(id){
            case BlockType.GRASS_BLOCK:
                return new GrassBlock(context);
            case BlockType.BARRACADING_BLOCK:
                return new BarracidingBlock(context);
            default:
                return null;
        }
    }
}
