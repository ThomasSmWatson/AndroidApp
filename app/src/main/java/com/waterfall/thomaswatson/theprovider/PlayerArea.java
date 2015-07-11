package com.waterfall.thomaswatson.theprovider;

import android.graphics.Canvas;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class PlayerArea {
    private static int blockXAmount = 5;
    private static int blockYAmount = 5;
    private Block blocks[][] = new Block[blockXAmount][blockYAmount];


     public void drawPlayeArea(float xPos,float yPos,Canvas canvas){
         for(int x = 0; x<blockXAmount; x++){
            for(int y = 0; y<blockYAmount; y++){
                canvas.drawBitmap(blocks[x][y].getBlockImage(), (xPos + (x*Block.getSize())), yPos + (y*Block.getSize()), null);
            }
         }
     }
}
