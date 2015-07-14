package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 13/07/2015.
 */
public class BlockDrawer extends View{
    private Bitmap image;
    private ArrayList<Block> blocks;
    public BlockDrawer(Context context, ArrayList<Block> blocks) {
        super(context);
        this.blocks = blocks;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for(Block block: blocks) {
           // block.setBlockImage(BitmapFactory.decodeFile("/tiling_grass_block.png"));

            canvas.drawBitmap(block.getBlockImage(), block.getXPosition() * Block.getSize(), block.getXPosition() * Block.getSize(), null);

        }
    }
}
