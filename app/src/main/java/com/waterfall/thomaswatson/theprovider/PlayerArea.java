package com.waterfall.thomaswatson.theprovider;

import android.content.Context;
import android.graphics.Canvas;

import java.util.ArrayList;

/**
 * Created by thomaswatson on 09/07/2015.
 */
public class PlayerArea {
    private static int blockXAmount = 5;
    private static int blockYAmount = 5;
    private static PlayerArea instance;
    private ArrayList<Block> blocks;
    private BlockDrawer blockDrawer;


    public static PlayerArea getInstance(){
        if(instance == null){
            instance = new PlayerArea();

        }
            return instance;
    }
    private PlayerArea(){
       blocks= new ArrayList<Block>();
        for(int i = 0; i<(blockXAmount*blockYAmount); i++){
            blocks.add(new Block());
        }

    }

     public void drawPlayerArea(Context context,Canvas canvas){
         blockDrawer = new BlockDrawer(context,blocks);
         blockDrawer.draw(canvas);

     }
}
