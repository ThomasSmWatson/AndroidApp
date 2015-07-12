package com.waterfall.thomaswatson.theprovider;

/**
 * Created by thomaswatson on 12/07/2015.
 */
public class Position <T extends  Number>{
    private T x;
    private T y;

    public void setX(T x){
        this.x = x;
    }
    public T getX(){
        return x;
    }

    public void setY(T y){
        this.y = y;
    }
    public T get(){
        return y;
    }
}
