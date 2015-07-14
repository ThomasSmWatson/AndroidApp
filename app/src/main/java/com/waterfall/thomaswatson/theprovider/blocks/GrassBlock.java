package com.waterfall.thomaswatson.theprovider.blocks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.waterfall.thomaswatson.theprovider.Position;
import com.waterfall.thomaswatson.theprovider.R;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class GrassBlock extends Block{

    private static int size = 100;



    private Position<Integer> position;
    boolean isInUse;
    //TODO: use position class isntead of floats

    private Bitmap blockImage;
    public GrassBlock(Context context){
        super(context);


    }

    @Override
    protected Bitmap setupBlockImage(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.tiling_grass_block);
    }


}
