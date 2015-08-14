package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.os.AsyncTask;

import com.waterfall.thomaswatson.theprovider.blocks.BarracidingBlock;
import com.waterfall.thomaswatson.theprovider.blocks.Block;
import com.waterfall.thomaswatson.theprovider.blocks.BlockFactory;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class PlayerArea{
    private static int blockXAmount = 30;
    private static int blockYAmount = 30;
    private boolean isReady = false;
    private BlockDrawer blockDrawer;
    private BlockFactory factory;

    private BlockGroup blockGroup;

    public PlayerArea(Context context){
        new BlockInitializerTask().doInBackground(context);
    }
    private void initBlocks(Context context){
        blockGroup = blockGroup.getInstance();
        ArrayList<Block> blocks = new ArrayList<Block>();;
        for(int x = 0; x<=blockXAmount; x++){
            for(int y = 0; y<blockYAmount; y++){
                    Block barricadingBlock = new BarracidingBlock(context);
                    barricadingBlock.setPosition(x, y);
                    blocks.add(barricadingBlock);
            }
        }
        blockGroup.setBlocks(blocks);
        blockGroup.setWidth(blockXAmount);
        blockGroup.setLength(blockYAmount);
    }

    public ArrayList<Block> getBlocks(){
        return blockGroup.getBlocks();
    }




//Change the initializing fo blocks to a task so it can process on a differnt thread...
    private  class BlockInitializerTask extends AsyncTask<Context,Boolean,Void>{

        @Override
        protected Void doInBackground(Context... context) {
            initBlocks(context[0]);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            isReady = true;
            System.gc();
        }

        @Override
        protected void onProgressUpdate(Boolean... values) {
            super.onProgressUpdate(values);
            System.gc();
        }
    }


}
