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
    public T getY(){
        return y;
    }

    public  boolean isGraterThan(Position<T> pos){
        if(pos.getX().floatValue() > this.getX().floatValue() && pos.getY().floatValue() > this.getY().floatValue()){
            return true;
        }
        return false;
    }

    public<T extends  Number>  boolean isGraterThan(T x, T y){
        if(x.floatValue() > this.getX().floatValue() && y.floatValue() > this.getY().floatValue()){
            return true;
        }
        return false;
    }


    public  boolean isLessThan(Position<T> pos){
        if(pos.getX().floatValue() < this.getX().floatValue() && pos.getY().floatValue() < this.getY().floatValue()){
            return true;
        }
        return false;
    }

    public<T extends  Number>  boolean isLessThan(T x, T y){
        if(x.floatValue() < this.getX().floatValue() && y.floatValue() < this.getY().floatValue()){
            return true;
        }
        return false;
    }
}
