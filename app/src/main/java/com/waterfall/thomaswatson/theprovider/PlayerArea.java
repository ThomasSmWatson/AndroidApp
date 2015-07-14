package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class PlayerArea {
    private static int blockXAmount = 3;
    private static int blockYAmount = 3;
    private static PlayerArea instance = new PlayerArea();
    private ArrayList<Block> blocks;
    private BlockDrawer blockDrawer;
    private Canvas canvas;

    public static PlayerArea getInstance(){

            return instance;
    }
    private PlayerArea(){
       //initBlocks();
        canvas = new Canvas(Bitmap.createBitmap((int)(blockXAmount*Block.getSize()), (int)(blockYAmount*Block.getSize()), Bitmap.Config.ARGB_8888));

    }
    private void initBlocks(){
        for(int i = 0; i<(blockXAmount*blockYAmount); i++){
            blocks.add(new Block());
        }

    }

     public void drawPlayerArea(Context context){
         blockDrawer = new BlockDrawer(context,blocks);
         blockDrawer.draw(canvas);

     }
}
