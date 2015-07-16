package com.waterfall.thomaswatson.theprovider.blocks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.waterfall.thomaswatson.theprovider.R;

/**
 * Created by thomaswatson on 16/07/2015.
 */
public class WaterBlock extends Block {

    public WaterBlock(Context context) {
        super(context);
        this.setIsInUse(true);

    }

    @Override
    protected Bitmap setupBlockImage(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.tiling_area_block);
    }

}
