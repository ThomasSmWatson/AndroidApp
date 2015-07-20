package com.waterfall.thomaswatson.theprovider.blocks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.waterfall.thomaswatson.theprovider.BlockType;
import com.waterfall.thomaswatson.theprovider.R;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class GrassBlock extends Block{



    public GrassBlock(Context context){
        super(context);
        BLOCK_TYPE = BlockType.GRASS_BLOCK;

    }

    @Override
    protected Bitmap setupBlockImage(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.tiling_grass_block);
    }


}
