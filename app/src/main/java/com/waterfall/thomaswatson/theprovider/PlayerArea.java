package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Canvas;

import com.waterfall.thomaswatson.theprovider.blocks.*;
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
    int blocksReady,totalBlockReady;


    public PlayerArea(Context context){
       //initBlocks();
        blocks = new ArrayList<Block>();
        totalBlockReady = blockXAmount*blockYAmount;
        blocksReady = 0;
       initBlocks(context);


    }
    private void initBlocks(Context context){
        for(int x = 0; x<=blockXAmount; x++){
            for(int y = 0; y<blockYAmount; y++){

                if( (x <10 || x >20) || (y<10 || y>20) ){
                    Block barricadingBlock = new BarracidingBlock(context);
                    barricadingBlock.setPosition(x,y);
                    blocks.add(barricadingBlock);
                }else {
                    GrassBlock block = new GrassBlock(context);
                    block.setPosition(x, y);
                    blocks.add(block);
                }
                blocksReady++;

            }
        }



    }

    public float getCurrentLoadStatus(){
        if(blocksReady == 0){
            return 0.1f;
        }
        return blocksReady/totalBlockReady;
    }
    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }



}
