package com.waterfall.thomaswatson.theprovider.blocks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.waterfall.thomaswatson.theprovider.BlockType;
import com.waterfall.thomaswatson.theprovider.R;

/**
 * Created by thomaswatson on 14/07/2015.
 */
public class BarracidingBlock extends Block {

    public BarracidingBlock(Context context) {
        super(context);
        this.setIsInUse(true);
        BLOCK_TYPE = BlockType.BARRACADING_BLOCK;
    }

    @Override
    protected Bitmap setupBlockImage(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.tiling_area_block);
    }
}
