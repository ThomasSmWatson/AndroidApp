package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Canvas;

import com.waterfall.thomaswatson.theprovider.blocks.BarracidingBlock;
import com.waterfall.thomaswatson.theprovider.blocks.Block;
import com.waterfall.thomaswatson.theprovider.blocks.BlockFactory;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class PlayerArea {
    private static int blockXAmount = 30;
    private static int blockYAmount = 30;
    private ArrayList<Block> blocks;
    private BlockDrawer blockDrawer;
    private Canvas canvas;
    private Position<Integer> center;
    int blocksReady,totalBlockReady;

    private BlockFactory factory;


        public PlayerArea(Context context){
           //initBlocks();
            blocks = new ArrayList<Block>();
            totalBlockReady = blockXAmount*blockYAmount;
            blocksReady = 0;
           initBlocks(context);


        }
        private void initBlocks(Context context){
            for(int x = 0; x<blockXAmount; x++){
                for(int y = 0; y<blockYAmount; y++){
                        Block barricadingBlock = new BarracidingBlock(context);
                        barricadingBlock.setPosition(x,y);
                        blocks.add(barricadingBlock);
                        blocksReady++;

                }
            }
            center = new Position<Integer>();
            center.setX((int)blockXAmount/2);
            center.setY((int) blockYAmount / 2);
            setBlocks(new BlockInitializer(context).generateRandomArea(blocks, center, 64));
        }

        public float getCurrentLoadStatus() {
            if (blocksReady == 0) {
                return 0.1f;
            }
            return blocksReady / totalBlockReady;
        }


        public ArrayList<Block> getBlocks() {
            return blocks;
        }

        public void setBlocks(ArrayList<Block> blocks) {
            this.blocks = blocks;
        }



}
