package com.waterfall.thomaswatson.theprovider;

import android.content.Context;

import com.waterfall.thomaswatson.theprovider.blocks.Block;
import com.waterfall.thomaswatson.theprovider.blocks.BlockFactory;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 20/07/2015.
 */
public class BlockInitializer {

    private Context context;
    BlockFactory factory;


    public BlockInitializer(Context context){
        prepareVariablesForGeneration();
        this.context = context;
    }

    //return an ArrayList of positions which have available Blocks
    public static  ArrayList<Block> getAvailableBlocks(ArrayList<Block> blocks){
        ArrayList<Block> availableBlocks = new ArrayList<Block>();

        //loop through the blocks and check the type...
        for(Block block:blocks){
            switch(block.BLOCK_TYPE){
                case BlockType.GRASS_BLOCK:
                    availableBlocks.add(block);
                    break;
            }
        }
        return availableBlocks;
    }

    private void prepareVariablesForGeneration(){
        factory = new BlockFactory();
    }

    //generates a square patch of grass blocks at pos x,y. with the radius given
    public ArrayList<Block> generateSquare(ArrayList<Block> blocks, int xPos, int yPos, int radius){
        ArrayList<Block> generatedBlocks = new ArrayList<Block>();
        for(Block block :blocks){
            if (block.getPosition().<Integer>isGraterThan(xPos,yPos) && block.getPosition().<Integer>isLessThan(xPos+radius,yPos+radius)){
                Position<Integer> lastPos = block.getPosition();
                block = factory.makeBlock(BlockType.GRASS_BLOCK, context);
                block.setPosition(lastPos);
            }
            generatedBlocks.add(block);
        }
        return generatedBlocks;
    }



}
