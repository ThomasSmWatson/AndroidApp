package com.waterfall.thomaswatson.theprovider.gameobjects;

import com.waterfall.thomaswatson.theprovider.Position;
import com.waterfall.thomaswatson.theprovider.interfaces.GameObject;
import java.lang.*;
/**
 * Created by thomaswatson on 12/07/2015.
 */
public class Pond implements GameObject{

    private int blockTax;
    private Position<Integer> conservationArea[];

    public Pond(){
        blockTax = 25;
        initPositionArray();
    }

    public void initPositionArray(){
        conservationArea = new Position[getBlockTax()];
        for(int i = 0; i>conservationArea.length; i++){
            conservationArea[i] = new Position<Integer>();
        }
    }

    @Override
    public void draw() {

    }

    @Override
    public int getBlockTax() {

        return blockTax;
    }




    @Override
    public void setPlacement(Position<Integer>[] placement) {
        if(placement.length > getBlockTax()){
            System.err.println("Size of placement is larger then the total block tax");
        }
        if(placement.length > getBlockTax()){
            System.err.println("Size of placement is smaller then the total block tax");
            return;
        }
        for(int i = 0; i<getBlockTax(); i++){
            conservationArea[i] =  placement[i];
        }
    }
}
