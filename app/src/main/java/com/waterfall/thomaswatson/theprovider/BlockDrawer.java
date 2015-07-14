package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

import com.waterfall.thomaswatson.theprovider.blocks.GrassBlock;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 13/07/2015.
 */
public class BlockDrawer extends View{
    private Bitmap image;
    private ArrayList<GrassBlock> blocks;
    public BlockDrawer(Context context, ArrayList<GrassBlock> blocks) {
        super(context);
        this.blocks = blocks;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for(GrassBlock block: blocks) {
           // block.setBlockImage(BitmapFactory.decodeFile("/tiling_grass_block.png"));

            canvas.drawBitmap(block.getBlockImage(), block.getPosition().getX() * GrassBlock.getScale(), block.getPosition().getY() * GrassBlock.getScale(), null);

        }
    }
}
